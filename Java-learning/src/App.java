import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Kółko i krzyżyk:");
        
        Scanner scanner = new Scanner(System.in);
        
        String[] p = new String[9];
        
        //Identyfikacja miejsca
        for (int i = 0; i <= 8; i++){
            p[i] = " ";
        }
        int[] k = new int[9];
        
        for (int i = 0; i <= 8; i++){
            k[i] = 2;
        }
        
        boolean win = false;
        
        int playerInt = 0;
        String playerString = "X";
        
        while(win != true){
            //Zmiana gracza co rundę
            if(playerInt == 1){
                playerInt = 0;
                playerString = "O";
            } else if (playerInt == 0){
                playerInt = 1;
                playerString = "X";
            }
            
            //Budowanie planszy
            System.out.println("Kolej gracza: " + playerString);
            
            System.out.println(" " + p[0] + " | " + p[1] + " | " + p[2] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + p[3] + " | " + p[4] + " | " + p[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + p[6] + " | " + p[7] + " | " + p[8] + " ");
            
            //Gracz wybiera miejsce
            int place = scanner.nextInt();
            
            //Zabezpieczenie przed błędnym znakiem
            while(place < 1 || place > 9){
                System.out.println("Podaj miejsce 1-9!");
                System.out.println("Kolej gracza: " + playerString);
                System.out.println(" " + p[0] + " | " + p[1] + " | " + p[2] + " ");
                System.out.println("---+---+---");
                System.out.println(" " + p[3] + " | " + p[4] + " | " + p[5] + " ");
                System.out.println("---+---+---");
                System.out.println(" " + p[6] + " | " + p[7] + " | " + p[8] + " ");
                
                place = scanner.nextInt();
                
            }
            
            
            //Gdzie gracz daje znak
            if(place == 1 && !(k[0] == 0 || k[0] == 1)){
                if(playerInt == 0){
                    p[0] = "O";
                    k[0] = 0;
                } else if(playerInt == 1){
                    p[0] = "X";
                    k[0] = 1;
                }
            }else if(place == 1){
                System.out.println("Miejsce zajęte!");
                
                if(playerInt == 0){
                    playerInt = 1;
                }else if(playerInt == 1){
                    playerInt = 0;
                }
            }
            if(place == 2 && !(k[1] == 0 || k[1] == 1)){
                if(playerInt == 0){
                    p[1] = "O";
                    k[1] = 0;
                } else if(playerInt == 1){
                    p[1] = "X";
                    k[1] = 1;
                }
            }else if(place == 2){
                System.out.println("Miejsce zajęte!");
                
                if(playerInt == 0){
                    playerInt = 1;
                }else if(playerInt == 1){
                    playerInt = 0;
                }
            }
            if(place == 3 && !(k[2] == 0 || k[2] == 1)){
                if(playerInt == 0){
                    p[2] = "O";
                    k[2] = 0;
                } else if(playerInt == 1){
                    p[2] = "X";
                    k[2] = 1;
                }
            }else if (place == 3){
                System.out.println("Miejsce zajęte!");
                
                if(playerInt == 0){
                    playerInt = 1;
                }else if(playerInt == 1){
                    playerInt = 0;
                }
            }
            if(place == 4 && !(k[3] == 0 || k[3] == 1)){
                if(playerInt == 0){
                    p[3] = "O";
                    k[3] = 0;
                } else if(playerInt == 1){
                    p[3] = "X";
                    k[3] = 1;
                }
            }else if(place == 4){
                System.out.println("Miejsce zajęte!");
                
                if(playerInt == 0){
                    playerInt = 1;
                }else if(playerInt == 1){
                    playerInt = 0;
                }
            }
            if(place == 5 && !(k[4] == 0 || k[4] == 1)){
                if(playerInt == 0){
                    p[4] = "O";
                    k[4] = 0;
                } else if(playerInt == 1){
                    p[4] = "X";
                    k[4] = 1;
                }
            }else if(place == 5){
                System.out.println("Miejsce zajęte!");
                
                if(playerInt == 0){
                    playerInt = 1;
                }else if(playerInt == 1){
                    playerInt = 0;
                }
            }
            if(place == 6 && !(k[5] == 0 || k[5] == 1)){
                if(playerInt == 0){
                    p[5] = "O";
                    k[5] = 0;
                } else if(playerInt == 1){
                    p[5] = "X";
                    k[5] = 1;
                }
            }else if(place == 6){
                System.out.println("Miejsce zajęte!");
                
                if(playerInt == 0){
                    playerInt = 1;
                }else if(playerInt == 1){
                    playerInt = 0;
                }
            }
            if(place == 7 && !(k[6] == 0 || k[6] == 1)){
                if(playerInt == 0){
                    p[6] = "O";
                    k[6] = 0;
                } else if(playerInt == 1){
                    p[6] = "X";
                    k[6] = 1;
                }
            }else if(place == 7){
                System.out.println("Miejsce zajęte!");
                
                if(playerInt == 0){
                    playerInt = 1;
                }else if(playerInt == 1){
                    playerInt = 0;
                }
            }
            if(place == 8 && !(k[7] == 0 || k[7] == 1)){
                if(playerInt == 0){
                    p[7] = "O";
                    k[7] = 0;
                } else if(playerInt == 1){
                    p[7] = "X";
                    k[7] = 1;
                }
            }else if(place == 8){
                System.out.println("Miejsce zajęte!");
                
                if(playerInt == 0){
                    playerInt = 1;
                }else if(playerInt == 1){
                    playerInt = 0;
                }
            }
            if(place == 9 && !(k[8] == 0 || k[8] == 1)){
                if(playerInt == 0){
                    p[8] = "O";
                    k[8] = 0;
                } else if(playerInt == 1){
                    p[8] = "X";
                    k[8] = 1;
                }
            }else if(place == 9){
                System.out.println("Miejsce zajęte!");
                
                if(playerInt == 0){
                    playerInt = 1;
                }else if(playerInt == 1){
                    playerInt = 0;
                }
            }
            
            
            
            //Wygrana
            if( k[0] == playerInt && k[1] == playerInt && k[2] == playerInt ||
                k[3] == playerInt && k[4] == playerInt && k[5] == playerInt ||
                k[6] == playerInt && k[7] == playerInt && k[8] == playerInt ||
                    
                k[0] == playerInt && k[3] == playerInt && k[6] == playerInt ||
                k[1] == playerInt && k[4] == playerInt && k[7] == playerInt ||
                k[2] == playerInt && k[5] == playerInt && k[8] == playerInt ||
                    
                k[0] == playerInt && k[4] == playerInt && k[8] == playerInt ||
                k[2] == playerInt && k[4] == playerInt && k[6] == playerInt){
                
                System.out.println(" " + p[0] + " | " + p[1] + " | " + p[2] + " ");
                System.out.println("---+---+---");
                System.out.println(" " + p[3] + " | " + p[4] + " | " + p[5] + " ");
                System.out.println("---+---+---");
                System.out.println(" " + p[6] + " | " + p[7] + " | " + p[8] + " ");
                
                System.out.println("Gracz: " + playerString + " wygrał!");
                win = true;
            }
            //Remis
            if( (k[0] == 0 || k[0] == 1) && 
                (k[1] == 0 || k[1] == 1) &&
                (k[2] == 0 || k[2] == 1) &&
                (k[3] == 0 || k[3] == 1) &&
                (k[4] == 0 || k[4] == 1) &&
                (k[5] == 0 || k[5] == 1) &&
                (k[6] == 0 || k[6] == 1) &&
                (k[7] == 0 || k[7] == 1) &&
                (k[8] == 0 || k[8] == 1)){
                
                System.out.println(" " + p[0] + " | " + p[1] + " | " + p[2] + " ");
                System.out.println("---+---+---");
                System.out.println(" " + p[3] + " | " + p[4] + " | " + p[5] + " ");
                System.out.println("---+---+---");
                System.out.println(" " + p[6] + " | " + p[7] + " | " + p[8] + " ");
                
                System.out.println("Remis!");
                win = true;
            }
        }
    }
}
