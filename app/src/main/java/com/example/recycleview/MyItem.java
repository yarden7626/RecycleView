package com.example.recycleview;

public class MyItem {
    private final String text1;
    private final String text2;
    private final int imageResId;

    public MyItem(String text1, String text2, int imageResId) {
        this.text1 = text1;
        this.text2 = text2;
        this.imageResId = imageResId;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

    public int getImageResId() {
        return imageResId;
    }
}
