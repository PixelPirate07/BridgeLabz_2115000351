import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
@Retention(RetentionPolicy.RUNTIME)
@interface CacheResult {}
class ExpensiveOperations{
    private static final Map<Integer, Integer> cache=new HashMap<>();
    @CacheResult
    public int computeFactorial(int n){
        if(cache.containsKey(n)){
            System.out.println("Returning cached result for "+n);
            return cache.get(n);
        }
        System.out.println("Computing factorial for "+n);
        int result=(n==0 || n==1)?1:n*computeFactorial(n-1);
        cache.put(n, result);
        return result;
    }
}
public class CustomCaching{
    public static void main(String[] args){
        ExpensiveOperations operations=new ExpensiveOperations();
        System.out.println("Factorial of 5 "+operations.computeFactorial(5));
        System.out.println("Factorial of 5 (cached) "+operations.computeFactorial(5));
        System.out.println("Factorial of 6 "+operations.computeFactorial(6));
    }
}

