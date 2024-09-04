package HoPhucKhang_23695871;
	 	// Cac thuoc tinh private
public class sinhVien {
	private int studentId;
	private String fullName;
	private String address;
	private String phoneNumber;
		//Constructor Mac Dinh
public sinhVien() {
	this.studentId = 0;
	this.fullName = "";
	this.address = "";
	this.phoneNumber = "";
}
		//Constructor co tham so
public sinhVien( int studentId, String fullName, String address, String phoneNumber) {
	this.studentId = studentId;
	this.fullName = fullName;
	this.address = address;
	this.phoneNumber = phoneNumber;
	}
		//getter va setter cho studentId
public int getStudentId() {
	return studentId;
}
public void setStudentId( int studentId) {
	this.studentId = studentId;
}
		//getter va setter cho fullName
public String getFullName() {
	return fullName;
}
public void setFullName( String fullName) {
	this.fullName = fullName;
}
		//getter va setter cho address
public String getAddress() {
	return address;
}
public void setAddress( String address) {
	this.address = address;
}
		//getter va setter cho phoneNumber
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber( String phoneNumber) {
	if( phoneNumber != null && phoneNumber.matches("\\d{7}")) {
		this.phoneNumber = phoneNumber;
	}
}
@Override 
public String toString() {
	 return "Student{" +
             "studentId = " + studentId +
             "\nfullName = '" + fullName + '\'' +
             "\naddress = '" + address + '\'' +
             "\nphoneNumber = '" + phoneNumber + '\'' +
             '}';
}
}
