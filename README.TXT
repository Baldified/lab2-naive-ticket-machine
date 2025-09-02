Project: naive-ticket-machine
Authors: David Barnes and Michael Kölling

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling
   Pearson Education

It is discussed in chapter 2.

Purpose of project: To illustrate the basics of fields, constructors, and methods.
How to start this project: Create one or more TicketMachine objects.



************ ANSWERS TO QUESTIONS *************

2.  Q-  What value is returned if you get the machine’s balance after it has printed a ticket?       A- The returned value of the machine's balance after it has printed a ticket is reset to 0.

3.  Q-  Do you notice anything strange about the machine’s behavior?       A- After inserting a random amount of money multiple times, be it double or triple the price of a ticket, it only prints 1 ticket and resets the balance value to 0.
    Q-  What happens if you insert too much money into the machine – do you receive any refund?      A- Nothing happens if you insert too much money into the machine. There is no refund and the remaining money just disappears as the balance value is reset to 0
    Q-  What happens if you do not insert enough and then try to print a ticket?       A- It still prints out a ticket without reaching the required price.

5.  Q-  Does the printed ticket look any different from those printed by the first machine? If so, what is different?      A- The only difference between both tickets is the price of it.

7.  Q- Does it matter whether we write public class TicketMachine or class public TicketMachine in the outer wrapper of a class?     A- Yes, it matters a lot. The source code of the class starts after the word class is written down and public just modifies the privacy of it. Since public is a visibility modifier, writing it after class cancels out class making the outer wrapper of class to end there.
    Q- Do you notice a change in the class diagram?      A- It stops working and counts as an error.

8.  Q- Check whether or not it is possible to leave out the word public from the outer wrapper of the TicketMachine class.       A- It is definitely possible.

9.  Q- Put back the word public, and then check whether it is possible to leave out the word class by trying to compile again.      A- No, it is not possible to leave out the word class because it is the base of the source code outer wrapper.

10.  Fields: price, balance, total
     Constructor: TicketMachine
     Methods: getPrice, getBalance, insertMoney, printTicket

11. The constructor shares the same name as their class and presets the initial values.

12. 1- int
    2- String
    3- String

13. 1- alive
    2- tutor
    3- game
