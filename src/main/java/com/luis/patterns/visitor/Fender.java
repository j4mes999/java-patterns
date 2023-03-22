package com.luis.patterns.visitor;

public class Fender implements AtvPart {
	@Override
	public void accept(final AtvPartVisitor visitor) {
		visitor.visit(this);
	}
}
