package combinedassignment7;

abstract class Document {
 private String title;
 private int size;

 public Document(String title, int size) {
     this.title = title;
     this.size = size;
 }

 public abstract String getType();

 public String getTitle() {
     return title;
 }
 public int getSize() {
     return size;
 }

 public abstract void printContent();
}

class PDFDocument extends Document {
 private String content;

 public PDFDocument(String title, int size, String content) {
     super(title, size);
     this.content = content;
 }

 
 public String getType() {
     return "PDF";
 }

 
 public void printContent() {
     System.out.println("Printing PDF content:");
     System.out.println(content);
 }
}


class TextDocument extends Document {
 private String content;

 public TextDocument(String title, int size, String content) {
     super(title, size);
     this.content = content;
 }

 
 public String getType() {
     return "Text";
 }

 
 public void printContent() {
     System.out.println("Printing text content:");
     System.out.println(content);
 }
}


class ImageDocument extends Document {
 private byte[] imageData;

 public ImageDocument(String title, int size, byte[] imageData) {
     super(title, size);
     this.imageData = imageData;
 }

 
 public String getType() {
     return "Image";
 }


 public void printContent() {
     System.out.println("Printing image content:");
    
 }
}

public class AbstractDocument{
 public static void main(String[] args) {
     Document pdfDoc = new PDFDocument("SamplePDF", 1024, "This is a PDF document.");
     Document textDoc = new TextDocument("SampleText", 512, "This is a text document.");
     Document imageDoc = new ImageDocument("SampleImage", 2048, new byte[]{});

   
     System.out.println("PDF Title: " + pdfDoc.getTitle());
     System.out.println("PDF Size: " + pdfDoc.getSize());
     System.out.println("PDF Type: " + pdfDoc.getType());
     pdfDoc.printContent();

     System.out.println("\nText Title: " + textDoc.getTitle());
     System.out.println("Text Size: " + textDoc.getSize());
     System.out.println("Text Type: " + textDoc.getType());
     textDoc.printContent();

     System.out.println("\nImage Title: " + imageDoc.getTitle());
     System.out.println("Image Size: " + imageDoc.getSize());
     System.out.println("Image Type: " + imageDoc.getType());
     imageDoc.printContent();
 }
}
