import java.util.Scanner;

public class FindMaxInArrayStep2 {
    public static void main(String[] args) {
        int [][] array = new int [4][4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                int x = scanner.nextInt();
                array[i][j]= x;
            }
        }
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
