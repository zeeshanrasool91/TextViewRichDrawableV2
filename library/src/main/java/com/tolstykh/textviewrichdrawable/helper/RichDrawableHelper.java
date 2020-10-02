package com.tolstykh.textviewrichdrawable.helper;


import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;

import com.tolstykh.library.R;
import com.tolstykh.textviewrichdrawable.DensityUtils;
import com.tolstykh.textviewrichdrawable.DrawableEnriched;

public class RichDrawableHelper implements DrawableEnriched {

    private static final int START_DRAWABLE_INDEX = 0;
    private static final int TOP_DRAWABLE_INDEX = 1;
    private static final int END_DRAWABLE_INDEX = 2;
    private static final int BOTTOM_DRAWABLE_INDEX = 3;

    private Context mContext;


    public int getmDrawableStartWidth() {
        return mDrawableStartWidth;
    }

    public void setmDrawableStartWidth(int mDrawableStartWidth) {
        this.mDrawableStartWidth = DensityUtils.dpToPx(mDrawableStartWidth,mContext);
    }

    public int getmDrawableStartHeight() {
        return mDrawableStartHeight;
    }

    public void setmDrawableStartHeight(int mDrawableStartHeight) {
        this.mDrawableStartHeight = DensityUtils.dpToPx(mDrawableStartHeight,mContext);
    }

    public int getmDrawableEndWidth() {
        return mDrawableEndWidth;
    }

    public void setmDrawableEndWidth(int mDrawableEndWidth) {
        this.mDrawableEndWidth = DensityUtils.dpToPx(mDrawableEndWidth,mContext);
    }

    public int getmDrawableEndHeight() {
        return mDrawableEndHeight;
    }

    public void setmDrawableEndHeight(int mDrawableEndHeight) {
        this.mDrawableEndHeight = DensityUtils.dpToPx(mDrawableEndHeight,mContext);
    }

    public int getmDrawableTopWidth() {
        return mDrawableTopWidth;
    }

    public void setmDrawableTopWidth(int mDrawableTopWidth) {
        this.mDrawableTopWidth = DensityUtils.dpToPx(mDrawableTopWidth,mContext);
    }

    public int getmDrawableTopHeight() {
        return mDrawableTopHeight;
    }

    public void setmDrawableTopHeight(int mDrawableTopHeight) {
        this.mDrawableTopHeight = DensityUtils.dpToPx(mDrawableTopHeight,mContext);
    }

    public int getmDrawableBottomWidth() {
        return mDrawableBottomWidth;
    }

    public void setmDrawableBottomWidth(int mDrawableBottomWidth) {
        this.mDrawableBottomWidth = DensityUtils.dpToPx(mDrawableBottomWidth,mContext);
    }

    public int getmDrawableBottomHeight() {
        return mDrawableBottomHeight;
    }

    public void setmDrawableBottomHeight(int mDrawableBottomHeight) {
        this.mDrawableBottomHeight = DensityUtils.dpToPx(mDrawableBottomHeight,mContext);
    }

    public void setAllSame(boolean allSame) {
        this.allSame = allSame;
    }

    public int getDrawableTintStart() {
        return drawableTintStart;
    }

    public void setDrawableTintStart(int drawableTintStart) {
        this.drawableTintStart = drawableTintStart;
    }

    public int getDrawableTintEnd() {
        return drawableTintEnd;
    }

    public void setDrawableTintEnd(int drawableTintEnd) {
        this.drawableTintEnd = drawableTintEnd;
    }

    public int getDrawableTintBottom() {
        return drawableTintBottom;
    }

    public void setDrawableTintBottom(int drawableTintBottom) {
        this.drawableTintBottom = drawableTintBottom;
    }

    public int getDrawableTintTop() {
        return drawableTintTop;
    }

    public void setDrawableTintTop(int drawableTintTop) {
        this.drawableTintTop = drawableTintTop;
    }

    private int mDrawableStartWidth;
    private int mDrawableStartHeight;
    private int mDrawableEndWidth;
    private int mDrawableEndHeight;
    private int mDrawableTopWidth;
    private int mDrawableTopHeight;
    private int mDrawableBottomWidth;
    private int mDrawableBottomHeight;

    private boolean allSame;
    @ColorInt
    private int drawableTintStart;
    @ColorInt
    private int drawableTintEnd;
    @ColorInt
    private int drawableTintBottom;
    @ColorInt
    private int drawableTintTop;

    public int getDefaultDrawableWidth() {
        return defaultDrawableWidth;
    }

    public void setDefaultDrawableWidth(int defaultDrawableWidth) {
        this.defaultDrawableWidth = DensityUtils.dpToPx(defaultDrawableWidth,mContext);
    }

    public int getDefaultDrawableHeight() {
        return defaultDrawableHeight;
    }

    public void setDefaultDrawableHeight(int defaultDrawableHeight) {
        this.defaultDrawableHeight = DensityUtils.dpToPx(defaultDrawableHeight,mContext);
    }

    private int defaultDrawableWidth;
    private int defaultDrawableHeight;

    private int mDrawableStartVectorId;
    private int mDrawableTopVectorId;
    private int mDrawableEndVectorId;
    private int mDrawableBottomVectorId;


    public RichDrawableHelper(@NonNull Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        mContext = context;

        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.TextViewRichDrawable, defStyleAttr, defStyleRes);

        try {
            defaultDrawableWidth = array.getDimensionPixelSize(R.styleable.TextViewRichDrawable_compoundDrawableWidth, UNDEFINED);
            defaultDrawableHeight = array.getDimensionPixelSize(R.styleable.TextViewRichDrawable_compoundDrawableHeight, UNDEFINED);

            mDrawableStartWidth = array.getDimensionPixelSize(R.styleable.TextViewRichDrawable_compoundDrawableStartWidth, UNDEFINED);
            mDrawableStartHeight = array.getDimensionPixelSize(R.styleable.TextViewRichDrawable_compoundDrawableStartHeight, UNDEFINED);

            mDrawableEndWidth = array.getDimensionPixelSize(R.styleable.TextViewRichDrawable_compoundDrawableEndWidth, UNDEFINED);
            mDrawableEndHeight = array.getDimensionPixelSize(R.styleable.TextViewRichDrawable_compoundDrawableEndHeight, UNDEFINED);

            mDrawableTopWidth = array.getDimensionPixelSize(R.styleable.TextViewRichDrawable_compoundDrawableTopWidth, UNDEFINED);
            mDrawableTopHeight = array.getDimensionPixelSize(R.styleable.TextViewRichDrawable_compoundDrawableTopHeight, UNDEFINED);

            mDrawableBottomWidth = array.getDimensionPixelSize(R.styleable.TextViewRichDrawable_compoundDrawableBottomWidth, UNDEFINED);
            mDrawableBottomHeight = array.getDimensionPixelSize(R.styleable.TextViewRichDrawable_compoundDrawableBottomHeight, UNDEFINED);
            //Sizing Attributes
            allSame = array.getBoolean(R.styleable.TextViewRichDrawable_widthHeightAllSame, true);

            drawableTintStart = array.getColor(R.styleable.TextViewRichDrawable_drawableTintStart, UNDEFINED);
            drawableTintEnd = array.getColor(R.styleable.TextViewRichDrawable_drawableTintEnd, UNDEFINED);
            drawableTintTop = array.getColor(R.styleable.TextViewRichDrawable_drawableTintTop, UNDEFINED);
            drawableTintBottom = array.getColor(R.styleable.TextViewRichDrawable_drawableTintBottom, UNDEFINED);

            mDrawableStartVectorId = array.getResourceId(R.styleable.TextViewRichDrawable_drawableStartVector, UNDEFINED);
            mDrawableTopVectorId = array.getResourceId(R.styleable.TextViewRichDrawable_drawableTopVector, UNDEFINED);
            mDrawableEndVectorId = array.getResourceId(R.styleable.TextViewRichDrawable_drawableEndVector, UNDEFINED);
            mDrawableBottomVectorId = array.getResourceId(R.styleable.TextViewRichDrawable_drawableBottomVector, UNDEFINED);
        } finally {
            array.recycle();
        }
    }

    private void inflateVectors(int drawableStartVectorId, int drawableTopVectorId, int drawableEndVectorId, int drawableBottomVectorId, Drawable[] drawables) {
        Log.d("INFLATE_VECTORS", "inflateVectors: "+drawableStartVectorId + "/"+drawableTopVectorId + "/"+drawableEndVectorId +"/"+ drawableBottomVectorId);
        if (drawableStartVectorId != UNDEFINED ) {
            drawables[START_DRAWABLE_INDEX] = ContextCompat.getDrawable(mContext, drawableStartVectorId);
        }
        if (drawableTopVectorId != UNDEFINED) {
            drawables[TOP_DRAWABLE_INDEX] = ContextCompat.getDrawable(mContext, drawableTopVectorId);
        }
        if (drawableEndVectorId != UNDEFINED ) {
            drawables[END_DRAWABLE_INDEX] = ContextCompat.getDrawable(mContext, drawableEndVectorId);
        }
        if (drawableBottomVectorId != UNDEFINED ) {
            drawables[BOTTOM_DRAWABLE_INDEX] = ContextCompat.getDrawable(mContext, drawableBottomVectorId);
        }
    }

    public void apply(TextView textView) {
        initCompoundDrawables(textView);
    }

    private void initCompoundDrawables(TextView textView) {
        int mDrawableWidth = UNDEFINED;
        int mDrawableHeight = UNDEFINED;
        int drawableTint = UNDEFINED;
        Drawable[] drawables = textView.getCompoundDrawablesRelative();
        if (mDrawableStartVectorId > 0 || mDrawableTopVectorId > 0 || mDrawableEndVectorId > 0 || mDrawableBottomVectorId > 0) {
            inflateVectors(mDrawableStartVectorId, mDrawableTopVectorId, mDrawableEndVectorId, mDrawableBottomVectorId, drawables);
            textView.setCompoundDrawablesRelative(drawables[START_DRAWABLE_INDEX], drawables[TOP_DRAWABLE_INDEX], drawables[END_DRAWABLE_INDEX], drawables[BOTTOM_DRAWABLE_INDEX]);
        }
        for (int i = 0; i < drawables.length; i++) {
            //Log.d("IndexTest", i + "" + drawables[i]);
            switch (i) {
                case START_DRAWABLE_INDEX:
                    mDrawableWidth = setValue(defaultDrawableWidth, mDrawableStartWidth);
                    mDrawableHeight = setValue(defaultDrawableHeight, mDrawableStartHeight);
                    drawableTint = drawableTintStart;
                    break;
                case END_DRAWABLE_INDEX:
                    mDrawableWidth = setValue(defaultDrawableWidth, mDrawableEndWidth);
                    mDrawableHeight = setValue(defaultDrawableHeight, mDrawableEndHeight);
                    drawableTint = drawableTintEnd;
                    break;
                case TOP_DRAWABLE_INDEX:
                    mDrawableWidth = setValue(defaultDrawableWidth, mDrawableTopWidth);
                    mDrawableHeight = setValue(defaultDrawableHeight, mDrawableTopHeight);
                    drawableTint = drawableTintBottom;
                    break;
                case BOTTOM_DRAWABLE_INDEX:
                    mDrawableWidth = setValue(defaultDrawableWidth, mDrawableBottomWidth);
                    mDrawableHeight = setValue(defaultDrawableHeight, mDrawableBottomHeight);
                    drawableTint = drawableTintTop;
                    break;
            }
            Drawable drawable = drawables[i];
            if (drawable == null) {
                continue;
            }
            scale(drawable, mDrawableHeight, mDrawableWidth);
            Log.d("DrawableTint", drawableTint + "");
            applyDrawableTint(drawable, drawableTint);
        }
        //textView.setCompoundDrawables(drawables[START_DRAWABLE_INDEX], drawables[TOP_DRAWABLE_INDEX], drawables[END_DRAWABLE_INDEX], drawables[BOTTOM_DRAWABLE_INDEX]);
        textView.setCompoundDrawablesRelative(drawables[START_DRAWABLE_INDEX], drawables[TOP_DRAWABLE_INDEX], drawables[END_DRAWABLE_INDEX], drawables[BOTTOM_DRAWABLE_INDEX]);
        //textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawables[START_DRAWABLE_INDEX], drawables[TOP_DRAWABLE_INDEX], drawables[END_DRAWABLE_INDEX], drawables[BOTTOM_DRAWABLE_INDEX]);
        //textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawables[START_DRAWABLE_INDEX], drawables[TOP_DRAWABLE_INDEX], drawables[END_DRAWABLE_INDEX], drawables[BOTTOM_DRAWABLE_INDEX]);
    }

    private void scale(Drawable drawable, int mDrawableHeight, int mDrawableWidth) {
        if (mDrawableHeight > 0 || mDrawableWidth > 0) {
            Rect realBounds = new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            float actualDrawableWidth = realBounds.width();
            float actualDrawableHeight = realBounds.height();
            float actualDrawableRatio = actualDrawableHeight / actualDrawableWidth;

            float scale;
            // check if both width and height defined then adjust drawable size according to the ratio
            if (mDrawableHeight > 0 && mDrawableWidth > 0) {
                float placeholderRatio = mDrawableHeight / (float) mDrawableWidth;
                if (placeholderRatio > actualDrawableRatio) {
                    scale = mDrawableWidth / actualDrawableWidth;
                } else {
                    scale = mDrawableHeight / actualDrawableHeight;
                }
            } else if (mDrawableHeight > 0) { // only height defined
                scale = mDrawableHeight / actualDrawableHeight;
            } else { // only width defined
                scale = mDrawableWidth / actualDrawableWidth;
            }

            actualDrawableWidth = actualDrawableWidth * scale;
            actualDrawableHeight = actualDrawableHeight * scale;

            realBounds.right = realBounds.left + Math.round(actualDrawableWidth);
            realBounds.bottom = realBounds.top + Math.round(actualDrawableHeight);

            drawable.setBounds(realBounds);
        } else {
            drawable.setBounds(new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()));
        }
    }


    /**
     * {@inheritDoc}
     */
    public int getCompoundDrawableHeight() {
        return defaultDrawableHeight;
    }

    /**
     * {@inheritDoc}
     */
    public int getCompoundDrawableWidth() {
        return defaultDrawableWidth;
    }

    /**
     * {@inheritDoc}
     */
    public int getDrawableStartWidth() {
        return mDrawableStartWidth;
    }

    /**
     * {@inheritDoc}
     */
    public int getDrawableStartHeight() {
        return mDrawableStartHeight;
    }

    /**
     * {@inheritDoc}
     */
    public int getDrawableEndWidth() {
        return mDrawableEndWidth;
    }

    /**
     * {@inheritDoc}
     */
    public int getDrawableEndHeight() {
        return mDrawableEndHeight;
    }

    /**
     * {@inheritDoc}
     */
    public int getDrawableTopWidth() {
        return mDrawableTopWidth;
    }

    /**
     * {@inheritDoc}
     */
    public int getDrawableTopHeight() {
        return mDrawableTopHeight;
    }

    /**
     * {@inheritDoc}
     */
    public int getDrawableBottomWidth() {
        return mDrawableBottomWidth;
    }

    /**
     * {@inheritDoc}
     */
    public int getDrawableBottomHeight() {
        return mDrawableBottomHeight;
    }

    private int setValue(int initialValue, int myValue) {
        int finalValue = initialValue;
        if (!allSame && myValue != UNDEFINED) {
            finalValue = myValue;
        }
        return finalValue;
    }

    /**
     * {@inheritDoc}
     */
    public Context getContext() {
        return mContext;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isAllSame() {
        return allSame;
    }

    public void applyDrawableTint(Drawable drawable, @ColorInt int mDrawableTint) {
        if (mDrawableTint == UNDEFINED)
            return;
        drawable.setColorFilter(new PorterDuffColorFilter(mDrawableTint, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public void setDrawableStartVectorId(@DrawableRes int id) {
        mDrawableStartVectorId = id;
    }

    @Override
    public void setDrawableEndVectorId(@DrawableRes int id) {
        mDrawableEndVectorId = id;
    }

    @Override
    public void setDrawableTopVectorId(@DrawableRes int id) {
        mDrawableTopVectorId = id;
    }

    @Override
    public void setDrawableBottomVectorId(@DrawableRes int id) {
        mDrawableBottomVectorId = id;
    }
}
