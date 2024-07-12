package org.example.string_handling;

/*
    StringBuffer:
    1. mutable
    2. thread safe

    StringBuilder:
    1. mutable
    2. not thread safe

 */


import java.util.Date;

public class StringBufferExample
{
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();//16
        System.out.println(stringBuffer.capacity());
        stringBuffer.ensureCapacity(10);
        System.out.println(stringBuffer.capacity());
        stringBuffer.append("poornima college, jaipur");
        // currentCapacity * 2 + 2;
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.capacity());
        long currentMS1 = new Date().getTime();
        System.out.println(currentMS1);
        StringBuffer stringBuffer1 = new StringBuffer();
        for(int i=0; i < 100000000; i++)
        {
            stringBuffer1.append(i);
        }
        long currentMS2 = new Date().getTime();
        System.out.println(currentMS1);
        System.out.println(currentMS2 - currentMS1);
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i < 100000000; i++)
        {
            stringBuilder.append(i);
        }
        long currentMS3 = new Date().getTime();
        System.out.println(currentMS3);
        System.out.println(currentMS3 - currentMS2);
    }
}
