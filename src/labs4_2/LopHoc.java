package labs4_2;

import java.util.ArrayList;

public class LopHoc {
    int maLop;
    char tenLop;
    char phongHoc;
    ArrayList<SinhVien> danhSachSV;

    public LopHoc() {
        danhSachSV = new ArrayList<SinhVien>();
    }

    public int getMaLop() {
        return maLop;
    }

    public void setMaLop(int maLop) {
        this.maLop = maLop;
    }

    public char getTenLop() {
        return tenLop;
    }

    public void setTenLop(char tenLop) {
        this.tenLop = tenLop;
    }

    public char getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(char phongHoc) {
        this.phongHoc = phongHoc;
    }

    public ArrayList<SinhVien> getDanhSachSV() {
        return danhSachSV;
    }

    public void addSV(SinhVien sv){
        getDanhSachSV().add(sv);
    }

    public void removeSV(SinhVien sv){
        getDanhSachSV().remove(sv);
    }

    public void printDanhSach(){
        System.out.println("Mã lớp: " + getMaLop());
        System.out.println("Tên lớp: " + getTenLop());
        System.out.println("Phòng học: " + getPhongHoc());
        System.out.println("Danh sách SV: ");
        for (SinhVien s:danhSachSV){
            System.out.println(s);
        }
    }
}
