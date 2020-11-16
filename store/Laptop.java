package store;

public class Laptop {

    public String ram;
    public String cpu;
    public String moniter;
    public String opSystem;
    public String battery;
    public String gpu;
    public String disk;

    public String nameLaptop;
    public String idLaptop;
    public String nameSupplier;
    public String idSupplier;
    public String brand;
    public long price;
    public int amount;
    
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getMoniter() {
		return moniter;
	}
	public void setMoniter(String moniter) {
		this.moniter = moniter;
	}
	public String getOpSystem() {
		return opSystem;
	}
	public void setOpSystem(String opSystem) {
		this.opSystem = opSystem;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	public String getDisk() {
		return disk;
	}
	public void setDisk(String disk) {
		this.disk = disk;
	}
	public String getNameLaptop() {
		return nameLaptop;
	}
	public void setNameLaptop(String nameLaptop) {
		this.nameLaptop = nameLaptop;
	}
	public String getIdLaptop() {
		return idLaptop;
	}
	public void setIdLaptop(String idLaptop) {
		this.idLaptop = idLaptop;
	}
	public String getNameSupplier() {
		return nameSupplier;
	}
	public void setNameSupplier(String nameSupplier) {
		this.nameSupplier = nameSupplier;
	}
	public String getIdSupplier() {
		return idSupplier;
	}
	public void setIdSupplier(String idSupplier) {
		this.idSupplier = idSupplier;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Laptop(String ram, String cpu, String moniter, String opSystem, String battery, String gpu, String disk,
			String nameLaptop, String idLaptop, String nameSupplier, String idSupplier, String brand, long price,
			int amount) {
		this.ram = ram;
		this.cpu = cpu;
		this.moniter = moniter;
		this.opSystem = opSystem;
		this.battery = battery;
		this.gpu = gpu;
		this.disk = disk;
		this.nameLaptop = nameLaptop;
		this.idLaptop = idLaptop;
		this.nameSupplier = nameSupplier;
		this.idSupplier = idSupplier;
		this.brand = brand;
		this.price = price;
		this.amount = amount;
	}
    
	@Override
	public String toString() {
		return "Laptop [Mã Laptop=" + idLaptop + ", Tên Laptop=" + nameLaptop + ", Thương Hiệu=" + brand + ", CPU=" + cpu + ", Màn Hình=" + moniter + ", RAM=" + ram + ", GPU=" + gpu + ", Lưu Trữ=" + disk + ", Hệ Điều Hàng=" + opSystem + ", Pin="+ battery + ", Mã nhà cung cấp=" + idSupplier + ", nameSupplier=" + nameSupplier + ", Số Lượng=" + amount+ ", Giá Thành=" + price + "]";
	}
  
}