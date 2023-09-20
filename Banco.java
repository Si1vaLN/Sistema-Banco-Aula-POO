public class Banco {
  
  private Conta[] contas;
  private int indice = 0;
  
  public Banco() {
    contas = new Conta[1000];
  }

  public void cadastrar(Conta conta) {
    if(!existe(conta.getNumero())){
      contas[indice] = conta; 
      indice++;
    }
  }
  

  private Conta procurar(String numero) {
    for(int i = 0; i < indice; i++){
      if (contas[i].getNumero().equals(numero)) {
        return contas[i];
      }
    }
    return null;
  }

  public boolean existe(String numero) {
    Conta conta = procurar(numero);
    if(conta != null){
      return true;
    }
    return false;
  }
  
  public void creditar(String numero, double valor) {
    Conta conta = procurar(numero);
    if(conta != null){
      conta.creditar(valor);
    }
  }

  public void debitar(String numero, double valor) {
    Conta conta = procurar(numero);
    if(conta != null){
      conta.debitar(valor);
    }
  }

  public double saldo(String numero) {
    Conta conta = procurar(numero);
    if(conta != null){
      return conta.getSaldo();
    }
    return -1;
  }

  public void transferir(String origem, String destino, double valor) {
    if(existe(origem) && existe(destino)){
      debitar(origem, valor);
      creditar(destino, valor);
    }
  }

  public int quantidade() {
    return indice;
  }  
}