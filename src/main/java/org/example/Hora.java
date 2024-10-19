package org.example;

public class Hora {
    private int hora;

    private int minuto;

    private int segundo;

    private boolean ValidarHora(int hora, int minuto, int segundo) {
        if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59) {
            return false;
        } else {
            return true;
        }
    }
}
