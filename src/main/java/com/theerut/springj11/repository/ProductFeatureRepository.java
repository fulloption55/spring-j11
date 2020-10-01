package com.theerut.springj11.repository;

import com.theerut.springj11.repository.entity.ProductFeatureEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductFeatureRepository extends JpaRepository<ProductFeatureEntity, String> {
}
