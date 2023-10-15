import java.util.Scanner;
public class Login {
    
    
    public boolean Login(Hesap hesap){
    Scanner input = new Scanner(System.in);
    System.out.print("tc: ");
    String tc = input.next();
    System.out.print("parola: ");
    String parola = input.next();
    
    if(hesap.getTc().equals(tc) && hesap.getParola().equals(parola)){
    return true;
    }
    else{
    return false;
    }
    }
    
}
