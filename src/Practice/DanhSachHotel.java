package Practice;

import java.util.ArrayList;

public class DanhSachHotel extends Hotel{
    ArrayList<Hotel> listHotel;

    public DanhSachHotel() {
        listHotel = new ArrayList<Hotel>();
    }

    public void addHotel(String name, String location, String ownerName){
        Hotel htl = new Hotel(name, location, ownerName);
        listHotel.add(htl);
    }

    public void showHotel(){
        System.out.println("Danh sách các khách sạn: ");
        for (Hotel l:listHotel){
            System.out.println(l.getName() + " - " + l.getLocation() + " - " + l.getOwnerName());
        }
    }

    public void searchHotel(String ownerName){
        for (Hotel l:listHotel){
            if (l.getOwnerName().contains(ownerName)){
                System.out.println(l.getName() + " - " + l.getLocation() + " - " + l.getOwnerName());
                return;
            }
        }
        System.out.println("Không tìm thấy");
    }
}
