package abstractPackage2;

import java.util.Scanner;

public class Run {
    public static void main(String[] args){
        Animal a1;
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if(input.equalsIgnoreCase("Cat")) {
            a1 = new Cat();
        }else {
            a1 = new Dog();
        }
        a1.catchme();
    }
}
