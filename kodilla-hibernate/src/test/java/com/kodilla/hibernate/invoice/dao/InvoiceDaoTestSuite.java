package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        Product product1 = new Product("Marchewka");
        Product product2 = new Product("Kapusta");
        Product product3 = new Product("Seler");
        Product product4 = new Product("Burak");

        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        productDao.save(product4);

        Invoice invoice = new Invoice("05/09/2017");

        Item item1 = new Item(product1, new BigDecimal(2.5), 7, invoice);
        Item item2 = new Item(product2, new BigDecimal(3.75), 4, invoice);
        Item item3 = new Item(product3, new BigDecimal(5), 12, invoice);
        Item item4 = new Item(product4, new BigDecimal(9.99), 8, invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);

        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);
        product4.getItems().add(item4);

        invoiceDao.save(invoice);

        int test = invoice.getItems().size();
        Assert.assertEquals(test, itemDao.findByInvoice_Id(invoice.getId()).size());
        Assert.assertEquals(test, itemDao.findByInvoice(invoice).size());

        List<String> itemNames = itemDao.findByInvoice(invoice).stream()
                .map(c -> c.getProduct().getName())
                .collect(Collectors.toList());

        Assert.assertTrue(itemNames.contains("Marchewka"));

        itemDao.deleteAll();
        productDao.deleteAll();
        invoiceDao.deleteAll();
        }
}