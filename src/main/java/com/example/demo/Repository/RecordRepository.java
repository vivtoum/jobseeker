package com.example.demo.Repository;

import com.example.demo.Domain.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecordRepository extends JpaRepository<Record, Long> {

    @Query(value = "SELECT * FROM `record` x WHERE x.room_id=?1 ORDER BY  x.record_time", nativeQuery = true)
    List<Record> findTop2RecordByroomId(String roomId);

}
