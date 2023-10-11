public class ContaCorrente {
    private int idContaCorrente;
    private int limite;
    private int totalTransacoes;

    public ContaCorrente(int idContaCorrente, int limite, int totalTransacoes) {
        this.idContaCorrente = idContaCorrente;
        this.limite = limite;
        this.totalTransacoes = totalTransacoes;
    }

    public int getIdContaCorrente() {
        return idContaCorrente;
    }

    public int getLimite() {
        return limite;
    }

    public int getTotalTransacoes() {
        return totalTransacoes;
    }
}
