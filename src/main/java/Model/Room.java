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
    private int roomId;
    private String roomtype;
    private int capacity;
    private float price;
    private String status;
    private String messages;

    public Room(int roomId, String roomtype, int capacity, float price, String status, String messages) {
        this.roomId = roomId;
        this.roomtype = roomtype;
        this.capacity = capacity;
        this.price = price;
        this.status = status;
        this.messages = messages;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
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

    public void setPrice(float price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "Room{" + "roomId=" + roomId + ", roomtype=" + roomtype + ", capacity=" + capacity + ", price=" + price + ", status=" + status + ", messages=" + messages + '}';
    }

    public Room() {
        
    }
    
}
