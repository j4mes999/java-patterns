package com.luis.patterns.visitor.without;

public class Wheel implements AtvPart {
	@Override
	public double calculateShipping() {
		return 12;
	}
}
