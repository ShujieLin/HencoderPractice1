package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint paint = new Paint();
        RectF rect = new RectF(250,250,750,750);

        //扇形
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(rect,0,65,true,paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(rect,68,30,true,paint);

        paint.setColor(Color.RED);
        canvas.drawArc(rect,100,40,true,paint);

        paint.setColor(Color.BLACK);
        canvas.drawArc(rect,141,23,true,paint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(rect,165,110,true,paint);

        RectF rect2 = new RectF(280,220,780,720);
        paint.setColor(Color.WHITE);
        canvas.drawArc(rect2,280,40,true,paint);

        //线
        Path path = new Path();
        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(100,300);
        path.lineTo(200,450);
        path.rLineTo(50,0);

        canvas.drawPath(path,paint);

        //文字
        canvas.drawText("Lollipop",70,280,paint);

    }
}
