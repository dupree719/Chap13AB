package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        divideByZero();

//        createNewFile();
//        numbersExceptionHandling();
//        createNewFileRethrow();
//    }
//
//    public static void createNewFile() {
//        File file = new File("resources/nonexistent.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) { //can use Exception parent class or any parent class of IOException here
//            System.out.println("Directory does not exist.");
//            e.printStackTrace(); //calling method on name of the exception "e"
//        }
//    }
//
//    public static void numbersExceptionHandling() {
//        File file = new File("resources/numbers.txt");
//
//        try(Scanner fileReader = new Scanner(file)) {
//            while (fileReader.hasNext()) {
//                double num = fileReader.nextDouble();
//                System.out.println(num);
//            }
//        } catch (FileNotFoundException | InputMismatchException e) {
//            e.printStackTrace();
////        }finally{
////            fileReader.close();
//            //The finally block says, "Hey, even if you finish everything in the try, even if no exceptions are thrown, I will execute whatever you place inside of me." So, this will execute no matter what — if exceptions are thrown, or if exceptions are not thrown — finally will execute.
//        }
//    }
//    public static void createNewFileRethrow() throws IOException {
//        File file = new File("resources/nonexistent");
//        file.createNewFile();
//    }
//    public static void calculateSalary(double hours, double rate){
//        if(hours > 40){
//            throw new IllegalArgumentException("We do not allow overtime");
//        }
        //Divide by zero

            try {
                int c = 30 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Dividing by zero is not permitted");
            } finally {
                System.out.println("Division is fun!");
            }

        }
    }



