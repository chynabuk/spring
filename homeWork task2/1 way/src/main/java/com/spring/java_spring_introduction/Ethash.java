package com.spring.java_spring_introduction;

public class Ethash implements Algorithm{

    public static class CezarCod {

        private static String getCodingIncodMessage(String message, int key) {
            StringBuilder strBox = new StringBuilder(message.length());
            char tmp;
            for (int i = 0; i < message.length(); i++) {
                tmp = message.charAt(i);
                if (Character.isLetter(message.charAt(i))) {
                    tmp += key % 26;
                    if (tmp > 'z')
                        tmp = (char)(tmp % 'z' + 'a');
                    else if (tmp < 'a')
                        tmp = (char)(tmp + 25);
                }
                strBox.append(tmp);
            }
            return strBox.toString();
        }

    }

    @Override
    public void doSmth(String text) {
        System.out.println("Cezar: " + CezarCod.getCodingIncodMessage(text, 10));
    }
}