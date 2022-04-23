package br.com.tqi.store.domain.service;

import br.com.tqi.store.api.dto.BuyRequest;
import br.com.tqi.store.api.dto.infoProviderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BuyService {
    @Autowired
    private RestTemplate client;


    public void makeBuy(BuyRequest buyRequest) {

        ResponseEntity<infoProviderRequest> exchange = client.exchange("http://provider/info/" + buyRequest.getAndress().getState(),
                HttpMethod.GET, null, infoProviderRequest.class);

        System.out.println(exchange.getBody().getAndress());
    }
}
