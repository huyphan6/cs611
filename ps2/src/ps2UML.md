## Questions:

1. Explain your UML diagram;
2. Explain how your design allowed for both scalability and extendability to different turn-based variants;
3. Explain any changes you had to make to your original game design in order to allow for another "turn-based" variant to be played.

## Answers:

1. The abstract classes Game/BoardGame, Board, and Player set the foundation and structure of this application. From these parent classes, I implemented for example, TTTBoardGame to hold Tic Tac Toe's game logic, TTTBoard to give the game board structure and functionality, and TTTPlayer to hold the player's data. I repeated these steps for the other game variants as you can see from the diagram. TTT/OC/C4BoardGame is where all the games are played and the class "playAllGames" is where the games are created. Everything is then connected to the Main class which is where the program is run. 

2. My design allowed for both scalability and extendability because of the modular structure of the game. I created a playAllGames class that would create the different game variants. I also created an abstract class called "Game" that would be extended by the different game variants. This allowed me to create new game variants by extending the Game class by creating the BoardGame subclass. For example, you can extend it by making other subclasses of Game such as FPS, RPG, MMO, etc. You can also extend BoardGame by making other subclasses of BoardGame such as Chess, Checkers, etc. Additionally, my Player and Cell classes are scalable because they are not dependent on the game variant. For example, you can create a new game variant and use the same Player and Cell classes. 

3. I made a complete redesign of my original Tic Tac Toe game -- my original ps1 was not modular, scalable, and violated 
    most of the SOLID programming principles. To make the game scalable and extendable, I had to make the game modular, 
    and created abstract classes and extended those classes to create the different game variants. I also had to make the
    game scalable, and I did this by creating a GameFactory type class called "playAllGames" that would create the 
    different game variants. I created one Main class that called the playAllGames 