package enity;

import java.util.ArrayList;
import java.util.Scanner;

public class quan_ly_khach_hang {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<khach_hang> list = new ArrayList<>();
    //them
    public static void Add_KH(){
            System.out.println(" Them khach hang ");
            khach_hang a = new khach_hang();
            a.nhap();
            list.add((khach_hang) a);
    }
    //xoa
    public static void deleteKH(){
        System.out.println("Nhap khach hang can xoa");
        String maN = sc.nextLine();
        for (khach_hang nv:list ){
            if(nv instanceof khach_hang && nv.getMaKhachHang().equals(maN)){
                list.remove(nv);
            }
        }
    }
    //xem
    public static void showKH(){
        for(khach_hang nv:list){
            nv.xuat();
        }
    }
    //sua
    // public static void updateKH(){
    //     System.out.println("Nhap ma khach hang can sua: ");
    //     String maN = sc.nextLine();
    //     System.out.println("Nhap thong tin moi");
    //     human a = new human();
    //     a.nhap();
    //     int index = list.indexOf(maN);
    //     list.set(index, (khach_hang) a);
    // }
    public static void updateKH(){
        System.out.println("Nhap ma khach hang can sua: ");
        String maN = sc.nextLine();
        boolean check=false;
        int index = -1;
        for(khach_hang nv:list){
            index ++;
            if(nv.getMaKhachHang().equals(maN)==true){
                human a = nv; 
                a.nhap();
                list.set(index,(khach_hang) a); 
                check = true;
                break;
            }
            if(check!=true){
                System.out.println("Khong ton tai!");
            }
        }
    }
    //tim kiem
    public static void searchKH(){
        System.out.println("Nhap ma khach hang can tim kiem");
        String maN = sc.nextLine();
        System.out.println("Thong tin khach hang ban can tim la: ");
        for(khach_hang nv:list){
            if(nv.getMaKhachHang().equals(maN)){
                nv.xuat();
                break;
            }
        }
    }
}
//nhan vien di 
