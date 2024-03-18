package gramer;

public class Ogeler {
    String[] ozne = {"Ben", "Sen", "Hasan", "Nurşah", "Elif", "Abdulrezzak", 
        "Şehribanu", "Zeynelabidin", "Naki"};
    String[] nesne = {"Bahçe", "Okul", "Park", "Sınıf", "Yarın", "Pazartesi", 
        "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar", "Merkez", 
        "Ev", "Kitap", "Defter", "Güneş", "Beydağı"};
    String[] yuklem = {"Gitmek", "Gelmek", "Okumak", "Yazmak", "Yürümek", "Görmek"};
    int hataSayaci=0;
    
    public int Kontrol(int ogeIndex, String oge){
        if(ogeIndex==0){
            for(int i=0; i<6; i++){
                if(ozne[i].equals(oge)){
                    return 1;
                }
            }
            hataSayaci++;
            //System.out.println("yanlıs ozne"); //Kontrol için
            return 0;
        }
        if(ogeIndex==1){
            for(int i=0; i<18; i++){
                if(nesne[i].equals(oge)){
                    return 1;
                }
            }
            hataSayaci++;
            //System.out.println("yanlıs nesne"); //Kontrol için
            return 0;
        }
        if(ogeIndex==2){
            for(int i=0; i<6; i++){
                if(yuklem[i].equals(oge)){
                    return 1;
                }
            }
            hataSayaci++;
            //System.out.println("yanlıs yuklem"); //Kontrol için
            return 0;
        }
        return 0;
    }
    public int isCorrect(){
        if(hataSayaci==0){
            System.out.println("EVET");
        }else{
            System.out.println("HAYIR");
        }
        return 0;
    }
}
