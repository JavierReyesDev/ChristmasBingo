# Christmas Bingo

Christmas Bingo is a fun, interactive Java game designed to bring holiday cheer! This program allows you to play a custom bingo game using predefined game sets of numbers, with the flexibility for users to extend or modify the sets according to their preferences.

## Features

- **Ascii Art**: Displays a festive header to set the holiday mood.
- **Custom Game Sets**: Users can select one of three predefined game sets, which can be easily extended to include user-defined numbers.
- **Interactive Gameplay**: Numbers are drawn randomly, and scored numbers are tracked until the game concludes.

## How It Works

1. **Game Sets**: The game starts by presenting three predefined sets of numbers. These are stored in the `GameSets` class and can be modified as needed by the user.
2. **Game Start**: Choose a game set to play with. The numbers from the selected set are randomized and presented one by one as you press Enter.
3. **Scored Numbers**: Each drawn number is displayed and tracked. The game ends when all numbers in the set are drawn.
4. **Exit Option**: You can exit the game at the start by selecting the Grinch option (`0`).

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher.
- A terminal or IDE to run the program.

### Compiling and Running the Game

1. **Compile the Program**:
   From the project directory, run the following command to compile the source code into a `compiled` directory:

   ```sh
   javac -d compiled src/christmas_bingo/*.java
   ```

2. **Run the Compiled Program**:
   From the project directory, execute the compiled program using the following command:

   ```sh
   java -cp compiled christmas_bingo.ChristmasBingo
   ```

3. Follow the on-screen instructions to play the game.

## Classes

### `GameSets`

This class contains the predefined bingo number sets. By default, it includes three sets, but you can modify or add sets to customize the game.

#### Adding or Modifying Game Sets

To introduce new game sets or adjust the numbers, edit the `all_numbers` array in the `GameSets` class:

```java
int[][] all_numbers = {
    // GameSet 1
    { 1, 2, 3, ... },
    // GameSet 2
    { 4, 5, 6, ... },
    // GameSet 3
    { 7, 8, 9, ... }
};
```

You can replace or add arrays to define your own game sets.

### `ChristmasBingo`

The main class handles user interaction, game logic, and random number selection.

### `AsciiArt`

This class provides a festive ASCII header displayed at the start of the game.

## Example Gameplay

1. Run the program.
2. Select `1` to play Christmas Bingo or `0` to exit.
3. Choose a game set (1, 2, or 3).
4. Press Enter repeatedly to draw numbers until the game ends.

```
   __                                          , _                 
  / () |)    ,_  o  , _|_          _,   ,     /|/_)o        _,  _  
 |     |/\  /  | | / \_|  /|/|/|  / |  / \_    |  \| /|/|  / | / \_
  \___/|  |/   |/|/ \/ |_/ | | |_/\/|_/ \/     |(_/|/ | |_/\/|/\_/ 
                                                            (|     
Choose your destiny:
1 - Let's play Christmas Bingo
0 - Let's be a Grinch
```

## Contributing

This project is open-source so feel free to fork this project and submit pull requests for improvements or new features. Suggestions for new game set options or enhancements are always welcome!
