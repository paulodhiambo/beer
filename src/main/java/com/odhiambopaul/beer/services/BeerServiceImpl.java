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

    @Override
    public BeerDTO insertBeer(BeerDTO beerDTO) {
        return BeerDTO.builder()
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDTO beerDTO) {
        //todo add a real impl to update the beer
    }

    @Override
    public void deleteById(UUID beerId) {
        System.out.println("Deleting Beer....");
    }
}
