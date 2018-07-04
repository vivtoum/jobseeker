package com.example.demo.Contorller;

import com.example.demo.Domain.Charge;
import com.example.demo.Service.Charge.ChargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/charge")
public class ChargeContorller {

    @Autowired
    private ChargeService chargeService;

    @GetMapping(path = "/findAll")
    public List<Charge> findAll() {
        return chargeService.findAll();
    }

}