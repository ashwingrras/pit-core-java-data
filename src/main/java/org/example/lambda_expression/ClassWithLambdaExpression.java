package org.example.lambda_expression;

public class ClassWithLambdaExpression implements LambdaInterfaceExample, LambdaInterfaceExample2
{

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public void printString(String value) {
        System.out.println(" value as "+value);
    }
}
