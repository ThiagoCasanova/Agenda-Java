import java.util.Scanner;


public class FaturaTeste
{      
    public static void main (String[]args) {
          Scanner scanner = new Scanner(System.in);
          
        String codigo = "", descricao = "";
        int quantidade = 0;
        double preco = 0.0;
        
        System.out.println("Informe o código do produto:");
        codigo = scanner.next();
        
        System.out.println("Informe a descrição do produto:");
        descricao = scanner.next();
        
        System.out.println("Informe a quantidade de itens que deseja comprar:");
        quantidade = scanner.nextInt();
        
        System.out.println("Informe o preço do item?");
        preco = scanner.nextDouble();
        
    Fatura fatura = new Fatura(codigo, descricao, quantidade, preco);
    
    System.out.println(fatura.toString());
    System.out.println("Valor TOTAL da fatura: R$" + fatura.getTotalFatura());
    }
}
