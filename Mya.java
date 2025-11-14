public class Mya {
    public static void main(String args[]){
       /*  int[][] arr = new int [3][3];
        System.out.println("no.of column's in the array :" + arr.length);
        System.out.println("no.of rows's in the array :" + arr[0].length);*/
       int[][] arr = {{2,7,9}, {12,7,9,7},{22,8,7},{6,10,8}};
       arr[0][1] = 22;
       for(int i = 0;i < arr.length;i++){
        for(int j = 0; j <arr[i].length;j++){
        System.out.print(arr[i][j] + " " );
        }
       System.out.println();


       }
        
    }
    
}
