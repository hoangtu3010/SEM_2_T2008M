package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Hotel> listHotel = new ArrayList<Hotel>();
        DanhSachHotel htl = new DanhSachHotel();

        htl.addHotel("HQA","8 Tôn Thất Thuyết","Nguyễn Văn Quỳnh");
        htl.addHotel("NĐ","Ba Đình, Hà Nội","Hoàng Văn Tùng");
        htl.addHotel("AKM","36 Mỹ Đình","Nguyễn Văn Quỳnh");
        htl.addHotel("LA","16 Khánh Hòa","Nguyễn Văn Quỳnh");
        htl.addHotel("US","Mai Dịch","Phùng Thanh Thủy");
        htl.addHotel("AVD","121 Trần Cung","Hoàng Văn Tùng");
        htl.addHotel("HVS","456 Phạm Văn Đồng","Lê Thị Hoài");
        htl.addHotel("NVH","56 Đình Thôn","Trần Quốc Giang");
        htl.addHotel("NAV","8 Phú Đô","Trần Quốc Giang");
        htl.addHotel("JKA","19 AN Nam","Dương Văn Dũng");

        htl.showHotel();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên cần tìm: ");
        String ownerName = sc.nextLine();
        htl.searchHotel(ownerName);



    }
}
