import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class Main {
    public static void main(String[] args) {
        Hello h=new Hello();
        char a= '\u00A5';
        String hello= "Hello world!  \u00BB";
        System.out.println(h);
        System.out.println(a);
        System.out.println(hello);
    }
}