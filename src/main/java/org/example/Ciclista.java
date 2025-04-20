package org.example;

/**
 * "etapa" no singular é confuso considerando que é um conjunto.
 * Sugestão: usar "etapas"
 * 
 * Usar array fixo reduz a flexibidade do código.
 * Sugestão: utilizar List<Etapa> se puder variar a quantidade de etapas.
 */
public class Ciclista {
    private Etapa[] etapa;

    public Ciclista() {
        this.etapa = new Etapa[21]; // Inicializa o array com 21 etapas
    }
}
