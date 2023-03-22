package com.luis.patterns.visitor.without;

public class Fender implements AtvPart {
	@Override
	public double calculateShipping() {
		return 3;
	}
}
