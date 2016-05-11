PROJECT TITLE: Matrix Capstone

PURPOSE OF PROJECT:
Linear Algebra and matrices are pretty boring in class, despite having endless applications ranging from computer graphics and image compression to MRIs and genetics. Considering that Linear Algebra and
computer programming coincide so much, I thought I would have a shot at it. 

This program covers concepts involcing multiple classes, algorithms (for loops, if-else), and some recursive processes.
It includes a matrix object-class, and the following processes: matrix addition, multiplication, transpose, determinants, inverse, and a simple matrix print method.


VERSION or DATE: 5/9/2016

AUTHORS: Sejal Sahu

USER INSTRUCTIONS:
So far I haven't implemented a calculator-like GUI or interface where a user can easily make calculations. All the work needs to be done in the CalculationsTester Class. I made some expamle test classes
to work off of and play around with. Feel free to make your own class with new combinations of methods and stuff. 

As you can see in the example test classes, you need to create a Calculations object, make a 2d array, and make a matrix object based off of the 2d array. 

Only use square matrices when using the determinant calculation or the program will crash. Also, I won't go into depth but use properly dimensioned matrices when doing matrix addition and multiplication.

Pseudocode: Most of the matrix operations were fairly straight forward except for the determinant operation. One method of finding the determinant is called cofactor expansion, where a matrix is broken down
into smaller 2x2 matrices which have easy to calculate determinants. For this I made a helper method that would take in a matrix and output a new matrix with a specific row and coloumn removed from it. I then
used recursion to total the sum of all the possible combinations that make up a determinant.