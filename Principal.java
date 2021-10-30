import java.util.Scanner;
/* Autor: Jeniffer Bittencourt (20103091)
    Data: 5/10/20

**/
public class Principal {
    public static void main(String args[]){ //aqui que a mágica acontece
        Scanner x = new Scanner(System.in); //objeto que lê as informações dadas pelo usuário
        int op = 0; //váriavel p/ controlar as opções do menu

        while(op != 5) {
            op = menu(); //chama função do menu
            switch(op) { //switch  recebe valor que definira qual função executar

                case 1:
                    Carrinho.adicionarProduto(); //adiciona o produtinho
                    break;
                case 2:
                    Carrinho.listarProduto(); //lista o produtinho
                    break;
                case 3:
                    Carrinho.removerProduto(); //remove com erro o produtinho
                    break;
                case 4:
                    Carrinho.esvaziarCarrinho(); //deixa tudo zeradinho
                    break;
                case 5:
                    x.close(); //fecha o programinha
                    break;
                default:
                    System.out.println("Digite apenas os números do MENU!"); //alerta o usuário sobre o que fazer
            }
        }

    }
    public static int menu() { //menu-chan
        Scanner x = new Scanner(System.in);
        int k = 0;
        System.out.println(" _______________________________________________");
        System.out.println("|                     M E N U                   |");
        System.out.println("|                                               |");
        System.out.println("|        1. Adicionar Produto no carrinho       |");
        System.out.println("|        2. Listar Produtos no carrinho         |");
        System.out.println("|        3. Remover produtos no carrinho        |");
        System.out.println("|        4. Esvaziar carrinho                   |");
        System.out.println("|        5. Sair                                |");
        System.out.println("|_______________________________________________|");
        System.out.print("Escolha : ");
        k = x.nextInt();
        System.out.println("........................................");
        System.out.println("\n");
        return k;
    }
}

