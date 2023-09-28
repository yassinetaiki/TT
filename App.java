import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.text.NumberFormat;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
         //In Java we have 8 primitive types. All the other types are reference types. These
         // types don’t store the actual objects in memory. They store the reference (or the
         // address of) an object in memory
        //primitive type (byte , short , int , long ,char  , float , double , boolean) 
        int age = 32 ;
        System.out.println(age);
        
        //refrence Type
        //reference type-date- 
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());
        
        //reference type string 
        String name="yassine";
        System.out.println(name.startsWith("y")); //ca va routrner true 
        System.out.println(name.endsWith("y")); //false 
        System.out.println(name.indexOf("y")); //0
        System.out.println(name.length()); //7
        System.out.println(name.replace("y","b")); //bassine
        System.out.println(name.toLowerCase()); //yassine
        System.out.println(name.toUpperCase()); // YASSINE
        System.out.println(name.trim()); //enlever les espaces 
        

        //Common escape sequences:
        // • \\
        // • \”
        // • \n (new line)
        // • \t (tab)



        //tableau 
        //1 er facon de declarer tableau 
        int[] tab1 = new int[3];
        tab1[0] = 10;
        tab1[1] = 20;
        tab1[2] = 22;
        System.out.println(Arrays.toString(tab1));
       //2eme facon de declarer tableau
        int[] tab2={90,50,60};
        System.out.println(Arrays.toString(tab2)); //afficher tout le tableau on utilise la biblio Arrays
        System.out.println(tab2.length);
        Arrays.sort(tab2);
        System.out.println(Arrays.toString(tab2));
        //multi tableaux
        int[][] tab_multi_dim ={
                     {1,2,3},
                     {4,5,6}
                    }; 
        System.out.println(Arrays.deepToString(tab_multi_dim));//aficher la matrice

        //constante 
        final float INTEREST_RATE = 04; //on utilise Final
        System.out.println(INTEREST_RATE);

        //arthimitique expression 
        int x = 10 / 3; // returns an int
        float x2 = (float)10 / (float)3; // returns a float
        System.out.println(x);
        System.out.println(x2);

        //Increment and Decrement Operators
        int x3 = 1;
        x3++; // Equivalent to x = x + 1
        x3--; // Equivalent to x = x - 1
        //Augmented Assignment Operator
        int x4 = 1;
        x4 += 5; // Equivalent to x = x + 5

        //casting
        // Implicit casting happens because we try to store a short
        // value (2 bytes) in an int (4 bytes).autrement dite 
        //lorsque vous affectez une valeur d'un type de données plus petit ou moins précis
        //à un type de données plus grand ou plus précis. Cela se fait sans perte de données, 
        //car le type de destination peut contenir toutes les valeurs du type sourc
        short x6 = 1;
        int y1 = x6;
        // Explicit casting
        double x7 = 1;
        int y2 = (int) x7;

        //convert string to number we use 
        // Byte.parseByte("1")
        // Short.parseShort(“1”)
        // Integer.parseInt(“1”)
        // Long.parseLong(“1”)
        // Float.parseFloat(“1.1”)
        // Double.parseDouble(“1.1”)

        //math bibliotheque (pas mal de fonctionnalite a tester (max , min ,))
        int result = Math.round(1.1F);
        double result2 = Math.random()*100;//valeur entre 0 et 100
        System.out.println(result2);


        // la classe NumberFormat pour formater une valeur numérique en une représentation monétaire.
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result3 = currency.format(1234.56);
        System.out.println(result3);
        // la classe NumberFormat pour formater une valeur décimale en une représentation en pourcentage.
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result4 = percent.format(0.04);
        System.out.println(result4);
        
        //Reading Input
        Scanner lire_var = new Scanner(System.in);
        System.out.print("enter your age ");//entre le nom sans sauter de line 
        byte age2 = lire_var.nextByte();//pour le next faut parser le bontype(float , double , int..)
        System.out.println("Your age is " +age2);
        
        Scanner lire_name = new Scanner(System.in);
        System.out.print("enter your name ");
        //String name2 = lire_var.next();//lire mot
        String name3 = lire_name.nextLine();//lire tt la ligne 
        //String name3 = lire_name.nextLine().trim();//lire tt la ligne et eleminer les espaces 
        System.out.println("Your name is " +name3);

        //logical operator (== , != , && , || , > , < , <= , >=)
        int a=5;
        int b=5;
        System.out.println(a == b);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = false; 
        boolean isEligible=(hasHighIncome && hasGoodCredit ); //false
        boolean isEligible2=(hasHighIncome || hasGoodCredit ); //True

        // if statement 
        Scanner lire_color=new Scanner(System.in);
        System.out.print("entrer votre coleur preferer " );
        String color = lire_color.next();
        if (color.equals("red")){
          System.out.println("Bon choix ");
        }
        else if( color.equals("green")){
          System.out.println("mauvais choix  ");
        }
        else{
          System.out.println("pas de dsiponibilite ");
        }
         
         //ternary operator
        int income =120000;
        String className = (income > 100000) ? "First" : "Economy";
        System.out.println(className);
        //statment is equivalent to this 
        // if (income > 100_000)
        //     className = “First”;
        //     else
        //     className = “Economy”;
         

        //switch statement 
        Scanner day_week = new Scanner(System.in);
        System.out.print("Entrez un jour de la semaine : ");
        String day = day_week.next();
        switch (day) {
            case "lundi":
                System.out.println("C'est le premier jour de la semaine.");
                break;
            case "mardi":
            case "mercredi":
            case "jeudi":
            case "vendredi":
                System.out.println("C'est un jour de semaine.");
                break;
            case "samedi":
            case "dimanche":
                System.out.println("C'est le week-end.");
                break;
            default:
                System.out.println("Jour non valide.");
                break;
        }

        // for loops
        for (int i =0 ; i<5 ; i++){
            System.out.println("hello world");
        }
        //loops for for tableau
        int[] tab5 = {1 ,2 ,7 , 10 ,12};
        for (int i=0 ; i < tab5.length ; i++){
            System.out.println(tab5[i]);
        }

        for (int element : tab5){
            System.out.println(element);
        } 

        //while loops 
        int i = 0;
        while (i < 5){
            System.out.println(i);
            i++;
            if(i ==3){
                break;
            }
        }

        //liste 
        List String l1= new ArrayList<>();
        l1.append("yassine");
        
        
        //liste 
        List String l1= new ArrayList<>();
        l1.append("taiki");
        
        
        //liste 
        List String l1= new ArrayList<>();
        l1.append("taiki2");
        














        //
    //     myframe.init();
    // 
}


    }

