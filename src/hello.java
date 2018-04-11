import java.util.ArrayList;

public class hello {
    public static void main(String[] args){
        System.out.println("Hello World!");
        int zyw=1;
        System.out.println(zyw);
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println(list.toString());
        System.out.println(“change”);
    }
}
