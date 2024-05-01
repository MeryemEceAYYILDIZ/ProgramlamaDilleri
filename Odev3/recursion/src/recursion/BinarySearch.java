package recursion;

public class BinarySearch {
    int orta, sol, sag, deger;
    int[] yigitEski = {sol, sag, orta, deger};
    int[] yigitYeni = new int[4];

    public BinarySearch(int sag) {
        this.sag = sag;
    }
    
    int Arama(int dizi[], int aranan){
        System.out.println("Aranan sayi= " + aranan);
        return AramaR(dizi, 0, dizi.length-1, aranan);
    }
    
    private int AramaR(int dizi[], int sol, int sag, int aranan){
        orta=(sol+sag)/2;
        
        yigitYeni[0]=sol;
        yigitYeni[1]=sag;
        yigitYeni[2]=orta;
        yigitYeni[3]=dizi[orta];
        
        Yazdir(yigitEski);
        Yazdir(yigitYeni);
        System.out.println("");
        
        for(int i=0; i<4; i++){
            yigitEski[i]=yigitYeni[i];
        }
        
        if(sol>sag){
            System.out.println("Aranan sayi bulunamadi");
            return -1;
        }
        if(aranan==dizi[orta]){
            return orta;
        }
        else if(aranan>dizi[orta]){
            sol=orta+1;
            AramaR(dizi,sol, sag, aranan);
        }
        else if(aranan<dizi[orta]){
            sag=orta-1;
            AramaR(dizi,sol, sag, aranan);
        }
        return -1;
    }
    
    private void Yazdir(int[] yigit){
        System.out.print("sol= " + yigit[0] + " sag= " + yigit[1] + " orta= " + yigit[2] + " deger= " + yigit[3] + " \t");
    }
}