package com.irinabreza.hillel.Phone;

    public class AndroidPhone extends Phone {

        @Override
        public void makeOutgoingCall(String number) {
            System.out.println("Calling" + number + "from android");
        }

        @Override
        public void receiveIncomingCall(String number) {
            System.out.println("New call from" + number + " on android");
        }
    }

