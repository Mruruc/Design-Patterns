package com.mruruc.behavioral.visitor_pattern;

public record Paragraph(String content) implements DocumentElement {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
