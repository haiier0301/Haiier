package store;

import java.util.Scanner;

public class KhuyenMai extends Laptop {
	Scanner sc = new Scanner(System.in);
	private static  String DaybeginPromo="20/11/2020"; //ngày bắt đầu khuyến mãi
	private static String DayendPromo="29/11/2020"; //ngày kết thúc khuyến mãi
	private static String Gift="Chuột không dây"; //quà tặng kèm
	private static String Discount="20%"; //giảm giá
	private float Sale;
	/*
	public KhuyenMai()
	{

		this.DaybeginPromo="20/11/2020";
		this.DayendPromo="29/11/2020";
		this.Gift="Chuột không dây";
		this.Discount="20%";
	}
	
	public String getDaybeginPromo() {
		return DaybeginPromo;
	}
	public void setDaybeginPromo(String daybeginPromo) {
		this.DaybeginPromo = daybeginPromo;
	}
	public String getDayendPromo() {
		return DayendPromo;
	}
	public void setDayendPromo(String dayendPromo) {
		this.DayendPromo = dayendPromo;
	}
	public String getGift() {
		return Gift;
	}
	public void setGift(String gift) {
		Gift = gift;
	}
	public String getDiscount() {
		return Discount;
	}
	public void setDiscount(String discount) {
		Discount = discount;
	}*/
	public void nhapKhuyenMai()
	{
		System.out.println("Hãy nhập vào ngày bắt đầu khuyến mãi:");
		DaybeginPromo=sc.nextLine();
		System.out.println("Hãy nhập vào ngày kết thúc khuyến mãi:");
		DayendPromo=sc.nextLine();
		System.out.println("Hãy nhập vào quà khuyến mãi:");
		Gift=sc.nextLine();
		System.out.println("Hãy nhập vào giá trị % giảm giá:");
		Sale=sc.nextFloat();
	}
	public  void DiscountPrice()
	{
		super.price=(long)((super.price)- (super.price*((this.Sale)/100)));
	}
	
	public static void main(String [] args)
	{
		Login lg=new Login();
		KhuyenMai km=new KhuyenMai();
		if(lg.username=="admin") {
		km.nhapKhuyenMai();
		}else {
	break;
		}
		System.out.println("*************************__CHƯƠNG TRÌNH KHUYẾN MÃI__**************************");
		System.out.println("|     Ngày bắt đầu khuyến mãi    |     Ngày kết thúc khuyến mãi     |    Quà tặng kèm    |     Sale(%)      |");
		System.out.printf(" \t%-30s%-33s%-28s%-32s",DaybeginPromo,DayendPromo,Gift,Discount);

		
        
	}
	
	
}
