# Program domain ideas

What to write programs about?

## Simulations

* Library - Keeping a list of books available in the system, checking in and out books, patrons can have an array of books checked out at a time. ([CS 200 Assignment](https://github.com/Rachels-Courses/CS200-Concepts-of-Progamming-Algorithms/tree/master/Assignments/Programs/PA3%20-%20Book%20List))
* Train station - Trains arriving and leaving the station, a queue of people lining up to board certain trains.
* Online shop - User can select items to buy, program keeps track of the array of items and the total, prints out a receipt once done.
* Election - Generate an array of candidates and issues (randomly generated issues that are silly are best...). Each candidate gets randomly assigned issues, and then Citizens are created with their own stance on issues. An election occurs, and each citizen votes based on closest issue agreement. Show winner. ([CS 200 Lab](https://github.com/Rachels-Courses/CS200-Concepts-of-Progamming-Algorithms/blob/master/Assignments/In-class%20Labs/Lab%208%20-%20Election%20(Structs%2C%20arrays%2C%20functions).md))
* Mars Colony - Given some amount of food grown per day, some amount of waste generated per day, and some amount of air generated per day, calculate the survival of a crew for a mission. ([CS 200 Lab](https://github.com/Rachels-Courses/CS200-Concepts-of-Progamming-Algorithms/blob/master/Assignments/In-class%20Labs/Lab%204%20-%20Mars%20Experiment%20(Variables%2C%20conditionals%2C%20while%20loops%2C%20input%2C%20output).md))
* Bank ATM - Implement a bank ATM system where each user has an account balance and can deposit or withdraw money. Have error checking. ([CS 200 Assignment](https://github.com/Rachels-Courses/CS200-Concepts-of-Progamming-Algorithms/tree/master/Assignments/Programs/PA1%20-%20Bank%20Program))

## Computer Utilities

* File searcher - Write a program to search a text file for specific words, returns information like line number and the line it was found on.
* File system mapper - Use a recursive function to go through all the folders in a directory and build a text file with a list of those directories.
* Text editor or text reader - Write a program that reads text files and displays them to the screen. Implement pagination to make it a more accessible text reader. Could implement bookmarks and such.

## Apps

* To-Do list - Have user keep a to-do list on their computer with a schedule, allow exporting the schedule to CSV file.
* Recipe - Allow user to store recipes, can type in a batch (ratio) to adjust the ingredient list. ([CS 200 Lab](https://github.com/Rachels-Courses/CS200-Concepts-of-Progamming-Algorithms/blob/master/Assignments/In-class%20Labs/Lab%202%20-%20Recipe%20(Variables%2C%20conditionals%2C%20input%2C%20and%20output).md))
* Card game - Implement a simple card game with boring-person cards (whatever the normal 52 card thing is called), or make a new card game (like MTG or Pokemon),
and write a program to implement the turns so two people can play.
* Quizzer - Use Polymorphism to store an array of Questions of different types (multiple choice, true-false, fill in the blank, etc.),
allow user to edit and save a question deck, and then run the quiz.

## Games

* Text adventure like Zork - Create an array of rooms, each room can have a neighbor to the North, South, East, or West. You can implement this via an array or via pointers. Can also implement an inventory system, or a door-and-key system. ([CS 200 Lab](https://github.com/Rachels-Courses/CS200-Concepts-of-Progamming-Algorithms/blob/master/Assignments/In-class%20Labs/Lab%206%20-%20Text%20Adventure%20(Strings%2C%20arrays%2C%20for-loops%2C%20random%20numbers).md))
* RPG Battle - Implement a turn-based RPG battle type system. Each turn, you can attack, heal, use an item, etc. ([CS 200 Assignment](https://github.com/Rachels-Courses/CS200-Concepts-of-Progamming-Algorithms/tree/master/Assignments/Programs/PA2%20-%20RPG%20Battle))

## Calculations

* Quadratic Formula - Calculate roots of a polynomial
* Square feet - Calculate the total square footage of a building, adding each room's dimensions
* Physics - For some acceleration, initial velocity, and initial position, calculate an item's position over time.
* Fractions - Write a Fraction class and overload math operators to handle fraction math.
* Distance - Calculate the distance between two objects.
* Moving at an angle - Use the trig functions to decide how much to modify an (x, y) coordinate pair based on the character's speed and the angle they're currently heading.

## Silly

* Random poetry generator - Based on some form ("Roses are red, violets are blue..."), generate random poetry with a list of nouns and adjectives.
