package combinedassignment14;

class PrinterSync {
    public void printDocument(String documentName) {
        synchronized (this) {
            System.out.println("Printing document: " + documentName + " by " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class PrintTask implements Runnable {
    private PrinterSync printer;
    private String documentName;

    public PrintTask(PrinterSync printer, String documentName) {
        this.printer = printer;
        this.documentName = documentName;
    }


    public void run() {
        while (true) {
            printer.printDocument(documentName);
        }
    }
}

public class Printer {
    public static void main(String[] args) {
        PrinterSync printer = new PrinterSync();

        
        Thread thread1 = new Thread(new PrintTask(printer, "Document1"));
        Thread thread2 = new Thread(new PrintTask(printer, "Document2"));

      
        thread1.start();
        thread2.start();
    }
}
