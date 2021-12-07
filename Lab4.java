import java.util.Scanner;
import java.util.regex.*;

public class Lab4 {
    public Lab4() {
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Пожалуйста, введите свой будущий пароль, состоящий не менее чем из 8 символов: ");
        String password;
        password = num.nextLine();
        Pattern p = Pattern.compile("(?=^.{8,}$)((?=.*\\d)|(?=.*\\_+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$");
        //"?=" означает что-то за чем следует что-то еще
        //"?!" означает что за чем-то не последует что-то еще
        Matcher m = p.matcher(password);
        boolean good = m.matches();
        if (good == true)
            System.out.println("Спасибо за Ваш пароль");
        else
            System.out.println(" Ваш пароль " + password + ", не надежен. Он должен содержать хотя бы\n" +
                    "одну заглавную букву, одну маленькую букву и одну цифру, иметь 8 или больше символов Используйте только латиницу. Попробуйте снова");
    }
}

