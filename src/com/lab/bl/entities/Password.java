package com.lab.bl.entities;

public class Password {
    private int longitud = 8;
    private String contrasena;
    private boolean resultado;


    public Password() {
        this.longitud = longitud;
    }
//    public Password() {
//    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String setContrasena(String contrasena) {
        this.contrasena = contrasena;
        return contrasena;
    }

    public boolean isResultado() {
        return resultado;
    }

    public boolean setResultado(boolean resultado) {
        this.resultado = resultado;
        return resultado;
    }
}
