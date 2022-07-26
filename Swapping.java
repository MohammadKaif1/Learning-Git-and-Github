public class Swapping {
    public static void main(String[] args) {
        int a=20 ,b=40;
        swap(20,40);
    }
    static void swap (int a,int b)
    {
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
:
    }
}
