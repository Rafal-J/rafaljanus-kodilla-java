package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BasicTaxiOrderTest {

    @Test
    public void getCostTest() {
        TaxiOrder order = new BasicTaxiOrder();

        BigDecimal cost = order.getCost();

        Assert.assertEquals(cost, new BigDecimal(5.00));
    }

    @Test
    public void getDescription() throws Exception {
        TaxiOrder order = new BasicTaxiOrder();

        String  description = order.getDescription();

        Assert.assertTrue(description.equals("Realizacja kursu"));
    }

    @Test
    public void testTaxiNetworkGetCost() {
        TaxiOrder order = new BasicTaxiOrder();
        order = new TaxiNetworkOrderDecorator(order);

        BigDecimal cost = order.getCost();

        Assert.assertTrue(cost.equals(new BigDecimal(40)));
    }

    @Test
    public void testTaxiNetworkGetDescription() {
        TaxiOrder order = new BasicTaxiOrder();
        order = new TaxiNetworkOrderDecorator(order);

        String description = order.getDescription();

        Assert.assertTrue(description.equals("Realizacja kursu przez Taxi Network"));
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        TaxiOrder order = new BasicTaxiOrder();
        order = new UberNetworkOrderDecorator(order);
        order = new ChildSeatDecorator(order);

        BigDecimal cost = order.getCost();

        Assert.assertEquals(new BigDecimal(27), cost);
    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        TaxiOrder order = new BasicTaxiOrder();
        order = new UberNetworkOrderDecorator(order);
        order = new ChildSeatDecorator(order);

        String description = order.getDescription();

        Assert.assertEquals("Realizacja kursu przez Uber + fotelik dla dziecka", description);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetCost() {
        TaxiOrder order = new BasicTaxiOrder();
        order = new TaxiNetworkOrderDecorator(order);
        order = new ExpressDecorator(order);
        order = new ChildSeatDecorator(order);
        order = new VipDecorator(order);

        BigDecimal cost = order.getCost();

        Assert.assertEquals(new BigDecimal(57), cost);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription() {
        TaxiOrder order = new BasicTaxiOrder();
        order = new TaxiNetworkOrderDecorator(order);
        order = new ExpressDecorator(order);
        order = new ChildSeatDecorator(order);
        order = new VipDecorator(order);

        String description = order.getDescription();

        Assert.assertEquals("Realizacja kursu przez Taxi Network + ekspres + fotelik dla dziecka + pakiet VIP", description);
    }
}