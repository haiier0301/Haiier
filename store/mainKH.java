package store;
import java.util.Scanner;
import java.util.Arrays;
public class mainKH extends KhachHangNhap {
		
	static KhachHangNhap mkh[] = null;
	private static int n=0;
	static Scanner sc=new Scanner(System.in);
	public mainKH()
	{
		mkh=null;
		n=0;
	}
	public static void main(String[] args) {
		int a;
		do {
			showMenu();
			a = sc.nextInt();
			switch (a) {
				case 1:
					inputCustomer();
					break;
				case 2:
					showCustomer();
					break;
				case 3:
					insertCustomer();
					break;
				case 4: 
					updateCustomer();
					break;
				case 5:
					findCustomer();
					break;
				case 6:
					deleteCustomer();
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
			System.out.println("1. Nhap danh sách KH");
			System.out.println("2. Xuat danh sach KH");
			System.out.println("3. Them  KH");
			System.out.println("4. Sua thong tin KH");
			System.out.println("5. Tim KH");
			System.out.println("6. Xoa KH");
			System.out.println("7. Thoat khoi chuong trinh!");
			System.out.println("Chon: ");
		}
		private static void inputCustomer() {
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
		    mkh=new KhachHangNhap[n];
	        for(int i=0;i<n;i++){
	            System.out.println("Nhập vào khách hàng thứ:" +(i+1));
	            KhachHangNhap a=new KhachHangNhap();
	            a.nhapThongTinKH();
	            mkh[i]=a;
	         }
	    }
			
		}
		private static void showCustomer() {
			System.out.println("*******************************__Danh sách khách hàng vừa nhập__************************************");
	        System.out.println("+-----------------------------------------------------------------------------------------------+");
	     
	        for(int i=0;i<n;i++){
	        	System.out.println("  " + (i+1));
	            mkh[i].xuatThongTinKH();
	        }
		}
		private static void insertCustomer() {
			System.out.println("Nhập vào khách hàng:");
	        KhachHangNhap kh=new KhachHangNhap();
	        kh.nhapThongTinKH();
	        mkh = Arrays.copyOf(mkh, mkh.length +1); 
	        mkh[n]=kh;
	        n++;        
	        System.out.println("\nDanh sách khách hàng sau khi thêm:");
	        for(int i=0 ;i<n ;i++)
	        {
	        	System.out.println("\n\n " + (i+1));
	        	mkh[i].xuatThongTinKH();
	        }
		}
		private static void updateCustomer() {
			System.out.println("Nhập vào mã khách hàng cần sửa :");
			   String Mahd=sc.next();
			   boolean check=false;
			   int c;
			   for(int i=0;i<mkh.length;i++)
		   {
				   if(mkh[i].getCustomerID().equalsIgnoreCase(Mahd))
				   {
					   check=true;
						System.out.println("1. Sửa mã khách hàng ");
					    System.out.println("2. Sửa tên khách hàng");
					    System.out.println("3. Sửa đại chỉ khách hàng");
					    System.out.println("4. Sửa số điện thoại khách hàng");
					    System.out.println("5. Sửa ngày mua hàng");
					    System.out.println("6. Thoát chương trình!!");
					    
					    do {
					    	   System.out.println("__Nhập vào phần muốn sửa: ");
					    	   c= sc.nextInt(); 
					   	switch(c)
					{
				
					case 1:{
						System.out.println("Nhập vào mã khách hàng mới:");
						String makhmoi=sc.next();
						mkh[i].setCustomerID(makhmoi);
						System.out.println("\n Danh sách sau khi sửa : ");
						mkh[i].xuatThongTinKH();
						break;
					}
						
					case 2:{
						System.out.println("Nhập vào tên khách hàng mới:");
						String tenkhmoi=sc.next();
						mkh[i].customerName=tenkhmoi;
						System.out.println("Danh sách khi sửa :");
						mkh[i].xuatThongTinKH();
						break;
					}
					case 3:
					{
						System.out.println("Nhập vào địa chỉ khách hàng mới:");
						String dcmoi=sc.next();
						mkh[i].customerAddress=dcmoi;
						System.out.println("Danh sách sau khi sửa :");
						mkh[i].xuatThongTinKH();
						break;
					}
					case 4:
					{
						System.out.println("Nhập vào số điện thoại khách hàng mới:");
						String sdtmoi=sc.next();
						mkh[i].customerPhone=sdtmoi;
						System.out.println("Danh sách sau khi sửa :");
						mkh[i].xuatThongTinKH();
						break;
					}
					case 5:
					{
						System.out.println("Nhập vào tên ngày mua hàng mới:");
						String nmhmoi=sc.next();
						mkh[i].dayPurchase=nmhmoi;
						System.out.println("Hóa dơn sau khi sửa :");
						mkh[i].xuatThongTinKH();
						break;
					}
					case 6:
					{
						System.out.println("\n Chương trình đang thoát!!!");
						break;
					}
					}
					    }  while(c>6 || c<1);
					    
					   
					  
				   }
		   }
			   if(check==false)
				   System.out.println("Không tìm thấy khách hàng cần sửa!");
		}
		private static void findCustomer() {
			System.out.println("Nhập vào mã khách hàng cần tìm:");
	        String makhachhang=sc.next();
	        int t=mkh.length;
	        int i;
	        for( i=0; i<t; i++) {
	        	if(mkh[i].getCustomerID().equalsIgnoreCase(makhachhang)){
						System.out.println("Khách hàng cần tìm:");
						mkh[i].xuatThongTinKH();
						break;
	        	}
	        	if(i==t){
	        			System.out.println("Không tìm thấy khách hàng cần tìm");
	        	}
	        }
		}
		private static void deleteCustomer() {
			System.out.println("Nhập vào mã khách hàng cần xóa:");
	        String makhachhang1=sc.next();
	        boolean [] deleteItem = new boolean[mkh.length];
	        int size=0;
	        for(int i=0;i<mkh.length;i++){
	           if(mkh[i].getCustomerID().equalsIgnoreCase(makhachhang1)){
	              deleteItem[i]=true;
	           }
	           else{
	              deleteItem[i]=false;
	              size++;
	           }
	        }
	        KhachHangNhap[] newArr=new KhachHangNhap[size];
	        int index=0;
	        for(int i=0;i<mkh.length;i++){
	           if(!deleteItem[i]){
	              newArr[index++]=mkh[i];
	           }
	        }
	        System.out.println("\nDanh sách hóa đơn sau khi xóa ta có:");
	        for(int i=0 ;i<index ;i++)
	        {
	        	System.out.println("\n\n ____Hóa Đơn thứ " + (i+1));
	        	newArr[i].xuatThongTinKH();
	        	
	        }
	    }
	}	