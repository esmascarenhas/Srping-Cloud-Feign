package br.com.tqi.store.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ItemsBuyRequest {

    private long id;
    private int quantity;
}
