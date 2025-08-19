package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggerAspect {

    private final Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* beans.*.*(..))")
    public Object log(ProceedingJoinPoint jp) throws Throwable {
        logger.info("Method Execution Start: " + jp.getSignature());
        long startTime = System.currentTimeMillis();
        Object result=jp.proceed();
        long endTime = System.currentTimeMillis();
        logger.info("Time taken: " + (endTime - startTime) + " ms");
        logger.info("Method Execution End: " + jp.getSignature());
        return result;
    }
}
