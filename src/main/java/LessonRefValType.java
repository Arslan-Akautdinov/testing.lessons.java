
public class LessonRefValType {
    public static void main(String[] args)
    {
        int a = 10;                                 // value type
        String[] names = new String[] {"Alexey", "Victor"};   // reference type
    }

    public static void changePrimitive(int x) {
        x = x + 100;
    }

    public static void changeArray(String[] arr) {
        arr[0] = ("Dmitriy");
    }

}
