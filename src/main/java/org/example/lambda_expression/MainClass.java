package org.example.lambda_expression;

public class MainClass
{
    public static void main(String[] args)
    {
        System.out.println(" at lambda expression Main Class");

        LambdaInterfaceExample interfaceExampleOld = new ClassWithLambdaExpression();
        interfaceExampleOld.multiply(3, 5);

        //TODO Anonymous Class
        LambdaInterfaceExample interfaceExample = new LambdaInterfaceExample() {

            @Override
            public double multiply(double a, double b) {
                return a * b;
            }
        };
        interfaceExample.multiply(4, 6);
        // TODO Lambda Expression
        LambdaInterfaceExample lambdaInterfaceExample = (a,  b) ->
        {
            //System.out.println(" at lambda multiply method");
            return a * b;
        };
        System.out.println(lambdaInterfaceExample.multiply(2, 4));

        LambdaInterfaceExample2 lambdaInterfaceExample2 = (value) -> System.out.println("value as "+value);
        lambdaInterfaceExample2.printString("Poornima College");
        lambdaInterfaceExample2.printString("Devashish");
        //Tasks

        // int[] array = {2, 4, 1, 6, 5, 3, 7, 9, 8};
        // Find Maximum Number from above array using lambda expression
        // Maximum value from array using lambda method
        // Array sort ( Bubble sort) using lambda expression
        int[] array = {2, 8, 4, 6, 5, 3, 7, 9, 1};
        FunctionalInterfaceArrayMax functionalInterfaceArrayMax = (arr) -> {
            int maxValue = -1;
            int secondMaxValue = -1;
            for (int j : arr)
            {
                if (j > maxValue)
                {
                    secondMaxValue = maxValue;
                    maxValue = j;
                }
                else if(j > secondMaxValue && j != maxValue)
                {
                    secondMaxValue = j;
                }
            }
            return secondMaxValue;
        };
        System.out.println("second max in array : "+functionalInterfaceArrayMax.getArrayMaxValue(array));
    }
}
