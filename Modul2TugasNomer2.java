package modul2tugas;
public class Modul2TugasNomer2 {
    public static void main (String[] args){
        int[][] P = {
            {9,8},
            {7,6},
            {5,4}
        };
        int[][] Q = {
            {21,22},
            {22,24},
            {25,26}
        };
        int baris_x = P.length;
        int kolom_x = P[0].length;
        int[][] hasil = new int [baris_x][kolom_x];
        
        
        for (int i=0; i<baris_x; i++){
              for (int j=0; j<kolom_x; j++){
                  hasil [i][j] = P[i][j] - Q[i][j];
                 
                  
              }
              System.out.println();
        }
    }
    
}

//M.Rizki_20090110_2A