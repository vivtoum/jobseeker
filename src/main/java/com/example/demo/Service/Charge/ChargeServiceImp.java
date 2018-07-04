package com.example.demo.Service.Charge;

import com.example.demo.Domain.Charge;
import com.example.demo.Repository.ChargeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ChargeServiceImp implements ChargeService {

    @Autowired
    ChargeRepository chargeRepository;

    @Override
    public List<Charge> findAll() {
        return chargeRepository.findAll();
    }
}
