public class VarArgMethod {

    public static void main(String ... args) {   //main as var-arg method
        calculateAverage(4,3);
        calculateAverage(4,3,8);

        int[] a = {1,2,3,4,5,6,7,8};
        calculateAverageWithArray(a);

        average(1);     //var-arg method
        average(1,2,3,4);
        average(1,2,3,4,5,6,7,8,9,10);
        average(0xAB);  //171 in decimal
        average(a);

        anotherAverage(2,true,3,4,5);  //first 2 arg fixed, others variadic
    }

    public static void calculateAverage(int x, int y){
        System.out.println("Average: " + (double) (x+y) / 2);
    }

    public static void calculateAverage(int x,int y,int z){  //OVERLOADING and goes on..
        System.out.println("Average: " + (double)(x+y+z) / 3);
    }

    public static void calculateAverageWithArray(int[] a){
        int sum = 0;

        for(int i : a)
            sum += i;
        System.out.println("Average: " + (double)sum / a.length);
    }

    //Variadic Method
    public static void average(int ... array){
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        System.out.println("Average: " + (double)sum / array.length);
    }

    //Variadic Method
    public static void anotherAverage(int x, boolean b, int ... array){
        int sum = 0;

        if(b){
            for(int i : array){
                sum += i;
            }
        }
        System.out.println("Average: " + (double)sum / array.length);
    }
}
