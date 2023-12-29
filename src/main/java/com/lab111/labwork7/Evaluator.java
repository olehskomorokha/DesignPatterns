/**
 * The `Evaluator` class represents an expression evaluator for mathematical expressions
 * using the interpreter pattern. It is responsible for creating a syntax tree from a
 * given expression and evaluating the expression based on a provided context.
 *
 * @author olegs
 */
package com.lab111.labwork7;
import java.util.Map;
import java.util.Stack;

public class Evaluator {
    private final Expression syntaxTree;

    public Evaluator(String expression){
        Stack<Expression> expressionStack = new Stack<>();
        String[] tokens = expression.split(" ");

        for(String token : tokens){
            if (token.matches("\\d+")){
                expressionStack.push(new Number(Integer.parseInt(token)));
            }
            else if (token.equals("+") | token.equals("-") | token.equals("*") | token.equals("/")) {
                Expression right = expressionStack.pop();
                Expression left = expressionStack.pop();

                if(token.equals("+")){
                    expressionStack.push(new Add(left, right));
                } else if (token.equals("-")) {
                    expressionStack.push(new Subtract(left, right));
                } else if (token.equals("/")) {
                    expressionStack.push(new Divide(left,right));
                } else if (token.equals("*")) {
                    expressionStack.push(new Multiply(left,right));
                }
            }
            else {
                expressionStack.push((new Variable(token)));
            }
        }
        syntaxTree = expressionStack.pop();

    }
    public int evaluate(Map<String, Integer> context){
        return syntaxTree.interpret(context);
    }
}
