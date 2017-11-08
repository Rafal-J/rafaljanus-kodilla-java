package com.kodilla.patterns2.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class ShopService {
    private final List<Order> orders = new ArrayList<>();
    @Autowired
    private Authenticator authenticator;
    @Autowired
    private ProductService productService;

    public Long openOrder(Long userId) {
        if (authenticator.isAuthenticated(userId)) {
            Long maxOrder = (long) orders.stream()
                    .mapToInt(c -> c.getOrderId().intValue())
                    .max().orElse(0);
            orders.add(new Order(maxOrder + 1, userId, productService));
            return maxOrder + 1;
        } else {
            return -1L;
        }
    }

    public void addItem(Long orderId, Long productId, double qty) {
        orders.stream()
                .filter(c -> c.getOrderId().equals(orderId))
                .forEach(c -> c.getItems().add(new Item(productId, qty)));
    }

    public boolean removeItem(Long orderId, Long productId) {
        List<Item> itemsFromOrder = orders.stream()
                .filter(c -> c.getOrderId().equals(orderId))
                .flatMap(c -> c.getItems().stream())
                .collect(Collectors.toList());

        for (int i = 0; i < itemsFromOrder.size(); i++) {
            if (itemsFromOrder.get(i).getProductId().equals(productId)) {
                itemsFromOrder.remove(i);
                return true;
            }
        }
        return false;
    }

    public BigDecimal calculateValue(Long orderId) {
        return orders.stream()
                .filter(c -> c.getOrderId().equals(orderId))
                .map(c -> c.calculateValue())
                .findFirst().orElse(BigDecimal.ZERO);
    }

    public boolean doPayment(Long orderId) {
        Iterator<Order> orderIterator = orders.stream()
                .filter(c -> c.getOrderId().equals(orderId))
                .iterator();

        while (orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            if (theOrder.isPaid()) {
                return true;
            } else {
                Random generator = new Random();
                theOrder.setPaid(generator.nextBoolean());
                return theOrder.isPaid();
            }
        }
        return false;
    }

    public boolean verifyOrder(Long orderId) {
        Iterator<Order> orderIterator = orders.stream()
                .filter(c -> c.getOrderId().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            boolean result = theOrder.isPaid();
            Random generator = new Random();
            if(!theOrder.isVerified()) {
                theOrder.setVerified(result && generator.nextBoolean());
            }
            return theOrder.isVerified();
        }
        return false;
    }

    public boolean submitOrder(Long orderId) {
        Iterator<Order> orderIterator = orders.stream()
                .filter(c -> c.getOrderId().equals(orderId))
                .iterator();

        while(orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            if (theOrder.isVerified()) {
                theOrder.setSubmitted(true);
            }
            return theOrder.isSubmitted();
        }
    return false;
    }

    public void cancelOrder(Long orderId) {
        Iterator<Order> orderIterator = orders.stream()
                .filter(c -> c.getOrderId().equals(orderId))
                .iterator();

        while (orderIterator.hasNext()) {
            Order theOrder = orderIterator.next();
            orders.remove(theOrder);
        }
    }
}
