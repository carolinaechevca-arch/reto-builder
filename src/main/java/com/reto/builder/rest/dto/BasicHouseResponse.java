package com.reto.builder.rest.dto;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BasicHouseResponse {
    private String type;
    private String foundation;
    private String structure;
    private String basicMaterial;
    private String roof;
    private int windows;
    private int doors;
    private boolean garage;
    private boolean garden;
}