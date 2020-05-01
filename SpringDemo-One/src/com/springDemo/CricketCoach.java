package com.springDemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	@Override
	public String getDailyWorkOut() {
		return "Practice fast bowling for 15 minutes a day";
	}

	@Override
	public String getDailyFortune() {
		return "Forntune From CricketCoach : "+ fortuneService.getFortune();
	}
	
	public CricketCoach() {
		System.out.println("CricketCoach: we are inside the CricketCoach Constructor..... ");
	}
	
	
	//Create the setter method, this will be called by spring when we inject the dependency
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("CricketCoach: we are inside the CricketCoach Stter method setFortuneService()..... ");

	}
	
	

}
