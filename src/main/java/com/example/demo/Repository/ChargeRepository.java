package com.example.demo.Repository;

import com.example.demo.Domain.Charge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChargeRepository extends JpaRepository<Charge, Long> {

//    Charge findByRoomCode(String roomCode);

}
