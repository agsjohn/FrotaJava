/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frota;

/**
 *
 * @author cesar
 */
public class Carro extends Automovel {
    
    int portas;
    int lugares;
    String tipo;

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Carro() {
    }

    public Carro(int portas, int lugares, String tipo) {
        this.portas = portas;
        this.lugares = lugares;
        this.tipo = tipo;
    }

    public Carro(int portas, int lugares, String tipo, int ano, String marca, String modelo) {
        super(ano, marca, modelo);
        this.portas = portas;
        this.lugares = lugares;
        this.tipo = tipo;
    }
    
    
    
}
