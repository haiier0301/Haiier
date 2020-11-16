package store;

import java.util.Scanner;

public  class HoaDon extends Laptop {
	Scanner sc=new Scanner(System.in);
	private String idBill;
	private int Amount;
	private int DayBuy; //ngày bán
	private int MounthBuy;
	private int YearBuy;
	public long TotalBill=0;// Tổng giá trị hóa đơn
	//private String idCustomer;// mã khách hàng
	private String Pay;// phuong thuc thanh toan
	
	public HoaDon()
	{
		super();
		this.idBill=null;
		this.Amount=0;
		this.DayBuy=0;
		this.MounthBuy=0;
		this.YearBuy=0;
		this.Pay=null;
	}
	public HoaDon(String brand, String idLaptop, String nameLaptop, String idSupplier,long price, String ram, String cpu, String moniter, String battery, String opSystem,String idBill, int Amount,String Pay,String nameSupplier,int DayBuy,int MounthBuy,int YearBuy){
		super(brand,idLaptop,nameLaptop,idSupplier,price,ram,cpu,moniter,battery,opSystem,nameSupplier);
		this.idBill=idBill;
		this.Amount=Amount;
		this.MounthBuy=MounthBuy;
		this.YearBuy=YearBuy;
		this.Pay=Pay;
		this.DayBuy=DayBuy;
	}
	public int getMounthBuy() {
		return MounthBuy;
	}
	public void setMounthBuy(int mounthBuy) {
		MounthBuy = mounthBuy;
	}
	public int getYearBuy() {
		return YearBuy;
	}
	public void setYearBuy(int yearBuy) {
		YearBuy = yearBuy;
	}
	public String getIdBill() {
		return idBill;
	}
	public void setIdBill(String idBill) {
		this.idBill = idBill;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public int getDayBuy() {
		return DayBuy;
	}
	public void setDayBuy(int daybuy) {
		DayBuy = daybuy;
	}
	public String getPay() {
		return Pay;
	}
	public void setPay(String pay) {
		Pay = pay;
	}
	public void taoHoaDon() {
		System.out.println("__________TẠO HÓA ĐƠN__________");
		System.out.println("*******************************");
		System.out.println("-Hãy nhập vào mã hóa đơn: ");
		idBill=sc.nextLine();
		System.out.println("-Hãy nhập vào mã Laptop : ");
		super.idLaptop=sc.nextLine();
		System.out.println("-Hãy nhập vào mã khách hàng: ");
		super.idSupplier=sc.nextLine();
		System.out.println("-Hãy nhập vào tên khách hàng: ");
		super.nameSupplier=sc.nextLine();
		System.out.println("-Hãy nhập vào tên Laptop: ");
		super.nameLaptop=sc.nextLine();
		System.out.println("-Hãy nhập vào giá Laptop: ");
		super.price=sc.nextLong();
	    System.out.println("-Hãy nhập vào số lượng Laptop: ");
		Amount=sc.nextInt();
		System.out.println("-Hãy nhập vào ngày bán Laptop: ");
	     DayBuy=sc.nextInt();
	     System.out.println("-Hãy nhập vào tháng đã bán Laptop: ");
	     MounthBuy=sc.nextInt();
	     System.out.println("-Hãy nhập vào năm bán Laptop: ");
	     YearBuy=sc.nextInt();
	      
		 }
	public void xuatHoaDon() {
		System.out.println("\n**************************************************____Hóa Đơn LapTop___**************************************************");
		System.out.println("=========================================================================================================================");
		System.out.println("|     Mã Hóa Đơn      |       Mã Laptop      |      Mã Khách Hàng     |         Tên Laptop       |        Tên Khách Hàng      |      Giá Laptop(vnd)     |     Số Lượng    |    Ngày bán Sp   |    Tháng bán Sp   |     Năm bán Sp   |");
		System.out.printf(" \t%-25s%-22s%-25s%-32s%-22s%-28d%-20d%-20d%-20d%-15d",idBill,super.idLaptop,super.idSupplier,super.nameLaptop,super.nameSupplier,super.price,Amount,DayBuy,MounthBuy,YearBuy);
		System.out.println("\n Tổng Giá Trị Hóa Đơn = " + TongBill());
	}
	public   long TongBill()
	{
		TotalBill=Amount*super.price;
		return TotalBill;
	}
	public static void main(String[] args)
	{
		HoaDon hd=new HoaDon();
		hd.taoHoaDon();
		hd.TongBill();
		hd.xuatHoaDon();
	}
}
