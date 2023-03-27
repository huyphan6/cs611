# CS611 - Assignment 3

## Monsters and Heroes

Name: Huy Phan <br/>
Email: hphan6@bu.edu <br/>
BUID: U99944177

## Files

- Abstract Classes
  - ***Game.java***: Abstract class for any type of game if we want to implement more than a board game
  - ***BoardGame.java***: an abstract extension of Game and contains the basic methods for a board game
  - ***Board.java***: an abstract class that contains the basic methods and attributes for a board


- Concrete Classes
   - ***Armor.java***: a class that represents an armor item
   - ***BattleGround.java***: a class that represents the battleground and its logic
   - ***Cell.java***: a class that represents a cell on the board
   - ***Controller.java***: a class that represents the controller of the game and allows the user to interact with the board
   - ***Dragon.java***: a class that represents a dragon monster
   - ***Exoskeleton.java***: a class that represents an exoskeleton monster
   - ***FireSpell.java***: a class that represents a fire spell item
   - ***Hero.java***: a class that represents a hero and its subtypes
   - ***IceSpell.java***: a class that represents an ice spell item
   - ***Inventory.java***: a class that represents the inventory of a hero
   - ***Item.java***: a class that represents an item 
   - ***LightningSpell.java***: a class that represents a lightning spell item
   - ***Market.java***: a class that represents the market of the game along with buying and selling logic
   - ***MHBoard.java***: a child class of Board that represents the Monsters and Heroes Board
   - ***MHBoardGame.java***: a child class of BoardGame that represents the Monsters and Heroes board game along with its rules and logic 
   - ***Monster.java***: a class that represents a monster and its subtypes
   - ***Paladin.java***: a subclass of hero that represents a paladin hero
   - ***Potion.java***: a class that represents a potion item
   - ***Sorcerer.java***: a subclass of hero that represents a sorcerer hero
   - ***Spell.java***: a class that represents a spell item
   - ***Spirit.java***: a class that represents a spirit monster
   - ***Warrior.java***: a subclass of hero that represents a warrior hero
   - ***Weapon.java***: a class that represents a weapon item


- Interfaces
   - ***Attackable.java***: an interface that specifies the methods for an attackable object


- MISC Classes
   - ***ArtMessages.java***: a class that contains all the ASCII art messages for the game
   - ***ColoredText.java***: a class that contains all the ANSI escape codes for colored text used for colored printing in terminal


- MISC Files
   - ***GameCenter.java***: a class that contains the main method to run the program and initializes the game
  - ***Main.java***: the main class that runs the program
  - ***README.md***: this file

## Notes

SQUARE GRID COORDINATES: (ROW, COLUMN) <br/>

Monsters & Heroes (DEFAULT 8x8):
```
(0,0) (0,1) (0,2) (0,3) (0,4) (0,5) (0,6) (0,7)
(1,0) (1,1) (1,2) (1,3) (1,4) (1,5) (1,6) (1,7)
(2,0) (2,1) (2,2) (2,3) (2,4) (2,5) (2,6) (2,7)
(3,0) (3,1) (3,2) (3,3) (3,4) (3,5) (3,6) (3,7)
(4,0) (4,1) (4,2) (4,3) (4,4) (4,5) (4,6) (4,7)
(5,0) (5,1) (5,2) (5,3) (5,4) (5,5) (5,6) (5,7)
(6,0) (6,1) (6,2) (6,3) (6,4) (6,5) (6,6) (6,7)
(7,0) (7,1) (7,2) (7,3) (7,4) (7,5) (7,6) (7,7)
```

MOVE DIRECTIONS: <br/>
```
W: UP = ROW+1 -> (GOES DOWN THE GRID)
A: LEFT 
S: DOWN = ROW-1 -> (GOES UP THE GRID)
D: RIGHT 
```

## How to compile and run

1. After downloading all the files
2. Run the following commands:
    1. ```javac ./*.java ```
    2. ```java Main.java```
3. The first command will compile all the java files
4. The second command will run the program

## Input/Output Example

```agsl

 _____ ______   ________  ________   ________  _________  _______   ________  ________          
|\   _ \  _   \|\   __  \|\   ___  \|\   ____\|\___   ___\\  ___ \ |\   __  \|\   ____\         
\ \  \\\__\ \  \ \  \|\  \ \  \\ \  \ \  \___|\|___ \  \_\ \   __/|\ \  \|\  \ \  \___|_        
 \ \  \\|__| \  \ \  \\\  \ \  \\ \  \ \_____  \   \ \  \ \ \  \_|/_\ \   _  _\ \_____  \       
  \ \  \    \ \  \ \  \\\  \ \  \\ \  \|____|\  \   \ \  \ \ \  \_|\ \ \  \\  \\|____|\  \      
   \ \__\    \ \__\ \_______\ \__\\ \__\____\_\  \   \ \__\ \ \_______\ \__\\ _\ ____\_\  \     
    \|__|     \|__|\|_______|\|__| \|__|\_________\   \|__|  \|_______|\|__|\|__|\_________\    
                                       \|_________|                             \|_________|    
                                                                                                
                                                                                                
           ________  ________   ________                                                        
          |\   __  \|\   ___  \|\   ___ \                                                       
          \ \  \|\  \ \  \\ \  \ \  \_|\ \                                                      
           \ \   __  \ \  \\ \  \ \  \ \\ \                                                     
            \ \  \ \  \ \  \\ \  \ \  \_\\ \                                                    
             \ \__\ \__\ \__\\ \__\ \_______\                                                   
              \|__|\|__|\|__| \|__|\|_______|                                                   
                                                                                                
                                                                                                
                                                                                                
     ___  ___  _______   ________  ________  _______   ________                                 
    |\  \|\  \|\  ___ \ |\   __  \|\   __  \|\  ___ \ |\   ____\                                
    \ \  \\\  \ \   __/|\ \  \|\  \ \  \|\  \ \   __/|\ \  \___|_                               
     \ \   __  \ \  \_|/_\ \   _  _\ \  \\\  \ \  \_|/_\ \_____  \                              
      \ \  \ \  \ \  \_|\ \ \  \\  \\ \  \\\  \ \  \_|\ \|____|\  \                             
       \ \__\ \__\ \_______\ \__\\ _\\ \_______\ \_______\____\_\  \                            
        \|__|\|__|\|_______|\|__|\|__|\|_______|\|_______|\_________\                           
                                                         \|_________|                           
                                                                                                
                                                                                                

Welcome To Monsters and Heroes! 

Initializing the board...
This game is played on a square board of at least 8 [WE RECOMMEND STARTING WITH 8]. What size board would you like to play on? 

Please enter a integer 8 or greater!

8
+---+---+---+---+---+---+---+---+
| I | I | M |   | I |   | I | M |
+---+---+---+---+---+---+---+---+
| I | M | M |   |   |   |   | M |
+---+---+---+---+---+---+---+---+
| M |   |   | M |   | M |   |   |
+---+---+---+---+---+---+---+---+
| M | M |   | M |   | M |   |   |
+---+---+---+---+---+---+---+---+
|   | M | I |   | I | M |   | I |
+---+---+---+---+---+---+---+---+
|   | I |   | M | M |   |   | M |
+---+---+---+---+---+---+---+---+
| M |   | M |   |   |   |   | I |
+---+---+---+---+---+---+---+---+
| M | M |   |   | M |   | M |   |
+---+---+---+---+---+---+---+---+

*** Empty squares represent common spaces [where battles can occur] ***
*** Squares with an 'I' represent inaccessible spaces [you cannot move here] ***
*** Squares with an 'M' represent market spaces [you can buy items here] *** 

*** Your team will be denoted by the character 'X' on the board *** 

Please enter valid common space coordinates to start your team on the board. 

We recommend starting your team next to the market so that you can purchase weapons before battling. 

Please enter the x coordinate of the space you want to start on: 
2
Please enter the y coordinate of the space you want to start on: 
4
+---+---+---+---+---+---+---+---+
| I | I | M |   | I |   | I | M |
+---+---+---+---+---+---+---+---+
| I | M | M |   |   |   |   | M |
+---+---+---+---+---+---+---+---+
| M |   |   | M | X | M |   |   |
+---+---+---+---+---+---+---+---+
| M | M |   | M |   | M |   |   |
+---+---+---+---+---+---+---+---+
|   | M | I |   | I | M |   | I |
+---+---+---+---+---+---+---+---+
|   | I |   | M | M |   |   | M |
+---+---+---+---+---+---+---+---+
| M |   | M |   |   |   |   | I |
+---+---+---+---+---+---+---+---+
| M | M |   |   | M |   | M |   |
+---+---+---+---+---+---+---+---+

Initializing the hero team...
How many heroes would you like to be on your team? 

Please enter a integer between 1-3!
2
Thank you! You wanted a team size of 2
Please choose which heroes you want on your team! 

[1]: Paladins:
[2]: Warriors:
[3]: Sorcerers: 

Please enter a integer between 1-3!
1
Paladins: 

0: {Name: Parzival, Level: 1, HP: 100, MP: 300, Strength: 750, Dexterity: 650, Agility: 700, Gold: 2500, Inventory: {  }}
1: {Name: Sehanine_Moonbow, Level: 1, HP: 100, MP: 300, Strength: 750, Dexterity: 700, Agility: 700, Gold: 2500, Inventory: {  }}
2: {Name: Skoraeus_Stonebones, Level: 1, HP: 100, MP: 250, Strength: 650, Dexterity: 600, Agility: 350, Gold: 2500, Inventory: {  }}
3: {Name: Garl_Glittergold, Level: 1, HP: 100, MP: 100, Strength: 600, Dexterity: 500, Agility: 400, Gold: 2500, Inventory: {  }}
4: {Name: Amaryllis_Astra, Level: 1, HP: 100, MP: 500, Strength: 500, Dexterity: 500, Agility: 500, Gold: 2500, Inventory: {  }}
5: {Name: Caliber_Heist, Level: 1, HP: 100, MP: 400, Strength: 400, Dexterity: 400, Agility: 400, Gold: 2500, Inventory: {  }}

Which paladin would you like to choose? 

Please enter a integer between 0-5!
0

Added Parzival to your team! 

Please choose which heroes you want on your team! 

[1]: Paladins:
[2]: Warriors:
[3]: Sorcerers: 

Please enter a integer between 1-3!
2
Warriors: 

0: {Name: Gaerdal_Ironhand, Level: 1, HP: 100, MP: 100, Strength: 700, Dexterity: 500, Agility: 600, Gold: 1354, Inventory: {  }}
1: {Name: Sehanine_Monnbow, Level: 1, HP: 100, MP: 600, Strength: 700, Dexterity: 800, Agility: 500, Gold: 2500, Inventory: {  }}
2: {Name: Muamman_Duathall, Level: 1, HP: 100, MP: 300, Strength: 900, Dexterity: 500, Agility: 750, Gold: 2546, Inventory: {  }}
3: {Name: Flandal_Steelskin, Level: 1, HP: 100, MP: 200, Strength: 750, Dexterity: 650, Agility: 700, Gold: 250, Inventory: {  }}
4: {Name: Undefeated_Yoj, Level: 1, HP: 100, MP: 400, Strength: 800, Dexterity: 400, Agility: 700, Gold: 250, Inventory: {  }}
5: {Name: Eunoia_Cyn, Level: 1, HP: 100, MP: 400, Strength: 700, Dexterity: 800, Agility: 600, Gold: 250, Inventory: {  }}

Which warrior would you like to choose? 

Please enter a integer between 0-5!
1

Added Sehanine_Monnbow to your team! 

Here is your team's lineup!: 
[{Name: Parzival, Level: 1, HP: 100, MP: 300, Strength: 750, Dexterity: 650, Agility: 700, Gold: 2500, Inventory: {  }}, {Name: Sehanine_Monnbow, Level: 1, HP: 100, MP: 600, Strength: 700, Dexterity: 800, Agility: 500, Gold: 2500, Inventory: {  }}]

+---+---+---+---+---+---+---+---+
| I | I | M |   | I |   | I | M |
+---+---+---+---+---+---+---+---+
| I | M | M |   |   |   |   | M |
+---+---+---+---+---+---+---+---+
| M |   |   | M | X | M |   |   |
+---+---+---+---+---+---+---+---+
| M | M |   | M |   | M |   |   |
+---+---+---+---+---+---+---+---+
|   | M | I |   | I | M |   | I |
+---+---+---+---+---+---+---+---+
|   | I |   | M | M |   |   | M |
+---+---+---+---+---+---+---+---+
| M |   | M |   |   |   |   | I |
+---+---+---+---+---+---+---+---+
| M | M |   |   | M |   | M |   |
+---+---+---+---+---+---+---+---+

W: Move Up 
A: Move Left 
S: Move Down  
D: Move Right 
Q: Quit

Please enter a move a valid move: 
d
You entered: D
You have reached the market!
                                                            __
                                                              \
                                                              ||        _
                                                             <||      /|
  ___________________________________________________________/||      |/
 /                      WELCOME TO                         //o|/\/\/\||/\
/__________________________________________________________\o|||||||||/**\
\                       THE MARKET                          /o|||||||||\**/
 \_________________________________________________________\\o|\/\/\/||\/
                                                             \||      |\
                                                             <||      \|_
                                                              ||
                                                            __/

Hero 1: {Name: Parzival, Level: 1, HP: 100, MP: 300, Strength: 750, Dexterity: 650, Agility: 700, Gold: 2500, Inventory: {  }}
Hero 2: {Name: Sehanine_Monnbow, Level: 1, HP: 100, MP: 600, Strength: 700, Dexterity: 800, Agility: 500, Gold: 2500, Inventory: {  }}

Which hero would you like to buy or sell for? (1-2)
Please enter a integer between 1-2!
1
You chose Hero: 1, {Name: Parzival, Level: 1, HP: 100, MP: 300, Strength: 750, Dexterity: 650, Agility: 700, Gold: 2500, Inventory: {  }}

Would you like to buy, sell or exit? (b/s/e)
b
You entered: B
What would you like to buy? 

[1]: Potions:
[2]: Weapons:
[3]: Armors:
[4]: Ice Spells:
[5]: Fire Spells:
[6]: Lightning Spells: 

Please enter a integer between 1-6!
2
Weapons 

[1]: Weapon: Sword, Price: 500, Level Required: 1, Damage: 800, NumHandsRequired: 1
[2]: Weapon: Bow, Price: 300, Level Required: 2, Damage: 500, NumHandsRequired: 2
[3]: Weapon: Scythe, Price: 100, Level Required: 6, Damage: 1100, NumHandsRequired: 2
[4]: Weapon: Axe, Price: 550, Level Required: 5, Damage: 850, NumHandsRequired: 1
[5]: Weapon: TSwords, Price: 140, Level Required: 8, Damage: 1600, NumHandsRequired: 2
[6]: Weapon: Dagger, Price: 200, Level Required: 1, Damage: 250, NumHandsRequired: 1
Which weapon would you like to buy? 

Please enter a integer between 1-6!
1
You chose: Weapon: Sword, Price: 500, Level Required: 1, Damage: 800, NumHandsRequired: 1
Successfully added Weapon: Sword, Price: 500, Level Required: 1, Damage: 800, NumHandsRequired: 1 to your inventory!

Your inventory now contains: { (Weapon: Sword, Price: 500, Level Required: 1, Damage: 800, NumHandsRequired: 1),  }

You now have 2000 gold left!

Hero 1: {Name: Parzival, Level: 1, HP: 100, MP: 300, Strength: 750, Dexterity: 650, Agility: 700, Gold: 2000, Inventory: { (Weapon: Sword, Price: 500, Level Required: 1, Damage: 800, NumHandsRequired: 1),  }}
Hero 2: {Name: Sehanine_Monnbow, Level: 1, HP: 100, MP: 600, Strength: 700, Dexterity: 800, Agility: 500, Gold: 2500, Inventory: {  }}

Which hero would you like to buy or sell for? (1-2)
Please enter a integer between 1-2!
2
You chose Hero: 2, {Name: Sehanine_Monnbow, Level: 1, HP: 100, MP: 600, Strength: 700, Dexterity: 800, Agility: 500, Gold: 2500, Inventory: {  }}

Would you like to buy, sell or exit? (b/s/e)
b
You entered: B
What would you like to buy? 

[1]: Potions:
[2]: Weapons:
[3]: Armors:
[4]: Ice Spells:
[5]: Fire Spells:
[6]: Lightning Spells: 

Please enter a integer between 1-6!
1
Potions 

[1]: Potion: Healing_Potion, Price: 250, Level: 1, Attribute Types Affected: [Health], Attribute Increase: 100
[2]: Potion: Strength_Potion, Price: 200, Level: 1, Attribute Types Affected: [Strength], Attribute Increase: 75
[3]: Potion: Magic_Potion, Price: 350, Level: 2, Attribute Types Affected: [Mana], Attribute Increase: 100
[4]: Potion: Luck_Elixir, Price: 500, Level: 4, Attribute Types Affected: [Agility], Attribute Increase: 65
[5]: Potion: Mermaid_Tears, Price: 850, Level: 5, Attribute Types Affected: [Health, Mana, Strength, Agility], Attribute Increase: 100
[6]: Potion: Ambrosia, Price: 1000, Level: 8, Attribute Types Affected: [Health, Mana, Strength, Dexterity, Agility], Attribute Increase: 150
Which potion would you like to buy? 

Please enter a integer between 1-6!
2
You chose: Potion: Strength_Potion, Price: 200, Level: 1, Attribute Types Affected: [Strength], Attribute Increase: 75
Successfully added Potion: Strength_Potion, Price: 200, Level: 1, Attribute Types Affected: [Strength], Attribute Increase: 75 to your inventory!

Your inventory now contains: { (Potion: Strength_Potion, Price: 200, Level: 1, Attribute Types Affected: [Strength], Attribute Increase: 75),  }

You now have 2300 gold left!

+---+---+---+---+---+---+---+---+
| I | I | M |   | I |   | I | M |
+---+---+---+---+---+---+---+---+
| I | M | M |   |   |   |   | M |
+---+---+---+---+---+---+---+---+
| M |   |   | M |   | M |   |   |
+---+---+---+---+---+---+---+---+
| M | M |   | M |   | M |   |   |
+---+---+---+---+---+---+---+---+
|   | M | I |   | I | M |   | I |
+---+---+---+---+---+---+---+---+
|   | I |   | M | M |   |   | M |
+---+---+---+---+---+---+---+---+
| M |   | M |   |   |   |   | I |
+---+---+---+---+---+---+---+---+
| M | M |   |   | M |   | M |   |
+---+---+---+---+---+---+---+---+

YOU ARE HERE (2, 5) CELL TYPE: M

W: Move Up 
A: Move Left 
S: Move Down  
D: Move Right 
Q: Quit

Please enter a move a valid move: 
d
You entered: D
You moved right!
Prepare for battle!
Entering the Battle Ground...
      ______________________________    . \  | / .
     /                            / \     \ \ / /
    |             TIME           | ==========  - -
     \____________________________\_/     / / \ \
  ______________________________      \  | / | \
 /                            / \     \ \ / /.   .
|             FOR            | ==========  - -
 \____________________________\_/     / / \ \    /
      ______________________________   / |\  | /  .
     /                            / \     \ \ / /
    |            BATTLE          | ==========  -  - -
     \____________________________\_/     / / \ \
                                        .  / | \  .


Hero Team Stats:
{Name: Parzival, Level: 1, HP: 100, MP: 300, Strength: 750, Dexterity: 650, Agility: 700, Gold: 2000, Inventory: { (Weapon: Sword, Price: 500, Level Required: 1, Damage: 800, NumHandsRequired: 1),  }}
{Name: Sehanine_Monnbow, Level: 1, HP: 100, MP: 600, Strength: 700, Dexterity: 800, Agility: 500, Gold: 2300, Inventory: { (Potion: Strength_Potion, Price: 200, Level: 1, Attribute Types Affected: [Strength], Attribute Increase: 75),  }}

Monster Team Stats:
Name: Ereshkigall, Level: 6, HP: 100, Damage: 950, Defense: 450, Dodge: 35
Name: Kiaransalee, Level: 8, HP: 100, Damage: 850, Defense: 950, Dodge: 85

Hero: Parzival, HP: 100, MP: 300

What would you like to do?
[1]: Attack
[2]: Cast a spell
[3]: Use a potion
[4]: Equip armor
[5]: Equip weapon
Enter a number between 1 and 5: 
5
Which weapon would you like to equip?
[0]: Sword
Enter a number between 0 and 0: 
0

Hero: Sehanine_Monnbow, HP: 100, MP: 600

What would you like to do?
[1]: Attack
[2]: Cast a spell
[3]: Use a potion
[4]: Equip armor
[5]: Equip weapon
Enter a number between 1 and 5: 
3
Which potion would you like to use?
[0]: Strength_Potion
Enter a number between 0 and 0: 
0
You used Strength_Potion and gained 75 strength!
Ereshkigall attacks Parzival for 500 damage!
The hero team has won the battle and slayed all the monsters!
Here are the heroes' stats after the battle:
{Name: Parzival, Level: 2, HP: 100, MP: 363, Strength: 787, Dexterity: 682, Agility: 735, Gold: 3400, Inventory: { (Weapon: Sword, Price: 500, Level Required: 1, Damage: 800, NumHandsRequired: 1),  }}
{Name: Sehanine_Monnbow, Level: 2, HP: 100, MP: 726, Strength: 813, Dexterity: 840, Agility: 525, Gold: 3700, Inventory: {  }}
+---+---+---+---+---+---+---+---+
| I | I | M |   | I |   | I | M |
+---+---+---+---+---+---+---+---+
| I | M | M |   |   |   |   | M |
+---+---+---+---+---+---+---+---+
| M |   |   | M |   | M | X |   |
+---+---+---+---+---+---+---+---+
| M | M |   | M |   | M |   |   |
+---+---+---+---+---+---+---+---+
|   | M | I |   | I | M |   | I |
+---+---+---+---+---+---+---+---+
|   | I |   | M | M |   |   | M |
+---+---+---+---+---+---+---+---+
| M |   | M |   |   |   |   | I |
+---+---+---+---+---+---+---+---+
| M | M |   |   | M |   | M |   |
+---+---+---+---+---+---+---+---+

YOU ARE HERE (2, 6) CELL TYPE: X

W: Move Up 
A: Move Left 
S: Move Down  
D: Move Right 
Q: Quit

Please enter a move a valid move: 
1
That's an invalid move!
d
You entered: D
You moved right!
Prepare for battle!
Entering the Battle Ground...
      ______________________________    . \  | / .
     /                            / \     \ \ / /
    |             TIME           | ==========  - -
     \____________________________\_/     / / \ \
  ______________________________      \  | / | \
 /                            / \     \ \ / /.   .
|             FOR            | ==========  - -
 \____________________________\_/     / / \ \    /
      ______________________________   / |\  | /  .
     /                            / \     \ \ / /
    |            BATTLE          | ==========  -  - -
     \____________________________\_/     / / \ \
                                        .  / | \  .


Hero Team Stats:
{Name: Parzival, Level: 2, HP: 100, MP: 363, Strength: 787, Dexterity: 682, Agility: 735, Gold: 3400, Inventory: { (Weapon: Sword, Price: 500, Level Required: 1, Damage: 800, NumHandsRequired: 1),  }}
{Name: Sehanine_Monnbow, Level: 2, HP: 100, MP: 726, Strength: 813, Dexterity: 840, Agility: 525, Gold: 3700, Inventory: {  }}

Monster Team Stats:
Name: DocOck, Level: 6, HP: 100, Damage: 600, Defense: 600, Dodge: 55
Name: Merrshaullk, Level: 10, HP: 100, Damage: 1000, Defense: 900, Dodge: 55

Hero: Parzival, HP: 100, MP: 363

What would you like to do?
[1]: Attack
[2]: Cast a spell
[3]: Use a potion
[4]: Equip armor
[5]: Equip weapon
Enter a number between 1 and 5: 
1
Parzival attacks DocOck for 79 damage!

Hero: Sehanine_Monnbow, HP: 100, MP: 726

What would you like to do?
[1]: Attack
[2]: Cast a spell
[3]: Use a potion
[4]: Equip armor
[5]: Equip weapon
Enter a number between 1 and 5: 
1
Sehanine_Monnbow attacks Merrshaullk for 40 damage!
DocOck attacks Parzival for 0 damage!
Merrshaullk attacks Parzival for 100 damage!
Hero Team Stats:
{Name: Parzival, Level: 2, HP: 0, MP: 399, Strength: 787, Dexterity: 682, Agility: 735, Gold: 3400, Inventory: { (Weapon: Sword, Price: 500, Level Required: 1, Damage: 800, NumHandsRequired: 1),  }}
{Name: Sehanine_Monnbow, Level: 2, HP: 100, MP: 798, Strength: 813, Dexterity: 840, Agility: 525, Gold: 3700, Inventory: {  }}

Monster Team Stats:
Name: DocOck, Level: 6, HP: 21, Damage: 600, Defense: 600, Dodge: 55
Name: Merrshaullk, Level: 10, HP: 60, Damage: 1000, Defense: 900, Dodge: 55

Hero: Sehanine_Monnbow, HP: 100, MP: 798

What would you like to do?
[1]: Attack
[2]: Cast a spell
[3]: Use a potion
[4]: Equip armor
[5]: Equip weapon
Enter a number between 1 and 5: 
1
Sehanine_Monnbow attacks DocOck for 40 damage!
Hero Team Stats:
{Name: Parzival, Level: 2, HP: 0, MP: 438, Strength: 787, Dexterity: 682, Agility: 735, Gold: 3400, Inventory: { (Weapon: Sword, Price: 500, Level Required: 1, Damage: 800, NumHandsRequired: 1),  }}
{Name: Sehanine_Monnbow, Level: 2, HP: 100, MP: 877, Strength: 813, Dexterity: 840, Agility: 525, Gold: 3700, Inventory: {  }}

Monster Team Stats:
Name: DocOck, Level: 6, HP: -19, Damage: 600, Defense: 600, Dodge: 55
Name: Merrshaullk, Level: 10, HP: 60, Damage: 1000, Defense: 900, Dodge: 55

Hero: Sehanine_Monnbow, HP: 100, MP: 877

What would you like to do?
[1]: Attack
[2]: Cast a spell
[3]: Use a potion
[4]: Equip armor
[5]: Equip weapon
Enter a number between 1 and 5: 
1
Sehanine_Monnbow attacks Merrshaullk for 40 damage!
Merrshaullk attacks Sehanine_Monnbow but misses!
Merrshaullk attacks Sehanine_Monnbow for 0 damage!
Hero Team Stats:
{Name: Parzival, Level: 2, HP: 0, MP: 481, Strength: 787, Dexterity: 682, Agility: 735, Gold: 3400, Inventory: { (Weapon: Sword, Price: 500, Level Required: 1, Damage: 800, NumHandsRequired: 1),  }}
{Name: Sehanine_Monnbow, Level: 2, HP: 100, MP: 964, Strength: 813, Dexterity: 840, Agility: 525, Gold: 3700, Inventory: {  }}

Monster Team Stats:
Name: DocOck, Level: 6, HP: -19, Damage: 600, Defense: 600, Dodge: 55
Name: Merrshaullk, Level: 10, HP: 20, Damage: 1000, Defense: 900, Dodge: 55

Hero: Sehanine_Monnbow, HP: 100, MP: 964

What would you like to do?
[1]: Attack
[2]: Cast a spell
[3]: Use a potion
[4]: Equip armor
[5]: Equip weapon
Enter a number between 1 and 5: 
1
Sehanine_Monnbow attacks Merrshaullk for 40 damage!
The hero team has won the battle and slayed all the monsters!
Here are the heroes' stats after the battle:
{Name: Parzival, Level: 3, HP: 100, MP: 581, Strength: 826, Dexterity: 716, Agility: 771, Gold: 5000, Inventory: { (Weapon: Sword, Price: 500, Level Required: 1, Damage: 800, NumHandsRequired: 1),  }}
{Name: Sehanine_Monnbow, Level: 3, HP: 100, MP: 1166, Strength: 853, Dexterity: 882, Agility: 551, Gold: 5300, Inventory: {  }}
+---+---+---+---+---+---+---+---+
| I | I | M |   | I |   | I | M |
+---+---+---+---+---+---+---+---+
| I | M | M |   |   |   |   | M |
+---+---+---+---+---+---+---+---+
| M |   |   | M |   | M |   | X |
+---+---+---+---+---+---+---+---+
| M | M |   | M |   | M |   |   |
+---+---+---+---+---+---+---+---+
|   | M | I |   | I | M |   | I |
+---+---+---+---+---+---+---+---+
|   | I |   | M | M |   |   | M |
+---+---+---+---+---+---+---+---+
| M |   | M |   |   |   |   | I |
+---+---+---+---+---+---+---+---+
| M | M |   |   | M |   | M |   |
+---+---+---+---+---+---+---+---+

YOU ARE HERE (2, 7) CELL TYPE: X

W: Move Up 
A: Move Left 
S: Move Down  
D: Move Right 
Q: Quit

Please enter a move a valid move: 
q
You entered: Q
Quitting the game...

Process finished with exit code 0
```
