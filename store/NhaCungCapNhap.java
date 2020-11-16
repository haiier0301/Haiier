package store;

import java.util.Scanner;

public class NhaCungCapNhap {
	public String supplierID;
	public String supplierName;
	public String supplierAddress;
	public String supplierPhone;
	Scanner scanner = new Scanner(System.in);
	
	// kh?i t?o constructor m?c d?nh
	public NhaCungCapNhap(){
		this.supplierID=null;
		this.supplierName=null;
		this.supplierAddress=null;
		this.supplierPhone=null;
	}
	
	// kh?i t?o constructor có tham s?
	public NhaCungCapNhap(String supplierID, String supplierName, String supplierAddress, String supplierPhone){
		this.supplierID = supplierID;
		this.supplierName = supplierName;
		this.supplierAddress = supplierAddress;
		this.supplierPhone = supplierPhone;
	}
	 
	// get and set	
	public String getSupplierID() {
		return supplierID;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public String getSupplierAddress() {
		return supplierAddress;
	}
	public String getSupllierPhone() {
		return supplierPhone;
	}
	public void setSupplierID(String supplierID){
		this.supplierID = supplierID;
	}
	public void setSupplierName(String supplierName){
		this.supplierName = supplierName;
	}
	public void setSupplierAddress(String supplierAddress){
		this.supplierAddress = supplierAddress;
	}
	public void setSupllierPhone(String supplierPhone){
		this.supplierPhone = supplierPhone;
	}
	public void nhapNhaCungCap() {
		System.out.print("Nhap ma nha cung cap: ");
		supplierID = scanner.nextLine();
		System.out.print("Nhap ten nha cung cap: ");
		supplierName = scanner.nextLine();
		System.out.print("Nhap dia chi nha cung cap: ");
		supplierAddress = scanner.nextLine();
		System.out.print("Nhap So dien thoai nha cung cap: ");
		supplierPhone = scanner.nextLine();
	}
	//xuat
	public void xuatNhaCungCap() {
		System.out.println("\n**************************************************____Danh sách nhà cung cấp___**************************************************");
		System.out.println("=========================================================================================================================");
		System.out.println("|     Mã Nhà cung chấp     |       Tên Nhà cung chấp      |      Địa chỉ nhà cung cấp     |         Số điện thoại nhà cung cấp       |");
		System.out.printf(" \t%-25s%-32s%-28d%-15s",supplierID,supplierName,supplierAddress,supplierPhone);
	}
	public static void main(String[] args)
	{
		NhaCungCapNhap ncc=new NhaCungCapNhap();
		ncc.nhapNhaCungCap();
		ncc.xuatNhaCungCap();
	}
}