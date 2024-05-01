package recursion;

public class Minimum {
    int eK, index=0, deger;
    int[] yigitEski = {index, eK, deger};
    int[] yigitYeni = new int[3];
    public Minimum(int eK) {
        this.eK = eK;
    }
    
    public int findMin(int[] dizi, int index){
        if(index>dizi.length-1){
            System.out.println("En kucuk deger= " + eK);
            return 1;
        }
        else{
            if(dizi[index]<eK){
                eK=dizi[index];
            }
        }
        yigitYeni[0]=index;
        yigitYeni[1]=eK;
        yigitYeni[2]=dizi[index];
        
        Yazdir(yigitEski);
        Yazdir(yigitYeni);
        System.out.println("");
        
        for(int i=0; i<3; i++){
            yigitEski[i]=yigitYeni[i];
        }
        
        index++;
        return findMin(dizi, index);
    }
    
    private void Yazdir(int[] yigit){
        System.out.print("index= " + yigit[0] + ", indexteki deger= " + yigit[2] + ", en kucuk deger= " + yigit[1] + " \t");
    }
}
