import java.util.Scanner;
import java.util.Random;

public class Teste {
   public static void main(String[] args) {
      
      Scanner a = new Scanner(System.in);
      System.out.println("Teste de ataque, aperte 1 para começar!");
      int Selecionar = a.nextInt();
      if (Selecionar == 1) {
         
         Random random = new Random();
         int RandomNumber = random.nextInt(21);
         if (RandomNumber >= 20) {
            System.out.println(RandomNumber);
            System.out.println("Ataque Critico!");
         } 
         
         else if (RandomNumber >= 10) {
            System.out.println(RandomNumber);
            System.out.println("Ataque Normal!");
         }  
         
         else if (RandomNumber <= 10) {
            System.out.println(RandomNumber);
            System.out.println("Ataque Ineficiente!");
         }

      }


     
    



   } 

}
