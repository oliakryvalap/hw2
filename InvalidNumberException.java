

//Напишите программу, которая запрашивает у пользователя число и проверяет,
// является ли оно положительным. Если число отрицательное или равно нулю, 
//программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
// В противном случае, программа должна выводить сообщение "Число корректно".

import java.util.Scanner;

public class InvalidNumberException {
    public InvalidNumberException(String string) {
    }

    public static void main(int[] args, String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ввудите число");
        int num = scanner.nextInt();
        try {
            if (num == 0 || num < 0){
             throw new InvalidNumberException(message:"Не корректное число");
        catch (InvalidNumberException exception){
            }
         } if (num > 0){
                System.out.println("Число корректно");
                    
        }
            
    }
    }
    scanner.close();
}


