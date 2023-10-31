package pizzaHut;

import java.util.Date;

interface Deliverable {
    int deliveryAreaLimit = 2;

    boolean delivery();
}

class Order implements Deliverable {
    private int orderNo;
    private Date orderDate;
    private int cost;
    private String custName;
    private String custAddress;
    private float approxDistance;

    public Order(int orderNo, Date orderDate, int cost, String custName, String custAddress, float approxDistance) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.cost = cost;
        this.custName = custName;
        this.custAddress = custAddress;
        this.approxDistance = approxDistance;
    }
    
    public void displayOrderDetails() {
		System.out.println("Order No :" + orderNo);
		System.out.println("Order Date :" + orderDate);
		System.out.println("Customer Name :" + custName);
		System.out.println("Customer Address :" + custAddress);
		System.out.println("Cost :" + cost);

	}

    public boolean delivery() {
        if (approxDistance <= deliveryAreaLimit) {
            System.out.println("Home Delivery available.");
            return true;
        } else {
            System.out.println("Home Delivery not available for this distance.");
            return false;
        }
    }
}
