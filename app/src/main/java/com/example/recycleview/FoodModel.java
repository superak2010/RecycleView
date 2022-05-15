package com.example.recycleview;

import com.example.recycleview.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FoodModel {
    private int image;
    private String name;
    private String address;
    private List<Category> categoryList;
    private String discount;
    private float distance;
    private Date openTime;
    private Date closeTime;

    public FoodModel(int image, String name, String address, List<Category> categoryList, String discount, float distance, Date openTime, Date closeTime) {
        this.image = image;
        this.name = name;
        this.address = address;
        this.categoryList = categoryList;
        this.discount = discount;
        this.distance = distance;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public static List<FoodModel> getMock() {
        return new ArrayList<>(Arrays.asList(
                new FoodModel(R.drawable.img_cheesecake, "Uncle Lu's Cheesecake - Sư Vạn Hạnh", "652 Sư Vạn Hạnh, P. 12, Quận 10, TP. HCM", Arrays.asList(Category.FAMILY, Category.GROUP), "Cả ngày - 15%", 10.1f, Utils.createDateForHour(8), Utils.createDateForHour(21));
            new FoodModel(R.drawable.img_raulangxaothitbo, "Rau lang xào thịt bò - Nguyễn Thị Minh Khai", "18A/3 Nguyễn Thị Minh Khai, P. Đa Kao, Quận 1, TP. HCM", Arrays.asList(Category.RESTAURANT), "Cả ngày - 12%", 21.5f, Utils.createDateForHour(17), Utils.createDateForHour(21));
            new FoodModel(R.drawable.img_canhchuacaloc, "Canh chua cá lóc - Nguyễn Thị Minh Khai", "285/11 Cách Mạng Tháng 8, P. 12, Quận 10, TP. HCM", Arrays.asList(Category.RESTAURANT), "Cả ngày - 20%", 6.5f, Utils.createDateForHour(17), Utils.createDateForHour(21));
            new FoodModel(R.drawable.img_thitbachichienxaot, "Thịt ba chỉ chiên xả ớt - Trần Quốc Thảo", "120/4A Trần Quốc Thảo, P. 7, Quận 3, TP. HCM", Arrays.asList(Category.RESTAURANT), "Cả ngày - 25%", 30.1f, Utils.createDateForHour(0), Utils.createDateForHour(24));
            new FoodModel(R.drawable.img_mamchung, "Mắm chưng - Đặng Văn Ngữ", "69 Đặng Văn Ngữ, P. 14,  Quận Phú Nhuận, TP. HCM", Arrays.asList(Category.RESTAURANT, Category.FAMILY, Category.GROUP), "Cả ngày - 5%", 30.1f, Utils.createDateForHour(9), Utils.createDateForHour(23));
            new FoodModel(R.drawable.img_laucakeo, "Lẩu cá kèo - Bà Huyện Thanh Quan", "87 Bà Huyện Thanh Quan, P. 7,  Quận 3, TP. HCM", Arrays.asList(Category.RESTAURANT, Category.FAMILY, Category.GROUP), "Cả ngày - 10%", 34.2f, Utils.createDateForHour(10), Utils.createDateForHour(22));
            new FoodModel(R.drawable.img_comtam, "Cơm tấm - Hồng Bàng", "933 Hồng Bàng,  Quận 6, TP. HCM", Arrays.asList(Category.RESTAURANT, Category.FAMILY), "Cả ngày - 10%", 30.1f, Utils.createDateForHour(15), Utils.createDateForHour(22));
            new FoodModel(R.drawable.img_bunbo, "Bún bò - Lý Chính Thắng", "134/11 Lý Chính Thắng, P. Võ Thị Sáu,  Quận 3, TP. HCM", Arrays.asList(Category.RESTAURANT, Category.FAMILY, Category.GROUP), "Cả ngày - 3%", 15.6f, Utils.createDateForHour(6), Utils.createDateForHour(22));
            new FoodModel(R.drawable.img_pho, "Phở - Cửu Long", "58 Cửu Long, P. 15,  Quận 10, TP. HCM", Arrays.asList(Category.RESTAURANT), "Cả ngày - 7%", 23.05f, Utils.createDateForHour(6), Utils.createDateForHour(23));
            new FoodModel(R.drawable.img_bunmam, "Bún mắm - Nhật Tảo", "Hẻm 412 Nhật Tảo, P. 6,  Quận 10, TP. HCM", Arrays.asList(Category.RESTAURANT, Category.FAMILY), "Cả ngày", 49.3f, Utils.createDateForHour(7), Utils.createDateForHour(15));
            ));
    }
}