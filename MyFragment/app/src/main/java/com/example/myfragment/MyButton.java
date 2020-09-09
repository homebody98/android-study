package com.example.myfragment;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;

public class MyButton extends AppCompatButton {
    public MyButton(@NonNull Context context) {
        super(context);
        init(context);
    }

    public MyButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        setBackgroundColor(Color.CYAN);
        setTextColor(Color.BLACK);
        setText("버튼");
        float textSize = getResources().getDimension(R.dimen.text_size);
        setTextSize(textSize);
    }
//버튼 크기 지정
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d("myButton","onDraw 호출됨");
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("myButton","onTouchEvent 호출됨");
        int action = event.getAction();
        switch(action){
            case MotionEvent.ACTION_DOWN:
                Log.d("myButton","down");
                setText("눌림");
                setTextColor(Color.WHITE);
                setBackgroundColor(Color.BLACK);
                break;
            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_OUTSIDE:
            case MotionEvent.ACTION_CANCEL:
                setBackgroundColor(Color.CYAN);
                setText("버튼");
                break;
        }
        invalidate();
        return true;
    }
}
