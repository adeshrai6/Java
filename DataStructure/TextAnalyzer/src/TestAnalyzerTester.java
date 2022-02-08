import java.util.Scanner;

public class TestAnalyzerTester {
    public static void main(String[] args) {
        System.out.println("TestAnalyzerTester");
        Scanner scanner = new Scanner(System.in);

      String fileName = "src/HumptyDumpty.txt";
//        String fileName = "src/OldMcDonald.txt";

        TestAnalyzer testAnalyzer = new TestAnalyzer();
        testAnalyzer.analyzeText(fileName);
        System.out.println("LineCount: " + testAnalyzer.getLineCount());
        System.out.println("WordCount: " + testAnalyzer.getWordCount());


        /***** Checking if the testAnalyzer is empty *******/
        if (testAnalyzer.getLineCount() > 0) {
            int[] frequency = testAnalyzer.getFrequencies();
            for (int i = 0; i < frequency.length; i++) {
                System.out.println("Frequency of " + (char) ('A' + i) + ": " + frequency[i]);
            }
        }

    }
}
