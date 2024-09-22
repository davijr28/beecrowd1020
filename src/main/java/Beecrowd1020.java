import java.util.Scanner;
public class Beecrowd1020 {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        int age,years,months,days;
        
        //ler variável
        age = leitor.nextInt();
        
        //calcular o valor em anos, meses e dias
        years = age/365;
        months = (age % 365) / 30;
        days = (age % 365) % 30;
        
        //mostrar o resultado no console
        System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n", years,months,days);
    }
}