public class Main {
    public static void main(String[] args) {
        // Aula introdutória de Orientação à Objetos
        // Declaração de objeto
        Pessoa adao;
        // Instanciação do objeto
        adao = new Pessoa();
        // Ao mesmo tempo
        Pessoa qualquer = new Pessoa();
        // Definir formato do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
        // comportamento
        qualquer.falar();
        System.out.println(qualquer.falar("oi"));
        // Criar novos objetos
        // Declarar objeto
        Pessoa rainha;
        // Instanciar objetos
        rainha = new Pessoa();
        // Definir forma do objeto
        rainha.nome = "Tina";
        rainha.sobrenome = "Tunner";
        // Definição do comportamento
        rainha.falar();
        rainha.comer();

        Produto p1 = new Produto(13300.00);
        Produto p2 = new Produto();
        // p2.preco = 200.00;
        p2.setPreco(200.00) ;
        Produto p3;
        p3 = new Produto ("placa mãe", 2550.00);

        p2.setPreco(1000.00) ;
    }
}