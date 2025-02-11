package com.mruruc.behavioral.visitor_pattern;

import java.util.List;

public class App {
    public static void main(String[] args) {
        var document = List.of(
                new Paragraph("Hello, Visitor Pattern"),
                new Image("photo.png")
        );

        Visitor htmlExporter = new HtmlExportVisitor();
        document.forEach(element -> element.accept(htmlExporter));

        Visitor pdfExport = new PdfExportVisitor();
        document.forEach(element -> element.accept(pdfExport));
    }
}
