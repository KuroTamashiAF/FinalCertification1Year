package Model;

public class Counter {
    public static int counter=0;

    public static void add (){
        counter++;
    }
    public static void reduce(){
        counter--;
    }

    public static int getCounter() {
        return counter;
    }
}
