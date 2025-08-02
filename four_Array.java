public class four_Array {
    public static void main(String[] args) {
        int[][][][] array= {{{{1,2,3},{1,2,3},{1,2,3}},{{1,2,3},{1,2,3},{1,2,3}},{{1,2,3},{1,2,3},{1,2,3}}},{{{1,2,3},{1,2,3},{1,2,3}},{{1,2,3},{1,2,3},{1,2,3}},{{1,2,3},{1,2,3},{1,2,3}}},{{{1,2,3},{1,2,3},{1,2,3}},{{1,2,3},{1,2,3},{1,2,3}},{{1,2,3},{1,2,3},{1,2,3}}}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        System.out.print(array[i][j][k][l]+" ");
                    }System.out.println();
                }System.out.println();
            }System.out.println();
            
        }
        
    }
}
