package org.example.generics;

public class GenericClassMultiParameter<T, U>
{
    T sender;
    U receive;

    // constructor with generic type
    GenericClassMultiParameter(T sender, U receive)
    {
        this.sender = sender;
        this.receive = receive;
    }


    public T getSender() {
        return sender;
    }

    public void setSender(T sender) {
        this.sender = sender;
    }

    public U getReceive() {
        return receive;
    }

    public void setReceive(U receive) {
        this.receive = receive;
    }
}
