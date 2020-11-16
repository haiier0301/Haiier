package store;

import java.util.Scanner;
import java.util.Arrays;

public class mainLTB extends LoaiThietBiNhap {
	static LoaiThietBiNhap mltb[] = null;
	private static int n=0;
	static Scanner sc=new Scanner(System.in);
	public mainLTB()
	{
		mltb=null;
		n=0;
	}
	public static void main(String[] args) {
		int a;
		do {
			showMenu();
			a = sc.nextInt();
			switch (a) {
				case 1:
					inputEquipment();
					break;
				case 2:
					showEquipment();
					break;
				case 3:
					insertEquipment();
					break;
				case 4: 
					updateEquipment();
					break;
				case 5:
					findEquipment();
					break;
				case 6:
					deleteEquipment();
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
		private static void inputEquipment() {
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
		          mltb=new LoaiThietBiNhap[n];
	        for(int i=0;i<n;i++){
	            System.out.println("Nhập vào loại thiết bị:" +(i+1));
	            LoaiThietBiNhap a=new LoaiThietBiNhap();
	            a.nhapLoaiThietBi();
	            mltb[i]=a;
	         }
	    }
			
		}
		private static void showEquipment() {
			System.out.println("*******************************__Danh sách loại thiết bị vừa nhập__************************************");
	        System.out.println("+-----------------------------------------------------------------------------------------------+");
	     
	        for(int i=0;i<n;i++){
	        	System.out.println("  " + (i+1));
	        	mltb[i].xuatLoaiThietBi();
	        }
		}
		private static void insertEquipment() {
			System.out.println("Nhập vào loại thiết bị:");
			LoaiThietBiNhap kh=new LoaiThietBiNhap();
	        kh.nhapLoaiThietBi();
	        mltb = Arrays.copyOf(mltb, mltb.length +1); 
	        mltb[n]=kh;
	        n++;        
	        System.out.println("\nDanh sách loại thiết bị sau khi thêm:");
	        for(int i=0 ;i<n ;i++)
	        {
	        	System.out.println("\n\n " + (i+1));
	        	mltb[i].xuatLoaiThietBi();
	        }
		}
		private static void updateEquipment() {
			System.out.println("Nhập vào mã loại thiết bị cần sửa :");
			   String Mahd=sc.next();
			   boolean check=false;
			   int c;
			   for(int i=0;i<mltb.length;i++)
		   {
				   if(mltb[i].getEquipmentID().equalsIgnoreCase(Mahd))
				   {
					   check=true;
					   System.out.println("1. Sửa mã loại thiết bị ");
					      System.out.println("2. Sửa tên loại thiết bị");
					      System.out.println("3. Sửa đơn vị ");
					      System.out.println("4. Sửa ghi chú");
					      System.out.println("5. Thoát chương trình!!");
					    
					    do {
					    	   System.out.println("__Nhập vào phần muốn sửa: ");
					    	   c= sc.nextInt(); 
					   	switch(c)
					{
				
					case 1:{
						System.out.println("Nhập vào mã loại thiết bị mới:");
						String makhmoi=sc.next();
						mltb[i].setEquipmentID(makhmoi);
						System.out.println("\n Danh sách sau khi sửa : ");
						mltb[i].xuatLoaiThietBi();
						break;
					}
						
					case 2:{
						System.out.println("Nhập vào tên loại thiết bị mới:");
						String tenkhmoi=sc.next();
						mltb[i].equipmentName=tenkhmoi;
						System.out.println("Danh sách khi sửa :");
						mltb[i].xuatLoaiThietBi();
						break;
					}
					case 3:{
						System.out.println("Nhập vào đơn vị mới:");
						String dcmoi=sc.next();
						mltb[i].equipmentUnit=dcmoi;
						System.out.println("Danh sách sau khi sửa :");
						mltb[i].xuatLoaiThietBi();
						break;
					}
					case 4:{
						System.out.println("Nhập vào ghi chú mới:");
						String sdtmoi=sc.next();
						mltb[i].equipmentNote=sdtmoi;
						System.out.println("Danh sách sau khi sửa :");
						mltb[i].xuatLoaiThietBi();
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
		private static void findEquipment() {
			System.out.println("Nhập vào mã loại thiết bị cần tìm:");
	        String maloaithietbi=sc.next();
	        int t=mltb.length;
	        int i;
	        for( i=0; i<t; i++) {
	        	if(mltb[i].getEquipmentID().equalsIgnoreCase(maloaithietbi)){
						System.out.println("Loại thiệt bị cần tìm:");
						mltb[i].xuatLoaiThietBi();
						break;
	        	}
	        	if(i==t){
	        			System.out.println("Không tìm thấy loại thiết bị cần tìm");
	        	}
	        }
		}
		private static void deleteEquipment() {
			System.out.println("Nhập vào mã loại thiết bị cần xóa:");
	        String maloaithietbi1=sc.next();
	        boolean [] deleteItem = new boolean[mltb.length];
	        int size=0;
	        for(int i=0;i<mltb.length;i++){
	           if(mltb[i].getEquipmentID().equalsIgnoreCase(maloaithietbi1)){
	              deleteItem[i]=true;
	           }
	           else{
	              deleteItem[i]=false;
	              size++;
	           }
	        }
	        LoaiThietBiNhap[] newArr=new LoaiThietBiNhap[size];
	        int index=0;
	        for(int i=0;i<mltb.length;i++){
	           if(!deleteItem[i]){
	              newArr[index++]=mltb[i];
	           }
	        }
	        System.out.println("\nDanh sách loại thiết bị sau khi xóa ta có:");
	        for(int i=0 ;i<index ;i++)
	        {
	        	System.out.println("\n\n " + (i+1));
	        	newArr[i].xuatLoaiThietBi();
	        	
	        }
	    }

}
