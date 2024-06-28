
package condicional;
import java.util.Scanner;
public class Condicional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
       
       
        System.out.println("Digite sua idade");
        idade = sc.nextInt();
       
        if (idade >= 18){
           System.out.println("vc esta apto a dirigir");
        }
        else {
            if (idade >=15 && idade <=17){
                System.out.println("Permissao");
            }
            else {
                System.out.println("Negado");
            }
        }
        
    }
    
}
