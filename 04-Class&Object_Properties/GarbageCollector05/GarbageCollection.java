public class GarbageCollection {
    int x = 5;
    double f = 14.3;
    String str = "Test";

    public static void main(String[] args) {
        GarbageCollection[] array = new GarbageCollection[1_000_000_000];

        for(int i = 0; i < array.length; i++){
            GarbageCollection obj = new GarbageCollection();
            array[i] = obj;   //nesneleri tutan referanslar bellekte saklanıyor array sayesinde. Bir süre sonra HEAPTE daha fazla nesne taşıyamayız, 'OutOfMemory' hatası alırız.

            //Memory Leak'i engellemek için referansa "null" atamalıyız!
        }
    }
}
