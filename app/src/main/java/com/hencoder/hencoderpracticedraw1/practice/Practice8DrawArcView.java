package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        //弧形
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);//填充
        canvas.drawArc(200,200,500,400,-100,100,false,paint);

        //伞形 不连接圆心
        paint.reset();
        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(200,200,500,400,20,140,false,paint);

        //扇形 连接圆心
        paint.reset();
        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(200,200,500,400,180,60,true,paint);
    }
}
