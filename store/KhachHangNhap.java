package store;

import java.util.Scanner;

public class KhachHangNhap {
	Scanner sc=new Scanner(System.in);
	public String customerID;
	public String customerName;
	public String customerAddress;
	public String customerPhone;
	public String dayPurchase; //ngày mua hàng
	
	public KhachHangNhap() {
		this.customerID=null;
		this.customerName=null;
		this.customerAddress=null;
		this.customerPhone=null;
		this.dayPurchase=null;
	}
	// kh?i t?o constructor có tham s?
	public KhachHangNhap(String customerID, String customerName, String customerAddress, String customerPhone, String dayPurchase){
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerPhone = customerPhone;
		this.dayPurchase = dayPurchase;
	}
	// get and set
		public String getCustomerID() {
			return customerID;
		}
		public String getCustomerName() {
			return customerName;
		}
		public String getCustomerAddress() {
			return customerAddress;
		}
		public String getCustomerPhone() {
			return customerPhone;
		}
		public String getDayPurchase() {
			return dayPurchase;
		}
		public void setCustomerID(String customerID){
			this.customerID = customerID;
		}
		public void setCustomerName(String customerName){
			this.customerName = customerName;
		}
		public void setCustomerAddress(String customerAddress){
			this.customerAddress = customerAddress;
		}
		public void setCustomerPhone(String customerPhone){
			this.customerPhone = customerPhone;
		}
		public void setDayPurchase(String dayPurchase){
			this.dayPurchase = dayPurchase;
		}
	public void nhapThongTinKH() {
		System.out.println("__________Nhập thông tin khách hàng__________");
		System.out.println("*******************************\n");
		System.out.println("-Hãy nhập vào mã khách hàng: \n");
		customerID=sc.nextLine();
		System.out.println("-Hãy nhập vào tên khách hàng: \n");
		customerName=sc.nextLine();
		System.out.println("-Hãy nhập vào địa chỉ khách hàng: \n");
		customerAddress=sc.nextLine();
		System.out.println("-Hãy nhập vào sđt khách hàng: \n");
		customerPhone=sc.nextLine();
		System.out.println("-Hãy nhập vào ngày mua hàng: \n");
		dayPurchase=sc.nextLine();
	    }
		//xuat hoa don
	public void xuatThongTinKH() {
		System.out.println("\n**************************************************____Danh sách Khách Hàng___**************************************************");
		System.out.println("=========================================================================================================================");
		System.out.println("|     Mã Khách Hàng      |       Tên Khách Hàng      |      Địa chỉ     |         Số điện thoại       |        Ngày mua hàng      |");
		System.out.printf(" \t%-25s%-20s%-25s%-32s%-22s",customerID,customerName,customerAddress,customerPhone,dayPurchase);
	}
	//hàm main
	public static void main(String[] args)
	{
		KhachHangNhap kh=new KhachHangNhap();
		kh.nhapThongTinKH();
		kh.xuatThongTinKH();
	}
}
