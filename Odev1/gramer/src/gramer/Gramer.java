package gramer;

import java.util.Scanner;

public class Gramer {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ogeler oge = new Ogeler();
        int ogeIndex = 0; //Girilen cümledeki boşlukları yoksaymak için
        System.out.println("Bir cumle giriniz:");
        String cumle = input.nextLine();
        String[] turkce = cumle.split(" ");
        //System.out.println(turkce.length); //Kontrol için
        for(int i=0; i<turkce.length; i++){
            if(!(turkce[i].equals(""))){
                //System.out.println("oge=" + turkce[i]); //Hangi öğeyi kontrol edeceğini kontrol etmek için
                if(oge.Kontrol(ogeIndex, turkce[i])==1){
                    //System.out.println("Kontrol Dogru"); //Kontrol için
                }
                ogeIndex++;
            }
        }
        oge.isCorrect();
    }   
}