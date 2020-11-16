package store;

import java.util.Scanner;
import java.util.Arrays;

public class mainNCC extends NhaCungCapNhap {
	static NhaCungCapNhap mncc[] = null;
	private static int n=0;
	static Scanner sc=new Scanner(System.in);
	public mainNCC()
	{
		mncc=null;
		n=0;
	}
	public static void main(String[] args) {
		int a;
		do {
			showMenu();
			a = sc.nextInt();
			switch (a) {
				case 1:
					inputSupplier();
					break;
				case 2:
					showSupplier();
					break;
				case 3:
					insertSupplier();
					break;
				case 4: 
					updateSupplier();
					break;
				case 5:
					findSupplier();
					break;
				case 6:
					deleteSupplier();
					break;
				case 7:
					System.out.println("Thoat khoi chuong trinh!");
					break;
				default:
					System.out.println("Sai thao tac!");
					break;
				}
			}while(a !=6);
		}
		static void showMenu() {
			System.out.println("1. Nhap danh sách LTB");
			System.out.println("2. Xuat danh sach LTB");
			System.out.println("3. Them  LTB");
			System.out.println("4. Sua thong tin LTB");
			System.out.println("5. Tim LTB");
			System.out.println("6. Xoa LTB");
			System.out.println("7. Thoat khoi chuong trinh!");
			System.out.println("Chon: ");
		}
		private static void inputSupplier() {
			boolean check= false;
	    	System.out.println("-----Nhập vào số loại thiết bị cần khai báo :-----");
			while(!check){
		          System.out.print(" ");
		          try{
		        	  n=sc.nextInt();
		        	  check= true;
		          }catch(Exception e){
		              System.out.println("Ban phải nhập số! vui lòng nhập lại...");
		              sc.nextLine();
		          }
		          mncc=new NhaCungCapNhap[n];
	        for(int i=0;i<n;i++){
	            System.out.println("Nhập vào hóa đơn thứ:" +(i+1));
	            NhaCungCapNhap a=new NhaCungCapNhap();
	            a.nhapNhaCungCap();
	            mncc[i]=a;
	         }
	    }
			
		}
		private static void showSupplier() {
			System.out.println("*******************************__Danh sách loại thiết bị vừa nhập__************************************");
	        System.out.println("+-----------------------------------------------------------------------------------------------+");
	     
	        for(int i=0;i<n;i++){
	        	System.out.println("  " + (i+1));
	        	mncc[i].xuatNhaCungCap();
	        }
		}
		private static void insertSupplier() {
			System.out.println("Nhập vào loại thiết bị:");
			NhaCungCapNhap kh=new NhaCungCapNhap();
	        kh.nhapNhaCungCap();
	        mncc = Arrays.copyOf(mncc, mncc.length +1); 
	        mncc[n]=kh;
	        n++;        
	        System.out.println("\nDanh sách loại thiết bị sau khi thêm:");
	        for(int i=0 ;i<n ;i++)
	        {
	        	System.out.println("\n\n " + (i+1));
	        	mncc[i].xuatNhaCungCap();
	        }
		}
		private static void updateSupplier() {
			System.out.println("Nhập vào mã khách hàng cần sửa :");
			   String Mahd=sc.next();
			   boolean check=false;
			   int c;
			   for(int i=0;i<mncc.length;i++)
		   {
				   if(mncc[i].getSupplierID().equalsIgnoreCase(Mahd))
				   {
					   check=true;
					   System.out.println("1. Sửa mã nhà cung cap ");
					      System.out.println("2. Sửa tên nhà cung cấp");
					      System.out.println("3. Sửa địa chỉ nhà cung cấp ");
					      System.out.println("4. Sửa số điện thoại nhà cung cấp");
					      System.out.println("5. Thoát chương trình!!");
					    
					    do {
					    	   System.out.println("__Nhập vào phần muốn sửa: ");
					    	   c= sc.nextInt(); 
					   	switch(c)
					{
				
					case 1:{
						System.out.println("Nhập vào mã nhà cung cấp mới:");
						String manccmoi=sc.next();
						mncc[i].setSupplierID(manccmoi);
						System.out.println("\n Danh sách sau khi sửa : ");
						mncc[i].xuatNhaCungCap();
						break;
					}
						
					case 2:{
						System.out.println("Nhập vào tên nhà cung cấp mới:");
						String tenkhmoi=sc.next();
						mncc[i].supplierName=tenkhmoi;
						System.out.println("Danh sách khi sửa :");
						mncc[i].xuatNhaCungCap();
						break;
					}
					case 3:{
						System.out.println("Nhập vào địa chỉ mới:");
						String dcmoi=sc.next();
						mncc[i].supplierAddress=dcmoi;
						System.out.println("Danh sách sau khi sửa :");
						mncc[i].xuatNhaCungCap();
						break;
					}
					case 4:{
						System.out.println("Nhập vào số điện thoại mới:");
						String sdtmoi=sc.next();
						mncc[i].supplierPhone=sdtmoi;
						System.out.println("Danh sách sau khi sửa :");
						mncc[i].xuatNhaCungCap();
						break;
					}
					case 5:{
						System.out.println("\n Chương trình đang thoát!!!");
						break;
					}
					}
					}  while(c>5 || c<1);
					    
				   }  
					  
		   }
		}
		private static void findSupplier() {
			System.out.println("Nhập vào mã nhà cung cấp cần tìm:");
	        String manhacungcap=sc.next();
	        int t=mncc.length;
	        int i;
	        for( i=0; i<t; i++) {
	        	if(mncc[i].getSupplierID().equalsIgnoreCase(manhacungcap)){
						System.out.println("nhà cung cấp cần tìm:");
						mncc[i].xuatNhaCungCap();
						break;
	        	}
	        	if(i==t){
	        			System.out.println("Không tìm thấy nhà cung cấp cần tìm");
	        	}
	        }
		}
		private static void deleteSupplier() {
			System.out.println("Nhập vào mã nhà cung cấp cần xóa:");
	        String manhacungcap1=sc.next();
	        boolean [] deleteItem = new boolean[mncc.length];
	        int size=0;
	        for(int i=0;i<mncc.length;i++){
	           if(mncc[i].getSupplierID().equalsIgnoreCase(manhacungcap1)){
	              deleteItem[i]=true;
	           }
	           else{
	              deleteItem[i]=false;
	              size++;
	           }
	        }
	        NhaCungCapNhap[] newArr=new NhaCungCapNhap[size];
	        int index=0;
	        for(int i=0;i<mncc.length;i++){
	           if(!deleteItem[i]){
	              newArr[index++]=mncc[i];
	           }
	        }
	        System.out.println("\nDanh sách nhà cung cấp sau khi xóa ta có:");
	        for(int i=0 ;i<index ;i++)
	        {
	        	System.out.println("\n\n " + (i+1));
	        	newArr[i].xuatNhaCungCap();
	        	
	        }
	    }

}
