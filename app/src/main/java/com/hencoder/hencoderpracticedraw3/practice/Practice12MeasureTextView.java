package com.hencoder.hencoderpracticedraw3.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice12MeasureTextView extends View {
    Paint paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint2 = new Paint(Paint.ANTI_ALIAS_FLAG);
    String text1 = "三个月内你胖了";
    String text2 = "4.5";
    String text3 = "公斤";

    {
        paint1.setTextSize(60);
        paint2.setTextSize(120);
        paint2.setColor(Color.parseColor("#E91E63"));
    }

    public Practice12MeasureTextView(Context context) {
        super(context);
    }

    public Practice12MeasureTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice12MeasureTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 使用 Paint.measureText 测量出文字宽度，让文字可以相邻绘制
        float startX = 50;
        canvas.drawText(text1, startX, 200, paint1);
        startX += paint1.measureText(text1);
        canvas.drawText(text2, startX, 200, paint2);
        startX += paint2.measureText(text2);
        canvas.drawText(text3, startX, 200, paint1);
    }
}
