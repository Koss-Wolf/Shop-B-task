package app.controllers;

import app.models.OrderBModel;
import app.utils.Rounder;
import app.views.OrderView;

public class OrderBController {

    private OrderView view;
    private OrderBModel model;
    private String[] data;
    private String orderCostRounded;
    private String deliveryCostRounded;

    public void handleData() {

        this.view = new OrderView();
        this.data = this.getData();
        this.model = new OrderBModel();
        double orderCost = this.getOrderCost();
        this.orderCostRounded = Rounder.roundValue(orderCost);
        double deliveryCost = this.getDeliveryCost();
        this.deliveryCostRounded = Rounder.roundValue(deliveryCost);
        this.view.getOutput(this.formOutput());
    }

    private String[] getData() {
        return this.view.getData();
    }

    private double getOrderCost() {
        return this.model.getOrderCost(Integer.parseInt(this.data[1]),
                Double.parseDouble(this.data[2]));
    }

    private double getDeliveryCost() {
        return  this.model.getDeliveryCost(Integer.parseInt(this.data[1]),
                Double.parseDouble(this.data[2]));
    }

    private String formOutput() {
        String form = this.data[0];
        return "\nOrder " + form + " cost is " + this.orderCostRounded + "\nDelivery cost is " +
                " " + this.deliveryCostRounded;
    }
}
