package com.reto.builder.domain.port.in;

import com.reto.builder.domain.model.House;

public interface IHouseServicePort {
    House buildBasicHouse();
    House buildPremiumHouse();
}
