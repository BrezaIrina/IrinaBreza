package com.irinabreza.hillel.Phone;

public abstract class Phone {
    public abstract void makeOutgoingCall(String number);


    public abstract void receiveIncomingCall(String number);

    public void receiveSms(String number, String message) {
        System.out.println("Receive message" + message + "from number" + number);

}
}
