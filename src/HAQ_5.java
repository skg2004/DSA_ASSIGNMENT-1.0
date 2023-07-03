import java.util.Scanner;

public class HAQ_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int row =sc.nextInt();
        System.out.println("Enter no of columns: ");
        int cols = sc.nextInt();
        int[][] ar = new int[row][cols];
        int max =1;int min =0;
        for (int i =0;i<row;i++){
            for (int j =0;j<cols; j++){
                ar[i][j]=(int)(Math.random()*(max-min+1)-min);
            }
        }
        for (int i =0;i<row;i++){
            for (int j =0;j<cols; j++){
                System.out.print( ar[i][j]+" ");
            }
            System.out.println();
        }
       int maxRowindex =0;
        int temp =0;
        for (int i =0;i<row;i++){
           int  count=0;
            for (int j =0;j<ar[i].length;j++){
                if (ar[i][j]==1){
                    count++;
                }
            }
            if (count>temp){
                temp=count;
                maxRowindex=i;
            }
        }
        int maxcolmnIndex=0;
        int temp1 =0;
        for (int j =0 ;j<ar[0].length;j++){
            int count =0;
            for (int i =0;i<ar.length;j++){
                if (ar[i][j]==1)
                    count++;
            }
            if (count>temp){
                temp1=count;
                maxcolmnIndex=j;
            }
        }
        System.out.println(maxRowindex+" "+maxcolmnIndex);
    }
}