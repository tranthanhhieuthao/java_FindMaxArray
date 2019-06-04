public class FindMaxInArray {
    public static void main(String[] args) {
        int[][] array ={
                {2,3,5,9},
                {5,6,9,15},
                {12,5,9,7},
                {1,8,45,11}
        };
        int Max =array[0][0];
        int indexI=0;
        int indexJ=0;
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                if (array[i][j] >Max){
                    Max =array[i][j];
                    indexI =i;
                    indexJ =j;
                }
            }
        }
        System.out.println("Phan tu lon nhat trong mang la:"+" "+Max+"\n"+"tai toa do:"+" "+"("+indexI+","+indexJ+")");
    }
}
