package com.example.demo.Service.Record;

import com.example.demo.Domain.Record;
import com.example.demo.Repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RecordServiceImp implements RecordService {

    @Autowired
    RecordRepository recordRepository;

    @Override
    public List<Record> findTop2RecordByroomId(String roomId) {
        return recordRepository.findTop2RecordByroomId(roomId);
    }
}
