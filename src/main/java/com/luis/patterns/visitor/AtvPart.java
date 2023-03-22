package com.luis.patterns.visitor;

public interface AtvPart {
	public void accept(AtvPartVisitor visitor);
}
