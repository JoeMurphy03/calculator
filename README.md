# calculator
Calculator application for Assignment a1

Six classes
Main class - Holds the menu, and all input variables. Uses the other classes to perform the calculator functions. 
  -Every time there is a calculation, the whole calculation becomes a string which gets put into the history array, which constantly updates every time it is called. It will hold the last ten calculations. 

Calculation classes
  - Addition: Gets two parameters, first number, second number. Performs addition on the two and returns the answer
  - Subtraction: Gets two parameters, first number, second number. Performs subtraction on the two and returns the answer
  - Multlipication: Gets two parameters, first number, second number. Performs Multiplication on the two and returns the answer
  - Division: Gets two parameters, first number, second number. Performs Division on the two and returns the answers
    
CalculationString
    -get four perameters, first number, second number, answer, and sign
    -Uses the Double toString to concatenate all four parameters into one string which gets returned in main into the history array
