import java.util.*;
public class hangman {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner (System.in);
        String Word = " ";
        int randomWordGenerator = (int) (Math.random() * 14 + 1);
        if (randomWordGenerator == 1) {
            Homes();
        }
        else if (randomWordGenerator == 2){
            Money();
        }
        else if (randomWordGenerator == 3){
            Ghost();
        }
        else if (randomWordGenerator == 4){
            Brief();
        }
        else if (randomWordGenerator == 5){
            Great();
        }
        else if (randomWordGenerator == 6){
            Chore();
        }
        else if (randomWordGenerator == 7){
            Board();
        }
        else if (randomWordGenerator == 8){
            Trick();
        }
        else if (randomWordGenerator == 9){
            Gnome();
        }
        else if (randomWordGenerator == 10){
            Piano();
        }
        else if (randomWordGenerator == 11){
            Tramp();
        }
        else if (randomWordGenerator == 12){
            Tiger();
        }
        else if (randomWordGenerator == 13){
            Train();
        }
        else if (randomWordGenerator == 14){
            Relic();
        }

    }

    static void Money() {
        Scanner scanner = new Scanner(System.in);
        char[] MoneyCharArray1 = {'m'};
        char[] MoneyCharArray2 = {'o'};
        char[] MoneyCharArray3 = {'n'};
        char[] MoneyCharArray4 = {'e'};
        char[] MoneyCharArray5 = {'y'};

        System.out.println("The word is five letters guess the word");

        for(int i = 0; i < 4; i++){

        char firstletter = scanner.next().charAt(0);
        char secondletter = scanner.next().charAt(0);
        char thirdletter = scanner.next().charAt(0);
        char fourthletter = scanner.next().charAt(0);
        char fifthletter = scanner.next().charAt(0);
        if (firstletter == MoneyCharArray1[0])
            System.out.print(firstletter);
        else System.out.print("_");

        if (secondletter == MoneyCharArray2[0])
            System.out.print(secondletter);
        else System.out.print("_");

        if (thirdletter == MoneyCharArray3[0])
            System.out.print(thirdletter);
        else System.out.print("_");

        if (fourthletter == MoneyCharArray4[0])
            System.out.print(fourthletter);
        else System.out.print("_");

        if (fifthletter == MoneyCharArray5[0])
            System.out.print(fifthletter);
        else System.out.print("_");

        System.out.println(" ");

        if (firstletter == MoneyCharArray1[0] && secondletter == MoneyCharArray2[0] && thirdletter == MoneyCharArray3[0] && fourthletter == MoneyCharArray4[0] && fifthletter == MoneyCharArray5[0]) {
            System.out.println("You won!");
            break;
        }
        if (i == 0){
            System.out.println("D");
        }
        else if (i == 1){
            System.out.println("DE");
        }
        else if (i == 2){
            System.out.println("DEA");
        }
        else if (i == 3){
            System.out.println("DEAD");
            System.out.println("You Lose");
        }

        }
    }
    static void Homes() {
        Scanner scanner = new Scanner(System.in);
        char[] WordCharArray1 = {'h'};
        char[] WordCharArray2 = {'o'};
        char[] WordCharArray3 = {'m'};
        char[] WordCharArray4 = {'e'};
        char[] WordCharArray5 = {'s'};

        System.out.println("The word is five letters guess the word");

        for (int i = 0; i < 4; i++) {
            char firstletter = scanner.next().charAt(0);
            char secondletter = scanner.next().charAt(0);
            char thirdletter = scanner.next().charAt(0);
            char fourthletter = scanner.next().charAt(0);
            char fifthletter = scanner.next().charAt(0);

            if (firstletter == WordCharArray1[0])
                System.out.print(firstletter);
            else System.out.print("_");

            if (secondletter == WordCharArray2[0])
                System.out.print(secondletter);
            else System.out.print("_");

            if (thirdletter == WordCharArray3[0])
                System.out.print(thirdletter);
            else System.out.print("_");

            if (fourthletter == WordCharArray4[0])
                System.out.print(fourthletter);
            else System.out.print("_");

            if (fifthletter == WordCharArray5[0])
                System.out.print(fifthletter);
            else System.out.print("_");

            System.out.println(" ");

            if (firstletter == WordCharArray1[0] && secondletter == WordCharArray2[0] && thirdletter == WordCharArray3[0] && fourthletter == WordCharArray4[0] && fifthletter == WordCharArray5[0]) {
                System.out.println("You won!");
                break;
            }
            if (i == 0){
                System.out.println("D");
            }
            else if (i == 1){
                System.out.println("DE");
            }
            else if (i == 2){
                System.out.println("DEA");
            }
            else if (i == 3){
                System.out.println("DEAD");
                System.out.println("You Lose");
            }
        }
    }
     static void Ghost(){
         Scanner scanner = new Scanner(System.in);
         char[] GhostCharArray1 = {'g'};
         char[] GhostCharArray2 = {'h'};
         char[] GhostCharArray3 = {'o'};
         char[] GhostCharArray4 = {'s'};
         char[] GhostCharArray5 = {'t'};

         System.out.println("The word is five letters guess the word");

         for (int i = 0; i < 4; i++) {
             char firstletter = scanner.next().charAt(0);
             char secondletter = scanner.next().charAt(0);
             char thirdletter = scanner.next().charAt(0);
             char fourthletter = scanner.next().charAt(0);
             char fifthletter = scanner.next().charAt(0);

             if (firstletter == GhostCharArray1[0])
                 System.out.print(firstletter);
             else System.out.print("_");

             if (secondletter == GhostCharArray2[0])
                 System.out.print(secondletter);
             else System.out.print("_");

             if (thirdletter == GhostCharArray3[0])
                 System.out.print(thirdletter);
             else System.out.print("_");

             if (fourthletter == GhostCharArray4[0])
                 System.out.print(fourthletter);
             else System.out.print("_");

             if (fifthletter == GhostCharArray5[0])
                 System.out.print(fifthletter);
             else System.out.print("_");

             System.out.println(" ");

             if (firstletter == GhostCharArray1[0] && secondletter == GhostCharArray2[0] && thirdletter == GhostCharArray3[0] && fourthletter == GhostCharArray4[0] && fifthletter == GhostCharArray5[0]) {
                 System.out.println("You won!");
                 break;
             }
             if (i == 0){
                 System.out.println("D");
             }
             else if (i == 1){
                 System.out.println("DE");
             }
             else if (i == 2){
                 System.out.println("DEA");
             }
             else if (i == 3){
                 System.out.println("DEAD");
                 System.out.println("You Lose");
             }
         }
     }
     static void Brief(){
         Scanner scanner = new Scanner(System.in);
         char[] GhostCharArray1 = {'b'};
         char[] GhostCharArray2 = {'r'};
         char[] GhostCharArray3 = {'i'};
         char[] GhostCharArray4 = {'e'};
         char[] GhostCharArray5 = {'f'};

         System.out.println("The word is five letters guess the word");

         for (int i = 0; i < 4; i++) {
             char firstletter = scanner.next().charAt(0);
             char secondletter = scanner.next().charAt(0);
             char thirdletter = scanner.next().charAt(0);
             char fourthletter = scanner.next().charAt(0);
             char fifthletter = scanner.next().charAt(0);

             if (firstletter == GhostCharArray1[0])
                 System.out.print(firstletter);
             else System.out.print("_");

             if (secondletter == GhostCharArray2[0])
                 System.out.print(secondletter);
             else System.out.print("_");

             if (thirdletter == GhostCharArray3[0])
                 System.out.print(thirdletter);
             else System.out.print("_");

             if (fourthletter == GhostCharArray4[0])
                 System.out.print(fourthletter);
             else System.out.print("_");

             if (fifthletter == GhostCharArray5[0])
                 System.out.print(fifthletter);
             else System.out.print("_");

             System.out.println(" ");

             if (firstletter == GhostCharArray1[0] && secondletter == GhostCharArray2[0] && thirdletter == GhostCharArray3[0] && fourthletter == GhostCharArray4[0] && fifthletter == GhostCharArray5[0]) {
                 System.out.println("You won!");
                 break;
             }
             if (i == 0){
                 System.out.println("D");
             }
             else if (i == 1){
                 System.out.println("DE");
             }
             else if (i == 2){
                 System.out.println("DEA");
             }
             else if (i == 3){
                 System.out.println("DEAD");
                 System.out.println("You Lose");
             }
         }
     }
     static void Great(){
         Scanner scanner = new Scanner(System.in);
         char[] WordCharArray1 = {'g'};
         char[] WordCharArray2 = {'r'};
         char[] WordCharArray3 = {'e'};
         char[] WordCharArray4 = {'a'};
         char[] WordCharArray5 = {'t'};

         System.out.println("The word is five letters guess the word");

         for (int i = 0; i < 4; i++) {
             char firstletter = scanner.next().charAt(0);
             char secondletter = scanner.next().charAt(0);
             char thirdletter = scanner.next().charAt(0);
             char fourthletter = scanner.next().charAt(0);
             char fifthletter = scanner.next().charAt(0);

             if (firstletter == WordCharArray1[0])
                 System.out.print(firstletter);
             else System.out.print("_");

             if (secondletter == WordCharArray2[0])
                 System.out.print(secondletter);
             else System.out.print("_");

             if (thirdletter == WordCharArray3[0])
                 System.out.print(thirdletter);
             else System.out.print("_");

             if (fourthletter == WordCharArray4[0])
                 System.out.print(fourthletter);
             else System.out.print("_");

             if (fifthletter == WordCharArray5[0])
                 System.out.print(fifthletter);
             else System.out.print("_");

             System.out.println(" ");

             if (firstletter == WordCharArray1[0] && secondletter == WordCharArray2[0] && thirdletter == WordCharArray3[0] && fourthletter == WordCharArray4[0] && fifthletter == WordCharArray5[0]) {
                 System.out.println("You won!");
                 break;
             }
             if (i == 0){
                 System.out.println("D");
             }
             else if (i == 1){
                 System.out.println("DE");
             }
             else if (i == 2){
                 System.out.println("DEA");
             }
             else if (i == 3){
                 System.out.println("DEAD");
                 System.out.println("You Lose");
             }
         }
     }
     static void Chore(){
         Scanner scanner = new Scanner(System.in);
         char[] WordCharArray1 = {'c'};
         char[] WordCharArray2 = {'h'};
         char[] WordCharArray3 = {'o'};
         char[] WordCharArray4 = {'r'};
         char[] WordCharArray5 = {'e'};

         System.out.println("The word is five letters guess the word");

         for (int i = 0; i < 4; i++) {
             char firstletter = scanner.next().charAt(0);
             char secondletter = scanner.next().charAt(0);
             char thirdletter = scanner.next().charAt(0);
             char fourthletter = scanner.next().charAt(0);
             char fifthletter = scanner.next().charAt(0);

             if (firstletter == WordCharArray1[0])
                 System.out.print(firstletter);
             else System.out.print("_");

             if (secondletter == WordCharArray2[0])
                 System.out.print(secondletter);
             else System.out.print("_");

             if (thirdletter == WordCharArray3[0])
                 System.out.print(thirdletter);
             else System.out.print("_");

             if (fourthletter == WordCharArray4[0])
                 System.out.print(fourthletter);
             else System.out.print("_");

             if (fifthletter == WordCharArray5[0])
                 System.out.print(fifthletter);
             else System.out.print("_");

             System.out.println(" ");

             if (firstletter == WordCharArray1[0] && secondletter == WordCharArray2[0] && thirdletter == WordCharArray3[0] && fourthletter == WordCharArray4[0] && fifthletter == WordCharArray5[0]) {
                 System.out.println("You won!");
                 break;
             }
             if (i == 0){
                 System.out.println("D");
             }
             else if (i == 1){
                 System.out.println("DE");
             }
             else if (i == 2){
                 System.out.println("DEA");
             }
             else if (i == 3){
                 System.out.println("DEAD");
                 System.out.println("You Lose");
             }
         }
     }
     static void Board(){
         Scanner scanner = new Scanner(System.in);
         char[] WordCharArray1 = {'b'};
         char[] WordCharArray2 = {'o'};
         char[] WordCharArray3 = {'a'};
         char[] WordCharArray4 = {'r'};
         char[] WordCharArray5 = {'d'};

         System.out.println("The word is five letters guess the word");

         for (int i = 0; i < 4; i++) {
             char firstletter = scanner.next().charAt(0);
             char secondletter = scanner.next().charAt(0);
             char thirdletter = scanner.next().charAt(0);
             char fourthletter = scanner.next().charAt(0);
             char fifthletter = scanner.next().charAt(0);

             if (firstletter == WordCharArray1[0])
                 System.out.print(firstletter);
             else System.out.print("_");

             if (secondletter == WordCharArray2[0])
                 System.out.print(secondletter);
             else System.out.print("_");

             if (thirdletter == WordCharArray3[0])
                 System.out.print(thirdletter);
             else System.out.print("_");

             if (fourthletter == WordCharArray4[0])
                 System.out.print(fourthletter);
             else System.out.print("_");

             if (fifthletter == WordCharArray5[0])
                 System.out.print(fifthletter);
             else System.out.print("_");

             System.out.println(" ");

             if (firstletter == WordCharArray1[0] && secondletter == WordCharArray2[0] && thirdletter == WordCharArray3[0] && fourthletter == WordCharArray4[0] && fifthletter == WordCharArray5[0]) {
                 System.out.println("You won!");
                 break;
             }
             if (i == 0){
                 System.out.println("D");
             }
             else if (i == 1){
                 System.out.println("DE");
             }
             else if (i == 2){
                 System.out.println("DEA");
             }
             else if (i == 3){
                 System.out.println("DEAD");
                 System.out.println("You Lose");
             }
         }
     }
     static void Trick(){
         Scanner scanner = new Scanner(System.in);
         char[] WordCharArray1 = {'t'};
         char[] WordCharArray2 = {'r'};
         char[] WordCharArray3 = {'i'};
         char[] WordCharArray4 = {'c'};
         char[] WordCharArray5 = {'k'};

         System.out.println("The word is five letters guess the word");

         for (int i = 0; i < 4; i++) {
             char firstletter = scanner.next().charAt(0);
             char secondletter = scanner.next().charAt(0);
             char thirdletter = scanner.next().charAt(0);
             char fourthletter = scanner.next().charAt(0);
             char fifthletter = scanner.next().charAt(0);

             if (firstletter == WordCharArray1[0])
                 System.out.print(firstletter);
             else System.out.print("_");

             if (secondletter == WordCharArray2[0])
                 System.out.print(secondletter);
             else System.out.print("_");

             if (thirdletter == WordCharArray3[0])
                 System.out.print(thirdletter);
             else System.out.print("_");

             if (fourthletter == WordCharArray4[0])
                 System.out.print(fourthletter);
             else System.out.print("_");

             if (fifthletter == WordCharArray5[0])
                 System.out.print(fifthletter);
             else System.out.print("_");

             System.out.println(" ");

             if (firstletter == WordCharArray1[0] && secondletter == WordCharArray2[0] && thirdletter == WordCharArray3[0] && fourthletter == WordCharArray4[0] && fifthletter == WordCharArray5[0]) {
                 System.out.println("You won!");
                 break;
             }
             if (i == 0){
                 System.out.println("D");
             }
             else if (i == 1){
                 System.out.println("DE");
             }
             else if (i == 2){
                 System.out.println("DEA");
             }
             else if (i == 3){
                 System.out.println("DEAD");
                 System.out.println("You Lose");
             }
         }
     }
     static void Gnome(){
         Scanner scanner = new Scanner(System.in);
         char[] WordCharArray1 = {'g'};
         char[] WordCharArray2 = {'n'};
         char[] WordCharArray3 = {'o'};
         char[] WordCharArray4 = {'m'};
         char[] WordCharArray5 = {'e'};

         System.out.println("The word is five letters guess the word");

         for (int i = 0; i < 4; i++) {
             char firstletter = scanner.next().charAt(0);
             char secondletter = scanner.next().charAt(0);
             char thirdletter = scanner.next().charAt(0);
             char fourthletter = scanner.next().charAt(0);
             char fifthletter = scanner.next().charAt(0);

             if (firstletter == WordCharArray1[0])
                 System.out.print(firstletter);
             else System.out.print("_");

             if (secondletter == WordCharArray2[0])
                 System.out.print(secondletter);
             else System.out.print("_");

             if (thirdletter == WordCharArray3[0])
                 System.out.print(thirdletter);
             else System.out.print("_");

             if (fourthletter == WordCharArray4[0])
                 System.out.print(fourthletter);
             else System.out.print("_");

             if (fifthletter == WordCharArray5[0])
                 System.out.print(fifthletter);
             else System.out.print("_");

             System.out.println(" ");

             if (firstletter == WordCharArray1[0] && secondletter == WordCharArray2[0] && thirdletter == WordCharArray3[0] && fourthletter == WordCharArray4[0] && fifthletter == WordCharArray5[0]) {
                 System.out.println("You won!");
                 break;
             }
             if (i == 0){
                 System.out.println("D");
             }
             else if (i == 1){
                 System.out.println("DE");
             }
             else if (i == 2){
                 System.out.println("DEA");
             }
             else if (i == 3){
                 System.out.println("DEAD");
                 System.out.println("You Lose");
             }
         }
     }
     static void Piano(){
         Scanner scanner = new Scanner(System.in);
         char[] WordCharArray1 = {'p'};
         char[] WordCharArray2 = {'i'};
         char[] WordCharArray3 = {'a'};
         char[] WordCharArray4 = {'n'};
         char[] WordCharArray5 = {'o'};

         System.out.println("The word is five letters guess the word");

         for (int i = 0; i < 4; i++) {
             char firstletter = scanner.next().charAt(0);
             char secondletter = scanner.next().charAt(0);
             char thirdletter = scanner.next().charAt(0);
             char fourthletter = scanner.next().charAt(0);
             char fifthletter = scanner.next().charAt(0);

             if (firstletter == WordCharArray1[0])
                 System.out.print(firstletter);
             else System.out.print("_");

             if (secondletter == WordCharArray2[0])
                 System.out.print(secondletter);
             else System.out.print("_");

             if (thirdletter == WordCharArray3[0])
                 System.out.print(thirdletter);
             else System.out.print("_");

             if (fourthletter == WordCharArray4[0])
                 System.out.print(fourthletter);
             else System.out.print("_");

             if (fifthletter == WordCharArray5[0])
                 System.out.print(fifthletter);
             else System.out.print("_");

             System.out.println(" ");

             if (firstletter == WordCharArray1[0] && secondletter == WordCharArray2[0] && thirdletter == WordCharArray3[0] && fourthletter == WordCharArray4[0] && fifthletter == WordCharArray5[0]) {
                 System.out.println("You won!");
                 break;
             }
             if (i == 0){
                 System.out.println("D");
             }
             else if (i == 1){
                 System.out.println("DE");
             }
             else if (i == 2){
                 System.out.println("DEA");
             }
             else if (i == 3){
                 System.out.println("DEAD");
                 System.out.println("You Lose");
             }
         }
    }
    static void Tramp(){
        Scanner scanner = new Scanner(System.in);
        char[] WordCharArray1 = {'t'};
        char[] WordCharArray2 = {'r'};
        char[] WordCharArray3 = {'a'};
        char[] WordCharArray4 = {'m'};
        char[] WordCharArray5 = {'p'};

        System.out.println("The word is five letters guess the word");

        for (int i = 0; i < 4; i++) {
            char firstletter = scanner.next().charAt(0);
            char secondletter = scanner.next().charAt(0);
            char thirdletter = scanner.next().charAt(0);
            char fourthletter = scanner.next().charAt(0);
            char fifthletter = scanner.next().charAt(0);

            if (firstletter == WordCharArray1[0])
                System.out.print(firstletter);
            else System.out.print("_");

            if (secondletter == WordCharArray2[0])
                System.out.print(secondletter);
            else System.out.print("_");

            if (thirdletter == WordCharArray3[0])
                System.out.print(thirdletter);
            else System.out.print("_");

            if (fourthletter == WordCharArray4[0])
                System.out.print(fourthletter);
            else System.out.print("_");

            if (fifthletter == WordCharArray5[0])
                System.out.print(fifthletter);
            else System.out.print("_");

            System.out.println(" ");

            if (firstletter == WordCharArray1[0] && secondletter == WordCharArray2[0] && thirdletter == WordCharArray3[0] && fourthletter == WordCharArray4[0] && fifthletter == WordCharArray5[0]) {
                System.out.println("You won!");
                break;
            }
            if (i == 0){
                System.out.println("D");
            }
            else if (i == 1){
                System.out.println("DE");
            }
            else if (i == 2){
                System.out.println("DEA");
            }
            else if (i == 3){
                System.out.println("DEAD");
                System.out.println("You Lose");
            }
        }
    }
    static void Tiger(){
        Scanner scanner = new Scanner(System.in);
        char[] WordCharArray1 = {'t'};
        char[] WordCharArray2 = {'i'};
        char[] WordCharArray3 = {'g'};
        char[] WordCharArray4 = {'e'};
        char[] WordCharArray5 = {'r'};

        System.out.println("The word is five letters guess the word");

        for (int i = 0; i < 4; i++) {
            char firstletter = scanner.next().charAt(0);
            char secondletter = scanner.next().charAt(0);
            char thirdletter = scanner.next().charAt(0);
            char fourthletter = scanner.next().charAt(0);
            char fifthletter = scanner.next().charAt(0);

            if (firstletter == WordCharArray1[0])
                System.out.print(firstletter);
            else System.out.print("_");

            if (secondletter == WordCharArray2[0])
                System.out.print(secondletter);
            else System.out.print("_");

            if (thirdletter == WordCharArray3[0])
                System.out.print(thirdletter);
            else System.out.print("_");

            if (fourthletter == WordCharArray4[0])
                System.out.print(fourthletter);
            else System.out.print("_");

            if (fifthletter == WordCharArray5[0])
                System.out.print(fifthletter);
            else System.out.print("_");

            System.out.println(" ");

            if (firstletter == WordCharArray1[0] && secondletter == WordCharArray2[0] && thirdletter == WordCharArray3[0] && fourthletter == WordCharArray4[0] && fifthletter == WordCharArray5[0]) {
                System.out.println("You won!");
                break;
            }
            if (i == 0){
                System.out.println("D");
            }
            else if (i == 1){
                System.out.println("DE");
            }
            else if (i == 2){
                System.out.println("DEA");
            }
            else if (i == 3){
                System.out.println("DEAD");
                System.out.println("You Lose");
            }
        }
    }
    static void Train(){
        Scanner scanner = new Scanner(System.in);
        char[] WordCharArray1 = {'t'};
        char[] WordCharArray2 = {'r'};
        char[] WordCharArray3 = {'a'};
        char[] WordCharArray4 = {'i'};
        char[] WordCharArray5 = {'n'};

        System.out.println("The word is five letters guess the word");

        for (int i = 0; i < 4; i++) {
            char firstletter = scanner.next().charAt(0);
            char secondletter = scanner.next().charAt(0);
            char thirdletter = scanner.next().charAt(0);
            char fourthletter = scanner.next().charAt(0);
            char fifthletter = scanner.next().charAt(0);

            if (firstletter == WordCharArray1[0])
                System.out.print(firstletter);
            else System.out.print("_");

            if (secondletter == WordCharArray2[0])
                System.out.print(secondletter);
            else System.out.print("_");

            if (thirdletter == WordCharArray3[0])
                System.out.print(thirdletter);
            else System.out.print("_");

            if (fourthletter == WordCharArray4[0])
                System.out.print(fourthletter);
            else System.out.print("_");

            if (fifthletter == WordCharArray5[0])
                System.out.print(fifthletter);
            else System.out.print("_");

            System.out.println(" ");

            if (firstletter == WordCharArray1[0] && secondletter == WordCharArray2[0] && thirdletter == WordCharArray3[0] && fourthletter == WordCharArray4[0] && fifthletter == WordCharArray5[0]) {
                System.out.println("You won!");
                break;
            }
            if (i == 0){
                System.out.println("D");
            }
            else if (i == 1){
                System.out.println("DE");
            }
            else if (i == 2){
                System.out.println("DEA");
            }
            else if (i == 3){
                System.out.println("DEAD");
                System.out.println("You Lose");
            }
        }
    }
    static void Relic(){
        Scanner scanner = new Scanner(System.in);
        char[] WordCharArray1 = {'r'};
        char[] WordCharArray2 = {'e'};
        char[] WordCharArray3 = {'l'};
        char[] WordCharArray4 = {'i'};
        char[] WordCharArray5 = {'c'};

        System.out.println("The word is five letters guess the word");

        for (int i = 0; i < 4; i++) {
            char firstletter = scanner.next().charAt(0);
            char secondletter = scanner.next().charAt(0);
            char thirdletter = scanner.next().charAt(0);
            char fourthletter = scanner.next().charAt(0);
            char fifthletter = scanner.next().charAt(0);

            if (firstletter == WordCharArray1[0])
                System.out.print(firstletter);
            else System.out.print("_");

            if (secondletter == WordCharArray2[0])
                System.out.print(secondletter);
            else System.out.print("_");

            if (thirdletter == WordCharArray3[0])
                System.out.print(thirdletter);
            else System.out.print("_");

            if (fourthletter == WordCharArray4[0])
                System.out.print(fourthletter);
            else System.out.print("_");

            if (fifthletter == WordCharArray5[0])
                System.out.print(fifthletter);
            else System.out.print("_");

            System.out.println(" ");

            if (firstletter == WordCharArray1[0] && secondletter == WordCharArray2[0] && thirdletter == WordCharArray3[0] && fourthletter == WordCharArray4[0] && fifthletter == WordCharArray5[0]) {
                System.out.println("You won!");
                break;
            }
            if (i == 0){
                System.out.println("D");
            }
            else if (i == 1){
                System.out.println("DE");
            }
            else if (i == 2){
                System.out.println("DEA");
            }
            else if (i == 3){
                System.out.println("DEAD");
                System.out.println("You Lose");
            }
        }
    }
}
