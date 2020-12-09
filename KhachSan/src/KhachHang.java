
public class KhachHang {
	private String name;
    private int age;
    private String passport;
    private Phong phong;
    private int numberRent;

    public KhachHang(String name, int age, String passport, Phong phong, int numberRent) {
        this.name = name;
        this.age = age;
        this.passport = passport;
        this.numberRent = numberRent;
        this.phong = phong;
    }

    public int getNumberRent() {
        return numberRent;
    }

    public void setNumberRent(int numberRent) {
        this.numberRent = numberRent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", passport='" + passport + '\'' + phong.toString() +
                '}';
    }

	
}
