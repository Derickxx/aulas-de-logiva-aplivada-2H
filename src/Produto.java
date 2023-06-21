public class Produto {

 private double preco;
    String modelo;
    int nivelAcesso;
    public void setPreco(double _preco) {

        if (nivelAcesso == 5) {
            this.preco = _preco;
        }
    }
    // metodo construtor
    Produto() {}

    // sobrecarga do metodo construtor
    Produto(double preco) {
        this.preco = preco;

    }
// mais uma sobrecarga
    Produto(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

}


