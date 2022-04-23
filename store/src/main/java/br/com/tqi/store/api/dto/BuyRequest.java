package br.com.tqi.store.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter @Setter
public class BuyRequest {

    private List<ItemsBuyRequest> items;
    private AndressRequest andress;
}
