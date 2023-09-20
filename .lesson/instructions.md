# Instruções  

## Visão Geral
Nessa prática de programação, cada questão (descrita em cada passo da próxima seção) deve ser implementada nas classes especificadas. Existem testes automatizados para todas as classes a serem implementadas, portanto, você não deve alterar nem o nome e nem a assinatura dos métodos já fornecidos, sejam os completamente implementados ou na forma de stubs (sem implementação funcional de fato).

## Passos

1. Codifique na classe ``Calculadora`` os métodos para cada uma das operações: adicionar, subtrair, multiplicar e dividir. Veja a assinatura de métodos da classe abaixo:


```
public class Calculadora{
  public Calculadora(){...} 
  public double adicionar(double operandoA, double operandoB){...}
  public double subtrair(double operandoA, double operandoB){...}
  public double multiplicar(double operandoA, double operandoB){...}
  public double dividir(double operandoA, double operandoB){...}
} 
```

2. Com base na ``Nota de Aula 05.pdf`` disponível no [SIGAA](https://si3.ufc.br/sigaa/verTelaLogin.do), escreva o código da clase ``Conta`` no arquivo ``Conta.java``. OBS. não altere a assinatura dos métodos para evitar falha na execução dos testes automatizados.

```
public class Conta {
  public Conta (String numero){...} 
  public void creditar(double valor){...}
  public void debitar(double valor){...}
  public String getNumero(){...}
  public double getSaldo(){...}
}
```

3. Com base na ``Nota de Aula 05.pdf`` disponível no [SIGAA](https://si3.ufc.br/sigaa/verTelaLogin.do), escreva o código da clase ``Banco``. OBS. não altere a assinatura dos métodos para evitar falha na execução dos testes automatizados.

```
public class Banco {
  public Banco(){...} 
  public void cadastrar(Conta conta){...}
  private Conta procurar(String numero){...}
  public boolean existe(String numero){...}
  public void creditar(String numero, double valor){...}
  public void debitar(String numero, double valor){...}
  public double saldo(String numero){...}
  public void transferir(String origem, String destino, double valor){...}
  public int quantidade(){...}
}
```
