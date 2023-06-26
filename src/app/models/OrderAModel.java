package app.models;

import app.base.BaseModel;

public class OrderAModel implements BaseModel {

    public OrderAModel() {
    }

    public double getOrderCost(int quota, double price) {
        return (double)quota * price;
    }
}
