import java.util.regex.Pattern;
public class UserRegistration{
    private static final Pattern EMAIL_PATTERN=Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    public String registerUser(String username,String email,String password){
        if(username==null || username.length()<5){
            throw new IllegalArgumentException("Invalid username: must be at least 5 characters long");
        }
        if(email==null || !EMAIL_PATTERN.matcher(email).matches()){
            throw new IllegalArgumentException("Invalid email format");
        }
        if(password==null || password.length()<8){
            throw new IllegalArgumentException("Invalid password: must be at least 8 characters long");
        }
        return "User registered successfully";
    }
}
