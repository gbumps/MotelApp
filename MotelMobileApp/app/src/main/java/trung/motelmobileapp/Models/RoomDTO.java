package trung.motelmobileapp.Models;

import java.io.Serializable;

public class RoomDTO implements Serializable {
    private String address;
    private String city;
    private String district;
    private String ward;
    private int price;
    private int area;
    private String description;

    public RoomDTO(String address, String city, String district, String ward, int price, int area, String description) {
        this.address = address;
        this.city = city;
        this.district = district;
        this.ward = ward;
        this.price = price;
        this.area = area;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "RoomDTO{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", ward='" + ward + '\'' +
                ", price=" + price +
                ", area=" + area +
                ", description='" + description + '\'' +
                '}';
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
