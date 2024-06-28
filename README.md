# Hangman Game in Java

## Game Description

Hangman is a classic word game where the player must guess a hidden word letter by letter. In this version of the game, it is played through the terminal and the player has a maximum of 5 attempts to guess the word before losing.

## Features

- Implemented in Java.
- Uses the `Scanner` class for user input.
- The player has 5 attempts to guess the word.
- Displays the current state of the word after each attempt.
- Indicates whether the player's guessed letter is correct or incorrect.
- Shows a victory or defeat message at the end of the game.

## System Requirements

- Java Development Kit (JDK) 8 or higher.
- Operating system capable of running Java applications.

## Installation and Execution Instructions

1. **Download the Source Code**:
   - Clone or download the `Hangman.java` file from this repository.

2. **Compile and Run**:
   - Open a terminal and navigate to the directory containing `Hangman.java`.
   - Compile the code using the following command:
     ```sh
     javac Hangman.java
     ```
   - Run the game with the command:
     ```sh
     java Hangman
     ```

## How to Play

1. When the game starts, a series of underscores (`_`) representing the letters of the word to be guessed will be displayed.
2. The player enters one letter per attempt when prompted.
3. If the letter is in the word, its position will be revealed among the underscores.
4. If the letter is not in the word, a message will indicate how many attempts the player has left.
5. The game continues until the player guesses the entire word or runs out of attempts.

## Example Usage

```sh
_ _ _ _ _ _ _ _ _ _

Enter a letter: d
_ _ _ _ _ _ _ _ _ _

Enter a letter: e
_ e _ e _ _ _ e _ _

Enter a letter: v
_ e _ e _ o _ e _ _

Enter a letter: l
_ e _ e l o _ e _ _

Enter a letter: p
Incorrect! You have 4 attempts left.

Enter a letter: m
_ e _ e l o m e _ _

Enter a letter: n
Correct! Congratulations, you have guessed the secret word! development
