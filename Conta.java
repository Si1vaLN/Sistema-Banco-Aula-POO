public class Conta {
  private String numero;
  private double saldo;
  
  public Conta(String numero) {
    this.numero = numero;
    saldo = 0.00;
  }

  public void creditar(double valor) {
      if(valor > 0)
      saldo = saldo + valor;
  }

  public void debitar(double valor) {
    if(valor > 0 && saldo >= valor)
      saldo = saldo - valor;
  }

  public String getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

}