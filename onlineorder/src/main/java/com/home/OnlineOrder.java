package com.home;

public class OnlineOrder extends App {
    private int OrderId;
    private String CustomerName;
    private String ItemName;
    private String ItemType;
    private String deleveryItem;
    private int Quntity;
    private Double cost;
    public int getOrderId() {
        return OrderId;
    }
    public void setOrderId(int orderId) {
        OrderId = orderId;
    }
    public String getCustomerName() {
        return CustomerName;
    }
    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }
    public String getItemName() {
        return ItemName;
    }
    public void setItemName(String itemName) {
        ItemName = itemName;
    }
    public String getItemType() {
        return ItemType;
    }
    public void setItemType(String itemType) {
        ItemType = itemType;
    }
    public String getDeleveryItem() {
        return deleveryItem;
    }
    public void setDeleveryItem(String deleveryItem) {
        this.deleveryItem = deleveryItem;
    }
    public int getQuntity() {
        return Quntity;
    }
    public void setQuntity(int quntity) {
        Quntity = quntity;
    }
    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }
    public OnlineOrder(int orderId, String customerName, String itemName, String itemType, String deleveryItem,
            int quntity, Double cost) {
        OrderId = orderId;
        CustomerName = customerName;
        ItemName = itemName;
        ItemType = itemType;
        this.deleveryItem = deleveryItem;
        Quntity = quntity;
        this.cost = cost;
    }
    

}
