package l7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.github.kilnn.tool.R;
import gm.l;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final View f19395a;

    /* renamed from: b */
    public final a f19396b;

    /* renamed from: c */
    public Drawable f19397c;

    /* renamed from: d */
    public int f19398d;

    /* renamed from: e */
    public Drawable f19399e;

    /* renamed from: f */
    public boolean f19400f;

    /* renamed from: g */
    public final Rect f19401g;

    public b(View view) {
        l.f(view, "view");
        this.f19395a = view;
        this.f19396b = (a) view;
        this.f19401g = new Rect();
    }

    public static void a(b bVar, Context context, AttributeSet attributeSet) {
        l.f(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PreferenceView, 0, 0);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr…efStyleAttr, defStyleRes)");
        bVar.f19397c = obtainStyledAttributes.getDrawable(R.styleable.PreferenceView_preferenceDivider);
        bVar.f19398d = obtainStyledAttributes.getInt(R.styleable.PreferenceView_showPreferenceDividers, 0);
        bVar.f19399e = obtainStyledAttributes.getDrawable(R.styleable.PreferenceView_preferenceIndicator);
        bVar.f19400f = obtainStyledAttributes.getBoolean(R.styleable.PreferenceView_showPreferenceIndicator, false);
        obtainStyledAttributes.recycle();
        bVar.l();
    }

    public final boolean b() {
        return (this.f19398d == 0 || this.f19397c == null) ? false : true;
    }

    public final boolean c() {
        return this.f19400f && this.f19399e != null;
    }

    public final void d(Canvas canvas) {
        int i10;
        int i11;
        l.f(canvas, "canvas");
        if (b()) {
            Drawable drawable = this.f19397c;
            l.c(drawable);
            if (drawable instanceof InsetDrawable) {
                i11 = 0;
                i10 = 0;
            } else if (this.f19395a.getLayoutDirection() == 1) {
                Rect rect = this.f19401g;
                i10 = rect.right;
                i11 = rect.left;
            } else {
                Rect rect2 = this.f19401g;
                i10 = rect2.left;
                i11 = rect2.right;
            }
            if ((this.f19398d & 1) != 0) {
                drawable.setBounds(i10, 0, this.f19395a.getWidth() - i11, drawable.getIntrinsicHeight());
                drawable.draw(canvas);
            }
            if ((this.f19398d & 2) != 0) {
                drawable.setBounds(i10, this.f19395a.getHeight() - drawable.getIntrinsicHeight(), this.f19395a.getWidth() - i11, this.f19395a.getHeight());
                drawable.draw(canvas);
            }
        }
        if (c()) {
            Drawable drawable2 = this.f19399e;
            l.c(drawable2);
            int height = (this.f19395a.getHeight() / 2) - (drawable2.getIntrinsicHeight() / 2);
            int intrinsicHeight = (drawable2.getIntrinsicHeight() / 2) + (this.f19395a.getHeight() / 2);
            if (this.f19395a.getLayoutDirection() == 1) {
                drawable2.setBounds(this.f19395a.getPaddingEnd() - drawable2.getIntrinsicWidth(), height, this.f19395a.getPaddingEnd(), intrinsicHeight);
            } else {
                drawable2.setBounds(this.f19395a.getWidth() - this.f19395a.getPaddingEnd(), height, drawable2.getIntrinsicWidth() + (this.f19395a.getWidth() - this.f19395a.getPaddingEnd()), intrinsicHeight);
            }
            drawable2.draw(canvas);
        }
    }

    public final void e() {
        boolean b10 = b();
        boolean c10 = c();
        if (b10 || c10) {
            int paddingTop = this.f19395a.getPaddingTop();
            int paddingBottom = this.f19395a.getPaddingBottom();
            if (b10) {
                Drawable drawable = this.f19397c;
                l.c(drawable);
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int i10 = this.f19398d;
                if ((i10 & 1) != 0) {
                    paddingTop -= intrinsicHeight;
                }
                if ((i10 & 2) != 0) {
                    paddingBottom -= intrinsicHeight;
                }
            }
            int paddingEnd = this.f19395a.getPaddingEnd();
            if (c10) {
                Drawable drawable2 = this.f19399e;
                l.c(drawable2);
                paddingEnd -= drawable2.getIntrinsicWidth();
            }
            this.f19396b.c(this.f19395a.getPaddingStart(), paddingTop, paddingEnd, paddingBottom);
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        e();
        boolean b10 = b();
        boolean c10 = c();
        if (b10) {
            Drawable drawable = this.f19397c;
            l.c(drawable);
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i14 = this.f19398d;
            if ((i14 & 1) != 0) {
                i11 += intrinsicHeight;
            }
            if ((i14 & 2) != 0) {
                i13 += intrinsicHeight;
            }
        }
        if (c10) {
            Drawable drawable2 = this.f19399e;
            l.c(drawable2);
            i12 += drawable2.getIntrinsicWidth();
        }
        this.f19396b.e(i10, i11, i12, i13);
    }

    public final void g(int i10, int i11, int i12, int i13) {
        e();
        boolean b10 = b();
        boolean c10 = c();
        if (b10) {
            Drawable drawable = this.f19397c;
            l.c(drawable);
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i14 = this.f19398d;
            if ((i14 & 1) != 0) {
                i11 += intrinsicHeight;
            }
            if ((i14 & 2) != 0) {
                i13 += intrinsicHeight;
            }
        }
        if (c10) {
            Drawable drawable2 = this.f19399e;
            l.c(drawable2);
            drawable2.getIntrinsicWidth();
        }
        this.f19396b.c(i10, i11, i12, i13);
    }

    public final void h(Drawable drawable) {
        if (drawable == this.f19397c) {
            return;
        }
        e();
        this.f19397c = drawable;
        l();
        this.f19395a.requestLayout();
    }

    public final void i(Drawable drawable) {
        if (drawable == this.f19399e) {
            return;
        }
        e();
        this.f19399e = drawable;
        l();
        this.f19395a.requestLayout();
    }

    public final void j(int i10) {
        if (i10 == this.f19398d) {
            return;
        }
        e();
        this.f19398d = i10;
        l();
        this.f19395a.requestLayout();
    }

    public final void k(boolean z10) {
        if (z10 == this.f19400f) {
            return;
        }
        e();
        this.f19400f = z10;
        l();
        this.f19395a.requestLayout();
    }

    public final void l() {
        boolean b10 = b();
        boolean c10 = c();
        boolean z10 = (b10 || c10) ? false : true;
        View view = this.f19395a;
        if (view instanceof ViewGroup) {
            view.setWillNotDraw(z10);
        }
        if (z10) {
            return;
        }
        int paddingTop = this.f19395a.getPaddingTop();
        int paddingBottom = this.f19395a.getPaddingBottom();
        if (b10) {
            Drawable drawable = this.f19397c;
            l.c(drawable);
            drawable.getPadding(this.f19401g);
            Drawable drawable2 = this.f19397c;
            l.c(drawable2);
            int intrinsicHeight = drawable2.getIntrinsicHeight();
            int i10 = this.f19398d;
            if ((i10 & 1) != 0) {
                paddingTop += intrinsicHeight;
            }
            if ((i10 & 2) != 0) {
                paddingBottom += intrinsicHeight;
            }
        }
        int paddingEnd = this.f19395a.getPaddingEnd();
        if (c10) {
            Drawable drawable3 = this.f19399e;
            l.c(drawable3);
            paddingEnd += drawable3.getIntrinsicWidth();
        }
        this.f19396b.c(this.f19395a.getPaddingStart(), paddingTop, paddingEnd, paddingBottom);
    }
}
