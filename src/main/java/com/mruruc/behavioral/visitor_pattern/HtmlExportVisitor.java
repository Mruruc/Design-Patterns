package com.mruruc.behavioral.visitor_pattern;

public class HtmlExportVisitor implements Visitor{
    @Override
    public void visit(Paragraph paragraph) {
        System.out.println("<p>" + paragraph.content()+ "</p>");
    }

    @Override
    public void visit(Image image) {
        System.out.println("<img src='" + image.src() + "'/>");
    }
}
