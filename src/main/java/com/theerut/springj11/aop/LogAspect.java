package com.theerut.springj11.aop;

import com.theerut.springj11.utils.EXAMPayload;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import static org.apache.commons.lang3.StringUtils.SPACE;

@Aspect
@Component
public class LogAspect {

    @Around(value = "@annotation(com.theerut.springj11.annotation.LogTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        final Instant start = Instant.now();
        final Object proceed = joinPoint.proceed();
        final long executionTime = ChronoUnit.MILLIS.between(start, Instant.now());
        final Logger log = LoggerFactory.getLogger(joinPoint.getTarget().getClass());
        log.info("Method {} executed in {} ms"
                , joinPoint.getSignature().getName()
                , executionTime);
        return proceed;
    }

    @Around(value = "@annotation(com.theerut.springj11.annotation.LogStartEnd)")
    public Object logStartEnd(ProceedingJoinPoint joinPoint) throws Throwable {
        final Logger log = LoggerFactory.getLogger(joinPoint.getTarget().getClass());
        final Signature codeSignature = joinPoint.getSignature();
        final String symbol = "==========";
        final String startMessageTemplate = "Start to {}";
        final String endMessageTemplate = "End to {}";
        final String withUserID = " by user ID [{}] and user type [{}]";
        final String methodName = StringUtils.join(
                StringUtils.splitByCharacterTypeCamelCase(codeSignature.getName()),
                SPACE);

        final Object[] arguments = joinPoint.getArgs();

        if (arguments.length > 0 && arguments[0] instanceof EXAMPayload) {
            final EXAMPayload payload = (EXAMPayload) arguments[0];
            final String userId = payload.getUserId();
            final String userType = payload.getUserType();

            final StringBuilder startBuilder = new StringBuilder();
            startBuilder.append(symbol).append(SPACE).append(startMessageTemplate).append(withUserID).append(SPACE).append(symbol);
            final String startMessage = startBuilder.toString();
            final StringBuilder endBuilder = new StringBuilder();
            endBuilder.append(symbol).append(SPACE).append(endMessageTemplate).append(withUserID).append(SPACE).append(symbol);
            final String endMessage = endBuilder.toString();

            log.info(startMessage, methodName, userId, userType);
            final Object proceed = joinPoint.proceed();
            log.info(endMessage, methodName, userId, userType);
            return proceed;
        }

        final StringBuilder startBuilder = new StringBuilder();
        startBuilder.append(symbol).append(SPACE).append(startMessageTemplate).append(SPACE).append(symbol);
        final String startMessage = startBuilder.toString();
        final StringBuilder endBuilder = new StringBuilder();
        endBuilder.append(symbol).append(SPACE).append(endMessageTemplate).append(SPACE).append(symbol);
        final String endMessage = endBuilder.toString();

        log.info(startMessage, methodName);
        final Object proceed = joinPoint.proceed();
        log.info(endMessage, methodName);
        return proceed;
    }


}