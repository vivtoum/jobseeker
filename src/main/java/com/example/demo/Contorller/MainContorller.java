package com.example.demo.Contorller;

import com.example.demo.Domain.Record;
import com.example.demo.Domain.Room;
import com.example.demo.Domain.User;
import com.example.demo.Service.Charge.ChargeService;
import com.example.demo.Service.Record.RecordService;
import com.example.demo.Service.Room.RoomService;
import com.example.demo.Service.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/main")
public class MainContorller {

    @Autowired
    private ChargeService chargeService;
    @Autowired
    private UserService userService;
    @Autowired
    private RoomService roomService;
    @Autowired
    private RecordService recordService;

    @GetMapping(path = "/get/{name}")
    public String getRent(@PathVariable("name") String name) {
        User user = userService.findByUserName(name);
        Room room = roomService.findByRoomId(user.getRoomId());
        List<Record> records = recordService.findTop2RecordByroomId(user.getRoomId());
        int rent = 0,recordNum=0;
        rent += Integer.parseInt(room.getRoomRent());
        for (Record record : records) {
            System.out.println(record);
        }
        return null;
    }

}