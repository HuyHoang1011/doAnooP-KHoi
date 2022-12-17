import java.util.Scanner;

import enity.*;

public class main {
    static Scanner sc = new Scanner(System.in);
    static quan_ly_nhan_su qlns = new quan_ly_nhan_su();
    static quan_ly_khach_hang qlkh = new quan_ly_khach_hang();
    public static void main(String[] args) {
        while (true) {
            System.out.println("Quan ly nhan vien");
            System.out.println("1.Them Nhan vien");
            System.out.println("2. Sua Nhan Vien");
            System.out.println("3. Xoa Nhan Vien");
            System.out.println("4. Xem Nhan Vien");
            System.out.println("5. Tim Nhan Vien");
            System.out.println("Quan ly khach hang");
            System.out.println("6.Them Khach Hang");
            System.out.println("7. Sua Khach Hang");
            System.out.println("8. Xoa Khach Hang");
            System.out.println("9. Xem Khach Hang");
            System.out.println("10. Tim Khach Hang");
            System.out.println("Quan ly file");
            System.out.println("21.Doc File Nhan Vien");
            System.out.println("0. Thoat");
            System.out.println("Moi nhap lua chon:");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                {
                    qlns.Add_NV();
                    break;
                }
                case 2:
                {
                    qlns.updateNV();
                    break;
                }
                case 3:
                {
                    qlns.deleteNV();
                    break;
                }
                case 4:
                {
                    qlns.showNV();
                    break;
                }
                case 5:
                {
                    qlns.searchNV();
                    break;
                }
                case 6:
                {
                    qlkh.Add_KH();
                    break;
                }
                case 7:
                {
                    qlkh.updateKH();
                    break;
                }
                case 8:
                {
                    qlkh.deleteKH();
                    break;
                }
                case 9:
                {
                    qlkh.showKH();
                    break;
                }
                case 10:
                {
                    qlkh.searchKH();
                    break;
                }
                case 21:
                {
                    qlns.nhapFile();
                    break;
                } 
                case 0:
                    System.exit(0);
            }
        }
    }
}
