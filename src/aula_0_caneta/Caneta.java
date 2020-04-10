package aula_0_caneta;

public class Caneta {
    //CONSTANTES
    private final int MAX_CARGA = 1024;
    private final int MIN_CARGA = 0;

    //ATRIBUTOS
    private final String modelo;
    private final String cor;
    private final float ponta;
    private int carga;
    private boolean tampada;

    //CONSTRUTORES
    public Caneta(String modelo, String cor, float ponta,int carga) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampar();
        this.carregar(carga);
    }
    public Caneta() {
        this.modelo = "Padrão";
        this.cor = "Transparente";
        this.ponta = 0.1f;
        this.tampar();
        this.carregar();
    }

    //METODOS
    public void status(){
        System.out.printf("\nModelo: %s", this.modelo());
        System.out.printf("\nCor: %s",this.cor);
        System.out.printf("\nPonta: %s", this.ponta);
        System.out.printf("\nCarga: %s", this.carga);
        System.out.printf("\nTampada: %b\n",this.tampada);
    }
    //Getters
    public String modelo(){
        return this.modelo;
    }
    public Caneta updt_modelo(String modelo){
        return new Caneta(modelo, this.cor, this.ponta,this.carga);
    }


    protected void rabiscar(String text){
        if(tampada || this.carga <= MIN_CARGA){
            System.out.println("ERRO! Não pode rabiscar");
        }else {
            System.out.println(text);
            this.use_carga(text.length());
        }
    }
    protected void rabiscar(){
        if(tampada || this.carga <= MIN_CARGA){
            System.out.println("ERRO! Nâo pode rabiscar");
        }else {
            String ESCREVA = "Rabiscar (*-*)!!!";
            System.out.println(ESCREVA);
            this.use_carga(ESCREVA.length());
        }
    }


    private void use_carga(int use){
        if(this.carga > use)
            this.carga -= use * (this.ponta * 10);
    }

    protected void carregar(int tinta){
        if(this.carga >= MAX_CARGA) {
            this.carregar();
        }else
        if(this.carga <= MIN_CARGA){
            this.carga = MIN_CARGA;
        }else this.carga = tinta;
    }

    protected void carregar(){
        this.carga = MAX_CARGA;
    }

    protected void tampar(){
                tampada = true;
    }

    protected void destampar(){
        tampada = false;
    }

}