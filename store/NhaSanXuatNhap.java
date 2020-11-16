package store;
import java.util.Scanner;


public class NhaSanXuatNhap {
	public String producerID;
	public String producerName;
	public String producerCountry;
	public String producerMail;
	Scanner scanner = new Scanner(System.in);
	
	// kh?i t?o constructor m?c d?nh
	public NhaSanXuatNhap(){
		this.producerID=null;
		this.producerName=null;
		this.producerCountry=null;
		this.producerMail=null;
	}
	
	// kh?i t?o constructor có tham s?
	public NhaSanXuatNhap(String producerID, String producerName, String producerCountry, String producerMail){
		this.producerID = producerID;
		this.producerName = producerName;
		this.producerCountry = producerCountry;
		this.producerMail = producerMail;
	}
	 
	// get and set	
	public String getProducerID() {
		return producerID;
	}
	public String getProducerName() {
		return producerName;
	}
	public String getProducerCountry() {
		return producerCountry;
	}
	public String getProducerMail() {
		return producerMail;
	}
	public void setProducerID(String producerID){
		this.producerID = producerID;
	}
	public void setProducerName(String producerName){
		this.producerName = producerName;
	}
	public void setProducerCountry(String producerCountry){
		this.producerCountry = producerCountry;
	}
	public void setProducerMail(String producerMail){
		this.producerMail = producerMail;
	}
	public void nhapNhaSanXuat() {
		System.out.print("Nhap ma nha san xuat: ");
		producerID = scanner.nextLine();
		System.out.print("Nhap ten nha san xuat: ");
		producerName = scanner.nextLine();
		System.out.print("Nhap quoc gia nha san xuat:: ");
		producerCountry = scanner.nextLine();
		System.out.print("Nhap Mail nha suan xuat: ");
		producerMail = scanner.nextLine();
	}
	//xuat
		public void xuatNhaSanXuat() {
			System.out.println("\n**************************************************____Danh sách nhà sản xuất___**************************************************");
			System.out.println("=========================================================================================================================");
			System.out.println("|     Mã Nhà sản xuất	     |       Tên Nhà sản xuất      |      Địa chỉ nhà sản xuất     |         Email nhà sản xuất       |");
			System.out.printf(" \t%-25s%-32s%-28d%-15s",producerID,producerName,producerCountry,producerMail);
		}
		public static void main(String[] args)
		{
			NhaSanXuatNhap nsx=new NhaSanXuatNhap();
			nsx.nhapNhaSanXuat();
			nsx.xuatNhaSanXuat();
		}
	}

	
