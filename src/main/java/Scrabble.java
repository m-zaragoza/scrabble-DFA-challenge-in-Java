import java.util.HashMap;

public class Scrabble {
    private String word;
    private int totalScore = 0;
    private boolean isDouble;
    private boolean isTriple;
    private Character doubleChar[];
    private Character tripleChar[];
    private HashMap<Character, Integer> scoring = new HashMap<>();
    public Scrabble(String word) {
        this.word = word;
        scoreMap();
    }
    public Scrabble(String  word, Character[] doubleLetter, Character[] tripleLetter, boolean doubleWord, boolean tripleWord ) {
        this.word = word;
        this.isDouble = doubleWord;
        this.isTriple = tripleWord;
        this.doubleChar = doubleLetter;
        this.tripleChar = tripleLetter;
        scoreMap();
    }


    public int score() {
        try {
            String wordToScore = this.word.toUpperCase();
            for (int i = 0; i < wordToScore.length(); i++) {
                if (isDouble == true) {
                    totalScore += scoring.get(wordToScore.charAt(i))*2;
                } else if (isTriple == true) {
                    totalScore += scoring.get(wordToScore.charAt(i))*3;
                } else {
                    totalScore += scoring.get(wordToScore.charAt(i));
                }
            }
        } catch (Exception e) {
            totalScore = 0;
        } finally {
            return totalScore;
        }
    }
    private void scoreMap() {
        scoring.put('A', 1);
        scoring.put('E', 1);
        scoring.put('I', 1);
        scoring.put('O', 1);
        scoring.put('U', 1);
        scoring.put('L', 1);
        scoring.put('N', 1);
        scoring.put('R', 1);
        scoring.put('S', 1);
        scoring.put('T', 1);
        scoring.put('D', 2);
        scoring.put('G', 2);
        scoring.put('B', 3);
        scoring.put('C', 3);
        scoring.put('M', 3);
        scoring.put('P', 3);
        scoring.put('F', 4);
        scoring.put('H', 4);
        scoring.put('V', 4);
        scoring.put('W', 4);
        scoring.put('Y', 4);
        scoring.put('K', 5);
        scoring.put('J', 8);
        scoring.put('X', 8);
        scoring.put('Q', 10);
        scoring.put('Z', 10);
    }
}




