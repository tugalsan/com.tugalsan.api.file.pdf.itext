package com.tugalsan.api.file.pdf.itext.server;

import com.itextpdf.text.pdf.PdfDocument;

public class TS_FilePdfItextPdfDocument extends PdfDocument implements AutoCloseable {

    @Override
    public void close() {
        super.close();
    }

}
