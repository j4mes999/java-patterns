package com.luis.patterns.state;

public class FanLowState extends State {

	private Fan fan;

	public FanLowState(final Fan fan) {
		this.fan = fan;
	}

	@Override
	public void handleRequest() {
		System.out.println("Turning fan on to Med");
		fan.setState(fan.getFanMedState());
	}

	public String toString(){
		return "Fan is Low";
	}
}
