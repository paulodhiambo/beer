package com.odhiambopaul.beer.services.v2;

import com.odhiambopaul.beer.web.model.v2.BeerDTOV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDTOV2 getBeerById(UUID beerId);

    BeerDTOV2 insertBeer(BeerDTOV2 beerDTO);

    void updateBeer(UUID beerId, BeerDTOV2 beerDTO);

    void deleteById(UUID beerId);
}
