package com.example.demo.Service.Record;

import com.example.demo.Domain.Record;

import java.util.List;

public interface RecordService {

    List<Record> findTop2RecordByroomId(String roomId);
}
