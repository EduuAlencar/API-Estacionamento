package com.API.estacionamento.DTOs;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.time.LocalDateTime;


@Data
public class ParkingSpotDTO {

    @NotBlank
    private String vagaEstacionanentoNumber;

   @NotBlank
   @Size(max = 7, min = 4)
    private String placaCarro;

   @NotBlank
    private String marcaCarro;

    @NotBlank
    private String modeloCarro;

    @NotBlank
    private String CorCarro;

    @NotBlank
    private LocalDateTime dataRegistro;

    @NotBlank
    private String nomeResponsavel;

   @NotBlank
    private String apartamento;

   @NotBlank
    private String bloco;




}
