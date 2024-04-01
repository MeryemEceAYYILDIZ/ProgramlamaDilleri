package bagli_sirala;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bagli_Sirala {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int line=0;
        
        System.out.println("Lutfen kullanacaginiz dosyanin dosya yolunu giriniz: ");
        String fileName = input.next();
        File file = new File(fileName);
        
        try{
            Scanner myReader = new Scanner(file);
            while(myReader.hasNextInt()){ // Satır sayısını bulmak için bir kez okuma işlemi gerçekleştirildi
                int satir = myReader.nextInt();
                line++;                
            }
            myReader.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Dosya bulunamadı!");
            e.printStackTrace();
        }
        
        Data[] data = new Data[line]; //Bulunan satır sayısına göre bir dizi oluşturuldu
        Data[] siraliData = new Data[line];
        line=0;
        int adres=0; // Adresin 0'dan başladığı varsayıldı
        
        try{
            Scanner myReader2 = new Scanner(file);
            while(myReader2.hasNextInt()){ // 
                data[line] = new Data();
                siraliData[line] = new Data();
                data[line].veri = myReader2.nextInt();
                data[line].adres = adres;
                line++;
                adres++; // integer 4 byte yer kapladığı için her seferinde 4 arttırdım
            }
            myReader2.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Dosya bulunamadı!");
            e.printStackTrace();
        }
        for(int k=0; k<line; k++){
            siraliData[k]=data[k];
        }
        
        for(int i=0; i<line; i++){
            if(i==0){ // eğer dizinin ilk elemanıysa diziye direkt yerleştir
                siraliData[0]=siraliData[i];
            } else{
                int j=0;
                Data temp = new Data(); // kaydırma işleminde kullanmak için geçici değişken tanımladım
                while(siraliData[j].veri<siraliData[i].veri && j<line){
                    j++;
                }
                temp=siraliData[i]; // Bulunduğumuz indexi geçicide tuttum ve kendi indisinden geriye doğru kaydırma işlemi yaptım.
                int k=i;
                while(k>j){
                    siraliData[k]=siraliData[k-1];
                    k--;
                }
                siraliData[j]=temp;
            }
        }
        // Diziyi yazdırma
        for(int i=0; i<line; i++){
            System.out.println("veri: " + data[i].veri + " adres: " + data[i].adres + "\t\t veri: " + siraliData[i].veri + " adres: " + siraliData[i].adres);
        }
    }    
}
/*Bağlı liste veri yapısı dinamik veri yapısı olup run-time aşamasında binding durumu değişen bir veri yapısıdır. 
+Bu amaçla bir sınıf tanımlanacaktır ve bu sınıfta iki tane tamsayı özellik olarak tanımlanacaktır. 
+Bu sayılardan biri veri olarak kullanılırken diğeri adres olarak taklit edilecektir. 
+Bu sınıftan bir dizi oluşturulacaktır. Bu diziye sayılar bir dosyadan giriş olarak verilecektir.
+Dosyanın her satırında bir sayı olacaktır.
+Dosyanın ismi klavyeden alınacaktır ve ondan sonra dosyadaki sayılar bu diziye geliş sırası ile aktarılacaktır. 
+Sayılar dosyadaki sıra ile diziye aktarılacaktır. 
+Bu adımdan sonra sınıfın içerisindeki ikinci sayı (adres taklidi) kullanılarak bağlı liste mantığına göre sıralama işlemi yapılacaktır. 
+Sıralama işlemi bittiğinde dizinin bütün elemanları (her iki sayı) ekrana yazılacaktır. 
+Ekranda her satırda dizinin bir elemanın alanları aralarında boşluk olacak şekilde yazılacaktır.*/