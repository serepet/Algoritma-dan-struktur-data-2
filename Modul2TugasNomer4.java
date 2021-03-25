package modul2tugas;
public class Modul2TugasNomer4 {
    public static void main(String[] args) {
        int[][] P = {
            {9,8,7},
            {6,5,4}
        };
        int[][] transpose = new int [3][2];
        for (int i=0; i<P.length; i++){
            for (int j=0; j<P[0].length; j++){
                transpose[j][i]= P [i][j];
            }
        }
        for (int i=0; i<P[0].length; i++){
            for (int j=0; j<P[0].length; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}


//M.Rizki_20090110_2A
