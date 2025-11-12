/**
 * ScannerDemo.java
 * Demonstration of the KAY scanner
 */

public class ScannerDemo {

    public static void main(String args[]) {
        //Step 1: check that a filename was passed
        if (args.length < 1) {
            System.out.println("Usage: java ScannerDemo <filename.kay>");
            return;
        }

        //Step 2: use the filename from the command line
        String filename = args[0];
        TokenStream ts = new TokenStream(filename);

        System.out.println("Scanning file: " + filename + "\n");

        Token tk;
        int counter = 1;

        //Step 3: repeatedly read tokens until end of file
        while (!(tk = ts.nextToken()).getType().equals("EOF")) {
            System.out.println("Token " + counter++ + " - Type: " + tk.getType() + " - Value: " + tk.getValue());
        }

        //Step 4: finished scanning
        System.out.println("\n Scanner finished successfully! " + (counter - 1) + " tokens processed.");
    }
}
