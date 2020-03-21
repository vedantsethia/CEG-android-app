package com.example.mahi.navigationd;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;

public class ClickableViewPager extends ViewPager {

    private OnItemClickListener mOnItemClickListener;

    public ClickableViewPager(Context context) {
        super(context);

    }

    public ClickableViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);

    }



    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        mOnItemClickListener = onItemClickListener;
    }

    public  interface OnItemClickListener {
       // void onItemClick(int position);
        public void onItemClick(AdapterView<?> parent, View view,
                                int position, long id);
    }


}
