/**
 * Daisy Molina and Uday Brathwaite
 * ParserDemo.java
 * KAY Parser Driver
 */

public class ParserDemo {

    public static void main(String[] args) {
        // Require a filename argument
        if (args.length < 1) {
            System.out.println("Usage: java ParserDemo <filename.kay>");
            return;
        }

        String filename = args[0];

        try {
            // Use the filename you pass in — no hardcoded paths!
            TokenStream ts = new TokenStream(filename);
            ConcreteSyntax parser = new ConcreteSyntax(ts);

            // Parse the program and display the syntax tree
            Program program = parser.program();
            System.out.println(program.display());

            System.out.println("\n Parsing completed successfully for file: " + filename);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}

