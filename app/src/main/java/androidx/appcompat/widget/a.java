package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: a */
    public final C0019a f1253a;

    /* renamed from: b */
    public final Context f1254b;

    /* renamed from: c */
    public ActionMenuView f1255c;

    /* renamed from: d */
    public c f1256d;

    /* renamed from: e */
    public int f1257e;

    /* renamed from: f */
    public k1.i2 f1258f;

    /* renamed from: g */
    public boolean f1259g;

    /* renamed from: h */
    public boolean f1260h;

    /* renamed from: androidx.appcompat.widget.a$a */
    /* loaded from: classes.dex */
    public class C0019a implements k1.j2 {

        /* renamed from: a */
        public boolean f1261a = false;

        /* renamed from: b */
        public int f1262b;

        public C0019a() {
            a.this = r1;
        }

        @Override // k1.j2
        public final void a(View view) {
            this.f1261a = true;
        }

        @Override // k1.j2
        public final void c() {
            a.super.setVisibility(0);
            this.f1261a = false;
        }

        @Override // k1.j2
        public final void e() {
            if (this.f1261a) {
                return;
            }
            a aVar = a.this;
            aVar.f1258f = null;
            a.super.setVisibility(this.f1262b);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1253a = new C0019a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1254b = context;
        } else {
            this.f1254b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int c(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - 0);
    }

    public static int d(int i10, int i11, int i12, View view, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public final k1.i2 e(int i10, long j10) {
        k1.i2 i2Var = this.f1258f;
        if (i2Var != null) {
            i2Var.b();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            k1.i2 a10 = k1.o0.a(this);
            a10.a(1.0f);
            a10.c(j10);
            C0019a c0019a = this.f1253a;
            a.this.f1258f = a10;
            c0019a.f1262b = i10;
            a10.d(c0019a);
            return a10;
        }
        k1.i2 a11 = k1.o0.a(this);
        a11.a(0.0f);
        a11.c(j10);
        C0019a c0019a2 = this.f1253a;
        a.this.f1258f = a11;
        c0019a2.f1262b = i10;
        a11.d(c0019a2);
        return a11;
    }

    public int getAnimatedVisibility() {
        return this.f1258f != null ? this.f1253a.f1262b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1257e;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(R.styleable.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f1256d;
        if (cVar != null) {
            Configuration configuration2 = cVar.f873b.getResources().getConfiguration();
            int i11 = configuration2.screenWidthDp;
            int i12 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i11 <= 600 && ((i11 <= 960 || i12 <= 720) && (i11 <= 720 || i12 <= 960))) {
                if (i11 < 500 && ((i11 <= 640 || i12 <= 480) && (i11 <= 480 || i12 <= 640))) {
                    if (i11 >= 360) {
                        i10 = 3;
                    } else {
                        i10 = 2;
                    }
                } else {
                    i10 = 4;
                }
            } else {
                i10 = 5;
            }
            cVar.f1280q = i10;
            androidx.appcompat.view.menu.f fVar = cVar.f874c;
            if (fVar != null) {
                fVar.p(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1260h = false;
        }
        if (!this.f1260h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1260h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1260h = false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1259g = false;
        }
        if (!this.f1259g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1259g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1259g = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f1257e = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            k1.i2 i2Var = this.f1258f;
            if (i2Var != null) {
                i2Var.b();
            }
            super.setVisibility(i10);
        }
    }
}
