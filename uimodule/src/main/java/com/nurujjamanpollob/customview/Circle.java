package com.nurujjamanpollob.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Create a extra class to draw circle
 */
public class Circle extends View {


    private final int circleBorderWidth;
    private final Paint backgroundPaint;
    private final Paint backgroundBorderPaint;
    private int viewWidth;
    private int viewHeight;
    private int originalViewWidth;
    private int originalViewHeight;
    private boolean viewDrawnOneTime = false;

    public Circle(Context context) {
        super(context);


        this.circleBorderWidth = 0;
        this.backgroundPaint = null;
        this.backgroundBorderPaint = null;


    }

    public Circle(Context context, AttributeSet attrs) {
        super(context, attrs);


        this.circleBorderWidth = 0;
        this.backgroundPaint = null;
        this.backgroundBorderPaint = null;

    }



    public Circle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);


        this.circleBorderWidth = 0;
        this.backgroundPaint = null;
        this.backgroundBorderPaint = null;
    }

    public Circle(Context context, int circleBorderWidth, Paint backgroundPaint, Paint circleBorderPaint){
        super(context);

        this.circleBorderWidth = circleBorderWidth;
        this.backgroundPaint = backgroundPaint;
        this.backgroundBorderPaint = circleBorderPaint;
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if(!viewDrawnOneTime){
            viewWidth = getWidth();
            viewHeight = getHeight();
            originalViewWidth = viewWidth;
            originalViewHeight = viewHeight;
            viewDrawnOneTime = true;
        }

        if(backgroundPaint != null) {

            float viewPortXY = findMin(viewHeight, viewWidth) / 2;
            float radiusOfBorder = viewPortXY - circleBorderWidth;
            // Draw background circle
            canvas.drawCircle(viewPortXY, viewPortXY, radiusOfBorder, backgroundPaint);

            // Draw circle using canvas instance
            canvas.drawCircle(viewPortXY, viewPortXY, radiusOfBorder, backgroundBorderPaint);


        }
    }


    /**
     * Method to find the minimum value
     * @param param1 First value
     * @param param2 Second value
     * @return Minimum value from the two
     * @see Math#min for more info
     */
    private float findMin(int param1, int param2){

        return Math.min(param1, param2);
    }


    /**
     * Method to set the circle color
     * @param colorInt the color hex code, for example #000000
     */
    public void setCircleColor(int colorInt) {

        if (backgroundPaint != null) {
            backgroundPaint.setColor(colorInt);
        }

        // Redraw the view
        invalidate();
    }

    /**
     * Method to set the circle border color
     * @param colorInt the color hex code, for example #000000
     */
    public void setCircleBorderColor(int colorInt) {

        if (backgroundBorderPaint != null) {
            backgroundBorderPaint.setColor(colorInt);
        }

        // Redraw the view
        invalidate();
    }


    /**
     * @apiNote Method to adjust circle view size. Please note, convert px to dp before passing the value.
     * This thing works only for the circle view, not for the circle layout.
     * @param width The width of the view
     * @param height The height of the view
     */
    public void setCircleSize(int width, int height) {
        this.viewWidth = width;
        this.viewHeight = height;

        // Redraw the view
        invalidate();
    }

    /**
     * Method to reset circle view size. This thing works only for the circle view, not for the circle layout.
     */
    public void resetCircleSize() {
        this.viewWidth = originalViewWidth;
        this.viewHeight = originalViewHeight;

        // Redraw the view
        invalidate();
    }

    /**
     * @apiNote Method to set circle width. Please note, convert px to dp before passing the value.
     * @param width The width of the view
     */
    public void setCircleWidth(int width) {
        this.viewWidth = width;

        // Redraw the view
        invalidate();
    }

    /**
     * @apiNote Method to set circle height. Please note, convert px to dp before passing the value.
     * @param height The height of the view
     */
    public void setCircleHeight(int height) {
        this.viewHeight = height;

        // Redraw the view
        invalidate();
    }

    /**
     * Method to customize the circle border width. Please note, convert px to dp before passing the value.
     * @param borderWidth The width of the border
     */
    public void setCircleBorderWidth(int borderWidth) {

        if (backgroundBorderPaint != null) {
            backgroundBorderPaint.setStrokeWidth(borderWidth);
        }

        // Redraw the view
        invalidate();
    }
}





