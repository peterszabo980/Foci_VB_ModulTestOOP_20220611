 package hu.Progmatic;

 import hu.Progmatic.FOCI_VB.Matches;

 import java.io.*;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Scanner;

 import static java.awt.SystemColor.text;

 public class Foci_VB {

     private static Throwable exception;

     public static void main(String[] args) throws IOException{
    try {
         List<Matches> matches = new ArrayList<>();
        try(PrintWriter out = new PrintWriter("/Users/szabopeter/IdeaProjects/ModulTestOOP_20220611/src/Files/selected.csv")  ){
            out.println(text);
        }
        /* System.out.println("Foci Világbajnokság");
         PrintStream fileStream = new PrintStream("/Users/szabopeter/IdeaProjects/ModulTestOOP_20220611/src/Files/matches_all.csv");
         System.setOut(fileStream);
         */


        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/szabopeter/IdeaProjects/ModulTestOOP_20220611/src/Files/matches_all.csv"))) {
            //List<Matches> maxgools = new ArrayList<>();

            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                Matches match = new Matches(line);
                matches.add(match);
                }
            }
            System.out.println("1. Feladatfoci meccsek száma: "+ matches.size());

            System.out.print("Kérem a meccs évét: ");
            Scanner sc = new Scanner(System.in);
            int getYear = sc.nextInt();
            //sc.nextLine();

            int max = Integer.MIN_VALUE;
            Matches[] maxgool;

            for (Matches matches1 : matches) {
                int sum = 0;
                if (matches1.getYear() == getYear) {
                    sum = matches1.getGoalDifference();
                }
                if (sum > max) {
                    max = matches1.getGoalDifference();
                }
            }

            System.out.print("2. – MAXIMÁLIS GÓLKÜLÖNBSÉG: " + max);
        System.out.println();

            int counter = 0;

            for (Matches matches2 : matches){
                if (matches2.getGoals_a() > matches2.getGoals_b()){
                    if(matches2.getYear() == getYear){
                        counter++;
                    }
                }

            }
            System.out.println("3. – GYŐZELMEK SZÁMA: " + counter);



            }   catch (IOException exception){
                exception.printStackTrace();
            }
    catch (Exception e) {
        e.printStackTrace();
    }
        }

 }


