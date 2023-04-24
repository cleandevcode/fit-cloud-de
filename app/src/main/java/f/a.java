package f;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.R;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: f.a$a */
    /* loaded from: classes.dex */
    public static class C0245a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f13867a;

        public C0245a() {
            super(-2, -2);
            this.f13867a = 8388627;
        }

        public C0245a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13867a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionBarLayout);
            this.f13867a = obtainStyledAttributes.getInt(R.styleable.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0245a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f13867a = 0;
        }

        public C0245a(C0245a c0245a) {
            super((ViewGroup.MarginLayoutParams) c0245a);
            this.f13867a = 0;
            this.f13867a = c0245a.f13867a;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }
}
