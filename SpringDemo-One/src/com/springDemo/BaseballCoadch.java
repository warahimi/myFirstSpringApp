package com.springDemo;

public class BaseballCoadch implements Coach {
	
	//define a priavate field
	private FortuneService fortuneservice;
	
	//define a constructor for dependency injection 
	public BaseballCoadch(FortuneService theFortuneService) {
		fortuneservice = theFortuneService;
	}
	
	@Override
	public String getDailyWorkOut()
	{
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneService to get a fortune
		return fortuneservice.getFortune();
	}
	
	
}
