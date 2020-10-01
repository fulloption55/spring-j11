package com.theerut.springj11.controller.validator;

import com.theerut.springj11.annotation.LimitDateRange;
import com.theerut.springj11.config.ApplicationConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@RequiredArgsConstructor
public class LimitDateRangeValidator implements ConstraintValidator<LimitDateRange, Object> {
    private final ApplicationConfiguration applicationConfiguration;

    private String startDate;
    private String endDate;

    @Override
    public void initialize(final LimitDateRange constraintAnnotation) {
        startDate = constraintAnnotation.startDate();
        endDate = constraintAnnotation.endDate();
    }

    @Override
    public boolean isValid(final Object value, final ConstraintValidatorContext context) {
        try {
            BeanWrapper beanWrapper = PropertyAccessorFactory.forBeanPropertyAccess(value);
            final LocalDate startLocalDate = (LocalDate) beanWrapper.getPropertyValue(startDate);
            assert startLocalDate != null;
            final LocalDate endLocalDate = (LocalDate) beanWrapper.getPropertyValue(endDate);
            final long range = ChronoUnit.DAYS.between(startLocalDate, endLocalDate);
            return applicationConfiguration.getValidatorRangeDays() > range;
        } catch (final Exception ignore) {
            return false;
        }
    }
}