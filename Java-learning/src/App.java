import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int number = random.nextInt(100)+1;
        
        System.out.println("Gra Większe czy mniejsze!\nZgadnij liczbę od 1 do 100");
        
        Scanner scanner = new Scanner(System.in);
        boolean correctNumber = false; 
        
        while(!correctNumber){
            
            System.out.println("Podaj liczbę");
            
            int guessNumber = scanner.nextInt();
            
            if(guessNumber < 1 || guessNumber > 100){
                System.out.println("Podaj liczbę od 1 do 100!");
            } else if (guessNumber < number){
                System.out.println("Większa");
            } else if (guessNumber > number){
                System.out.println("Mniejsza");
            } else if (guessNumber == number){
                System.out.println("Brawo! Odgadłeś liczbę! Ta liczba to: " + number);
                correctNumber = true;
            }
        }


    }
}
