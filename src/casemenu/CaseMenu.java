
package casemenu;

import java.util.Scanner;

public class CaseMenu {

    public static void main(String[] args) {
    int menu;
    Scanner leia = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("      MENU       ");
        System.out.println("-----------------");
        System.out.println("[0] FIM ");
        System.out.println("[1] INCLUIR ");
        System.out.println("[2] ALTERAR");  
        System.out.println("[3] EXCLUIR");
        System.out.println("[4] CONSULTAR");
        System.out.println("Digite o codigo");
        menu = leia.nextInt();
        switch (menu){
            case 0: 
                System.out.println("FIM");
                break;
            case 1:
                System.out.println("INCLUIR");
                break;
            case 2:
                System.out.println("ALTERAR");
                break;
            case 3:
                System.out.println("EXCLUIR");
                break;
            case 4:
                System.out.println("CONSULTAR");    
                break;
            default:
                System.out.println("Página em Construção!");
        }
    }
    
}
