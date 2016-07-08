package com.i_realtech.scanner;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by FNarvaez on 08-07-2016.
 */
public class DrawView extends ImageView{

    public DrawView(Context context) {
        super(context);
    }

    DrawView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    DrawView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setAlpha(128);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(10);

        int width = super.getWidth();
        int height = super.getHeight();

        Point p_leftTop = new Point(100,100);
        Point p_rightTop = new Point(width - 100, 100);
        Point p_leftBottom = new Point(width - 100, height - 100);
        Point p_rightBottom = new Point(100, height - 100);

        Path path = new Path();
        path.addCircle(100,100,5,Path.Direction.CW);
        path.addCircle(width - 100,100,5,Path.Direction.CW);
        path.addCircle(width - 100, height - 100,5,Path.Direction.CW);
        path.addCircle(100 , height - 100,5,Path.Direction.CW);

        canvas.drawPath(path, paint);
    }
}

