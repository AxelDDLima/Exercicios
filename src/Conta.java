public class Conta {
    private double saldo;
    private double chequeEspecial;
    private boolean usandoChequeEspecial;
    private boolean contaNova;
    private double saldoDevedorChequeEspecial;

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
        if(contaNova) {
            setChequeEspecial(saldo <= 500 ? 50.0 : (saldo * 0.5));
            contaNova = false;
        }
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}
