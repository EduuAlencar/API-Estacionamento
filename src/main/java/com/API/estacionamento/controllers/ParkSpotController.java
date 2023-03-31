package com.API.estacionamento.controllers;

import com.API.estacionamento.services.ParkSpotService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parking-spot")
public class ParkSpotController {
    final ParkSpotService parkSpotService;
    public ParkSpotController(ParkSpotService parkSpotService) {
        this.parkSpotService = parkSpotService;
    }







}
