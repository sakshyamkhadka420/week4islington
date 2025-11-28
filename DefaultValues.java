/**
 * Assignment submission
 *
 * @author Sakshyam Khadka
 * @version 01
 */
public class DefaultValues
{
        byte b;
        short s;
        int i;
        float f;
        long l;
        double d;
        char c;
        boolean a;
        
        
    public static void main(String[] args) {
        DefaultValues d=new DefaultValues();
        System.out.println(d.b);
        System.out.println(d.s);
        System.out.println(d.i);
        System.out.println(d.f);
        System.out.println(d.l);
        System.out.println(d.d);
        System.out.println(d.c);
        System.out.println(d.a);
        
        //Local variables don't get default values, and thus they must be initialized before use. Otherwise, they won't work.
        
            }
}