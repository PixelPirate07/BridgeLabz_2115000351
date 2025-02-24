import java.lang.reflect.*;
interface Greeting{
    void sayHello(String name);
}
class GreetingImpl implements Greeting{
    public void sayHello(String name){
        System.out.println("Hello "+name);
    }
}
class LoggingProxyHandler implements InvocationHandler{
    private final Object target;
    public LoggingProxyHandler(Object target){
        this.target=target;
    }
    public Object invoke(Object proxy,Method method,Object[] args) throws Throwable{
        System.out.println("Logging: Method called  "+method.getName());
        return method.invoke(target,args);
    }
}
public class DynamicProxy{
    public static void main(String[] args){
        Greeting originalGreeting=new GreetingImpl();
        Greeting proxyGreeting=(Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingProxyHandler(originalGreeting)
        );
        proxyGreeting.sayHello("Jon");
    }
}

