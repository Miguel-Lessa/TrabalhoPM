package org.example;

public class Data {
    private int dia;

    private int mes;

    private int ano;

    private boolean ValidarData(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 0) {
            return false;
        } else {
            return true;
        }
    }
}
