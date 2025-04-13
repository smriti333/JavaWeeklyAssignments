package main;

public class PunctuationCounter {
	public static void main(String[] args) {
        String text = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end.";

        // Defining punctuation marks to count
        char[] punctuations = { '.', ',', '-' };

        // Initializing the counters for each punctuation mark
        int[] counts = new int[punctuations.length];

        // Counting occurrences
        for (char ch : text.toCharArray()) {
            for (int i = 0; i < punctuations.length; i++) {
                if (ch == punctuations[i]) {
                    counts[i]++;
                }
            }
        }

       
        System.out.println("Punctuation Mark | Occurrences");
        System.out.println("-----------------|------------");

        for (int i = 0; i < punctuations.length; i++) {
            if (counts[i] > 0) {
                System.out.printf("       %c         |     %d%n", punctuations[i], counts[i]);
            }
        }
    }
}


