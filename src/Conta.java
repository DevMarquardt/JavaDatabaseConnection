public class Conta {
    private int id;
    private String nome;
    private double saldo;
    private ContaCorrente contaCorrente;

    public Conta(int id, String nome, double saldo) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Conta(int id, String nome, double saldo, ContaCorrente contaCorrente) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
        this.contaCorrente = contaCorrente;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }
}
