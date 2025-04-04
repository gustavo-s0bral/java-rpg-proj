import java.util.Scanner;

public class Xp {
    public static void main(String[] args) {
        int XpPlayer = 25;
        int pontosDeStatus = 0;
        int levelPlayer = 1;
        
        int forcaStatus = 1;
        int forcaStatusAdicao = 0;

        int energiaStatus = 1;
        int energiaStatusAdicao = 0;

        int vidaStatus = 1;
        int vidaStatusAdicao = 0;

        int criticoStatus = 1;
        int criticoStatusAdicao = 0;

        int lifeJogador = 100;

        if (XpPlayer == 25) {
            levelPlayer += 1;
            pontosDeStatus += 1;
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Escolha a opcao que voce deseja evoluir:\n1 - forca\n2 - chance de acerto\n3 - vida\n4 - critico\n");
            int escolhaStatus = scanner1.nextInt();
            if (escolhaStatus == 1) {
                System.out.println("Voce upou sua força, voce ganhou uma adicao de 5 DMG");
                forcaStatusAdicao += 5;
                forcaStatus += 1;
            }
            else if(escolhaStatus == 2){
                System.out.println("Você upou sua energia, ganhou uma adicao de +1 em chance de acertar");
                energiaStatus += 1;
                energiaStatusAdicao+=1;
            }
            else if (escolhaStatus == 3) {
                System.out.println("Voce upou sua vida, ganhou +10 de HP.");
                vidaStatus += 1;
                vidaStatusAdicao += 10;
                lifeJogador += vidaStatusAdicao;
            }
            scanner1.close();
        }
        System.out.println(levelPlayer);
        System.out.println(pontosDeStatus);
        System.out.println(lifeJogador);
    }
}
