

public class Conta {
    String nome;
    String numero;
    double saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(String nome, String numero, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void Saque(double saldo){
        this.saldo = saldo;
        if(saldo < this.saldo){
            System.out.println("Transacao nao realizada");
        } else {
            this.saldo -= saldo;
            System.out.println("Transacao completa! ");
        }
}
public void TipoConta(){
    System.out.println("Tipo de Conta: Brasil");
    System.out.println("Nome:" + nome);
    System.out.println("Numero:" + numero);
    System.out.println("Saldo: " + saldo);
}
}

