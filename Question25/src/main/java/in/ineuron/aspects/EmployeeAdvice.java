package in.ineuron.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAdvice {

	private Logger logger = LoggerFactory.getLogger(EmployeeAdvice.class);

	@Pointcut("execution(public * in.ineuron.service.EmployeeServiceImpl.saveEmployeeDetails(..))")
	public void p1() {
	}

	@Before("p1()")
	public void before() {
		logger.info("Method saveEmployeeDetails is called for saving the data ");
	}

	@After("p1()")
	public void after() {
		logger.info("Execution has been returned to from where the saveEmployeeDetails is called");
	}

	@AfterReturning("p1()")
	public void afterReturing() {
		logger.info("Method saveEmployeeDetails is called for saving the data and data has been saved successfully ");
	}

	@AfterThrowing("p1()")
	public void afterThrowing() {
		logger.info("Method saveEmployeeDetails has thrown an exception ");
	}
}
