import java.lang.reflect.Field;
class Configuration{
    private static String API_KEY="ORIGINAL_KEY";
    public static void printApiKey(){
        System.out.println("API_KEY "+API_KEY);
    }
}
public class StaticField{
    public static void main(String[] args){
        try{
            Class<?> configClass=Configuration.class;
            Field apiKeyField=configClass.getDeclaredField("API_KEY");
            apiKeyField.setAccessible(true);
            apiKeyField.set(null,"NEW_SECRET_KEY");
            Configuration.printApiKey();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

