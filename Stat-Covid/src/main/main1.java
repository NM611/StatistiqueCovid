package main;

import java.util.Scanner;

public class main1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        int choix;
        int TConf,TSousTrait,TGueris,DistT,TDe,TEva,TInM,TInA,TInMDe,TInADe;
        TConf=39836;
        TSousTrait=145;
        TGueris=38668;
        DistT=79;
        TDe=1097;
        TEva=1;
        TInM=143052070;
        TInMDe=3046871;
        TInA=4447830;
        TInADe=118529;

        System.out.println("<-------Statistique du covid-19 au Sénégal--------->");
        System.out.println("Total Confirmer  :"+TConf);
        System.out.println("Total sous traitement  :"+TSousTrait);
        System.out.println("Total Gueris  :"+TGueris);
        System.out.println("District touches  :"+DistT);
        System.out.println("Total Deces :"+TDe);
        System.out.println("Total Evacues  :"+TEva);
        System.out.println("Total Infecter dans le monde  :"+TInM);
        System.out.println("Dont "+TInMDe+" Deces");
        System.out.println("Total Infecter en Afrique  :"+TInA);
        System.out.println("Dont "+TInADe+" Deces");
        System.out.println("<--------------------------------------->");






    }
}
