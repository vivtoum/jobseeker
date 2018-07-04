package com.example.demo.Domain;

import javax.persistence.*;

@Entity
@Table(name = "room")
public class Room {

    @Id
    private String roomId;
    @Column(name = "room_code")
    private String roomCode;
    @Column(name = "room_rent")
    private String roomRent;
    @Column(name = "room_floor")
    private long roomFloor;
    @Column(name = "room_size")
    private double roomSize;
    @Column(name = "room_info")
    private String roomInfo;


    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }


    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }


    public String getRoomRent() {
        return roomRent;
    }

    public void setRoomRent(String roomRent) {
        this.roomRent = roomRent;
    }


    public long getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(long roomFloor) {
        this.roomFloor = roomFloor;
    }


    public double getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(double roomSize) {
        this.roomSize = roomSize;
    }


    public String getRoomInfo() {
        return roomInfo;
    }

    public void setRoomInfo(String roomInfo) {
        this.roomInfo = roomInfo;
    }

}
