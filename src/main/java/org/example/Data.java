package org.example;

/**
 * A classe Data é uma classe imutável.
 * Sugestão: Tornar a classe Data como final.
 * 
 * Sugestão: É uma boa prática adicionar getters para manter os atributos
 * privados.
 * 
 * O método validarData() é privado e inutilizado dentro da classe.
 * Sugestão: Torne o método static ou coloque-o no construtor da classe.
 * 
 * O método aceita datas inválidas como 31/02/2025;
 * Não leva em conta ano bissexto;
 * Não leva em conta meses com 31 dias.
 * Sugestão: realizar melhorias na lógica para que o método atenda as demandas
 * necessárias para fazer a validação correta de datas ou use
 * java.time.LocalDate diretamente.
 */
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
