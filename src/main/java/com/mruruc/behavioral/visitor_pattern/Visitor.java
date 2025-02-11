package com.mruruc.behavioral.visitor_pattern;

public interface Visitor {
    void visit(Paragraph paragraph);

    void visit(Image image);
}
