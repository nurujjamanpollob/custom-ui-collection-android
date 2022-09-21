package com.nurujjamanpollob.customview;


import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.constraintlayout.widget.ConstraintLayout;



/**
 * @author Nurujjaman Pollob
 * @version 1.0
 * @apiNote Custom {@link ConstraintLayout} to create a centered circle view background. <br />
 * <b>Warning:</b> Do not use <b>wrap_content</b> or <b>match_parent</b> to define value for <b>android:layout_width</b> and <b>android:layout_height</b> properties in the layout tag.
 * As, we are looking for dimensions of the view to draw the circle, and align the view in the center of the screen. <br />
 * So, android framework can't provide the dimensions of the view before the view is drawn, so we left no choice but to get the dimensions from the properties.
 * And, those values can't be <b>wrap_content</b> or <b>match_parent</b> and invertible to dimension.
 * <b>Throws </b> {@link UnsupportedOperationException} if android:layout_width or android:layout_height is set to wrap_content or match_parent. <br />
 * For now, we are catching the exception and printing the stack trace.
 * @see View
 * @see Canvas
 * @see Paint
 * @see Color
 * @see TypedArray
 * @see AttributeSet
 * @see Context
 * @see ConstraintLayout
 * For more information ;)
 * @since 1.0
 */
@SuppressWarnings({"unused"})
public class CircleLayout extends ConstraintLayout {

    private int circleId;

    /**
     * Constructor to initialize the view
     *
     * @param context The Context the view is running in, through which it can access the current theme, resources, etc.
     */
    public CircleLayout(Context context) {
        super(context);
        init(context, null);
    }

    /**
     * Constructor to initialize the view
     *
     * @param context The Context the view is running in, through which it can access the current theme, resources, etc.
     * @param attrs   The attributes of the XML tag that is inflating the view.
     */
    public CircleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    /**
     * Constructor to initialize the view
     *
     * @param context      The Context the view is running in, through which it can access the current theme, resources, etc.
     * @param attrs        The attributes of the XML tag that is inflating the view.
     * @param defStyleAttr An attribute in the current theme that contains a reference to a style resource that supplies default values for the view. Can be 0 to not look for defaults.
     */
    public CircleLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    /*
     * Init the layout vars
     */
    private void init(final Context context, final AttributeSet attrs) {

        final TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CircleLayout);


        // Get parameters
        int circleBackgroundColor = typedArray.getColor(R.styleable.CircleLayout_circle_color, Color.parseColor("#000000"));
        int circleStrokeColor = typedArray.getColor(R.styleable.CircleLayout_circle_border_color, Color.parseColor("#F0F0F0"));
        int circleStrokeWidth = typedArray.getDimensionPixelSize(R.styleable.CircleLayout_circle_border_width, 0);


        int viewWidth = 0;
        int viewHeight = 0;

        try {
            viewWidth = typedArray.getDimensionPixelSize(R.styleable.CircleLayout_android_layout_width, 0);
            viewHeight = typedArray.getDimensionPixelSize(R.styleable.CircleLayout_android_layout_height, 0);
        } catch (Exception e) {
            Exception exception = new Exception("android:layout_width or android:layout_height can't be wrap_content or match_parent");
            exception.printStackTrace();
        }

        // Initialize circle view
        initializeCircleView(viewWidth, viewHeight, circleStrokeWidth, circleBackgroundColor, circleStrokeColor);

        // Recycle
        typedArray.recycle();


    }

    // Method to calculate and initialize views
    private void initializeCircleView(int viewWidth, int viewHeight, int circleStrokeWidth, int circleBackgroundColor, int circleStrokeColor) {


        // We need to grab the parent layout height and width
        int circleWidth = Math.min(viewWidth, viewHeight);
        int circleHeight = Math.min(viewWidth, viewHeight);

        // Calculate vertical and horizontal margins
        int horizontalMargin = circleWidth > viewWidth ? (circleWidth - viewWidth) / 2 : viewWidth > circleWidth ? (viewWidth - circleWidth) / 2 : 0;
        int verticalMargin = viewHeight > circleHeight ? (viewHeight - circleHeight) / 2 : 0;

        // add to view
        Circle circle = new Circle(getContext(), circleStrokeWidth, getPaintInstance(circleBackgroundColor, 0, circleStrokeWidth), getPaintInstance(circleStrokeColor, 1, circleStrokeWidth));
        LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        // generate circle id
        circleId = View.generateViewId();
        // set circle id
        circle.setId(circleId);
        circle.setLayoutParams(layoutParams);


        // Set margin
        layoutParams.setMargins(horizontalMargin, verticalMargin, horizontalMargin, verticalMargin);

        // Add to views
        addView(circle);

    }

    /**
     * Method to change circle color
     *
     * @param colorInt The color hex code to set, such as #000000
     */
    public void setCircleColor(int colorInt) {
        Circle circle = (Circle) getViewById(circleId);
        circle.setCircleColor(colorInt);
    }

    /**
     * Method to change circle border color
     *
     * @param colorInt The color hex code to set, such as #000000
     */
    public void setCircleBorderColor(int colorInt) {
        Circle circle = (Circle) getViewById(circleId);
        circle.setCircleBorderColor(colorInt);
    }

    /**
     * Method to change circle border width. Please note, convert dp to px before passing the value.
     *
     * @param width The width of the border
     */
    public void setCircleBorderWidth(int width) {
        Circle circle = (Circle) getViewById(circleId);
        circle.setCircleBorderWidth(width);
    }

    /**
     * Method to adjust the circle width. Please note, convert dp to px before passing the value.
     *
     * @param width The width of the circle
     */
    public void setCircleWidth(int width) {
        Circle circle = (Circle) getViewById(circleId);
        circle.setCircleWidth(width);
    }

    /**
     * Method to adjust the circle height. Please note, convert dp to px before passing the value.
     *
     * @param height The height of the circle
     */
    public void setCircleHeight(int height) {
        Circle circle = (Circle) getViewById(circleId);
        circle.setCircleHeight(height);
    }

    /**
     * Method to define the circle size. Please note, convert dp to px before passing the value.
     * This method will override the circle width and height.
     * @param width The width of the circle
     * @param height The height of the circle
     */
    public void setCircleSize(int width, int height) {
        Circle circle = (Circle) getViewById(circleId);
        circle.setCircleSize(width, height);
    }

    /**
     * Method to reset the circle width and height to the default value, while creating the view for the first time.
     */
    public void resetCircleWidthAndHeight() {
        Circle circle = (Circle) getViewById(circleId);
        circle.resetCircleSize();
    }


    /**
     * Method to return a new instance of paint
     *
     * @return a new instance of {@link Paint}
     */
    private Paint getPaintInstance(int backgroundColor, int backgroundFillType, int strokeWidth) {

        // Define circle background paint
        Paint backgroundPaint = new Paint();
        backgroundPaint.setAntiAlias(true);
        if (backgroundFillType == 0) {
            backgroundPaint.setStyle(Paint.Style.FILL);
        } else {
            backgroundPaint.setStyle(Paint.Style.STROKE);
            backgroundPaint.setStrokeWidth(strokeWidth);
        }
        backgroundPaint.setColor(backgroundColor);

        return backgroundPaint;
    }


}
