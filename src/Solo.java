import Semente.Semente;
 public class Solo {
    // Atributos
   String tipo_solo;
   String cor;
   Boolean fertil;

    // Método
    public Planta gerarPlanta(Semente s1){
        Planta p1 = new Planta(s1);
        return p1;
    }

}
