package testYuji;
import java.util.Scanner;
import java.util.Random;

public class Test01 
{
    public static void main(String[] args)
    {
        System.out.println("Ano de Reval de 2135 (ano galáctico 16524). Lamir', Montens \n\nMay Roosevelt e Theodore Roosevelt, irmãos órfãos de 17 e 19 anos, respectivamente, perderam seus pais há 2 anos em um incêndio em uma taverna. Agora sozinhos, têm de trabalhar para se sustentarem. Theodore é carpinteiro e May trabalha com tecelagem. Mesmo ambos trabalhando, a situação é apertada e precisam ainda pagar as dívidas que seus pais deixaram antes de morrer.\n\nDurante o caminho de volta de para casa depois de May entregar um pedido de cliente, os irmãos passam por um bosque que já haviam adentrado inúmeras vezes. Certo momento, um brilho atrás de uma moita chama a atenção deles. Verificando o montante de folhas misteriosas, eles se deparam com uma espécie de portal. Não acharam nada estranho a existência, mas sim o aparecimento do portal. Ora, naquele mundo, tempos antigos, futurísticos e fantasiosos coexistiam, os governantes de cada planeta que escolhiam o mundo, havendo comunicação entre estes, e seus povos tendo conhecimento de outros planetas com outras realidades. Ao se aproximarem, metade do corpo de um homem encapuzado, de repente, sai e agarra Theo e tenta o puxar para dentro do portal, dizendo desesperadamente, com voz já rouca:\n  -Volte para Windfall, ó rei, clamamos pelo seu socorro!\nCom uma face assustada e inquietante.");

        Scanner scan1 = new Scanner(System.in);
        System.out.println("O que Theodore fará? \n\n1-) Resistir \n2-) Desviar \n3-) Não resistir");
        int decisao1 = scan1.nextInt();
        scan1.close();

        Random random = new Random();

        if (decisao1 == 1)
        {
            int resistir = random.nextInt(20) + 1;
            
            if (resistir < 19)
            {
                System.out.println("Theodore é puxado facilmente pelo homem para dentro do portal.");
            }
            else if (resistir >= 19)
            {
                System.out.println("Theodore é capaz de apresentar resistência, antes de ser puxado pelo homem para dentro do portal.");
            }
        }
        else if (decisao1 == 2)
        {
            int esquiva = random.nextInt(20) + 1;

            if (esquiva < 15)
            {
                System.out.println("Theodore é puxado facilmente pelo homem para dentro do portal.");
            }
            else if (esquiva >= 15)
            {
                System.out.println("Theodore não esquivou-se da investida do homem, porém foi puxado para dentro do portal.");
            }
        }
        else if (decisao1 == 3)
        {
            System.out.println("Theodore n é um pussy q deixaria um cara aleatório sugá-lo");
        }
        else
        {
            System.out.println("Tu sabe ler?");
        }
    }
}
