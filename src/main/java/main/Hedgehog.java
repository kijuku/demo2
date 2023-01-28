package main;
// Kirjoita ohjelma, jossa luot siili-olion ja käskytät sitä valikkorakenteen kautta. 
// Tarvitset tähän samanlaisen App.java-tiedoston kuin ensimmäisellä viikolla. 
// Tämä tiedosto sisältää main-metodin, jonka sisällä on valikkorakenne. 
// Tämän lisäksi tarvitset Hedgehog.java-tiedoston, jonka sisällä määritellään Hedgehog-luokka.


// 2 pistettä (saat suoraan 2 pistettä tästä vaiheesta)
// Luokassa tulee määrittää oletusrakentaja, jossa siilille määritellään 
// nimi ja ikä (String name, int age). Oletuksena nämä ovat “Pikseli” ja 5. 
// Tämän lisäksi siilin tulee olla mahdollista puhua. Tämä hoituu speak-metodin kautta. 
// Metodi saa parametrinään String-muuttujan ja tulostaa ruudulle tekstin 
// “<siilin nimi>: <teksti>”. Ohjelman alussa luodaan oletussiili, joka on käytössä heti.
public class Hedgehog {
    private String name;
    private int age;
    
    public Hedgehog(){
        name = "Pikseli";
        age = 5;
    }

    public Hedgehog(String Str, int Age){
        name = Str;
        age = Age;
    }

    public void Run(int amount){
        for (int i = 0; i < amount; i++){
            System.out.println(name + " juoksee kovaa vauhtia!");          
        }
    }

    // Hedgehog Speak - method
    // Call example:
    //      hed.Speak("");
    //      hed.Speak("Terve vaan!");
    public void Speak(String Str){
        if (!Str.equals("")){
            System.out.println(name + ": " + Str);
        }
        else {
            //Olen <siilin nimi> ja ikäni on <siilin ikä>, mutta antaisitko silti syötteen?
            System.out.println("Olen " + name + " ja ikäni on " + age + " vuotta, mutta antaisitko silti syötteen?");
        }
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String Str){
        name = Str;
    }

    public void setAge(int Age){
        age = Age;
    }
    
}
