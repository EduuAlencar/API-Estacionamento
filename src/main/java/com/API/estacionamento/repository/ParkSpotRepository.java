package com.API.estacionamento.repository;

import com.API.estacionamento.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;


@Repository
public interface ParkSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
}
