import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

//Поменять значения двух переменных без использования третей
public class Two {
    public static void main(String[] agrs){
        int a=2;
        int b=3;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("\u0423\u0441\u043b\u043e\u0432\u0438\u0435 \u0430=2; b=3");
        System.out.println("\u0440\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442: \u0430=" +a+"; b="+b);


    }
}
