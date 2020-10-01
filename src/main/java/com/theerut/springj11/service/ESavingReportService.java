package com.theerut.springj11.service;

import com.theerut.springj11.repository.ApplicationTransactionRepository;
import com.theerut.springj11.repository.entity.ApplicationTransactionEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;

@Slf4j
@Service
@RequiredArgsConstructor
public class ESavingReportService {
    private final ApplicationTransactionRepository applicationTransactionRepository;

    public Page<ApplicationTransactionEntity> getApplicationByCriteria(LocalDateTime startDate, LocalDateTime endDate, String userId, Integer actionId, int pageIndex, int recordPerPage) {
        Specification<ApplicationTransactionEntity> specification = getApplicationTransactionSpecification(startDate, endDate, userId, actionId);
        Pageable pageable = PageRequest.of(pageIndex, recordPerPage, Sort.by("createdDatetime").descending());
        return applicationTransactionRepository.findAll(specification, pageable);
    }

    private Specification<ApplicationTransactionEntity> getApplicationTransactionSpecification(LocalDateTime startDate, LocalDateTime endDate, String userId, Integer actionId) {
        Specification<ApplicationTransactionEntity> specification = (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.between(root.get("createdDatetime"), startDate, endDate);
        if (!StringUtils.isEmpty(userId)) {
            specification = specification.and((root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("userId"), userId));
        }
        if (!StringUtils.isEmpty(actionId)) {
            specification = specification.and((root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("activity"), actionId));
        }
        return specification;
    }
}
