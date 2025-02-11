package com.mruruc.behavioral.visitor_pattern.example_without_visitor;

import java.util.List;

public class DocumentProcessor {

    public static String exportToHtml(List<DocumentElement> elements) {
        var htmlBuilder = new StringBuilder();
        for (DocumentElement element : elements) {
            switch (element) {
                case Paragraph paragraph -> htmlBuilder.append("<p>")
                        .append(paragraph.content())
                        .append("</p>\n");
                case Image img -> htmlBuilder.append("<img src='")
                        .append(img.src())
                        .append("'/>\n");
                default -> throw new UnsupportedOperationException("Unexpected value: " + element);
            }
        }
        return htmlBuilder.toString();
    }

    public static String exportToPdf(List<DocumentElement> elements) {
        StringBuilder pdf = new StringBuilder();

        for (DocumentElement element : elements) {
            if (element instanceof Paragraph(String content)) {
                pdf.append("PDF Paragraph: ")
                        .append(content)
                        .append("\n");
            } else if (element instanceof Image(String src)) {
                pdf.append("PDF Image: ")
                        .append(src)
                        .append("\n");
            }
        }
        return pdf.toString();
    }
}
