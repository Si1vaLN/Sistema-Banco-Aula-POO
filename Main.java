import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Calculadora calculadora = new Calculadora();
    Banco banco = new Banco();
    Conta conta = new Conta(scanner.nextLine());
    
    banco.cadastrar(new Conta(scanner.nextLine()));
    banco.transferir(scanner.nextLine(), scanner.nextLine(), scanner.nextDouble());
    banco.creditar(scanner.nextLine(), scanner.nextDouble());
    banco.debitar(scanner.nextLine(), scanner.nextDouble());
    
    conta.getNumero();
    conta.creditar(scanner.nextDouble());
    conta.debitar(scanner.nextDouble());
    
    calculadora.dividir(scanner.nextDouble(),scanner.nextDouble());
    calculadora.multiplicar(scanner.nextDouble(),scanner.nextDouble());
    calculadora.subtrair(scanner.nextDouble(),scanner.nextDouble());
    calculadora.adicionar(scanner.nextDouble(),scanner.nextDouble());
    
  }
}