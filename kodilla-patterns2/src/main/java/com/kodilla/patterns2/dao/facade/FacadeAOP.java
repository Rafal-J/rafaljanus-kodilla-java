package com.kodilla.patterns2.dao.facade;

import com.kodilla.patterns2.facade.api.OrderDto;
import com.kodilla.patterns2.facade.api.OrderProcessingException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component

public class FacadeAOP {
    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeAOP.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..)) && " +
            "args(order, userId) && target(object)")
    public void processOrderWatch(OrderDto order, Long userId, Object object) {
        LOGGER.info("Zarejestrowano wywołanie metody " + object.getClass().getSimpleName() +
        "\n Metoda została wywołana dla użytkownika o ID = " + userId);
    }

    @Around("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
        public Object executionTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;

        try {
            long start = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long finish = System.currentTimeMillis();
            LOGGER.info("Czas wywołania metody processOrder wyniósł" + (finish - start) + " ms");
        } catch (Throwable t){
            LOGGER.error("Wystąpił błąd");
            throw t;
        }
        return result;
    }

}
