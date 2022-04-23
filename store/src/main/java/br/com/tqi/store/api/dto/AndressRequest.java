package br.com.tqi.store.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AndressRequest {

    private String street;
    private int number;
    private String state;
}
