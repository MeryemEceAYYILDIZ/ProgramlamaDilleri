package recursion;

public class Recursion {

    public static void main(String[] args) {
        int[] dizi1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] dizi2 = {47, 53, 25, 82, 18, 21, 4, 36, 9};
        
        BinarySearch BS = new BinarySearch(dizi1.length);
        BS.Arama(dizi1, 6);
        
        Minimum min = new Minimum(dizi2[0]);
        min.findMin(dizi2, 0);
        
    }
}
