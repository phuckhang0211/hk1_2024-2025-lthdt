package HoPhucKhang_tuan5_23695871;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Sach {
	 public abstract double getThanhTien();
	    protected String maSach, nhaXB;
	    protected LocalDate ngayNhap;
	    protected double donGia;
	    protected int soLuong;

	    public String getMaSach() {
	        return maSach;
	    }

	    public void setMaSach(String maSach) {
	        this.maSach = maSach;
	    }

	    public String getNhaXB() {
	        return nhaXB;
	    }

	    public void setNhaXB(String nhaXB) {
	        this.nhaXB = nhaXB;
	    }

	    public LocalDate getNgayNhap() {
	        return ngayNhap;
	    }

	    public void setNgayNhap(LocalDate ngayNhap) {
	        this.ngayNhap = ngayNhap;
	    }

	    public double getDonGia() {
	        return donGia;
	    }

	    public void setDonGia(double donGia) {
	        this.donGia = donGia;
	    }

	    public int getSoLuong() {
	        return soLuong;
	    }

	    public void setSoLuong(int soLuong) {
	        this.soLuong = soLuong;
	    }
	 public Sach( String maSach, String nhaXB, LocalDate ngayNhap, double donGia, int soLuong) {
		 this.maSach = maSach;
		 this.nhaXB = nhaXB;
		 this.ngayNhap = ngayNhap;
		 this.donGia = donGia;
		 this.soLuong = soLuong;
	 }
	 public Sach() {}
	 @Override
	public String toString() {
		String s = "";
		s+= s.format("|%10s|%10s|%10s|%10s|%10s|", getMaSach(), getNhaXB(), getNgayNhap(), getDonGia(), getSoLuong());
		return s;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maSach);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sach other = (Sach) obj;
		return Objects.equals(maSach, other.maSach);
	}
	 
	
}
	 

