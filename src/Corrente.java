public class Corrente {

    private double SaldoCorrente;

    public Corrente(double SaldoCorrente) {

        this.SaldoCorrente = SaldoCorrente;

    }

    public void TipoContaCorrente() {
        System.out.println("Corrente");
        System.out.println("Saldo Corrente: " + SaldoCorrente);
    }


    public void Saque(int valorCor){
        if (this.SaldoCorrente <  valorCor) {
            System.out.println("Não há saldo na conta Corrente ");
        } else {
            this.SaldoCorrente -= valorCor;
            System.out.println("Seu saldo restante da Conta Corrente é: " + SaldoCorrente);
        }



    }

}
