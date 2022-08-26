package com.ntuc.datah2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TxnAspects {

	Logger logger = LoggerFactory.getLogger(SpringAoPApplication.class);

	/*
	 * @Before("execution(public * withdrawAmt(..)) and args(amt)") public void
	 * createlog(float amt) { logger.info("Withdraw Initiated for " + amt ); }
	 * 
	 * @After("execution(public * withdrawAmt(..)) and args(amt)") public void
	 * createloga(float amt) { logger.info("Withdraw completed for "+ amt); }
	 */

	@Around("execution(public * withdrawAmt(..)) and args(amt)")
	public String chkAmt(ProceedingJoinPoint pjp, float amt) throws Throwable {
		if (amt > 1000) {
			logger.info("Limit exceeded");
			return "redirect:/reject";

		} else {
			logger.info("Withdraw successful");
			return (String) pjp.proceed();
		}
	}
}
