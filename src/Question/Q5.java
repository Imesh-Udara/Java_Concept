package Question;

public class Q5 {
    public static void main(String[] args) {
        int[][] dimen = {
                {10, 20, 30},
                {40, 50, 60}

        };
        System.out.print("Original Array:\n");
        print_array(dimen);
        System.out.print("After changing the rows and columns of the said array:\n");
        transpose(dimen);

    }

    private static void print_array(int[][] dimen){


        for(int i=0; i< dimen.length;i++){
            for(int j=0; j < dimen[0].length; j++){
                System.out.print(dimen[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void transpose(int[][] dimen){
                int[][] newdimen = new int[dimen[0].length][dimen.length];

                for( int i=0; i < dimen.length; i++){
                    for(int j=0; j<dimen[0].length; j++){
                        newdimen[j][i] = dimen[i][j];
                    }

                }
        print_array(newdimen);
    }
}
