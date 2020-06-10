package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        Paint paint = new Paint();
        Path pathAxis = new Path();
        int interval = 20;//item之间的间隔
        int itemWidth = 60;//item的宽度
        //画坐标轴
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        pathAxis.moveTo(100,100);
        pathAxis.lineTo(100,800);
        pathAxis.rLineTo(700,0);
        //此时坐标原点为：(100,800)

        //用线画item
        pathAxis.moveTo(100 + interval,800);
        pathAxis.rLineTo(0,-100);
        pathAxis.rLineTo(itemWidth,0);
        pathAxis.rLineTo(0,100);

        canvas.drawPath(pathAxis,paint);


        //画矩形
        Paint paintItem = new Paint();
        Path pathItem = new Path();
        paintItem.setColor(Color.GREEN);
        paintItem.setStyle(Paint.Style.FILL);


        RectF item2 = new RectF(100 + interval + (itemWidth + interval) * 1,300,100 + (interval + itemWidth) * 2,800);
        pathItem.addRect(item2, Path.Direction.CW);

        RectF item3 = new RectF(100 + interval + (itemWidth + interval) * 2,600,100 + (interval + itemWidth) * 3,800);
        pathItem.addRect(item3, Path.Direction.CW);

        RectF item4 = new RectF(100 + interval + (itemWidth + interval) * 3,50,100 + (interval + itemWidth) * 4,800);

        RectF item5 = new RectF(100 + interval + (itemWidth + interval) * 4,1000,100 + (interval + itemWidth) * 5,800);

        pathItem.addRect(item4, Path.Direction.CW);
        pathItem.addRect(item5, Path.Direction.CW);

        canvas.drawPath(pathItem,paintItem);
    }
}
