public class Main {
    
    public static void main(String[] args) {
        //Veiculo veiculo = new Veiculo();
        
        Veiculo automovel = new Automovel();
        automovel.ligar();
        automovel.acelerar();
        automovel.mostrarStatus();
        automovel.desligar();
        
        Veiculo aviao = new Aviao();
        aviao.ligar();
        aviao.acelerar();
        aviao.mostrarStatus();
        aviao.desligar();
    }
}