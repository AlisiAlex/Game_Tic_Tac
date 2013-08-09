package Game;

import java.util.Scanner;

public class MechanicsGame {
        Field field = new Field();

        public void Game(){
            field.clearField();
            boolean f = checkField();
            while (f){
                field.showField();
                humanMove();
            }
        }

        public int checkNumbers(){
            int number = 0;
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNext()){
                number = scanner.nextInt();
                if (number>=1 && number <=3)
                {
                    return number -1;
                }else {
                    number = 0;
                }
            }
            return number;
        }

        public char[][] humanMove(){
            char[][] plas = new char[field.SIZE_FIELD][field.SIZE_FIELD];
            System.out.println("--Input X--");
            int x = checkNumbers();
            System.out.println("--Input Y-");
            int y = checkNumbers();
            field.game_field[x][y] = plas[x][y];
            return field.game_field;
        }

        public boolean checkField(){
            boolean check = false;
            for (int i = 0; i<field.SIZE_FIELD; i++){
                for (int j=0; j<field.SIZE_FIELD; j++){
                    if (field.game_field[i][j] !=field.DEFAULT){
                        check = false;
                    }
                    else {
                        check = true;
                    }
                }
            }
            return check;
        }
    }
