package enity;

import java.util.ArrayList;
import java.util.Scanner;

public class quan_ly_san_pham {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<san_pham> list = new ArrayList<>();

    //them
    public static void Add_SP(){
        while(true){
            System.out.println(" Them san pham ");
            System.out.println("1. Them giay cao got");
            System.out.println("2. Them giay the thao");
            System.out.println("3. Them giay thoi trang");
            System.out.println("4. Thoat");
            System.out.println(" Moi ban nhap lua chon: ");

            int opt = Integer.parseInt(sc.nextLine());

            if(opt == 4){
                return;
            }

            switch(opt){
                case 1: 
                    san_pham c = new cao_got();
                    
            }
        }
    }
}
