package com.example.demo.Contorller;

import com.example.demo.Domain.Room;
import com.example.demo.Service.Room.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/room")
public class RoomContorller {

    @Autowired
    private RoomService roomService;

    @GetMapping(path = "/get")
    public Room getByUserName(@RequestParam("roomCode") String roomCode) {
        Room room = roomService.findByRoomCode(roomCode);
        System.out.println(room);
        return room;
    }

//    @GetMapping(value = "/getUserList")
//    public List<User> getUserList() {
//        List<User> users = userService.getUserList();
//        return users;
//    }

}