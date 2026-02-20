package com.reto.builder.domain.model;

import com.reto.builder.domain.enums.HouseType;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class House {

    private HouseType type;

    // Common
    private String foundation;
    private String structure;
    private String roof;
    private int windows;
    private int doors;

    // Basic
    private boolean garage;
    private boolean garden;
    private String basicMaterial;

    // Premium
    private boolean pool;
    private boolean smartSystem;
    private String luxuryLevel;
    private int floors;
}
