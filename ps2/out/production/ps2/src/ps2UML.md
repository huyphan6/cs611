## Questions:

1. Explain your UML diagram;
2. Explain how your design allowed for both scalability and extendability to different turn-based variants;
3. Explain any changes you had to make to your original game design in order to allow for another "turn-based" variant to be played.

## Answers:

1. 

2.

3. I made a complete redesign of my original Tic Tac Toe game -- my original ps1 was not modular, scalable, and violated 
    most of the SOLID programming principles. To make the game scalable and extendable, I had to make the game modular, 
    and created abstract classes and extended those classes to create the different game variants. I also had to make the
    game scalable, and I did this by creating a GameFactory type class called "playAllGames" that would create the 
    different game variants. I created one Main class that called the playAllGames 