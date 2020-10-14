package com.odhiambopaul.beer.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
//creates the getter and setters
@NoArgsConstructor
@AllArgsConstructor
@Builder
//implements the builder pattern
public class BeerDTO {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;
}
