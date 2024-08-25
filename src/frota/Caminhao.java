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
public class Caminhao extends Automovel {
    
    int capacidade;
    float largura;
    String caracteristica;

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public Caminhao() {
    }

    public Caminhao(int capacidade, float largura, String caracteristica) {
        this.capacidade = capacidade;
        this.largura = largura;
        this.caracteristica = caracteristica;
    }

    public Caminhao(int capacidade, float largura, String caracteristica, int ano, String marca, String modelo) {
        super(ano, marca, modelo);
        this.capacidade = capacidade;
        this.largura = largura;
        this.caracteristica = caracteristica;
    }
}
