package store;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LaptopFile {
    public static void writeLaptop(){
        try {

            FileOutputStream fOut = new FileOutputStream("data.txt");
            ObjectOutputStream loo = new ObjectOutputStream(fOut);
    
            Laptop  LaptopArr[]={
                new Laptop("EJ155T","Laptop ASUS 15 X509FJ","ASUS ","Intel Core i5-8265U","15.6 inch (1920 x 1080)","4GB Onboard DDR4 2400MHz","NVIDIA GeForce MX230 2GB GDDR5 / Intel UHD Graphics 620","512GB SSD M.2 NVMe ","Windows 10 Home SL 64-bit","2 cell 32 Wh","A","Công Ty A",3,15490000),
                new Laptop("EJ155T","Laptop ASUS 15 X509FJ","ASUS ","Intel Core i5-8265U","15.6 inch (1920 x 1080)","4GB Onboard DDR4 2400MHz","NVIDIA GeForce MX230 2GB GDDR5 / Intel UHD Graphics 620","512GB SSD M.2 NVMe ","Windows 10 Home SL 64-bit","2 cell 32 Wh","A","Công Ty A",3,15490000),
                new Laptop("EJ155T","Laptop ASUS 15 X509FJ","ASUS ","Intel Core i5-8265U","15.6 inch (1920 x 1080)","4GB Onboard DDR4 2400MHz","NVIDIA GeForce MX230 2GB GDDR5 / Intel UHD Graphics 620","512GB SSD M.2 NVMe ","Windows 10 Home SL 64-bit","2 cell 32 Wh","A","Công Ty A",3,15490000),
                new Laptop("EJ155T","Laptop ASUS 15 X509FJ","ASUS ","Intel Core i5-8265U","15.6 inch (1920 x 1080)","4GB Onboard DDR4 2400MHz","NVIDIA GeForce MX230 2GB GDDR5 / Intel UHD Graphics 620","512GB SSD M.2 NVMe ","Windows 10 Home SL 64-bit","2 cell 32 Wh","A","Công Ty A",3,15490000),
                new Laptop("EJ155T","Laptop ASUS 15 X509FJ","ASUS ","Intel Core i5-8265U","15.6 inch (1920 x 1080)","4GB Onboard DDR4 2400MHz","NVIDIA GeForce MX230 2GB GDDR5 / Intel UHD Graphics 620","512GB SSD M.2 NVMe ","Windows 10 Home SL 64-bit","2 cell 32 Wh","A","Công Ty A",3,15490000),
                new Laptop("EJ155T","Laptop ASUS 15 X509FJ","ASUS ","Intel Core i5-8265U","15.6 inch (1920 x 1080)","4GB Onboard DDR4 2400MHz","NVIDIA GeForce MX230 2GB GDDR5 / Intel UHD Graphics 620","512GB SSD M.2 NVMe ","Windows 10 Home SL 64-bit","2 cell 32 Wh","A","Công Ty A",3,15490000),
                new Laptop("EJ155T","Laptop ASUS 15 X509FJ","ASUS ","Intel Core i5-8265U","15.6 inch (1920 x 1080)","4GB Onboard DDR4 2400MHz","NVIDIA GeForce MX230 2GB GDDR5 / Intel UHD Graphics 620","512GB SSD M.2 NVMe ","Windows 10 Home SL 64-bit","2 cell 32 Wh","A","Công Ty A",3,15490000),
                new Laptop("EJ155T","Laptop ASUS 15 X509FJ","ASUS ","Intel Core i5-8265U","15.6 inch (1920 x 1080)","4GB Onboard DDR4 2400MHz","NVIDIA GeForce MX230 2GB GDDR5 / Intel UHD Graphics 620","512GB SSD M.2 NVMe ","Windows 10 Home SL 64-bit","2 cell 32 Wh","A","Công Ty A",3,15490000),
                new Laptop("EJ155T","Laptop ASUS 15 X509FJ","ASUS ","Intel Core i5-8265U","15.6 inch (1920 x 1080)","4GB Onboard DDR4 2400MHz","NVIDIA GeForce MX230 2GB GDDR5 / Intel UHD Graphics 620","512GB SSD M.2 NVMe ","Windows 10 Home SL 64-bit","2 cell 32 Wh","A","Công Ty A",3,15490000)
            };
    
            loo.writeObject(fOut);
    
            fOut.close();
            loo.close();
        } 
        catch (IOException e){
            System.out.println("Lỗi khi ghi: "+e);
        } 
    }
    public static void readLaptop(){
        try {
            FileInputStream fIn = new FileInputStream("data.txt");
            ObjectInputStream loi = new ObjectInputStream(fIn);

            Laptop readLaptopArr[] = (Laptop[]) loi.readObject();
            for(Laptop LaptopArr : readLaptopArr){
                System.out.println(LaptopArr.toString());
            }

            fIn.close();
            loi.close();

        } catch (Exception e) {
            System.out.println("Lỗi khi đọc: "+e);
        } /* catch (FileNotFoundException ex) {
            System.out.println("Lỗi khi đọc: "+ex);
        } */
    }
    public static void main(String[] args) {
        writeLaptop();
        readLaptop();
    }
}