package com.odhiambopaul.beer.services;

import com.odhiambopaul.beer.web.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder().id(UUID.randomUUID())
                .beerName("Gallary Cat")
                .beerStyle("Pale Apple")
                .build();
    }
}
