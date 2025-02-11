package com.mruruc.behavioral.visitor_pattern;

public record Image(String src) implements DocumentElement {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
