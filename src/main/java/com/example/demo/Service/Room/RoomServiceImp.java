package com.example.demo.Service.Room;

import com.example.demo.Domain.Room;
import com.example.demo.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoomServiceImp implements RoomService {

    @Autowired
    RoomRepository roomRepository;


    @Override
    public Room findByRoomCode(String roomCode) {
        return roomRepository.findByRoomCode(roomCode);
    }

    @Override
    public Room findByRoomId(String roomId) {
        return roomRepository.findByRoomId(roomId);
    }
}
