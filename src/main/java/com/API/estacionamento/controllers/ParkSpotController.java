package com.API.estacionamento.controllers;

import com.API.estacionamento.DTOs.ParkingSpotDTO;
import com.API.estacionamento.models.ParkingSpotModel;
import com.API.estacionamento.services.ParkSpotService;
import com.fasterxml.jackson.databind.util.BeanUtil;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parking-spot")
public class ParkSpotController {
    final ParkSpotService parkSpotService;
    public ParkSpotController(ParkSpotService parkSpotService) {
        this.parkSpotService = parkSpotService;
    }


    @PostMapping
    public ResponseEntity<Object>saveParkingSpot(@RequestBody @Valid ParkingSpotDTO parkingSpotDTO){
        var parkingSpotModel = new ParkingSpotModel();
        //BeanUtils.copyProperties converta o DTO para Model
        BeanUtils.copyProperties(parkingSpotDTO, parkingSpotModel);
        parkingSpotModel.setDataRegistro(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(parkSpotService.save(parkingSpotModel));
    }







}
