import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StudentList {
    private ArrayList<Student> students = new ArrayList<>();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public void themSinhVien(Student sinhVien) {
        students.add(sinhVien);
    }

    public void nhapDanhSachSinhVien(int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho sinh vien " + (i + 1) + ":");
            System.out.print("Ma sinh vien: ");
            String id = scanner.nextLine();
            System.out.print("Ten day du: ");
            String hoTen = scanner.nextLine();
            System.out.print("Ngay sinh (yyyy-MM-dd): ");
            Date ngaySinh = null;
            try {
                ngaySinh = dateFormat.parse(scanner.nextLine());
            } catch (ParseException e) {
                System.out.println("Dinh dang ngay khong hop le. Hay nhap theo dinh dang yyyy-MM-dd.");
                continue;
            }
            System.out.print("Nganh hoc: ");
            String nganhHoc = scanner.nextLine();
            System.out.print("Diem GPA: ");
            float gpa = scanner.nextFloat();
            scanner.nextLine();  // don bo nho dem

            Student sinhVien = new Student(id, hoTen, ngaySinh, nganhHoc, gpa);
            themSinhVien(sinhVien);
        }
    }

    public void hienThiTatCaSinhVien() {
        for (Student sinhVien : students) {
            sinhVien.hienThiThongTin();
            System.out.println("-----");
        }
    }

    public Student timSinhVienBangId(String id) {
        for (Student sinhVien : students) {
            if (sinhVien.getId().equals(id)) {
                return sinhVien;
            }
        }
        return null;
    }

    public void xoaSinhVienBangId(String id) {
        Student sinhVien = timSinhVienBangId(id);
        if (sinhVien != null) {
            students.remove(sinhVien);
            System.out.println("Da xoa sinh vien co ma " + id);
        } else {
            System.out.println("Khong tim thay sinh vien co ma " + id);
        }
    }

    public void capNhatSinhVienBangId(String id) {
        Student sinhVien = timSinhVienBangId(id);
        if (sinhVien != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ten moi: ");
            sinhVien.setHoTen(scanner.nextLine());
            System.out.print("Ngay sinh moi (yyyy-MM-dd): ");
            try {
                sinhVien.setNgaySinh(dateFormat.parse(scanner.nextLine()));
            } catch (ParseException e) {
                System.out.println("Dinh dang ngay khong hop le. Cap nhat that bai.");
                return;
            }
            System.out.print("Nganh hoc moi: ");
            sinhVien.setNganhHoc(scanner.nextLine());
            System.out.print("GPA moi: ");
            sinhVien.setGpa(scanner.nextFloat());
            System.out.println("Da cap nhat thong tin sinh vien.");
        } else {
            System.out.println("Khong tim thay sinh vien co ma " + id);
        }
    }
}
