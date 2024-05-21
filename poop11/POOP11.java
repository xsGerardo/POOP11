/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gerar
 */
public class POOP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("##### File Writer #####");
        try{
            // Clase que permite la entrada de datos desde el teclado
            /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribe texto: ");
            String texto = br.readLine();
            System.out.println(texto);*/
           
            // Clase para crear o editar un archivo. En este caso "alumnos".
            FileWriter fw = new FileWriter("alumnos.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            //salida.println("Hola mundo desde POO");
            //salida.println(texto);
           
            
            // Creación de alumnos, cada uno se mete en el Array List
            Alumno alu1 = new Alumno("Ruben Alberto","Ortega","Macias","Computacion",314125109,25);
            ArrayList<Alumno> listaAlumnos = new ArrayList <Alumno>();
            listaAlumnos.add(alu1);
            listaAlumnos.add(new Alumno("Isaac","Mendoza","Sosa","Computacion",317179211,20));
            listaAlumnos.add(new Alumno("Jocelyn","Cruz","Herrera","Computacion",320202238,20));
            listaAlumnos.add(new Alumno("Marcos","Ortiz","De Jesus","Computacion",317266788,22));
            listaAlumnos.add(new Alumno("Carlos","Perez","Gomez","Civil",234634236,21));
            listaAlumnos.add(new Alumno("Gerardo","Pliego","Hidalgo","Telecomunicaciones",320087240,19));
            listaAlumnos.add(new Alumno("Axel","Garcia","Ramos","Geofisica",234634236,22));
            listaAlumnos.add(new Alumno("Emiliano","Sanchez","Reyes","Mecatronica",213513631,18));
            listaAlumnos.add(new Alumno("Ximena","Palacios","Romero","Sistemas Biomedicos",346262442,20));
            listaAlumnos.add(new Alumno("Andrea","Alvarez","Casas","Ambiental",324923411,19));
            listaAlumnos.add(new Alumno("Arturo","Navarro","Guzman","Electrica",312352575,23));
            listaAlumnos.add(new Alumno("Jessica","Nunez","Casillas","Industrial",241253465,22));
            
            for (Alumno alumno : listaAlumnos) {
                salida.println(alumno.toString());
            }
            // Se cierra la salida del PrintWriter, porque es necesario hacerlo.
            salida.close();
           
        // Se lanza una excepción que indica problemas con las operaciones de entrada y salida.
        } catch (IOException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        System.out.println("##### File Reader #####");
       
        try{
            // Se lee el archivo "alumnos.csv" y se muestra su contenido.
            FileReader fr = new FileReader("alumnos.csv");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("El texto del archivo es: ");
            String linea = br.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            // Se cierra el bufferedReader.
            br.close();
        } catch (FileNotFoundException ex) { 
            // Se lanza una excepción para archivos que no se encuentran.
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            // Se lanza una excepción para evitar problemas con las operaciones de entrada y salida.
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        System.out.println("");
        System.out.println("##### String Tokenizer #####");
        
        // Uso de String Tokenizer para separar cadenas en tokens.
        String[] textos = {
            "Ruben Alberto,Ortega,Macias,Computacion,314125109,25",
            "Marcos,Ortiz,De Jesus,Computacion,317266788,22",
            "Carlos,Perez,Gomez,Civil,234634236,21",
            "Gerardo,Pliego,Hidalgo,Telecomunicaciones,320087240,19",
            "Axel,Garcia,Ramos,Geofisica,234634236,22",
            "Emiliano,Sanchez,Sosa,Mecatronica,213513631,18",
            "Ximena,Palacios,Romero,Sistemas Biomedicos,346262442,20",
            "Andrea,Alvarez,Casas,Ambiental,324923411,19",
            "Arturo,Navarro,Guzman,Electrica,312352575,23",
            "Jessica,Nunez,Casillas,Industrial,241253465,22"
        };

        // Ciclo for-each que recorre cada texto y separa las cadenas en tokens.
        for (String texto : textos) {
            StringTokenizer tokenizador = new StringTokenizer(texto, ",");
            // Ciclo while que indica que mientras existan tokens, se imprima el siguiente token.
            while (tokenizador.hasMoreTokens()) {
                System.out.println(tokenizador.nextToken());
            }
            System.out.println("");
        }
        
    }
    
}
