public class TestConta {


    public static void main(String[] args) {
        System.out.println("Dados da Conta");
        System.out.println("------------------");
        Conta conta =  new Conta("Pedro Silva", "892309023", 10000);
        Corrente c1 = new Corrente(4000);
        Poupanca c2 = new Poupanca(6000);

        conta.TipoConta();
        c1.TipoContaCorrente();
        c1.Saque(1000);
        System.out.println("----------------------------------");
        c2.TipoContaPopanca();

    }
}
