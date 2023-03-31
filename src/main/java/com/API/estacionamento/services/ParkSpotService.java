package com.API.estacionamento.services;

import com.API.estacionamento.repository.ParkSpotRepository;
import org.springframework.stereotype.Service;

@Service
public class ParkSpotService {


    final ParkSpotRepository parkSpotRepository;

    public ParkSpotService(ParkSpotRepository parkSpotRepository){
        this.parkSpotRepository = parkSpotRepository;
    }
}
