# Scrabble challenge

##  Approach

To tackle the acceptance criteria, I gave Scrabble 2 private members: word(string) and totalScore(integer) with a default value of 0. 
Then created a public constructor that takes an argument of string, which will be the value of word.
To have access to the scores, I thought the best would be to create a HashMap that takes character and integer as key-value pairs. This HashMap is called scoring and is private. 
I then used .put(K,V) to add each letter with its value. I did this inside a function called scoreMap(). It took me a while to understand where to call it so the hashMap would have all the values for each scrabble instance. In the end I called it in the constructor, so with each instance it gets called and sets the hashMap with all its contents. 

For score() I decided to use try-catch-finally to try and take advantage of the exception that empty string and null would throw. 
It first tries to convert the word to upper case, using .toUpperCase(). If this works, we loop through the word and set totalScore to be the result of adding the value of each of the letters in the word. 
I've used .get()  to retrieve the value of the letter in scoring, and charAt() to get each letter in the word.

If toUpperCase() doesn't work, it throws an exception that is caught and sets totalScore to 0.
Finally returns totalScore.

For the extended criteria, through the tests I understood I would need to overload Scrabble with a second constructor that took 5 arguments. 
I added 4 more private members: isDouble and isTriple as booleans, doubleChar and TripleChar. 
In the second constructor I set it so isDouble would take the value of doubleWord, doubleChar of doubleLetter etc. I also implemented in the constructor the function scoreMap().

I have only implemented code to pass the tests on double and triple words. I have added conditions to the loop in score(): 
if the instance of Scrabble has a value of true assigned to isDouble, totalScore would be the result of the original operation, multiplied by 2. 
If isTriple is true, the result would be multiplied by 3 instead. 
The rest of the code runs as it did before. 

I didn't get to add any code to pass the double and triple letter tests, although I will try to do it during upcoming self-study time to help me study Java.












# Scrabble Challenge - this time in Java!

Welcome to the Scrabble challenge!

## Learning Objectives
- Build a simple program using functions, loops, and flow control
- Use `git` & GitHub to commit work and open a Pull Request

## Instructions

1. Fork this repository and then:
```sh
$ git clone git@github.com:digital-futures-academy/scrabble-challenge.git && cd scrabble-challenge
```
2. Run the tests from IntelliJ. There should be a lot of failures to begin with. You can run your test suite in a few ways:
   1. Right-click on the project and then select `Run all Tests`
   2. Right-click on the `ScrabbleTest` and click `Run ScrabbleTest`
   3. Open the class file `ScrabbleTest` and click the "Play" button to the left of the class declaration

Your first error when running the tests should be this:

![Initial Error](images/InitialError.png)

3. In GitHub, [open a Pull Request](https://docs.github.com/en/github/collaborating-with-issues-and-pull-requests/creating-a-pull-request) from your forked repository to the challenge repository.
4. Implement the criteria below locally and [push your code](https://docs.github.com/en/github/managing-files-in-a-repository/adding-a-file-to-a-repository-using-the-command-line) to your repository! Every push to a branch that has an open Pull Request will update it automatically with your changes.

# Task

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

## Acceptance Criteria

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

## Extended Acceptance Criteria
> Each `Scrabble` method should be no more than 5 lines and contain no more than 5 operations.

> You can play a double or a triple letter.

> You can play a double or a triple word.