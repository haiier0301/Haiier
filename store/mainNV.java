package store;
import java.util.Scanner;
import java.util.Arrays;
public class mainNV extends NhanVienNhap {
		
	static NhanVienNhap mnv[] = null;
	private static int n=0;
	static Scanner sc=new Scanner(System.in);
	public mainNV()
	{
		mnv=null;
		n=0;
	}
	public static void main(String[] args) {
		int a;
		do {
			showMenu();
			a = sc.nextInt();
			switch (a) {
				case 1:
					inputStaff();
					break;
				case 2:
					showStaff();
					break;
				case 3:
					insertStaff();
					break;
				case 4: 
					updateStaff();
					break;
				case 5:
					findStaff();
					break;
				case 6:
					deleteStaff();
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
			System.out.println("1. Nhap danh sách NV");
			System.out.println("2. Xuat danh sach NV");
			System.out.println("3. Them  NV");
			System.out.println("4. Sua thong tin NV");
			System.out.println("5. Tim NV");
			System.out.println("6. Xoa NV");
			System.out.println("7. Thoat khoi chuong trinh!");
			System.out.println("Chon: ");
		}
		private static void inputStaff() {
			boolean check= false;
	    	System.out.println("-----Nhập vào số khách hàng cần khai báo :-----");
			while(!check){
		          System.out.print(" ");
		          try{
		        	  n=sc.nextInt();
		        	  check= true;
		          }catch(Exception e){
		              System.out.println("Ban phải nhập số! vui lòng nhập lại...");
		              sc.nextLine();
		          }
		          mnv=new NhanVienNhap[n];
	        for(int i=0;i<n;i++){
	            System.out.println("Nhập vào khách hàng thứ:" +(i+1));
	            NhanVienNhap a=new NhanVienNhap();
	            a.nhapNhanVien();
	            mnv[i]=a;
	         }
	    }
			
		}
		private static void showStaff() {
			System.out.println("*******************************__Danh sách sinh viên vừa nhập__************************************");
	        System.out.println("+-----------------------------------------------------------------------------------------------+");
	     
	        for(int i=0;i<n;i++){
	        	System.out.println("  " + (i+1));
	        	mnv[i].xuatNhanVien();
	        }
		}
		private static void insertStaff() {
			System.out.println("Nhập vào nhân viên:");
			NhanVienNhap kh=new NhanVienNhap();
	        kh.nhapNhanVien();
	        mnv = Arrays.copyOf(mnv, mnv.length +1); 
	        mnv[n]=kh;
	        n++;        
	        System.out.println("\nDanh sách sinh viên sau khi thêm:");
	        for(int i=0 ;i<n ;i++)
	        {
	        	System.out.println("\n\n " + (i+1));
	        	mnv[i].xuatNhanVien();
	        }
		}
		private static void updateStaff() {
			System.out.println("Nhập vào mã nhân viên cần sửa :");
			   String Mahd=sc.next();
			   boolean check=false;
			   int c;
			   for(int i=0;i<mnv.length;i++)
		   {
				   if(mnv[i].getStaffID().equalsIgnoreCase(Mahd))
				   {
					   check=true;
					   System.out.println("1. Sửa mã nhân viên ");
					      System.out.println("2. Sửa tên nhân viên");
					      System.out.println("3. Sửa đại chỉ nhân viên");
					      System.out.println("4. Sửa số điện thoại nhân viên");
					      System.out.println("5. Sửa chức vụ nhân viên");
					      System.out.println("6. Sửa lương cơ bản nhân viên");
					      System.out.println("7. Sửa số giờ làm nhân viên");
					      System.out.println("81. Thoát chương trình!!");
					    
					    do {
					    	   System.out.println("__Nhập vào phần muốn sửa: ");
					    	   c= sc.nextInt(); 
					   	switch(c)
					{
				
					case 1:{
						System.out.println("Nhập vào mã khách hàng mới:");
						String makhmoi=sc.next();
						mnv[i].setStaffID(makhmoi);
						System.out.println("\n Danh sách sau khi sửa : ");
						mnv[i].xuatNhanVien();
						break;
					}
						
					case 2:{
						System.out.println("Nhập vào tên nhân viên mới:");
						String tenkhmoi=sc.next();
						mnv[i].staffName=tenkhmoi;
						System.out.println("Danh sách khi sửa :");
						mnv[i].xuatNhanVien();
						break;
					}
					case 3:
					{
						System.out.println("Nhập vào địa chỉ nhân viên mới:");
						String dcmoi=sc.next();
						mnv[i].staffAddress=dcmoi;
						System.out.println("Danh sách sau khi sửa :");
						mnv[i].xuatNhanVien();
						break;
					}
					case 4:
					{
						System.out.println("Nhập vào số điện thoại nhân viên mới:");
						String sdtmoi=sc.next();
						mnv[i].staffPhone=sdtmoi;
						System.out.println("Danh sách sau khi sửa :");
						mnv[i].xuatNhanVien();
						break;
					}
					case 5:
					{
						System.out.println("Nhập vào chức vụ nhân viên mới:");
						String nmhmoi=sc.next();
						mnv[i].staffPosition=nmhmoi;
						System.out.println("Danh sách sau khi sửa :");
						mnv[i].xuatNhanVien();
						break;
					}
					case 6:
					{
						System.out.println("Nhập vào lương nhân viên mới:");
						int lmoi=sc.nextInt();
						mnv[i].safaryNormal=lmoi;
						System.out.println("Danh sách sau khi sửa :");
						mnv[i].xuatNhanVien();
						break;
					}
					case 7:
					{
						System.out.println("Nhập vào số giờ làm việc :");
						int hmoi=sc.nextInt();
						mnv[i].hoursWorked=hmoi;
						System.out.println("Danh sách sau khi sửa :");
						mnv[i].xuatNhanVien();
						break;
					}
					
					case 8:
					{
						System.out.println("\n Chương trình đang thoát!!!");
						break;
					}
					}
					    }  while(c>8 || c<1);
					    
					   
					  
				   }
		   }
			   if(check==false)
				   System.out.println("Không tìm thấy nhân viên cần sửa!");
		}
		private static void findStaff() {
			System.out.println("Nhập vào mã nhân viên cần tìm:");
	        String makhachhang=sc.next();
	        int t=mnv.length;
	        int i;
	        for( i=0; i<t; i++) {
	        	if(mnv[i].getStaffID().equalsIgnoreCase(makhachhang)){
						System.out.println("Nhân viên cần tìm:");
						mnv[i].xuatNhanVien();
						break;
	        	}
	        	if(i==t){
	        			System.out.println("Không tìm thấy nhân viên cần tìm");
	        	}
	        }
		}
		private static void deleteStaff() {
			System.out.println("Nhập vào mã nhân viên cần xóa:");
	        String makhachhang1=sc.next();
	        boolean [] deleteItem = new boolean[mnv.length];
	        int size=0;
	        for(int i=0;i<mnv.length;i++){
	           if(mnv[i].getStaffID().equalsIgnoreCase(makhachhang1)){
	              deleteItem[i]=true;
	           }
	           else{
	              deleteItem[i]=false;
	              size++;
	           }
	        }
	        NhanVienNhap[] newArr=new NhanVienNhap[size];
	        int index=0;
	        for(int i=0;i<mnv.length;i++){
	           if(!deleteItem[i]){
	              newArr[index++]=mnv[i];
	           }
	        }
	        System.out.println("\nDanh sách nhân viên sau khi xóa ta có:");
	        for(int i=0 ;i<index ;i++)
	        {
	        	System.out.println("\n\n " + (i+1));
	        	newArr[i].xuatNhanVien();
	        	
	        }
	    }
	}	