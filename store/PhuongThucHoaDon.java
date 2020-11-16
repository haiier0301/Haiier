package store;

import java.util.Arrays;
import java.util.Scanner;

public class PhuongThucHoaDon extends HoaDon {
	HoaDon []arr;
	private int n=0;

	private  long DoanhThuNgay;
	private  long DoanhThuThang;
	private long DoanhThuSP;
	private  long DoanhThuNam;
	private int XemDoanhThuNgay;
	private String XemDoanhThuSP;
	private int XemDoanhThuThang;
	private int XemDoanhThuNam;
	
	Scanner sc=new Scanner(System.in);

	public PhuongThucHoaDon()
	{
		super();
		arr=null;
		n=0;
		this.XemDoanhThuSP=null;
		this.XemDoanhThuNgay=0;
		this.XemDoanhThuThang=0;
		this.XemDoanhThuNam=0;
	}
	public PhuongThucHoaDon(String idBill,int Amount,int DayBuy,int MounthBuy,int YearBuy,String Pay,int XemDoanhThuNgay, int XemDoanhThuThang,int XemDoanhThuNam,String XemDoanhThuSP) {
		this.XemDoanhThuNgay=XemDoanhThuNgay;
		this.XemDoanhThuThang=XemDoanhThuThang;
		this.XemDoanhThuSP=XemDoanhThuSP;
		this.XemDoanhThuNam=XemDoanhThuNam;
	}
    public void nhapdsHoaDon() 
    {
    	boolean check= false;
    	System.out.println("-----Nhập vào số hóa đơn cần tạo :-----");
		 while(!check){
	          System.out.print(" ");
	          try{
	        	  n=sc.nextInt();
	        	  check= true;
	          }catch(Exception e){
	              System.out.println("Ban phải nhập số! vui lòng nhập lại...");
	              sc.nextLine();
	          }
        arr=new HoaDon[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhập vào hóa đơn thứ:" +(i+1));
           HoaDon a=new HoaDon();
            a.taoHoaDon();
            arr[i]=a;
         }
    }
    }
	
	public void xuatdsHoaDon()
	{
		    System.out.println("*******************************__Danh sách hóa đơn vừa nhập__************************************");
	        System.out.println("+-----------------------------------------------------------------------------------------------+");
	     
	        for(int i=0;i<n;i++)
	        {
	    	
	       
	           
	        	System.out.println("-Hóa Đơn Thứ  " + (i+1));
		        arr[i].TongBill();
	            arr[i].xuatHoaDon();
	        
	        }
	}
	   public void timkiemHoaDon()
	    {
	        System.out.println("Nhập vào mã hóa đơn cần tìm:");
	        String mahoadon=sc.next();
	        int t=arr.length;
	        int i;
	        for( i=0; i<t; i++) {
	       	if(arr[i].getIdBill().equalsIgnoreCase(mahoadon))
		{
					System.out.println("Hóa Đơn cần tìm:");
				   arr[i].xuatHoaDon();
				   break;
		}
	           
	        }
	        if(i==t)
	         {
		          System.out.println("Không tìm thấy hóa đơn cần tìm");
		     }
	    }
	   public void themHoaDon()
	    {
	        System.out.println("Nhập vào hóa đơn cần thêm:");
	        HoaDon hd=new HoaDon();
	        hd.taoHoaDon();
	        arr = Arrays.copyOf(arr, arr.length +1); 
	        arr[n]=hd;
	        n++;        
	        System.out.println("\nDanh sách hóa đơn Sau khi thêm ta có:");
	        for(int i=0 ;i<n ;i++)
	        {
	        	System.out.println("\n\n ____Hóa Đơn thứ " + (i+1));
	        	arr[i].TongBill();
	        	arr[i].xuatHoaDon();
	        	
	        }
	    }
	   public void xoaHoaDon() {
	    	System.out.println("Nhập vào mã hóa đơn cần xóa:");
	        String mahd=sc.next();
	        int k=0;
	        boolean [] deleteItem = new boolean[arr.length];
	        int size=0;
	        for(int i=0;i<arr.length;i++){
	           if(arr[i].getIdBill().equalsIgnoreCase(mahd)){
	        	
	        	k=1;
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
	        if(k==1) {
	        System.out.println("\nDanh sách hóa đơn sau khi xóa ta có:");
	        for(int i=0 ;i<index ;i++)
	        {
	        	System.out.println("\n\n ____Hóa Đơn thứ " + (i+1));
	        	newArr[i].TongBill();
	        	newArr[i].xuatHoaDon();
	        	
	        }}
	        else {
	        	System.out.println("\nKhông thấy mã hóa đơn cần xóa!!!");
	        }
	    	}
	   public void suaHoaDon()
	   {
		   System.out.println("Nhập vào mã hóa đơn cần sửa :");
		   String Mahd=sc.next();
		   int c;
		   for(int i=0;i<arr.length;i++)
	   {
			   if(arr[i].getIdBill().equalsIgnoreCase(Mahd))
			   {
				 
				    
				    do {
				    	   System.out.println("__Nhập vào phần muốn sửa: ");
				    	  
				    	   System.out.println("1. Sửa mã hóa đơn ");
						      System.out.println("2. Sửa mã laptop");
						      System.out.println("3. Sửa mã khách hàng");
						      System.out.println("4. Sửa tên khách hàng");
						      System.out.println("5. Sửa tên laptop");
						      System.out.println("6. Sửa giá laptop");
						      System.out.println("7. Sửa số lượng laptop");
						      System.out.println("8. Sửa ngày bán laptop");
						      System.out.println("9. Sửa tháng bán laptop");
						      System.out.println("10. Sửa năm bán laptop");
						      System.out.println("11. Thoát chương trình!!");
						      c= sc.nextInt(); 
				
				  
				   	switch(c)
					{
				
					case 1:{
						System.out.println("Nhập vào mã hóa đơn mới:");
						String mahdmoi=sc.next();
						arr[i].setIdBill(mahdmoi);
						System.out.println("\n Hoá đơn sau khi sửa : ");
						arr[i].xuatHoaDon();
						break;
					}
						
					case 2:{
						System.out.println("Nhập vào mã laptop cần sửa:");
						String maltmoi=sc.next();
						arr[i].idLaptop=maltmoi;
						System.out.println("Hóa dơn sau khi sửa :");
						arr[i].xuatHoaDon();
						break;
					}
					case 3:
					{
						System.out.println("Nhập vào mã khách hàng cần sửa:");
						String makhmoi=sc.next();
						arr[i].idSupplier=makhmoi;
						System.out.println("Hóa dơn sau khi sửa :");
						arr[i].xuatHoaDon();
						break;
					}
					case 4:
					{
						System.out.println("Nhập vào tên khách hàng mới:");
						String tenkhmoi=sc.next();
						arr[i].nameSupplier=tenkhmoi;
						System.out.println("Hóa dơn sau khi sửa :");
						arr[i].xuatHoaDon();
						break;
					}
					case 5:
					{
						System.out.println("Nhập vào tên laptop mới:");
						String tenltmoi=sc.next();
						arr[i].nameLaptop=tenltmoi;
						System.out.println("Hóa dơn sau khi sửa :");
						arr[i].xuatHoaDon();
						break;
					}
					case 6:
					{
						System.out.println("Nhập vào giá laptop mới:");
						long gialtmoi=sc.nextLong();
						arr[i].price=gialtmoi;
						System.out.println("Hóa dơn sau khi sửa :");
						arr[i].TongBill();
						arr[i].xuatHoaDon();
						break;
					}
					
					case 7:
					{
						System.out.println("Nhập vào số lượng laptop mới:");
					int  slltmoi=sc.nextInt();
						arr[i].setAmount(slltmoi);
						System.out.println("Hóa dơn sau khi sửa :");
						arr[i].xuatHoaDon();
						break;
					}
					case 8:
					{
						System.out.println("Nhập vào ngày bán laptop mơí:");
						int daymoi=sc.nextInt();
						arr[i].setDayBuy(daymoi);
						System.out.println("Hóa dơn sau khi sửa :");
						arr[i].xuatHoaDon();
						break;
					}
					case 9:
					{
						System.out.println("Nhập vào tháng  mơí:");
						int thangmoi=sc.nextInt();
						arr[i].setDayBuy(thangmoi);
						System.out.println("Hóa dơn sau khi sửa :");
						arr[i].xuatHoaDon();
						break;
					}
					case 10:
					{
						System.out.println("Nhập vào năm bán laptop mơí:");
						int nammoi=sc.nextInt();
						arr[i].setYearBuy(nammoi);
						System.out.println("Hóa dơn sau khi sửa :");
						arr[i].xuatHoaDon();
						break;
					}
					case 11:
					{
						System.out.println("\n Chương trình đang thoát!!!");
						break;
					}
					 
				   
				  
			   } }  while(c!=11 || c<1);
	   }
			   else{ 
			   System.out.println("Không tìm thấy hóa đơn cần sửa!");
	   }
	   }
	   }
	       
	   public void nhapDoanhThuNgay() {
			
			System.out.println("Nhập vào ngày xem doanh thu:");
			XemDoanhThuNgay=sc.nextInt();
		}
		public void nhapDoanhThuThang() {
			
			System.out.println("Nhập vào tháng muốn xem doanh thu:");
			XemDoanhThuThang=sc.nextInt();
		}
		public void nhapDoanhThuNam() {
			
			System.out.println("Nhập vào năm muốn xem doanh thu:");
			XemDoanhThuNam=sc.nextInt();
		}
		public void nhapDoanhSP() {
			
			System.out.println("Nhập vào tên sản phẩm muốn xem doanh thu:");
			XemDoanhThuSP=sc.nextLine();
		}
		public void TongDoanhThuNgay() {
                int m=0;
			for(int i=0;i<arr.length;i++)
			 {
				if(arr[i].getDayBuy()==XemDoanhThuNgay)
				{
					m=1;
				DoanhThuNgay+=arr[i].TongBill();
			    }
		     }if(m==1) {
			System.out.println("Doanh thu của ngày " + XemDoanhThuNgay + " : " + DoanhThuNgay);
		}
		     else {
		    	 System.out.println("\n Không tìm thấy ngày đã bán !!");
		     }
		}
		public void TongDoanhThuThang() {
			int m=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i].getMounthBuy()==XemDoanhThuThang)
				{
					m=1;
					DoanhThuThang+=arr[i].TongBill();
			
				}
			}if(m==1) {	
			System.out.println("Doanh thu của tháng " + XemDoanhThuThang + " : " + DoanhThuThang);
		
			}else {
				System.out.println("\n Không tìm thấy tháng đã bán  !!");
			}
		}
		public void TongDoanhThuNam() {
			int m=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i].getYearBuy()==XemDoanhThuNgay) {
				
					m=1;
					DoanhThuNam+=arr[i].TongBill();
				}
			}if(m==1) {	
			System.out.println("Doanh thu của năm " + XemDoanhThuNam + " : " + DoanhThuNam);
		   }else {
			   System.out.println("\n Không tìm thấy năm đã bán  !!");
		   }
		}
		public void TongDoanhThuSP() {
			int m=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i].getNameLaptop().equalsIgnoreCase(XemDoanhThuSP)) {
					DoanhThuSP+=arr[i].TongBill();

					m=1;
				}
			}if(m==1) {	
			System.out.println("Doanh thu theo sản phẩm có tên  " + XemDoanhThuNam + " : " + DoanhThuNam);
		    }else {
		    	  System.out.println("\n Không tìm thấy tên sản phẩm đã bán  !!");
		    	
		    }
		}
		public void XemDoanhThu( PhuongThucHoaDon pt)
		{
			int choice;
		
			 do {
		    	   System.out.println("Xem doanh thu theo: ");
		    	  
		    	   System.out.println("1. Doanh thu theo ngày ");
				      System.out.println("2. Doanh thu the tháng");
				      System.out.println("3. Doanh thu theo năm");
				      System.out.println("4. Doanh thu theo tên sản phẩm");
				     System.out.println("5. Thoát chương trình!!");
				      choice= sc.nextInt();
				      switch(choice) {
				    
				      case 1:{
				    	  pt.nhapDoanhThuNgay();
				    	  pt.TongDoanhThuNgay();
				    	  break;
				      }
				      case 2:{
				    	  pt.nhapDoanhThuThang();
				    	  pt.TongDoanhThuThang();
				    	  break;
				      }
				      case 3:{
				    	  pt.nhapDoanhThuNam();
				    	  pt.TongDoanhThuNam();
				    	  break;
				      }
				      case 4:{
				    	  pt.nhapDoanhSP();
				    	  pt.TongDoanhThuSP();
				    	  break;
				      }
				      case 5:{
				    	  System.out.println("\n Chương trình đang thoát!!!");
							break;
				      }
				      }
			 }while(choice!=5 || choice<1);
		
		  
		}
	public static void main(String[] args)
	{
		PhuongThucHoaDon pthd=new PhuongThucHoaDon();
		pthd.nhapdsHoaDon();
		pthd.xuatdsHoaDon();
		pthd.timkiemHoaDon();
		pthd.themHoaDon();
		pthd.xoaHoaDon();
	    pthd.XemDoanhThu(pthd);
		pthd.suaHoaDon();
	}
}
