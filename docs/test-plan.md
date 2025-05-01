# Plan for Testing the Program

The test plan lays out the actions and data I will use to test the functionality of my program.

Terminology:

- **VALID** data values are those that the program expects
- **BOUNDARY** data values are at the limits of the valid range
- **INVALID** data values are those that the program should reject

---

## Testing the board prints correctly

To print the board correctly, it must start with both players at square one and snakes and ladders thrown randomly around the board and then when the player rolls a die, move the player accordingly to the roll of the die.

### Test Data To Use

There are quite a few functions involved in making the board print everything correctly, I chose this test because the board printing is probably the most important part of the entire code because otherwise the game will be unplayable.

### Expected Test Result

I expect that the board will print out everything and will work well.  

---

## Testing the players move correctly

Making sure that the players move how they should with the roll of a die, and get moved by ladders and snakes.

### Test Data To Use

There are only 2 main functions to the movement, movement for player one and player two, I chose to test this because its the second most important thing play the game. 


### Expected Test Result

I expect that player 1 will move with the rol of the player 1 die and player 2 will move with the player 2 die, and if they hit a snake or a ladder they will randomly be moved up or down. 

---


