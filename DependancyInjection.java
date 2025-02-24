import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}
interface Service{
    void serve();
}
class MyService implements Service{
    public MyService() {} 
    public void serve(){
        System.out.println("Service is running");
    }
}
class Client{
    @Inject
    private Service service;
    public void doSomething(){
        if(service!=null){
            service.serve();
        } 
        else{
            System.out.println("Dependency injection failed");
        }
    }
}
class DIContainer{
    private Map<Class<?>, Object> instances=new HashMap<>();
    public <T> void register(Class<T> interfaceType,Class<? extends T> implementationType) throws Exception{
        Object instance=implementationType.getDeclaredConstructor().newInstance();
        instances.put(interfaceType,instance);
    }
    public void injectDependencies(Object obj) throws Exception{
        for(Field field:obj.getClass().getDeclaredFields()){
            if(field.isAnnotationPresent(Inject.class)){
                Class<?> fieldType=field.getType();
                Object dependency=instances.get(fieldType);
                if(dependency==null){
                    throw new RuntimeException("No registered implementation for "+fieldType.getName());
                }
                field.setAccessible(true);
                field.set(obj,dependency);
            }
        }
    }
}
public class DependancyInjection{
    public static void main(String[] args){
        try{
            DIContainer container=new DIContainer();
            container.register(Service.class,MyService.class);
            Client client=new Client();
            container.injectDependencies(client);
            client.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

