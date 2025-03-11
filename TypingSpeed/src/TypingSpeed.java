import java.util.Scanner;

public class TypingSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sampleText = "Java is a high-level programming language.";
        
        System.out.println("Type this as fast as you can: \n" + sampleText);
        System.out.println("Press Enter to start...");
        sc.nextLine();

        long startTime = System.currentTimeMillis();
        String typedText = sc.nextLine();
        long endTime = System.currentTimeMillis();

        int words = typedText.split("\s+").length;
        double timeTaken = (endTime - startTime) / 1000.0;
        double wpm = (words / timeTaken) * 60;

        System.out.printf("You typed at %.2f words per minute.\n", wpm);
    }
}

