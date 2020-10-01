package com.theerut.springj11.service;


import com.theerut.springj11.repository.ProductFeatureRepository;
import com.theerut.springj11.repository.entity.ProductFeatureEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductFeatureService {
    private final ProductFeatureRepository productFeatureRepository;

    List<ProductFeatureEntity> getProductFeatureList() {
        Optional<List<ProductFeatureEntity>> entity = Optional.of(productFeatureRepository
                .findAll());
        return entity.orElse(new ArrayList<>());
    }

}
