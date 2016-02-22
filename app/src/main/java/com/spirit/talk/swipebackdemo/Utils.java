package com.spirit.talk.swipebackdemo;

import java.util.ArrayList;

/**
 * Created by spiritTalk on 2015/5/5.
 */
public class Utils {
    private static int mBgIndex = 0;
    private static int[] mBgColors;

    public static int getColorRId() {
        if (mBgColors == null) {
            mBgColors = new int[]{R.color.androidColorA,
                    R.color.androidColorB,
                    R.color.androidColorC,
                    R.color.androidColorD,
                    R.color.androidColorE,};
        }
        int color = mBgColors[mBgIndex];
        mBgIndex++;
        if (mBgIndex >= mBgColors.length) {
            mBgIndex = 0;
        }
        return color;
    }

    public static ArrayList<String> getDataList(int size) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add("item " + i);
        }
        return list;
    }

    public static String getArticleUrl() {
        return "https://github.com/RadiateWSG/SwipeBackDemo";
    }

}
