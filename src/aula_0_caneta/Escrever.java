package aula_0_caneta;

public class Escrever {
    public static void main(String[] args) {
        Caneta color_red = new Caneta("Caneta Gel","Vermelho",0.1f,100);
        Caneta comum = new Caneta();


        comum.status();
        comum.destampar();
        comum.status();
        comum.rabiscar("Essa num ta tampada");
        comum.rabiscar();
        color_red.status();
        color_red.updt_modelo("Caneta azul");
        color_red.status();

    }
}
