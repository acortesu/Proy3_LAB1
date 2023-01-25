package com.lab.bl.logic;

import com.lab.bl.entities.PasswordFactory;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Gestor {
    public void ordenarLista() {
        List<Integer> list = Arrays.asList(12, 27, 14, 5, 20);
        Collections.sort(list, Comparator.naturalOrder());

        System.out.println("Lista ordenada de números: "+list);
    }

    private PasswordFactory passFactory;

    public Gestor() {
        passFactory = new PasswordFactory();
    }

    public void generarPassword() {
        passFactory.generarPassword();
    }
    public void esFuerte() {
        passFactory.esFuerte();
    }
    public void resultado() {
        passFactory.result();
    }
}
