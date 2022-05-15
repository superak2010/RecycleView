package com.example.recycleview;

public enum Category {
    RESTAURANT("Nhà hàng"),
    SHOP_ONLINE("Shop online"),
    FAMILY("Gia đình"),
    GROUP("Hội nhóm"),
    BIRTHDAY("Sinh nhật");

    private String text;

    Category(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
