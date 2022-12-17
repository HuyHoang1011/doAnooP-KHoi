package enity;


import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;


public class quan_ly_nhan_su {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<nhan_vien> list = new ArrayList<>();
    //them
    public static void Add_NV(){
        while(true){
            System.out.println(" Them nhan vien ");
            System.out.println("1. Them nhan vien ban hang");
            System.out.println("2. Them nhan vien thu ngan");
            System.out.println("3 Them nhan vien quan ly");
            System.out.println("4 Thoat");
            System.out.println(" Moi ban nhap lua chon: ");

            int opt = Integer.parseInt(sc.nextLine());

            if(opt == 4){
                return;
            }

            switch (opt){
                case 1:
                    human c = new ban_hang();
                    c.nhap();
                    list.add((nhan_vien) c);
                    break;
                case 2:
                    human b = new thu_ngan();
                    b.nhap();
                    list.add((nhan_vien) b);
                    break;
                case 3:
                    human a = new quan_ly();
                    a.nhap();
                    list.add((nhan_vien) a);
                    break;
            }
        }
    }
    //xoa
    public static void deleteNV(){
        System.out.println("Nhap nhan vien can xoa");
        String maN = sc.nextLine();
        for (nhan_vien nv:list ){
            if(nv instanceof nhan_vien && nv.getMaNhanVien().equals(maN)){
                list.remove(nv);
            }
        }
    }
    //xem
    public static void showNV(){
        for(nhan_vien nv:list){
            nv.xuat();
        }
    }
    //sua
    // public static void updateNV(){
    //     System.out.println("Nhap ma nhan vien can sua: ");
    //     String maN = sc.nextLine();
    //     System.out.println("Nhap thong tin moi");
    //     human a = new human();
    //     a.nhap();
    //     int index = list.indexOf(maN);
    //     list.set(index, (nhan_vien) a);
    // }

    public static void updateNV(){
        System.out.println("Nhap ma nhan vien can sua: ");
        String maN = sc.nextLine();
        boolean check=false;
        int index = -1;
        for(nhan_vien nv:list){
            index ++;
            if(nv.getMaNhanVien().equals(maN)==true){
                human a = nv; 
                a.nhap();
                list.set(index,(nhan_vien) a); 
                check = true;
                break;
            }
            if(check!=true){
                System.out.println("Khong ton tai!");
            }
        }
    }
    //tim kiem
    public static void searchNV(){
        System.out.println("Nhap ma nhan vien can tim kiem");
        String maN = sc.nextLine();
        System.out.println("Thong tin nhan vien ban can tim la: ");
        for(nhan_vien nv:list){
            if(nv.getMaNhanVien().equals(maN)){
                nv.xuat();
                break;
            }
        }
    }

    //nhap file
    public static void nhapFile(){
        try {
            BufferedReader fi=new BufferedReader(new FileReader("nhan_vien.txt"));
            String line = fi.readLine();
            int i=0;
            while(line!=null){
                String arr[] = line.split(",");
                // int nam = Integer.parseInt(arr[3]);

                if(arr[0].equals("ban hang")==true){
                    int nam = Integer.parseInt(arr[3]);
                    float luong = Float.parseFloat(arr[7]);
                    human a = new ban_hang(arr[6],luong,arr[1],arr[2],nam,arr[4],arr[5]);
                    list.add((nhan_vien) a);
                    line = fi.readLine();
                }
                if(arr[0].equals("thu ngan")==true){
                    int nam = Integer.parseInt(arr[3]);
                    float luong = Float.parseFloat(arr[7]);
                    human b = new thu_ngan(arr[6],luong,arr[1],arr[2],nam,arr[4],arr[5]);
                    list.add((nhan_vien) b);
                    line = fi.readLine();
                }
                if(arr[0].equals("quan ly")==true){
                    int nam = Integer.parseInt(arr[3]);
                    float luong = Float.parseFloat(arr[7]);
                    human c = new quan_ly(arr[6],luong,arr[1],arr[2],nam,arr[4],arr[5]);
                    list.add((nhan_vien) c);
                    line = fi.readLine();
                }
            }
            fi.close();
        } catch (Exception e) {
            e.getStackTrace();
        } 
        System.out.println("Nhap hoan thanh!");
        
    }
}
// co ma