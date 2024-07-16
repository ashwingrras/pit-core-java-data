package org.example.garbage_collection;


public class GarbageCollectionExample {
    static String name;
    public static void main(String[] args) {

        System.out.println(" at GarbageCollectionExample");
        //System.out.println(name.length());
        System.out.println(" now creating objects");
        //TODO Creating objects
        MyClass obj1 = new MyClass("Object 1");
        MyClass obj2 = new MyClass("Object 2");
        System.out.println(obj1);
        obj1.showData();
        System.out.println("obj1: "+obj1);
        //TODO obj1 is now unreachable, eligible for garbage collection
        // nullify obj1
        obj1 = null;
        //obj2 = null;
        //obj1.showData();
        System.out.println("obj1: "+obj1);
        // Requesting JVM to run Garbage Collector
        System.gc();

        // Creating another object
        MyClass obj3 = new MyClass("Object 3");

        // obj2 and obj3 are reachable
        System.out.println("End of main method");
    }
}

class MyClass {
    private String name;

    public MyClass(String name) {
        this.name = name;
        System.out.println(name + " created");
    }

    public void showData()
    {
        System.out.println(" at MyClass showData");
    }

    /**
     * @throws Throwable
     */
    @SuppressWarnings("removal")
    @Override
    protected void finalize() throws Throwable {
        System.out.println("at finalize method");
        System.out.println(name + " is being garbage collected");
    }
}

