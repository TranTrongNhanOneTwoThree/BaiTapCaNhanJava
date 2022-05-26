/*Tran Trong Nhan 
Ma sinh vien: 6151071016
Lop: Cong nghe thong tin k61*/
import java.util.Scanner;
public class Bai1_8{
   public static String nhap(){
      Scanner input= new Scanner(System.in);
      boolean check=false;
      String s="";
      while(!check){
         System.out.print(" ");
         try {
            s=input.nextLine();
            
            check=true;
         } catch (Exception e) {
            System.out.println("Sai du lieu, moi ban nhap lai");
            input.nextLine();    
         }
      } 
      return (s);
   }
   public static int countString(String a[], int n, String s){
      int count=0;
      String x,y;
      for(int j=0; j<n; j++)
      {
         x=a[j];
         y=s;
         if(x.compareToIgnoreCase(y)==0)
         count++;
      }
      return (count);
   }
   public static int lastPosition(String a[], int n, String s){
      int p=0;
      String x,y;
      for(int i=0; i<n; i++)
      {
         x=a[i];
         y=s;
         if(x.compareToIgnoreCase(y)==0)
         {
            p=i+1;
         }
      }
      return (p);
   }
   public static int lengThan(String a[], int n){
      int count=0;
      for(int i=0; i<n; i++)
      {
         if(a[i].length()>4)
         count++;
      }
      return (count);
   }
   public static String[] createNewArayy(String a[], int n){
      int n1=lengThan(a, n);
      int index=0;
      String[] newArrayy= new String[n1];
      for(int i=0; i<n; i++)
      {
         if(a[i].length()>4)
         {
            newArrayy[index]=a[i];
            index++;
         }
      }
      return (newArrayy);
   }
   public static void main(String[] args){
      int i,n;
      Scanner input = new Scanner(System.in);
      System.out.println("Nhap n= ");
      n=input.nextInt();
      String[] array=new String[n];
      for(i=0; i<n; i++)
      {
         System.out.println("Nhap phan tu thu "+(i+1)+" ");
         array[i]=nhap();
      }
      System.out.println("Day vua nhap: ");
      for(i=0; i<n; i++)
      {
         System.out.println(" "+array[i]);
      }
      String s="";
      System.out.println("Nhap chuoi can dem");
      System.out.print(" ");
      input.nextLine();
      s=input.nextLine();
      System.out.println("Chuoi vua nhap co so lan xuat hien la: "+countString(array, n, s));
      System.out.println("Chuoi vua nhap co vi tri xuat hien cuoi cung la: "+lastPosition(array, n, s));
      System.out.println("Cac chuoi co chieu dai lon hon 4 ki tu:");

      String[] array2= createNewArayy(array, n);
      int n1= array2.length;
      for(i=0; i<n1; i++)
      {
         System.out.println(" "+array2[i]);
      }
}
}