public class Poupanca {
    private double SaldoPoupanca;
    public Poupanca(double SaldoPoupanca) {

        this.SaldoPoupanca =  SaldoPoupanca;
    }

    public void TipoContaPopanca() {
        System.out.println("Poupança");
        System.out.println("Saldo Poupanca é: " + SaldoPoupanca);
    }



    //Saque ContaPoupanca
    public void Saque(int valorPoup){
        if (this.SaldoPoupanca <  valorPoup) {
            System.out.println("Não há saldo na Conta Poupanca");
        } else {
            this.SaldoPoupanca -= valorPoup;
            System.out.println("Seu saldo da restante da Conta Poupanca é: " + SaldoPoupanca);
        }
    }


}

