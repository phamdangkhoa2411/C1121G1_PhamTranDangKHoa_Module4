package product.model;

public class Product {
//    id, tên sản phẩm, giá sản phẩm, mô tả của sản phẩm, nhà sản xuất.
    private int ma;
    private String ten ;
    private String gia ;
    private String mota;
    private String nhaSanXuat ;

    public Product() {
    }

    public Product(int ma, String ten, String gia, String mota, String nhaSanXuat) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.mota = mota;
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }
}
