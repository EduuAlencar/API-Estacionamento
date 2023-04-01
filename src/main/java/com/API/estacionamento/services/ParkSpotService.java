package com.API.estacionamento.services;

import com.API.estacionamento.models.ParkingSpotModel;
import com.API.estacionamento.repository.ParkSpotRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class ParkSpotService {


    final ParkSpotRepository parkSpotRepository;

    public ParkSpotService(ParkSpotRepository parkSpotRepository){
        this.parkSpotRepository = parkSpotRepository;
    }


    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkSpotRepository.save(parkingSpotModel);
    }
}
