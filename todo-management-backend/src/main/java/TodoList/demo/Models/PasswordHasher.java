package TodoList.demo.Models;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordHasher {
    public static void main(String[] args){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
        String pt = "admin14344";
        String hashedPassword = encoder.encode(pt);
        System.out.println(hashedPassword+":");
    }
}


