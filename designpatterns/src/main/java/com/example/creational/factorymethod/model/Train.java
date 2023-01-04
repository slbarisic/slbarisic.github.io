package com.example.creational.factorymethod.model;

import com.example.creational.factorymethod.Transport;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

@Builder
@Slf4j
public class Train implements Transport {
    @Override
    public void load(){
        log.info("************ TRAIN CREATED. LOADING. ***************");
    }
}
