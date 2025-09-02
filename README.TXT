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




