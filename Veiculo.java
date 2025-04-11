public abstract class Veiculo {
    int velocidade;
    boolean status;
    
    public void ligar() {
        this.status = true;
    }
    
    public void desligar() {
        this.status = false;
    }
    
    public void mostrarStatus() {
        if (status) {
            System.out.println(velocidade);
        } else {
            System.out.println(status);
        }
    }
    public abstract void acelerar();
}