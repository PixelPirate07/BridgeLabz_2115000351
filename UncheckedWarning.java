import java.util.*;
public class UncheckedWarning{
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        ArrayList list=new ArrayList();
        list.add("Hello");
        list.add(100);
        System.out.println(list);
    }
}

