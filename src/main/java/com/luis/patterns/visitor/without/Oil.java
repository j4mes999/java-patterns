package com.luis.patterns.visitor.without;

public class Oil implements AtvPart {
	@Override
	public double calculateShipping() {
		return 9;
	}
}
