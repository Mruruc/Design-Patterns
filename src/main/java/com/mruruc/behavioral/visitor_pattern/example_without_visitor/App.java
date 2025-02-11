package com.mruruc.behavioral.visitor_pattern.example_without_visitor;

import java.util.List;

import static com.mruruc.behavioral.visitor_pattern.example_without_visitor.DocumentProcessor.exportToHtml;
import static com.mruruc.behavioral.visitor_pattern.example_without_visitor.DocumentProcessor.exportToPdf;

public class App {
    public static void main(String[] args) {
        List<DocumentElement> document = List.of(
                new Paragraph("Hello, World!"),
                new Image("photo.jpg")
        );

        System.out.println(exportToHtml(document));
        System.out.println(exportToPdf(document));
    }
}
