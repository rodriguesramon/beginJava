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
        
        objetoNum01Cliente.setNome("Felipe");
        objetoNum01Cliente.setIdade(29);
        //objetoNum01Cliente.sexo = "Masc.";
        objetoNum01Cliente.setSexo("Masc.");
        
        
        // Vamos enviar o "tipo de sexo" pro metodo definir o real valor do 
        // atributo sexo que está dentro da class
        
        System.out.println("Nome do cliente " + objetoNum01Cliente.getNome());
        System.out.println("Idade do cliente " + objetoNum01Cliente.getIdade());
        System.out.println("Sexo do cliente " + objetoNum01Cliente.getSexo());
        
        //Console.WriteLine()
        
    }
}
