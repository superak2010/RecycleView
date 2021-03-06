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

    public static int getImage() {
        return getImage();
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

//    public static List<FoodModel> getMock() {
//        return new ArrayList<>(Arrays.asList(
//                new FoodModel(R.drawable.img_cheesecake, "Uncle Lu's Cheesecake - S?? V???n H???nh", "652 S?? V???n H???nh, P. 12, Qu???n 10, TP. HCM", Arrays.asList(Category.FAMILY, Category.GROUP), "Ca?? nga??y - 15%", 10.1f, Utils.createDateForHour(8), Utils.createDateForHour(21))));
//            new FoodModel(R.drawable.img_raulangxaothitbo, "Rau lang x??o th???t b?? - Nguy???n Th??? Minh Khai", "18A/3 Nguy???n Th??? Minh Khai, P. ??a Kao, Qu???n 1, TP. HCM", Arrays.asList(Category.RESTAURANT), "C??? ng??y - 12%", 21.5f, Utils.createDateForHour(17), Utils.createDateForHour(21));
//            new FoodModel(R.drawable.img_canhchuacaloc, "Canh chua c?? l??c - Nguy???n Th??? Minh Khai", "285/11 C??ch M???ng Th??ng 8, P. 12, Qu???n 10, TP. HCM", Arrays.asList(Category.RESTAURANT), "C??? ng??y - 20%", 6.5f, Utils.createDateForHour(17), Utils.createDateForHour(21));
//            new FoodModel(R.drawable.img_thitbachichienxaot, "Th???t ba ch??? chi??n x??? ???t - Tr???n Qu???c Th???o", "120/4A Tr???n Qu???c Th???o, P. 7, Qu???n 3, TP. HCM", Arrays.asList(Category.RESTAURANT), "C??? ng??y - 25%", 30.1f, Utils.createDateForHour(0), Utils.createDateForHour(24));
//            new FoodModel(R.drawable.img_mamchung, "M???m ch??ng - ?????ng V??n Ng???", "69 ?????ng V??n Ng???, P. 14,  Qu???n Ph?? Nhu???n, TP. HCM", Arrays.asList(Category.RESTAURANT, Category.FAMILY, Category.GROUP), "C??? ng??y - 5%", 30.1f, Utils.createDateForHour(9), Utils.createDateForHour(23));
//            new FoodModel(R.drawable.img_laucakeo, "L???u c?? k??o - B?? Huy???n Thanh Quan", "87 B?? Huy???n Thanh Quan, P. 7,  Qu???n 3, TP. HCM", Arrays.asList(Category.RESTAURANT, Category.FAMILY, Category.GROUP), "C??? ng??y - 10%", 34.2f, Utils.createDateForHour(10), Utils.createDateForHour(22));
//            new FoodModel(R.drawable.img_comtam, "C??m t???m - H???ng B??ng", "933 H???ng B??ng,  Qu???n 6, TP. HCM", Arrays.asList(Category.RESTAURANT, Category.FAMILY), "C??? ng??y - 10%", 30.1f, Utils.createDateForHour(15), Utils.createDateForHour(22));
//            new FoodModel(R.drawable.img_bunbo, "B??n b?? - L?? Ch??nh Th???ng", "134/11 L?? Ch??nh Th???ng, P. V?? Th??? S??u,  Qu???n 3, TP. HCM", Arrays.asList(Category.RESTAURANT, Category.FAMILY, Category.GROUP), "C??? ng??y - 3%", 15.6f, Utils.createDateForHour(6), Utils.createDateForHour(22));
//            new FoodModel(R.drawable.img_pho, "Ph??? - C???u Long", "58 C???u Long, P. 15,  Qu???n 10, TP. HCM", Arrays.asList(Category.RESTAURANT), "C??? ng??y - 7%", 23.05f, Utils.createDateForHour(6), Utils.createDateForHour(23));
//            new FoodModel(R.drawable.img_bunmam, "B??n m???m - Nh???t T???o", "H???m 412 Nh???t T???o, P. 6,  Qu???n 10, TP. HCM", Arrays.asList(Category.RESTAURANT, Category.FAMILY), "C??? ng??y", 49.3f, Utils.createDateForHour(7), Utils.createDateForHour(15));

}