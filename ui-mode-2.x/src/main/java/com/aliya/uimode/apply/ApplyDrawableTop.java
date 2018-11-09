package com.aliya.uimode.apply;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

/**
 * 应用android:drawableTop {@link TextView}
 *
 * @author a_liYa
 * @date 2017/6/26 12:33.
 */
public final class ApplyDrawableTop extends AbsApplyTextViewDrawable {

    @Override
    protected void setDrawablePolicy(TextView v, Drawable drawable) {
        setCompoundDrawablesPolicy(v, null, drawable, null, null);
    }

}