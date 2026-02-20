package com.reto.builder.domain.builder;

import com.reto.builder.domain.enums.HouseType;
import com.reto.builder.domain.model.House;

public class HouseBuilder {

    private House house;

    public HouseBuilder() {
        this.house = new House();
    }

    public HouseBuilder foundation(String foundation) {
        house.setFoundation(foundation);
        return this;
    }

    public HouseBuilder structure(String structure) {
        house.setStructure(structure);
        return this;
    }

    public HouseBuilder roof(String roof) {
        house.setRoof(roof);
        return this;
    }

    public HouseBuilder windows(int windows) {
        house.setWindows(windows);
        return this;
    }

    public HouseBuilder doors(int doors) {
        house.setDoors(doors);
        return this;
    }

    public HouseBuilder garage(boolean garage) {
        house.setGarage(garage);
        return this;
    }

    public HouseBuilder garden(boolean garden) {
        house.setGarden(garden);
        return this;
    }

    public HouseBuilder basicMaterial(String basicMaterial) {
        house.setBasicMaterial(basicMaterial);
        return this;
    }

    public HouseBuilder pool(boolean pool) {
        house.setPool(pool);
        return this;
    }

    public HouseBuilder smartSystem(boolean smartSystem) {
        house.setSmartSystem(smartSystem);
        return this;
    }

    public HouseBuilder luxuryLevel(String luxuryLevel) {
        house.setLuxuryLevel(luxuryLevel);
        return this;
    }

    public HouseBuilder floors(int floors) {
        house.setFloors(floors);
        return this;
    }

    public HouseBuilder type(HouseType type) {
        house.setType(type);
        return this;
    }

    public House build() {
        return this.house;
    }
}