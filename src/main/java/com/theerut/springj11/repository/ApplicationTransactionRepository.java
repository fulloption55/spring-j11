package com.theerut.springj11.repository;

import com.theerut.springj11.repository.entity.ApplicationTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ApplicationTransactionRepository extends JpaRepository<ApplicationTransactionEntity, String>, JpaSpecificationExecutor<ApplicationTransactionEntity> {

    ApplicationTransactionEntity findTopByUserIdAndActivityOrderByCreatedDatetimeDesc(String userId, int actionId);

}
