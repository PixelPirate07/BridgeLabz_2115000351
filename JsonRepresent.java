import java.lang.reflect.Field;
class JsonConverter{
    public static String toJson(Object obj){
        StringBuilder json=new StringBuilder("{");
        Class<?> clazz=obj.getClass();
        Field[] fields=clazz.getDeclaredFields();
        int count=0;
        for(Field field:fields){
            field.setAccessible(true);
            try{
                Object value=field.get(obj);
                json.append("\"").append(field.getName()).append("\": ");
                if(value instanceof String){
                    json.append("\"").append(value).append("\"");
                }else{
                    json.append(value);
                }
                count++;
                if(count<fields.length){
                    json.append(", ");
                }
            }catch(IllegalAccessException e){
                e.printStackTrace();
            }
        }
        json.append("}");
        return json.toString();
    }
}
class Person{
    private String name;
    private int age;
    private boolean isStudent;
    public Person(String name,int age,boolean isStudent){
        this.name=name;
        this.age=age;
        this.isStudent=isStudent;
    }
}
public class JsonRepresent{
    public static void main(String[] args){
        Person person=new Person("Jon",24,true);
        String json=JsonConverter.toJson(person);
        System.out.println(json);
    }
}

