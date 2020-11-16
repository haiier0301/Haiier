package store;

import java.util.Scanner;

public class NhanVienNhap {
	public String staffID;
	public String staffName;
	public String staffAddress;
	public String staffPhone;
	public String staffPosition;
	public int hoursWorked;
	protected int safary, safaryNormal, safaryBonus;
	Scanner scanner = new Scanner(System.in);
	
	
	// kh?i t?o constructor m?c d?nh
	public NhanVienNhap(){
		this.staffID=null;
		this.staffName=null;
		this.staffAddress=null;
		this.staffPhone=null;
		this.staffPosition=null;
		this.safary=0;
		this.safaryNormal=0;
		this.hoursWorked=0;
	}
	
	// kh?i t?o constructor có tham s?
	public NhanVienNhap(String staffID, String staffName, String staffAddress, String staffPhone, String staffOld, String staffPosiion,int hoursWorked,
	int safary, int safaryNormal){
		this.staffID = staffID;
		this.staffName = staffName;
		this.staffAddress = staffAddress;
		this.staffPhone = staffPhone;
		this.staffPosition = staffPosition;
		this.safary = safary;
		this.safaryNormal = safaryNormal;
		this.hoursWorked = hoursWorked;
	}
	 
	// get and set	
	public String getStaffID() {
		return staffID;
	}
	public String getStaffName() {
		return staffName;
	}
	public String getStaffAddress() {
		return staffAddress;
	}
	public String getStaffPhone() {
		return staffPhone;
	}
	public int getSafary() {
		return safary;
	}
	public int getSafaryNormal() {
		return safaryNormal;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public String getStaffPosition() {
		return staffPosition;
	}
	public void setStaffID(String staffID){
		this.staffID = staffID;
	}
	public void setStaffName(String staffName){
		this.staffName = staffName;
	}
	public void setStaffAddress(String staffAddress){
		this.staffAddress = staffAddress;
	}
	public void setStaffPhone(String staffPhone){
		this.staffPhone = staffPhone;
	}
	public void setStaffSafary(int safary){
		this.safary = safary;
	}
	public void setStaffSafaryNormal(int safaryNormal){
		this.safaryNormal = safaryNormal;
	}
	public void setStaffPosition(String staffPosition){
		this.staffPosition = staffPosition;
	}
	public void setHoursWorked(int hoursWorked){
		this.hoursWorked = hoursWorked;
	}


	public void nhapNhanVien() {
		System.out.print("Nhap ma nhan vien: ");
		staffID = scanner.nextLine();
		System.out.print("Nhap ten nhan vien: ");
		staffName = scanner.nextLine();
		System.out.print("Nhap dia chi nhan vien: ");
		staffAddress = scanner.nextLine();
		System.out.print("Nhap So dien thoai nhan vien: ");
		staffPhone = scanner.nextLine();
		System.out.print("Nhap chức vụ nhan vien: ");
		staffPosition = scanner.nextLine();
		System.out.print("Nhap luong co ban nhan vien: ");
		safaryNormal = scanner.nextInt();
		System.out.print("Nhập số giờ làm việc");
		hoursWorked = scanner.nextInt();
	}
	public void xuatNhanVien() {
		System.out.println("\n**************************************************____Danh sách nhân viên___**************************************************");
		System.out.println("=========================================================================================================================");
		System.out.println("|     Mã nhân viên      |       Tên      |      Địa chỉ     |         Số điện thoại       |        Chức vụ      |      Lương theo giờ     |     Số giờ làm    |    Lương tổng   |");
		System.out.printf(" \t%-25s%-20s%-25s%-32s%-22s%-28d%-15d%-15s",staffID,staffName,staffAddress,staffPhone,staffPosition,safaryNormal,hoursWorked,safary);
	}
	
	// tinh luong
	public void tinhLuong() {
		safary=safaryNormal*hoursWorked;
	}
	public static void main(String[] args)
	{
		NhanVienNhap nv=new NhanVienNhap();
		nv.nhapNhanVien();
		nv.tinhLuong();
		nv.xuatNhanVien();
	}
}
	
	