package program;


import entities.taxPlayer;
import entities.indiviudal;
import entities.company;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

public class program  {

    public static <entities> void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.CANADA);

        Double sum=0.0;
        System.out.println("Enter the number of tax player:");
        int n = scanner.nextInt();
        List<taxPlayer> list = new ArrayList<>();


        for(int i = 1; i<=n; i++){
            System.out.print("tax payer #"+ i + " data:");

            System.out.print("Individual or company (i/c)");
            char resp =scanner.next().charAt(0);

            System.out.print("name: ");
            String name = scanner.next();
            System.out.print("Anual income: ");
            Double anualIncome =scanner.nextDouble();
            if (resp == 'i'){
               System.out.print("Health expenditures: ");
               Double healthExpenditures = scanner.nextDouble();
               list.add(new indiviudal(name, anualIncome, healthExpenditures));
            }
            if (resp == 'c'){
                System.out.print("Number of employees");
                int numberOfEmployees = scanner.nextInt();
                list.add(new company(name, anualIncome, numberOfEmployees));
            }
            System.out.println();
            System.out.println("TAXES PAID:");

            for (taxPlayer tp : list){
            Double tax = tp.tax();
            System.out.println(tp.getName() + ": $ "+ String.format("%.2f", tax));
            sum=+ tax;
            }
            System.out.println();
            System.out.print("TOTAL TAXES: $"+ String.format("%.2f",sum));
        }

    }

}








