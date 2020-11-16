package store;

import java.util.Scanner;

public class taikhoan extends NhanVien{
    private String username;
    private String password;
    Scanner sc= new Scanner(System.in);
    
    public taikhoan() {
        this.username = null;
        this.password = null;
        super();
    }

    public taikhoan(String username, String password, String TenNV, String MaNV, String Sdt, String ChucVu){
        username= username;
        password= password;
        super(TenNV, MaNV, Sdt, ChucVu);

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return username.toString();
    }

    public void taoTaikhoan() {
        System.out.println("__________TẠO TÀI KHOẢN__________");
		System.out.println("*******************************");
        System.out.println("-Hãy nhập vào tên tài khoản: ");
        username=sc.nextLine();
        System.out.println("-Hãy nhập vào mật khẩu: ");
        password=sc.nextLine();
    }    
    public void xuatTaikhoan() {
		System.out.println("\n**************************************************____Hóa Đơn LapTop___**************************************************");
		System.out.println("=========================================================================================================================");
		System.out.println("|     Mã Nhân Viên      |       Tên Tài Khoản      |      Mật Khẩu     |         Tên Nhân Viên       |        Số Điện Thoại      |      Chức Vụ     |");
		System.out.printf(" \t%-25s%-20s%-25s%-32s%-22s%-28d",super.MaNV,username,password,super.TenNV,super.Sdt,super.ChucVu);
}
