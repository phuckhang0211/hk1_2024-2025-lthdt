package HoPhucKhang_23695871;

public class testSinhVien {

	public static void main(String[] args) {
		// Khoi tao doi tuong bang constructor co tham so
	sinhVien sv = new sinhVien(1, "Ho Phuc Khang", "46 Nguyen Thuong Hien", " 0933111" );
	System.out.println(sv);
		sv.setFullName("Ho Khang Phuc");
		sv.setAddress("258 Duong so 6");
		sv.setPhoneNumber("0223333");
	System.out.println(sv);
	}
}
