**Naming convention and coding standard:**
1.	Class --> Demo, AudiCar, SortStudentByAge
2.	Variable --> age, studentAge, noOfStudents
3.	Methods --> work(), shiftGears(), checkEvenOrOdd()
4.	Packages --> lowercase com, org, in…...
5.	Constants --> Uppercase GST, PI, ID...

**What is Java?**

It is an Object Oriented Programming Language because it is support all 5 OOPS concept like Class, Object, Polymorphism, Inheritance, Abstraction and Encapsulation.
What is object oriented means – without class we can’t write a single line of code.
Types of Programming language.

**Types --	Languages --	Concept support**

Structured --	C, Python --	No OOPS concept support
Object based --	VB, VB Script --	Class, Object
Object Oriented --	C++, JAVA, C#, Python --	Class, Object, Polymorphism, Inheritance, Abstraction and Encapsulation

**Features of JAVA:**
1.	Platform independent
2.	Case Sensitive
   
**Components of JAVA:**
1.	JDK – Java Development Kit
2.	JRE – Java Runtime Environment
3.	JVM – Java Virtual Machine


**Operators:**

Arithmetic Operator -> +, -, *, /, %
Relational Operator ->>, >=, <, <=, ==, !=
Logical Operator ->&&, ||, !
Assignment/ Short hand operator -> = +=, -=, *=, /=, %=
Increment/Decrement Operator -> ++, --
Ternary/Conditional Operator -> Variable = (Expression)? true: false;
Operators are classified into 3 types
Unary ->those operators we can use with single variable
++, --, +=,-=, *=, /=, %=, !, =
Binary ->those operators we can use with at least two variables
+, -, *, /, %, &&, ||, >, >=, <, <=, !=, ==
Ternary -> those operators we can use with at least three variables
?:

**Conditional Statements:**

**Method Overloading:**

In a class having multiple methods with the same name, but difference in arguments is called as Method Overloading.
In order to achieve method overloading we need to satisfy either 1 of the following 3 rules.
1. There should be a change in the Number of Arguments.
2. There should be a change in the Data type of the Arguments.
3. There should be a change in the order/sequence of the Data types.

**Note:**
1. Both Static and Non-Static methods can be Overloaded.
2. Yes, we can overload Main() as well, But the execution starts from the main() which accepts String[] as the argument.
3. Return type might be same or different.
4. Method Overloading is also referred as Compile time Polymorphism.

**Scanner**

1. Scanner is a pre-defined class in java.util package.
2. Scanner class is used to accept dynamic input from the User.

**Rules to accept dynamic input from the user (or) Rules to work around with Scanner class**
1. Create an object of Scanner class.
2. Pass System.in to the Constructor call.

**Syntax:**

Scanner scan = new Scanner(System.in);

3. import Scanner class from java.util package.
   
Syntax: import java.util.Scanner;

4. Make use of pre-defined methods to accept dynamic input.


