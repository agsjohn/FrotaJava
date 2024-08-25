package frota;

/**
 *
 * @author cesar
 */
public abstract class Automovel {
    int ano;
    String marca;
    String modelo;  

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Automovel() {
    }

    public Automovel(int ano, String marca, String modelo) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
    }
}
