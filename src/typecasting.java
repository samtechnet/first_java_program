public class typecasting {
    public static void main(String[] args) {
        int y = 10;
        int i=1 ,b=10,j=10,p=50 ;
        short x = (short) y;
        System.out.println(x + y);
        loop1(i, b);
        System.out.println("******************");
        loop2(j,p);
        System.out.println("******************");
        loop1(i=4, b=14);
        System.out.println("******************");
        System.out.println("******************");
        loop3(20,60);
        System.out.println("******************");
        System.out.println("******************");
        System.out.println("******************");
        System.out.println("******************");
        loop3(10,15, "i just execute methode overriding");
        System.out.println("******************");
        System.out.println("******************");
        System.out.println("******************");
        System.out.println("******************");
            int Job=loop3(1);
        System.out.println(Job);
    }

    public static void loop1(int i,int b) {
//        int i;
        while (i <= b) {
            System.out.println(i);
            i++;
        }
    }

    public static void loop2(int j,int p) {
//        int j = 10;
        while (j <= p) {
            System.out.println(j);
            j++;
        }

    }

    public static void loop3(int m,int o, String k) {
//        int j = 10;
        while (m <= o) {
            System.out.println(m +"\u00BB "+k);
            m++ ;
        }
        System.out.println(k);
    }
    public static void loop3(int m,int o) {
//        int j = 10;
        while (m <= o) {
            System.out.println(m);
            m++;
        }

    }
    public static int loop3(int expirience) {
//        int j = 10;
        Boolean exposure=true;

        while (exposure) {
            System.out.println(expirience +"\u00BB "+ expirience);
            expirience++;
        }
        return expirience;
    }

}