/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PC
 */
public class Room {
    private String roomId;
    private String roomtype;
    private int capacity;
    private double price;
    private String status;

    public Room(String roomId, String roomtype, int capacity, double price, String status) {
        this.roomId = roomId;
        this.roomtype = roomtype;
        this.capacity = capacity;
        this.price = price;
        this.status = status;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Room{" + "roomId=" + roomId + ", roomtype=" + roomtype + ", capacity=" + capacity + ", price=" + price + ", status=" + status + '}';
    }
    
    
}
