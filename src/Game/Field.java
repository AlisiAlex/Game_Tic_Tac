package Game;
public class Field {

    public final int SIZE_FIELD = 3;
    public final char DEFAULT = '+';
    public char[][] game_field = new char[SIZE_FIELD][SIZE_FIELD];

    public void clearField(){
        for (int i=0; i<SIZE_FIELD;i++){
            for (int j=0; j<SIZE_FIELD; j++){
                game_field[i][j] = DEFAULT;
            }
        }
    }

    public void showField(){
        for (int i=0; i<SIZE_FIELD;i++){
            for (int j=0; j<SIZE_FIELD; j++){
                System.out.print("["+game_field[i][j] +"]");
            }
            System.out.println();
        }
    }
}
