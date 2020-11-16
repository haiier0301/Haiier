package store;

import java.util.Scanner;
import java.util.Arrays;

public class mainNSX extends NhaSanXuatNhap {
	static NhaSanXuatNhap mnsx[] = null;
	private static int n=0;
	static Scanner sc=new Scanner(System.in);
	public mainNSX()
	{
		mnsx=null;
		n=0;
	}
	public static void main(String[] args) {
		int a;
		do {
			showMenu();
			a = sc.nextInt();
			switch (a) {
				case 1:
					inputProducer();
					break;
				case 2:
					showProducer();
					break;
				case 3:
					insertProducer();
					break;
				case 4: 
					updateProducer();
					break;
				case 5:
					findProducer();
					break;
				case 6:
					deleteProducer();
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
			System.out.println("1. Nhap danh sách NSX");
			System.out.println("2. Xuat danh sach NSX");
			System.out.println("3. Them  NSX");
			System.out.println("4. Sua thong tin NSX");
			System.out.println("5. Tim NSX");
			System.out.println("6. Xoa NSX");
			System.out.println("7. Thoat khoi chuong trinh!");
			System.out.println("Chon: ");
		}
		private static void inputProducer() {
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
		          mnsx=new NhaSanXuatNhap[n];
	        for(int i=0;i<n;i++){
	            System.out.println("Nhập vào nhà sản xuất thứ:" +(i+1));
	            NhaSanXuatNhap a=new NhaSanXuatNhap();
	            a.nhapNhaSanXuat();
	            mnsx[i]=a;
	         }
	    }
			
		}
		private static void showProducer() {
			System.out.println("*******************************__Danh sách loại thiết bị vừa nhập__************************************");
	        System.out.println("+-----------------------------------------------------------------------------------------------+");
	     
	        for(int i=0;i<n;i++){
	        	System.out.println("  " + (i+1));
	        	mnsx[i].xuatNhaSanXuat();
	        }
		}
		private static void insertProducer() {
			System.out.println("Nhập vào nhà sản xuất:");
			NhaSanXuatNhap kh=new NhaSanXuatNhap();
	        kh.nhapNhaSanXuat();
	        mnsx = Arrays.copyOf(mnsx, mnsx.length +1); 
	        mnsx[n]=kh;
	        n++;        
	        System.out.println("\nDanh sách nhà sản xuất sau khi thêm:");
	        for(int i=0 ;i<n ;i++)
	        {
	        	System.out.println("\n\n " + (i+1));
	        	mnsx[i].xuatNhaSanXuat();
	        }
		}
		private static void updateProducer() {
			System.out.println("Nhập vào mã nhà sản xuất cần sửa :");
			   String Mahd=sc.next();
			   boolean check=false;
			   int c;
			   for(int i=0;i<mnsx.length;i++)
		   {
				   if(mnsx[i].getProducerID().equalsIgnoreCase(Mahd))
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
						System.out.println("Nhập vào mã nhà sản xuất mới:");
						String mansxmoi=sc.next();
						mnsx[i].setProducerID(mansxmoi);
						System.out.println("\n Danh sách sau khi sửa : ");
						mnsx[i].xuatNhaSanXuat();
						break;
					}
						
					case 2:{
						System.out.println("Nhập vào tên sản xuất cấp mới:");
						String tensxmoi=sc.next();
						mnsx[i].producerName=tensxmoi;
						System.out.println("Danh sách khi sửa :");
						mnsx[i].xuatNhaSanXuat();
						break;
					}
					case 3:{
						System.out.println("Nhập vào quốc gia mới:");
						String qgmoi=sc.next();
						mnsx[i].producerCountry=qgmoi;
						System.out.println("Danh sách sau khi sửa :");
						mnsx[i].xuatNhaSanXuat();
						break;
					}
					case 4:{
						System.out.println("Nhập vào mail mới:");
						String mailmoi=sc.next();
						mnsx[i].producerMail=mailmoi;
						System.out.println("Danh sách sau khi sửa :");
						mnsx[i].xuatNhaSanXuat();
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
		private static void findProducer() {
			System.out.println("Nhập vào mã nhà cung cấp cần tìm:");
	        String manhasanxuat=sc.next();
	        int t=mnsx.length;
	        int i;
	        for( i=0; i<t; i++) {
	        	if(mnsx[i].getProducerID().equalsIgnoreCase(manhasanxuat)){
						System.out.println("nhà sản xuất cần tìm:");
						mnsx[i].xuatNhaSanXuat();
						break;
	        	}
	        	if(i==t){
	        			System.out.println("Không tìm thấy nhà sản xuất cần tìm");
	        	}
	        }
		}
		private static void deleteProducer() {
			System.out.println("Nhập vào mã nhà cung cấp cần xóa:");
	        String manhasanxuat1=sc.next();
	        boolean [] deleteItem = new boolean[mnsx.length];
	        int size=0;
	        for(int i=0;i<mnsx.length;i++){
	           if(mnsx[i].getProducerID().equalsIgnoreCase(manhasanxuat1)){
	              deleteItem[i]=true;
	           }
	           else{
	              deleteItem[i]=false;
	              size++;
	           }
	        }
	        NhaSanXuatNhap[] newArr=new NhaSanXuatNhap[size];
	        int index=0;
	        for(int i=0;i<mnsx.length;i++){
	           if(!deleteItem[i]){
	              newArr[index++]=mnsx[i];
	           }
	        }
	        System.out.println("\nDanh sách nhà sản xuất sau khi xóa ta có:");
	        for(int i=0 ;i<index ;i++)
	        {
	        	System.out.println("\n\n " + (i+1));
	        	newArr[i].xuatNhaSanXuat();
	        	
	        }
	    }

}

