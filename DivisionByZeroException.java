//Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. 
//Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с 
//сообщением "Деление на ноль недопустимо". В противном случае, программа должна выводить результат деления.

//Обратите внимание, что в обоих задачах используются собственные исключения, 
//которые наследуются от класса Exception. Это позволяет нам определить специфическую 
//причину ошибки и передать информацию об ошибке для последующей обработки.

import java.util.Scanner;

public class DivisionByZeroException {
     public DivisionByZeroException(String string) {
    }

    public static void main(int[] args, String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число");
        int num2 = scanner.nextInt();
        try {
            for (num2 == 0){
                
             throw new DivisionByZeroException(message:"Деление на ноль не допустимо");
        catch (DivisionByZeroException exception){
            
         
         else 
                System.out.println(num1() / num2());
                    
        }
            
    }
    }
    scanner.close();
}

    private static int num2() {
        return 0;
    }

    private static int num1() {
        return 0;
    }
}


