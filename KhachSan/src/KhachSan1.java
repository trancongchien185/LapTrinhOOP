import java.util.ArrayList;
import java.util.List;

public class KhachSan1 {
	private List<KhachHang> khachhang;

    public KhachSan1() {
        khachhang = new ArrayList<>();
    }

    public void add(KhachHang khachhang) {
        this.khachhang.add(khachhang);
    }

    public boolean delete(String passport) {
    	KhachHang khachhang = this.khachhang.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if (khachhang == null) {
            return false;
        } else {
            this.khachhang.remove(khachhang);
            return true;
        }
    }

    public int calculator(String passport) {
    	KhachHang khachhang = this.khachhang.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if (khachhang == null) {
            return 0;
        }
        return khachhang.getPhong().getPrice() * khachhang.getNumberRent();
    }

    public void show() {
        this.khachhang.forEach(p -> System.out.println(p.toString()));
    }

}
