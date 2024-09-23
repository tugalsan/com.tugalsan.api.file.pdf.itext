module com.tugalsan.api.file.pdf.itext {
    requires java.desktop;
    requires itextpdf;
    requires jai.imageio.core;
    requires com.tugalsan.api.union;
    requires com.tugalsan.api.unsafe;
    requires com.tugalsan.api.tuple;
    requires com.tugalsan.api.thread;
    requires com.tugalsan.api.stream;
    requires com.tugalsan.api.font;
    requires com.tugalsan.api.string;
    requires com.tugalsan.api.url;
    requires com.tugalsan.api.function;
    requires com.tugalsan.api.list;
    requires com.tugalsan.api.charset;
    requires com.tugalsan.api.log;
    requires com.tugalsan.api.shape;
    requires com.tugalsan.api.file;
    requires com.tugalsan.api.file.txt;
    requires com.tugalsan.api.file.common;
    requires com.tugalsan.api.file.html;
    requires com.tugalsan.api.file.img;
    exports com.tugalsan.api.file.pdf.itext.server;
}
