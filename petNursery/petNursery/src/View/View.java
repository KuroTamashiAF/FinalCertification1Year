package View;

import java.io.IOException;
import java.util.Scanner;

public class View {


    public void greeting() {

        System.out.println("Здравствуйте кого вы хотите завести нажмите 1 " +
                "если Кошечку или 2 если Собачку");
        Scanner sc = new Scanner(System.in);
        int chooseAnimal =sc.nextInt();
        switch (chooseAnimal){
            case 1:;
                break;
            case 2:
                break;
            default:
                throw new RuntimeException("Введите 1 или 2 ");
        }

    }
}
