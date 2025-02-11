package com.mruruc.behavioral.visitor_pattern;

public class PdfExportVisitor implements Visitor{
    @Override
    public void visit(Paragraph paragraph) {
        System.out.println("Exporting paragraph to PDF: " + paragraph.content());
    }

    @Override
    public void visit(Image image) {
        System.out.println("Exporting image to PDF: " + image.src());
    }
}
