/**
 * @deprecated 
 * Método sobre carros
 */

public class Carros {

    public String modelo;
    public String cor;
    public int velocidade;

    /**
     * 
     * @param cor
     * @param modelo
     * @param velocida
     */

    public Carros(String cor, String modelo, int velocida){
        this.cor = cor;
        this.modelo = modelo;
        this.velocidade = velocida;
    }

    // Método para a descrição do carro
    public String getDescricao() {
        return "Modelo: " + this.modelo + ", Cor: " + this.cor + ", Velocidade: " + this.velocidade;
    }
}
