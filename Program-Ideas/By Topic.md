# Program domain ideas

What to write programs about?

## Simulations

* Library - Keeping a list of books available in the system, checking in and out books, patrons can have an array of books checked out at a time.
* Train station - Trains arriving and leaving the station, a queue of people lining up to board certain trains.
* Online shop - User can select items to buy, program keeps track of the array of items and the total, prints out a receipt once done.
* Election - Generate an array of candidates and issues (randomly generated issues that are silly are best...). Each candidate gets randomly assigned issues, and then Citizens are created with their own stance on issues. An election occurs, and each citizen votes based on closest issue agreement. Show winner. 
* Mars Colony - Given some amount of food grown per day, some amount of waste generated per day, and some amount of air generated per day, calculate the survival of a crew for a mission. 
* Bank ATM - Implement a bank ATM system where each user has an account balance and can deposit or withdraw money. Have error checking. 
* Train ticketing system and train scheduling; popular destinations and starting locations, times of day, etc.
* Movie theater - Limited theaters, seats, and have a certain amount of movies, popular times, and set up the movie showtimes.
* Herd migration - Due to predators, weather, season, etc.?
* Virus/outbreak simulation
* Waste/recycling/space/processing management
* Simulation of productivity - set the amount of time in meetings and watch employee morale and productivity go down.
* Airplane loading / unloading optimization
* Food - For a given amount of people, with a certain amount with dietary restrictions, estimate the amount of food needed, types, and the ingredients. Run simulation to make sure enough was prepared?

## Computer Utilities

* File searcher - Write a program to search a text file for specific words, returns information like line number and the line it was found on.
* File system mapper - Use a recursive function to go through all the folders in a directory and build a text file with a list of those directories.
* Text editor or text reader - Write a program that reads text files and displays them to the screen. Implement pagination to make it a more accessible text reader. Could implement bookmarks and such.
* Picture filters - Use the PPM image format to write programs that will apply "filters" to images. 
* Blogger app - Create a blogging system, including Users, Posts, and Likes. Save/load blog posts and user data in text files.
* Instant Messenger - maybe wrap some basic sockets in an easy class for students to use.
* Searching and modifying hex files - maybe have a program that edits an .exe's hex file, replacing certain text (like dialogue text in some games).
* Text comparison utility - Write a program that shows the user two programs at one time, for comparison. Also analyzes simularities.
* Chat bot - try to have students analyze sentences for certain things, try to generate responses.
* Heightmaps - Given a set of data, have students output RGB values into a bitmap / image file to generate a height map.

## Apps

* Book reading backlog - List a series of books that the user wants, or owns, as well as the current reading status (read / reading / not started).
* To-Do list - Have user keep a to-do list on their computer with a schedule, allow exporting the schedule to CSV file.
* Recipe - Allow user to store recipes, can type in a batch (ratio) to adjust the ingredient list.
* Card game - Implement a simple card game with boring-person cards (whatever the normal 52 card thing is called), or make a new card game (like MTG or Pokemon),
and write a program to implement the turns so two people can play.
* Quizzer - Use Polymorphism to store an array of Questions of different types (multiple choice, true-false, fill in the blank, etc.),
allow user to edit and save a question deck, and then run the quiz.
* Calorie counter - Create a program that stores a list of food items and their calories, then allow user to build their meals (example, tacos or sandwiches or pizza) and come up with the total calories.
* Translation dictionary - Keep a file of English - (other language) terms and allow the user to do searches to find translations for certain words.
* Contact book
* Fridge recipes - User enters all ingredients they have, and the program does a search for recipes that contain those ingredients.
* Workout organizer - Store types of workouts based on some criteria, be able to view by type,  or randomly select something.

## Games

* Text adventure like Zork - Create an array of rooms, each room can have a neighbor to the North, South, East, or West. You can implement this via an array or via pointers. Can also implement an inventory system, or a door-and-key system.
* RPG Battle - Implement a turn-based RPG battle type system. Each turn, you can attack, heal, use an item, etc. 
* ASCII Maze - Draw a room to the screen using text symbols. Allow the user to move around to navigate to an exit.
* Word Search generator
* Checkers AI - Give students pre-built checkers game, have them write the AI.
* Flip card game

## Calculations

* Quadratic Formula - Calculate roots of a polynomial ([CS 134 Lab](https://github.com/Rachels-Courses/CS134-Programming-Fundamentals/blob/master/Assignments/Java%20Labs/Java%20Lab%201%20-%20Math%20Programs.md))
* Square feet - Calculate the total square footage of a building, adding each room's dimensions
* Physics - For some acceleration, initial velocity, and initial position, calculate an item's position over time.
* Fractions - Write a Fraction class and overload math operators to handle fraction math.
* Distance - Calculate the distance between two objects.
* Moving at an angle - Use the trig functions to decide how much to modify an (x, y) coordinate pair based on the character's speed and the angle they're currently heading.
* Binary Math
* Derivatives and Integrals (note to self: find my old numerical analysis textbook)

### Discrete Math

* Generate truth tables
* Generate proposition results
* Generate power sets
* Solve summations
* Solving the Josephus Game


## Language/Conversions

* Text <-> Morse Code converter
* Text <-> Braile converter
* Caesar ciphers, other ciphers
* Text <-> Binary
* Cryptanalysis; analyzing which characters show up most often to try to guess at the conversion.

## Other

* Write a programming language that has variables and can perform simple math and echos
* Digital clock LED - Have an array of LEDs that make up a clock (how it's laid out like an "8" and only certain ones light up for specific numbers.)

## Silly

* Random poetry generator - Based on some form ("Roses are red, violets are blue..."), generate random poetry with a list of nouns and adjectives.
* Astrology generator - Randomly generate astrology forecasts like "You will have horrible luck today."
