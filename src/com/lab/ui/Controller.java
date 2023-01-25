package com.lab.ui;

import com.lab.bl.logic.Gestor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Controller {
    static PrintStream out = System.out;
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static Gestor gestor = new Gestor();

    public void menuPrincipal() throws IOException {
        int op = -1;
        out.println("Menu Lab1");
        out.println("Alonso Cortés");
        out.println(" ");
        out.println("1. Ordenar lista de números");
        out.println("2. Autogenerar password");
        out.println("0. Salir");
        out.println(" ");
        out.println("Elija una opción");
        op = Integer.parseInt(in.readLine());

        procesarOpcion(op);
    }

    private void procesarOpcion(int op) throws IOException {
        switch (op) {
            case 1:
                ordenarLista();
                break;
            case 2:
                autogenerarPassword();
                break;
        }
    }

    private void ordenarLista() throws IOException {
        out.println("Los números a ordenar son:");
        out.println("12, 27, 14, 5, 20");
        out.println("");
        gestor.ordenarLista();

        menuPrincipal();
    }

    private void autogenerarPassword() throws IOException {

        gestor.generarPassword();
        gestor.esFuerte();
        gestor.resultado();

        menuPrincipal();
    }
}
