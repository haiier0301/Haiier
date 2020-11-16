package store;

import java.util.Arrays;
import java.util.Scanner;

public class qltaikhoan extends taikhoan{
    taikhoan [] arr;
    private int n=0;
    Scanner sc= new Scanner(System.in);
    public qltaikhoan(){
        arr=null;
        n=0;
    }

    public void timkiemHoaDon()
    {
        System.out.println("Nhập thông tin tài khoản cần tìm (Mã Nhân Viên)");
        String super.MaNV=sc.next();
        int t=arr.length;
        int i;
        for( i=0; i<t; i++) {
        if(arr[i].getIdBill().equalsIgnoreCase(MaNV))
    {
                System.out.println("Tài khoản cần:");
                arr[i].xuatHoaDon();
                break;
    }
            
        }
        if(i==t)
            {
                System.out.println("Không tìm thấy tài khoản: ");
            }
    }
    public void themHoaDon()
    {
        System.out.println("Nhập thông tin tài khoản cần thêm:");
        taikhoan n1=new taikhoan();
        n1.taoTaikhoan();
        arr = Arrays.copyOf(arr, arr.length +1); 
        arr[n]=n1;
        n++;        
        System.out.println("\nDanh sách tài khoản sau khi thêm:");
        for(int i=0 ;i<n ;i++)
        {
            arr[i].xuatTaikhoan();
            
        }
    }
    public void xoaHoadDon() 
    {
        System.out.println("Nhập vào thông tin của tài khoản cần xoá(Mã Nhân Viên):");
        String newMaNV=sc.next();
        boolean [] deleteItem = new boolean[arr.length];
        int size=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i].getMaNV().equalsIgnoreCase(newMaNV)){
            deleteItem[i]=true;
           }
           else{
            deleteItem[i]=false;
            size++;
           }
        }
        HoaDon[] newArr=new HoaDon[size];
        int index=0;
        for(int i=0;i<arr.length;i++){
           if(!deleteItem[i]){
            newArr[index++]=arr[i];
           }
        }
        System.out.println("\nDanh sách tài khoản sau khi đã xoá:");
        for(int i=0 ;i<n ;i++)
        {
            arr[i].xuatTaikhoan();
            
        }
    }
}
