/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;
import eapli.util.Console;

/**
 *
 * @author simaotiago
 */
public class MainMenu {
    
    public MainMenu(){
        
    }
    
    public void mainLoop(){
        int op;
        do{
            op=menu();
            switch(op){
                case 0:
                    System.out.println("A Encerrar...");
                    break;
                case 1:
                    //Sócios
                    break;
                case 2:
                    //Quotas
                    break;
                case 3:
                    //Alterar Dados de Acesso
                    break;
            }
        }while(op!=0);
    }
    
    private static int menu(){
        System.out.println("=======================");
        System.out.println("Sistema de Gestão de Sócios");
        System.out.println("=======================");
        System.out.println("1. Sócios");
        System.out.println("2. Quotas");
        System.out.println("3. Alterar Dados de Acesso");
        System.out.println("0. Sair");
        
        int option = Console.readInteger("Escolha uma opção");
        return option;
    }
}
