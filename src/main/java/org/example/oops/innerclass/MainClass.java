package org.example.oops.innerclass;

/*
    1. non-static inner class
    2. static inner class
    3. class inside method
    4. anonymous class
    5. singleton class

 */
public class MainClass
{

    int a = 10;
    public static void main(String[] args)
    {
        SimpleInnerClassExample simpleInnerClassExample = new SimpleInnerClassExample();
        System.out.println(simpleInnerClassExample.a);
        SimpleInnerClassExample.InnerClass innerClass = simpleInnerClassExample.new InnerClass();
        System.out.println(innerClass.a);
        System.out.println(innerClass.b);
        innerClass.showData();
        //
        StaticInnerClassExample.StaticInnerClass staticInnerClass = new StaticInnerClassExample.StaticInnerClass();
        staticInnerClass.showData();

        TestInterface testInterface_1 = new AnonymousClassUsageExample();
        System.out.println(testInterface_1.sum(4, 5));
        TestInterface testInterface = new TestInterface() {
            @Override
            public int sum(int a, int b) {
                System.out.println(" at main class, test interface, anonymous");
                return a + b;
            }
        };
        System.out.println(testInterface.sum(3, 5));

        SingletonClassExample singletonClassExample1 = SingletonClassExample.getSingletonClass();
        System.out.println(singletonClassExample1);
        System.out.println("singletonClassExample1 hashcode = "+singletonClassExample1.hashCode());
        ////
        SingletonClassExample singletonClassExample2 = SingletonClassExample.getSingletonClass();
        System.out.println(singletonClassExample2);
        System.out.println("singletonClassExample1 hashcode = "+singletonClassExample2.hashCode());
    }

}
