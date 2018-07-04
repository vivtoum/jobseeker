package com.example.demo.Domain;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    private String userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_password")
    private String userPassword;
    @Column(name = "user_sex")
    private String userSex;
    @Column(name = "user_tel")
    private String userTel;
    @Column(name = "user_idcard")
    private String userIdcard;
    @Column(name = "room_id")
    private String roomId;
    @Column(name = "user_stata")
    private long userStata;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }


    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }


    public String getUserIdcard() {
        return userIdcard;
    }

    public void setUserIdcard(String userIdcard) {
        this.userIdcard = userIdcard;
    }


    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }


    public long getUserStata() {
        return userStata;
    }

    public void setUserStata(long userStata) {
        this.userStata = userStata;
    }

}
