package com.reto.builder.domain.usecase;


import com.reto.builder.domain.builder.HouseBuilder;
import com.reto.builder.domain.enums.HouseType;
import com.reto.builder.domain.model.House;
import com.reto.builder.domain.port.in.IHouseServicePort;
import org.springframework.stereotype.Service;

@Service
public class BuildHouseUseCase implements IHouseServicePort {

    @Override
    public House buildBasicHouse() {
        return new HouseBuilder()
                .type(HouseType.BASIC)
                .foundation("Concrete slab foundation")
                .structure("Standard brick structure")
                .basicMaterial("Brick")
                .roof("Standard tile roof")
                .windows(6)
                .doors(3)
                .garage(false)
                .garden(true)
                .build();
    }

    @Override
    public House buildPremiumHouse() {
        return new HouseBuilder()
                .type(HouseType.PREMIUM)
                .foundation("Reinforced deep foundation")
                .structure("Steel and glass structure")
                .roof("Thermal insulated smart roof")
                .windows(20)
                .doors(8)
                .floors(3)
                .pool(true)
                .smartSystem(true)
                .luxuryLevel("HIGH")
                .build();
    }
}