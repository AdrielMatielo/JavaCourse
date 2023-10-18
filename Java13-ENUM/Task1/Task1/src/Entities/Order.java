package Entities;

import Entities.Enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime date;
    private OrderStatus status;
    private final List<OrderItem> items;
    private Client client;


    private DateTimeFormatter fmt_DD_MM_YYYY_HH_mm_SS = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Order(LocalDateTime date, OrderStatus status, Client client) {
        this.date = date;
        this.status = status;
        this.client = client;
        items = new ArrayList<>();
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item){
        this.items.add(item);
    }
    public void removeItem(OrderItem item){
        this.items.remove(item);
    }
    public double total(){
        double sum =0;
        for(OrderItem c: items){
            sum += c.subTotal();
        }
        return sum;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:\n");
        sb.append("Order moment: ").append(getDate().format(fmt_DD_MM_YYYY_HH_mm_SS)).append("\n");
        sb.append("Order status: ").append(getStatus());

        return sb.toString();
    }
    public String toStringItems(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order Items: \n");
        for(OrderItem c: items){
            sb.append(c).append("\n");
        }
        return sb.toString();
    }

}
