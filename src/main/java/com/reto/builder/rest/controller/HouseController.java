    package com.reto.builder.rest.controller;

    import com.reto.builder.rest.dto.BasicHouseResponse;
    import com.reto.builder.rest.dto.PremiumHouseResponse;
    import com.reto.builder.rest.mapper.IHouseMapper;
    import com.reto.builder.domain.model.House;
    import com.reto.builder.domain.port.in.IHouseServicePort;
    import lombok.RequiredArgsConstructor;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/api/houses")
    @RequiredArgsConstructor
    public class HouseController {

        private final IHouseServicePort houseServicePort;
        private final IHouseMapper houseMapper;

        @GetMapping("/basic")
        public ResponseEntity<BasicHouseResponse> buildBasicHouse() {
            House house = houseServicePort.buildBasicHouse();
            return ResponseEntity.ok(houseMapper.toBasicResponse(house));
        }

        @GetMapping("/premium")
        public ResponseEntity<PremiumHouseResponse> buildPremiumHouse() {
            House house = houseServicePort.buildPremiumHouse();
            return ResponseEntity.ok(houseMapper.toPremiumResponse(house));
        }
    }