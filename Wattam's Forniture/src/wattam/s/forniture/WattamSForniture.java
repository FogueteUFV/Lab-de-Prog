package Interface;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;
import javax.swing.JOptionPane;
import wattam.s.forniture.Cliente;

public class WattamSForniture{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        //Instanciando funcionário
        //System.out.println("Digite, em sequência, o login, senha, nome e cpf do funcionário");
        
        //Funcionario f = new Funcionario(scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine());
        
        //System.out.println("\n"+f.toString());
        
        //Instanciando Cliente
        System.out.println("Digite, em sequência, o email do cliente, telefone, nome, cpf, rua, numero, bairro e a cidade.");
        
        Cliente c = new Cliente(scn.nextLine(), scn.nextInt(), scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine(), scn.nextLine());
        
        System.out.println("\n"+c.toString());
        
        scn.close();
    }
    
}
