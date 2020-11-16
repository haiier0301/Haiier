package store;


import java.util.Scanner;

public class LoaiThietBiNhap {
	public String equipmentID;
	public String equipmentName;
	public String equipmentUnit;
	public String equipmentNote;
	Scanner scanner = new Scanner(System.in);
	
	
	// kh?i t?o constructor m?c d?nh
	public LoaiThietBiNhap(){
		this.equipmentID=null;
		this.equipmentName=null;
		this.equipmentUnit=null;
		this.equipmentNote=null;
	}
	
	// kh?i t?o constructor có tham s?
	public LoaiThietBiNhap(String equipmentID, String equipmentName, String equipmentUnit, String equipmentNote){
		this.equipmentID = equipmentID;
		this.equipmentName = equipmentName;
		this.equipmentUnit = equipmentUnit;
		this.equipmentNote = equipmentNote;
	}
	 
	// get and set	
	public String getEquipmentID() {
		return equipmentID;
	}
	public String getEquipmentName() {
		return equipmentName;
	}
	public String getEquipmentUnit() {
		return equipmentUnit;
	}
	public String getEquipmentNote() {
		return equipmentNote;
	}
	public void setEquipmentID(String equipmentID){
		this.equipmentID = equipmentID;
	}
	public void setEquipmentName(String equipmentName){
		this.equipmentName = equipmentName;
	}
	public void setEquipmentUnit(String equipmentUnit){
		this.equipmentUnit = equipmentUnit;
	}
	public void setEquipmentNote(String equipmentNote){
		this.equipmentNote = equipmentNote;
	}
	public void nhapLoaiThietBi() {
		System.out.println("__________Nhập thông tin thiết bị__________");
		System.out.println("*******************************\n");
		System.out.print("Nhập mã loại thiết bị: \n");
		equipmentID = scanner.nextLine();
		System.out.print("Nhập tên loại thiết bị: \n");
		equipmentName = scanner.nextLine();
		System.out.print("Nhập đơn vị tính: \n");
		equipmentUnit = scanner.nextLine();
		System.out.print("Nhập ghi chú: \n");
		equipmentNote = scanner.nextLine();
	}
	//xuat hoa don
	public void xuatLoaiThietBi() {
		System.out.println("\n**************************************************____Danh sách Khách Hàng___**************************************************");
		System.out.println("=========================================================================================================================");
		System.out.println("|     Mã Loại Thiết Bị      |       Tên loại thiết bị      |      Đơn vị tính     |         Ghi chú       |");
		System.out.printf(" \t%-25s%-20s%-25s%-22s",equipmentID,equipmentName,equipmentUnit,equipmentNote);
	}
	//hàm main
	public static void main(String[] args){
		LoaiThietBiNhap ltb=new LoaiThietBiNhap();
		ltb.nhapLoaiThietBi();
		ltb.xuatLoaiThietBi();
	}
}