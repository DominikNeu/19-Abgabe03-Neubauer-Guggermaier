# 19-Abgabe03-Neubauer-Guggermaier

Project Overview 

	A simple java project to implement a stack. We have implemented two classes, which are the StringStack and Stack class. 
	In the StringStack class there are all necessary methods to implement a stack.
	In this project we also use the test framework JUnit. For the test framework we have implemented the class
	StringStackTest.

	Package: at.fhj.iit

Stack class: 

	Interface

StringStack class: 

	Includes two class variables and four methods. 

	Method StringStack():
		Constructor from the class StringStack wich have one parameter to set the size. 
    Parameter: Integer

	Method isEmpty():
		Checks if the array is empty or not 
		Returns true or false

	Method push(): 
		To add an element to the stack. 
		Parameter: String

	Method pop():
		To return the last value of the stack.
		Return value: String  

StringStackTest class:
 
	Includes all necessary test case for the methods in class StringStack()

Test cases: 

	testIsEmpty(): 
		to check if the Stack is empty after implementation 
	
	testIsNotEmpty(): 
		to check if the Stack is not empty after pushing an element to the stack 
	
	testPushPop(): 
		to check if all the elements are in the correct order.

	testEmptyPop(): 
		to check if there is an exception when you pop an element from an empty stack. 
	
	testFullPush():
		to check if there is an exception when you push more elements to the stack than possible. 
	
	testConstructorCapNull():
		to Check if there is an exception when the size of the stack is zero. 
