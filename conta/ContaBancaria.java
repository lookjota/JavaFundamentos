package conta;

public class ContaBancaria {
  
  private String numero;
  private String Titular;
  private double saldo;

  // Getters e Setters

  public ContaBancaria() {
    saldo = 0.0;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getNumero() {
    return this.numero;
  }




  public void setTitular(String titular) {
    this.Titular = titular;
  }

  public String getTitular() {
    return Titular;
  }



  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public double getSaldo() {
    return saldo;
  }

  // depositar 
  void depositar(double valor) {
    if(valor > 0) {
      saldo = saldo + valor;
      System.out.println("Deposito de R$ " + valor + ". Saldo atual R$ " + saldo);
    } else {
      System.out.println("O valor de deposito eh invalido");
    }
  }

  // sacar
  void sacar(double valor) {
    if(valor > 0 && valor <= saldo) {
      saldo = saldo - valor;
      System.out.println("Saque de R$ " + valor + ". Saldo atual R$ " + saldo);
    }
}
}
