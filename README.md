# Java-Lab-9
Usings classes and methods to roll dice

Lab Desc;
Objective: This lab is about writing our own classes for use as objects. We will design
a Dice class to use in gaming as an object (kinda like our own random number generator
interface)
1. Set up your Dice class in a Java project. also set up a Driver class to use to test your
Dice class constantly as you develop it.
2. For instance Data, we will want a dice to have a number of sides and a current value it
is showing. A dice does not contain a history of its rolls and we will assume all possible
dice can “roll” values from 1 to the number of sides. Since using dice will involve a
random numbers we want to create and use a random generator which is shared
amount all objects from this class (and is not changeable)
3. Add a default constructor which will create a D6 (the term for a 6 sided dice whose
values are 1 to 6). As part of this object we should write a roll() method (public)
which will will set the current value of the dice. This roll method should be called by
our constructor so the dice has an initial random value.
4. Add a second constructor which brings in a number of sides the dice should have
(assumed to be positive and an integer) and also initially rolls the dice.
5. OBSERVATION: The default parameter constructor can now be modified just to
execute parameter one by replacing its internal code with
this(6);
do this.
6. Add an accessor methods for the number of sides and the current value
7. Add a toString method to create a sentence containing the current value and the
number of sides.
8. Do we think we should add a method called set which mutates the dice to a specific
value? I have lots of games that need this!!!
9. Add a method called increment that adds 1 to the value of the dice but does not allow
it to go too high
10. Add a method called decrement that subtracts 1 from the value of the dice but does
not allow it to go too low
Earlier in the course we rolled a pair of dice, summed them, and counted the frequencies
(without using an array). This time, in the Driver, lets roll and sum 4 dice (one 2 sided, one
3 sided, one 4 sided, and one 6 sided) a total of 10,000,000 times, counting the frequencies of
occurrences of the resulting sum (using an array). Print out this table well formatted. this
is called Monte-Carlo simulation for probability determination.
