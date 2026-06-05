public class Conta {
    private double saldo;
    private double chequeEspecial;
    private boolean usandoChequeEspecial;
    private boolean contaNova;
    private double saldoDevedorChequeEspecial;

    public boolean getContaNova() {
        return contaNova;
    }

    public void setContaNova(boolean contaNova) {
        this.contaNova = contaNova;
    }

    public double getSaldoDevedorChequeEspecial() {
        return saldoDevedorChequeEspecial;
    }

    public void setSaldoDevedorChequeEspecial(double saldoDevedorChequeEspecial) {
        this.saldoDevedorChequeEspecial = saldoDevedorChequeEspecial;
    }

    public Conta() {
        this.usandoChequeEspecial = false;
        this.contaNova = true;
    }

    public boolean getUsandoChequeEspecial() {
        return usandoChequeEspecial;
    }

    public void setUsandoChequeEspecial(boolean usandoChequeEspecial) {
        this.usandoChequeEspecial = usandoChequeEspecial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}
