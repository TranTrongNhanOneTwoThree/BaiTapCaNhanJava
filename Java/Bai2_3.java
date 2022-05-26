/*
Ho va ten: Tran Trong Nhan
Ma sinh vien: 6151071016
Lop: cong nghe thong tin k61 
*/
import java.util.Scanner;

public class Bai2_3 {
    public static int nhap(){
        Scanner input=new Scanner(System.in);
        boolean check=false;
        int n=0;
        while(!check){
            System.out.print(" ");
            try {
                n=input.nextInt();
                check=true;
            } catch (Exception e) {
                System.out.println("Ban phai nhap so! hay nhap lai");
                input.nextLine();
            }
        }
        return (n);
    }
    public static void inMT(int[][] a, int n,int m){
        int i,j;
        for(i=0; i<n; i++){
            System.out.print("\n");
            for(j=0; j<m; j++)
            System.out.print(" "+a[i][j]);
        }
    }
    public static int secondValue(int[][] a, int n, int m){
        int soLe=0,i,j;
        boolean exist=false;
        for( i=0; i<n; i++){
            for(j=0; j<m;j++ )
            if(a[i][j]%2!=0)
            {
                soLe=a[i][j];
                exist=true;
                break;
            }
            if(exist == true) break;
        }
        if(!exist) return 0;
        
        int heigh=soLe;
        int secondheigh=soLe;
        for(i=0; i<n; i++)
        for( j=0; j<m; j++)
        {
            if(a[i][j]>heigh && a[i][j] %2!=0)
            {
                secondheigh=heigh;
                heigh=a[i][j];
            }
            else if(heigh > a[i][j] && a[i][j]>secondheigh && a[i][j]%2!=0){
                secondheigh=a[i][j];
            }
        
        }
        if(heigh==secondheigh) return 2;
        return secondheigh;
    }
    public static void maxValueDiagonal(int[][] a, int n, int m){
        if(m!=n){
            System.out.println("Khong tim duoc gia tri lon nhat tren hai duong cheo do day khong phai la ma tran vuong");
            return;
        }
        int principalMax=a[0][0];
        int secondaryMax=a[n-1][0];
        int i,j;
        for(i=1; i<n; i++)
            for(j=1; j<m; j++)
            {
                if(i==j && a[i][j]>principalMax){
                    principalMax=a[i][j];
                }
                if((i+j)==(n-1) && a[i][j] >secondaryMax){
                    secondaryMax=a[i][j];
                }
            }
        int t= (principalMax>secondaryMax)?principalMax:secondaryMax;
        System.out.println("Phan tu lon nhat tren duong cheo chinh la: "+principalMax);
        System.out.println("Phan tu lon nhat tren duong cheo phu la: "+secondaryMax);
        System.out.println("Phan tu lon nhat tren ca hai duong cheo la: "+t);
    }
    public static int maxValueColum(int[][] a, int n, int j){

        int max=a[0][j];
        for(int i=1;i<n; i++){
            if(a[i][j]>max) max=a[i][j];
        }
        return max;
    }
    public static void replaceItem(int[][] a, int n, int m)
    {
        int i,j;
        for(i=0; i<n; i++)
            for(j=0;j<m; j++)
            {
                if(a[i][j]==-1)
                a[i][j]=maxValueColum(a, n, j);
            }
    }
    public static void main(String[] args) {
        System.out.print("Nhap so hang n=");
        int n=nhap();
        System.out.print("Nhap so cot m=");
        int m=nhap();
        int[][] a= new int[n][m];
        int i,j;
        for(i=0; i<n; i++){
            for(j=0; j<m; j++)
            {
                System.out.println("Nhap phan tu thu A"+(i+1)+"]["+(j+1)+"]= ");
                a[i][j]=nhap();
            }
        }
        System.out.println("Ma tran vua nhap: ");
        inMT(a, n, m);
        System.out.print("\n");
        if(secondValue(a, n, m)== 0 )
            System.out.println("Mang khong ton tai so le");
        else if(secondValue(a, n, m)==2)
             System.out.println("Mang chi co mot so le");
        else
            System.out.println("So le lon thu hai trong mang la: "+secondValue(a, n, m));
        maxValueDiagonal(a, n, m);
        replaceItem(a, n, m);

        System.out.print("\nMa tran sau khi thay the phan tu co gia tri -1 bang gia tri lon nhat tren cot do");
        inMT(a, n, m);
    }
}
