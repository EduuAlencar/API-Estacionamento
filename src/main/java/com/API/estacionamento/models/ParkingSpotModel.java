package com.API.estacionamento.models;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "PARKING_SPOT")
public class ParkingSpotModel implements Serializable {
    private static final long serialVasionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false,unique = true,length = 10)
    private String vagaEstacionanentoNumber;

    @Column(nullable = false, unique = true,length = 7)
    private String placaCarro;

    @Column(nullable = false,length = 70)
    private String marcaCarro;

    @Column(nullable = false, length = 70)
    private String modeloCarro;

    @Column(nullable = false,length = 70)
    private String CorCarro;

    @Column(nullable = false)
    private LocalDateTime dataRegistro;

    @Column(nullable = false,length = 130)
    private String nomeResponsavel;

    @Column(nullable = false,length = 30)
    private String apartamento;

    @Column(nullable = false,length = 30)
    private String bloco;

}
