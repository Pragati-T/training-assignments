package rpncalculator;

import java.util.Stack;

public class RPNCalculator {
	double firstOperand;
	double secondOperand;
	RPNCalculator()
	{
		
	}
	
	public double evaluate(String input) {
		String[] tokens = input.split(" ");
		Stack<Double> stack = new Stack<Double>();
		Operations operation;
		
		for(String token: tokens) {
			
			if(token.equals("+")) {
				operation = new Addition();
				performOperation(stack, operation);			
			}
			else if(token.equals("-")) {
				operation = new Subtraction();
				performOperation(stack, operation);			
			}
			else if(token.equals("*")) {
				operation = new Multiplication();
				performOperation(stack, operation);			
			}
			else if(token.equals("/")) {
				operation = new Division();
				performOperation(stack, operation);			
			}
			else {
				stack.push(Double.parseDouble(token));
			}
		}
		return stack.pop();
	}

	private void performOperation(Stack<Double> stack, Operations operation) {
		firstOperand = stack.pop();
		secondOperand= stack.pop();
		operation.calculate(firstOperand,secondOperand);
		stack.push(operation.result);
	}
	
	

}
