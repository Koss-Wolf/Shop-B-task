package app.controllers;

import app.base.BaseController;
import app.models.OrderAModel;
import app.utils.Constants;
import app.utils.Rounder;
import app.views.OrderView;

public class OrderAController implements BaseController{

    private OrderView view;
    private OrderAModel model;
    private String[] data;
    private String costRounded;

    public void handleData() {
        this.view = new OrderView();
        this.data = this.getData();
        this.model = new OrderAModel();
        this.costRounded = Rounder.roundValue(this.getOrderCost());
        this.view.getOutput(this.formOutput());
    }

    private String[] getData() {
        return this.view.getData();
    }

    private double getOrderCost() {
        return model.getOrderCost(Integer.parseInt(this.data[1]),
                Double.parseDouble(this.data[2]));
    }

    private String formOutput() {
        String form = this.data[0];
        return "\nOrder " + form + " cost is " +
                " " + this.costRounded;
    }
}
