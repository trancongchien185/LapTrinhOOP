import java.util.Scanner;

public class ThongTin {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KhachSan1 khachsan1 = new KhachSan1();
        while (true) {
            System.out.println("Application Manager Candidate");
            System.out.println("Enter 1: To insert person for rent");
            System.out.println("Enter 2: To remove person by passport");
            System.out.println("Enter 3: To calculator price by passport");
            System.out.println("Enter 4: To show infor");
            System.out.println("Enter 5: To exit:");
            String line = scanner.nextLine();
            switch(line) {
                case "1": {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter passport: ");
                    scanner.nextLine();
                    String passport = scanner.nextLine();
                    System.out.println("Choise a to rent room type A");
                    System.out.println("Choise b to rent room type B");
                    System.out.println("Choise c to rent room type C");
                    String choise = scanner.nextLine();
                    Phong Phong ;
                    if (choise.equals("a")) {
                        Phong = new PhongA();
                    } else if (choise.equals("b")) {
                    	Phong = new PhongB();
                    } else if (choise.equals("c")) {
                    	Phong = new PhongC();
                    } else {
                        continue;
                    }
                    System.out.print("Enter number day for rent: ");
                    int numberRent = scanner.nextInt();
                    KhachHang KhachHang = new KhachHang(name, age, passport, Phong, numberRent);
                    khachsan1.add(KhachHang);
                    scanner.nextLine();
                    break;
                }
                case "2": {
                    System.out.print("Enter passport: ");
                    String passport = scanner.nextLine();
                    khachsan1.delete(passport);
                    break;
                }
                case "3": {
                    System.out.print("Enter passport: ");
                    String passport = scanner.nextLine();
                    System.out.println("Price: " + khachsan1.calculator(passport));
                    break;
                }
                case "4": {
                	khachsan1.show();
                    break;
                }
                case "5": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }

    }

}
