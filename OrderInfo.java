import java.time.LocalDate;
class Order{
    int orderId;
    LocalDate orderDate;
    Order(int orderId,LocalDate orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }
    String getOrderStatus() {
        return "Order placed";
    }
    void displayInfo(){
        System.out.println("Order ID is "+orderId);
        System.out.println("Order Date is "+orderDate);
        System.out.println("Order Status is "+getOrderStatus());
    }
}
class ShippedOrder extends Order{
    String trackingNumber;
    ShippedOrder(int orderId,LocalDate orderDate,String trackingNumber) {
        super(orderId,orderDate);
        this.trackingNumber=trackingNumber;
    }
    @Override
    String getOrderStatus(){
        return "Order shipped. Tracking Number is "+trackingNumber;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Tracking Number is "+trackingNumber);
    }
}
class DeliveredOrder extends ShippedOrder{
    LocalDate deliveryDate;
    DeliveredOrder(int orderId,LocalDate orderDate,String trackingNumber,LocalDate deliveryDate){
        super(orderId,orderDate,trackingNumber);
        this.deliveryDate=deliveryDate;
    }
    @Override
    String getOrderStatus(){
        return "Order delivered on "+deliveryDate;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Delivery Date is "+deliveryDate);
    }
}
public class OrderInfo{
    public static void main(String[] args){
        Order order=new Order(101,LocalDate.of(2025,1,10));
        ShippedOrder shippedOrder=new ShippedOrder(102,LocalDate.of(2025,1,11),"UP12345");
        DeliveredOrder deliveredOrder=new DeliveredOrder(103,LocalDate.of(2025,1,13),"UP67890",LocalDate.of(2025, 1, 25));
        System.out.println("Order Details");
        order.displayInfo();
        System.out.println();
        System.out.println("Shipped Order Details");
        shippedOrder.displayInfo();
        System.out.println();
        System.out.println("Delivered Order Details");
        deliveredOrder.displayInfo();
    }
}
