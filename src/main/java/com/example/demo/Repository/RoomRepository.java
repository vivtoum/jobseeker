package com.example.demo.Repository;

import com.example.demo.Domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {

    Room findByRoomCode(String roomCode);


    Room findByRoomId(String roomId);

}
