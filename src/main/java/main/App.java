package main;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner; 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void Running(Hedgehog hed,Scanner Scan){
        System.out.println("Kuinka monta kierrosta?");
        int selection = Integer.valueOf(Scan.nextLine());
        hed.Run(selection);
    }

    public static void Speaking(Hedgehog hed,Scanner Scan){
        System.out.println("Mitä siili sanoo:");
        String str = Scan.nextLine();
        
        hed.Speak(str);
    }

    // Anna siilin nimi:
    // Tekseli
    // Anna siilin ikä:
    // 3
    public static void Creature(Hedgehog hed,Scanner Scan){
        System.out.println("Anna siilin nimi:");
        String name = Scan.nextLine();
        System.out.println("Anna siilin ikä:");
        int age = Integer.valueOf(Scan.nextLine());
        hed.setName(name);
        hed.setAge(age);    
    }

    public static int Menu(Scanner Scan){
        System.out.println(
        "1) Pistä siili puhumaan, "+
        "2) Luo uusi siili, "+
        "3) Juoksuta siiliä, "+
        "0) Lopeta ohjelma");
        int selection = Integer.valueOf(Scan.nextLine());
        return selection;
    }
    
    public static void main( String[] args )
    {
        Hedgehog hed = new Hedgehog("Pikseli",5);
        Scanner Scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int selection;

        do {
        //System.out.println( "Hello World!" );
        selection = Menu(Scan);
        switch (selection) {
            case 0: // Exit
                Scan.close();
                System.out.println("Kiitos ohjelman käytöstä.");
                
            break;
            case 1: // Speak
        
                // Mitä siili sanoo:
                // Moikka!
                // Pikseli: Moikka!
                Speaking(hed,Scan);
            break;
            
            case 2: // Create New Hedgehog¨
                Creature(hed,Scan);
            break;
            case 3: // Run
                // Kuinka monta kierrosta?
                // 2
                // Pikseli juoksee kovaa vauhtia!
                // Pikseli juoksee kovaa vauhtia!
                Running(hed,Scan);
            break;
            default:
                System.out.println("Syöte oli väärä");
            break;
        }
      } while (selection != 0);
              
    }

}
