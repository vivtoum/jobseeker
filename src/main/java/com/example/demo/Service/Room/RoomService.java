package com.example.demo.Service.Room;

import com.example.demo.Domain.Room;

public interface RoomService {

    Room findByRoomCode(String roomCode);

    Room findByRoomId(String roomId);

}
