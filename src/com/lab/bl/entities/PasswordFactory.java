package com.lab.bl.entities;

import java.io.PrintStream;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PasswordFactory {
    static Password pass = new Password();
    static PrintStream out = System.out;

    public void generarPassword() {
        int length = pass.getLongitud();
        String cap_letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small_letter = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";

        String finalString = cap_letter + small_letter + numbers;

        Random random = new Random();

        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            password[i] = finalString.charAt(random.nextInt(finalString.length()));
        }
        String passw = pass.setContrasena(String.valueOf(password));

        out.println("Su password es " + passw + " y su longitud es de " + length);
    }

    public static boolean esFuerte(){
        String password = pass.getContrasena();
        Pattern p = Pattern.compile("(?=.*[a-z])(?=\\d{5})^(.*?[A-Z]){2,}.*$");
        Matcher m = p.matcher(password);
        boolean esFuerte = pass.setResultado(m.matches());

        return esFuerte;
    }

    public void result(){
        boolean esFuerte = pass.isResultado();
        if (esFuerte == true) {
            out.println("La contraseña es fuerte");
        } else {
            out.println("La contraseña es débil");
        }
    }
}
