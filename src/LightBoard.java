public class LightBoard {
    private boolean[][] lights;
    public LightBoard(int numRows, int numCols){
        lights = new boolean[numRows][numCols];
        for (int Rows = 0; numRows > Rows; Rows++){
            for (int Cols = 0; numCols > Cols; Cols++){
                int r = (int)(Math.random()*10);
                    lights[Rows][Cols] = (r <4);
            }
        }
    }

    public boolean evaluateLight (int row, int col){
        int c = 0;
        for(int i = 0; i < lights.length; i++){
            if(lights[i][col]){
                c++;
            }
        }
        if(lights[row][col]){
            if(c%2==0){
                return false;
            }
        }
        else if(c%3==0){
            return true;
        }
        return lights[row][col];

    }

}
