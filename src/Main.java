// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        byte one = 1;
        short two = 2000;
        int three = 30000;
        long four = 400000;
        float five = 5.137f;
        double six =  6.22;
        char seven = 'c';
        boolean eight = true;

        System.out.println(one + two);//byte + short

        System.out.println(three % six);// int % double

        System.out.println(eight && four > five); //boolean && long > int

        System.out.println(++one);//+1

        System.out.println(seven != six);//not equal

        System.out.println(two << 3);//bitwise

        long far = three;

        System.out.println(far);

        int clear = (int) four;

        System.out.println(clear);

        Plus(one,two);

        Remain(three,six);

        And(two, four);

        PlusOne(two);

        Notequal(seven, six);

        Biwiise(2);
        }

    public static void Plus(byte a,short b){
        System.out.println(a + b);
    }
    public static void Remain(int a,double b){
        System.out.println(a % b);
    }
    public static void And(short a,long b){
        System.out.println(a == b && b < a);
    }
    public static void PlusOne(int a){
        a++;
        System.out.println(a);
    }
    public static void Notequal(char a,double b){
        System.out.println(a != b);
    }
    public static void Biwiise(int a){
        System.out.println(a >> 2);
    }
    }
