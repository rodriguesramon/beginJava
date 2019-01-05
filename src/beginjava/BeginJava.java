/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beginjava;

/**
 *
 * @author Ramon Costa
 */
public class BeginJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Cria objeto - Modelo Cliente
        
        Cliente objetoNum01Cliente = new Cliente();        
        
        objetoNum01Cliente.nome = "Felipe";
        objetoNum01Cliente.idade = 29;
        
        System.out.println("Nome do cliente " + objetoNum01Cliente.nome);
        System.out.println("Idade do cliente " + objetoNum01Cliente.idade);
        
        //Console.WriteLine()
        
    }
}
