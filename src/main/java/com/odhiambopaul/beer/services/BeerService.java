package com.odhiambopaul.beer.services;

import com.odhiambopaul.beer.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    BeerDTO getBeerById(UUID beerId);
}
