package com.pdfGenerator.pdfGenerator;

public class PdfForm {
    private String id;
    private String fileName;

    public PdfForm() {
    }

    public PdfForm(String id, String fileName) {
        this.id = id;
        this.fileName = fileName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
