package tn.esprit.mouhibsaleh.LogConfig;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {

    //  private static final Logger l = LogManager.getLogger(LoggingAspect.class);
    @Before("execution(* tn.esprit.mouhibsaleh.Services.*.Imp*.ajouter*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Début Exécution de la methode " + name + " : ");
    }

    @After("execution(* tn.esprit.mouhibsaleh.Services.*.Imp*.void*(..))")
    public void logMethodExit(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Début Exécution de la methode " + name + " : ");
    }
}
