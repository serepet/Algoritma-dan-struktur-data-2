package modul2tugas;
public class Modul2TugasNomer3 {
    public static void main(String[] args) {
        int [][] matrix_Y = {
            {11,12,13},
            {14,15,16}
        };
        int[][] matrix_X = {
            {17,18},
            {19,20},
            {21,22}
        };
        int baris_a = matrix_Y.length;
        int kolom_a = matrix_Y[0].length;
        int baris_b = matrix_X.length;
        int kolom_b = matrix_X[0].length;
        int[][] hasilkali = new int[baris_a][kolom_b];
        for (int i=0; i<baris_a; i++){
            for (int j=0; j<kolom_b; j++){
                for (int k=0; k<kolom_a; k++){
                hasilkali[i][j] = hasilkali[i][j] + (matrix_Y[i][j]*matrix_X[k][j]);
            }
        }
    } 
    for (int[] x: hasilkali){
        for (int y:x){
            System.out.print(y+" ");
            
        }
        System.out.println();
    }
    }
}




//M.Rizki_20090110_2A
