package com.config;

import com.model.Bikes;
import org.springframework.batch.item.ItemProcessor;

public class BikeProcessor implements ItemProcessor<Bikes,Bikes> {

    @Override
    public Bikes process(Bikes bikes) throws Exception {
        return bikes;
    }
}
