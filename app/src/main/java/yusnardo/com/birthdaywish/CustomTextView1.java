package yusnardo.com.birthdaywish;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Yusnardo on 03/07/2017.
 */

public class CustomTextView1 extends TextView {
    public CustomTextView1(Context context) {
        super(context);

        applyCustomFont(context);
    }

    public CustomTextView1(Context context, AttributeSet attrs) {
        super(context, attrs);

        applyCustomFont(context);
    }

    public CustomTextView1(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface("GloriaHallelujah.ttf", context);
        setTypeface(customFont);
    }
}
