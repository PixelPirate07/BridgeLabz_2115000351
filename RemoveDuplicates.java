import java.util.*;
public class RemoveDuplicates{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        HashSet<Character> seen=new HashSet<>();
        for(char c:input.toCharArray()) {
            if(!seen.contains(c)){
                sb.append(c);
                seen.add(c);
            }
        }
        System.out.println(sb.toString());
    }
}
