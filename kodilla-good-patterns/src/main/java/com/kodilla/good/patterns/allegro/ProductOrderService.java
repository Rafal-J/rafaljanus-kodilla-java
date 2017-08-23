package com.kodilla.good.patterns.allegro;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final EmailSender emailSender,
                           final OrderService orderService,
                           final OrderRepository OrderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final Order order) {
        boolean isSold = orderService.validateOrder(order.getBuyer(),order.getSeller(),order.getItem(),order.getPrice(),order.getAmount());

        if(isSold) {
            informationService.sentMessageToBuyer(order.getBuyer(),"Kupiłeś przedmiot");
            informationService.sentMessageToSeller(order.getSeller(),"Sprzedałeś przedmiot");
            orderRepository.writeOrderToDB (order.getBuyer(),order.getSeller(),order.getItem(),order.getPrice(),order.getAmount());
            return new OrderDto(order.getBuyer(),order.getSeller(), true);
        } else {
             informationService.sentMessageToBuyer(order.getBuyer(),"Dane niekompletne");
             return new OrderDto(order.getBuyer(),order.getSeller(), false);
        }
    }
}