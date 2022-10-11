# Scrabble challenge
## About the project
The aim of this project is to build a program with IntelliJ, using Java. 
</br></br>

## Built with
Java.
</br></br>

## Getting started
- To see this project, it is best to use IntelliJ.
- Clone this project to your local machine and open it on IntelliJ.\
\
You can run the tests in a few different ways:
- Right-click on the project and then select `Run all Tests`.
- Right-click on the `ScrabbleTest` and click `Run ScrabbleTest`.
- Open the class file `ScrabbleTest` and click the "Play" button to the left of the class declaration.
</br></br>

## Problem Statement
Given a word, compute the scrabble score for that word.

##### Letter Values

You'll need these:

| Letter                        | Value  |
| ----                          |  ----  |
| A, E, I, O, U, L, N, R, S, T  |     1  |
| D, G                          |     2  |
| B, C, M, P                    |     3  |
| F, H, V, W, Y                 |     4  |
| K                             |     5  |
| J, X                          |     8  |
| Q, Z                          |     10 |

Example
"cabbage" should be scored as worth 14 points:

- 3 points for C
- 1 point for A, twice
- 3 points for B, twice
- 2 points for G
- 1 point for E

And to total:

```
3 + 2x1 + 2x3 + 2 + 1
= 3 + 2 + 6 + 3
= 14
```

### Acceptance Criteria

```java

class ScrabbleRunner {

   public static void main(String[] args) {
      Scrabble scrabble = new Scrabble("");
      scrabble.score();   // => 0

      Scrabble scrabble = new Scrabble(null);
      scrabble.score();   // => 0

      Scrabble scrabble = new Scrabble("a");
      scrabble.score(); // => 1

      Scrabble scrabble = new Scrabble("f");
      scrabble.score(); // => 4

      Scrabble scrabble = new Scrabble("street");
      scrabble.score(); // =>, 6

      Scrabble scrabble = new Scrabble("quirky");
      scrabble.score(); // => 22

      Scrabble scrabble = new Scrabble("OXYPHENBUTAZONE");
      scrabble.score(); // => 41
   }
}
```

### Extended Acceptance Criteria
- Each `Scrabble` method should be no more than 5 lines and contain no more than 5 operations.
- You can play a double or a triple letter.
- You can play a double or a triple word.
</br></br>

## Review
This was my first contact with Java so I took a lot away from it! 
If I were to do this challenge again today, I would change a few things:
- I would make the scoreMap() method into a static method instead, saving the program from running the block every time it's instaciated. 
- I would make the catch block catch a NullPointerExceotion, which is the one thrown on the try when the word is an empty string or `null`.
- I would extract the logic for double and triple word from the score() method.\
As it is, this method is a bit convoluted with the for loop, the if-else statements and the try-catch block. By separating the double and triple word logic, I could simply multiply the total score by 2 or 3 if the word happens to be one of those cases. That would have also made it easier to complete the double or triple letter part of the criteria, which I didn't get to solve. 
</br></br>
