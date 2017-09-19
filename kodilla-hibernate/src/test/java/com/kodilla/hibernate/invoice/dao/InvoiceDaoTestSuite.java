package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao ProductDao;

    @Test
    public void testInvoiceDaoSave() {
        Product product1 = new Product("Marchewka");
        Product product2 = new Product("Kapusta");
        Product product3 = new Product("Seler");
        Product product4 = new Product("Burak");

        Invoice invoice = new Invoice("014/09/2017");

        Item item1 = new Item(product1, new BigDecimal(2.5), 7, invoice);
        Item item2 = new Item(product2, new BigDecimal(3.75), 4, invoice);
        Item item3 = new Item(product3, new BigDecimal(5), 12, invoice);
        Item item4 = new Item(product4, new BigDecimal(9.99), 8, invoice);

        List<Item> items = new ArrayList<>(Arrays.asList(item1, item2, item3, item4));
        invoice.setItems(items);
    }
}