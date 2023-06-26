package app.models;

import app.base.BaseModel;
import app.utils.Constants;

public class OrderBModel implements BaseModel {

    public double deliveryRate = 2.5;

    public OrderBModel() {
    }

    public double getOrderCost(int quota, double price) {
        return (double)quota * price * (1.0 + this.deliveryRate / 100.0);
    }

    public double getDeliveryCost(int quota, double price) {
        return (double)quota * price * this.deliveryRate / 100.0;
    }

}
