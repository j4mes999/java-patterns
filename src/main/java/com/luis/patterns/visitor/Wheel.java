package com.luis.patterns.visitor;

public class Wheel implements AtvPart {
	@Override
	public void accept(final AtvPartVisitor visitor) {
		visitor.visit(this);
	}
}
