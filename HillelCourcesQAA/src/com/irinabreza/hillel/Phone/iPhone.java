package com.irinabreza.hillel.Phone;

public class iPhone extends Phone{

    @Override
    public void makeOutgoingCall(String number) {
        System.out.println("Calling" + number + "from iPhone");
    }



    @Override
    public void receiveIncomingCall(String number) {
        System.out.println("New call from" + number + " on iPhone");
    }

}
