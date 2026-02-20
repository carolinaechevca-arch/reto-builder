package com.reto.builder.rest.dto;


import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PremiumHouseResponse {
    private String type;
    private String foundation;
    private String structure;
    private String roof;
    private int windows;
    private int doors;
    private int floors;
    private boolean pool;
    private boolean smartSystem;
    private String luxuryLevel;
}