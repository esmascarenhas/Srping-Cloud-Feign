package br.com.tqi.store.api.controller;

import br.com.tqi.store.api.dto.BuyRequest;
import br.com.tqi.store.domain.service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buy")
public class StoreController {

    @Autowired
    private BuyService buyService;

    @PostMapping
    public void makeBuy(@RequestBody BuyRequest buyRequest){
        buyService.makeBuy(buyRequest);

    }
}
