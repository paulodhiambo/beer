package com.odhiambopaul.beer.services.v2;

import com.odhiambopaul.beer.web.model.v2.BeerDTOV2;
import com.odhiambopaul.beer.web.model.v2.BeerStyleEno;

import java.util.UUID;

public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDTOV2 getBeerById(UUID beerId) {
        return BeerDTOV2.builder().id(UUID.randomUUID())
                .beerName("Gallary Cat")
                .beerStyle(BeerStyleEno.ACE)
                .build();
    }

    @Override
    public BeerDTOV2 insertBeer(BeerDTOV2 beerDTO) {
        return BeerDTOV2.builder()
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDTOV2 beerDTO) {

    }

    @Override
    public void deleteById(UUID beerId) {

    }
}
