package com.reto.builder.rest.mapper;

import com.reto.builder.rest.dto.BasicHouseResponse;
import com.reto.builder.rest.dto.PremiumHouseResponse;
import com.reto.builder.domain.model.House;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper(componentModel = "spring")
public interface IHouseMapper {

    @Mapping(target = "type", expression = "java(house.getType().name())")
    BasicHouseResponse toBasicResponse(House house);

    @Mapping(target = "type", expression = "java(house.getType().name())")
    PremiumHouseResponse toPremiumResponse(House house);
}