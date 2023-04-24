package w6;

import android.content.Context;
import android.view.View;
import com.github.kilnn.refreshloadlayout.RefreshLoadLayout;
import k1.o0;

/* loaded from: classes.dex */
public abstract class a extends d {

    /* renamed from: a */
    public RefreshLoadLayout f29751a;

    /* renamed from: b */
    public int f29752b;

    /* renamed from: c */
    public int f29753c;

    /* renamed from: d */
    public int f29754d;

    public a(Context context) {
        super(context);
        this.f29752b = Integer.MIN_VALUE;
    }

    @Override // w6.c
    public final void b() {
        this.f29754d = this.f29753c;
    }

    @Override // w6.c
    public final void c() {
        int measuredWidth = (this.f29751a.getMeasuredWidth() - this.f29751a.getPaddingLeft()) - this.f29751a.getPaddingRight();
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = this.f29753c;
        layout(i10, i11, measuredWidth2 + i10, measuredHeight + i11);
    }

    @Override // w6.c
    public final void e() {
    }

    @Override // w6.c
    public final void h(int i10) {
        o0.j(this, (this.f29752b + i10) - this.f29753c);
        this.f29753c = getTop();
    }

    public void i() {
        measure(View.MeasureSpec.makeMeasureSpec((this.f29751a.getMeasuredWidth() - this.f29751a.getPaddingLeft()) - this.f29751a.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((this.f29751a.getMeasuredHeight() - this.f29751a.getPaddingTop()) - this.f29751a.getPaddingBottom(), 0));
        int paddingTop = this.f29751a.getPaddingTop() - getMeasuredHeight();
        if (this.f29752b != paddingTop) {
            this.f29752b = paddingTop;
            this.f29753c = paddingTop;
        }
    }

    @Override // w6.c
    public final void j(int i10, float f10) {
        if (i10 != 1 && i10 != 4) {
            if (i10 == 2 || i10 == 3) {
                int contentHeight = (getContentHeight() + this.f29751a.getPaddingTop()) - getMeasuredHeight();
                int i11 = this.f29754d;
                o0.j(this, (i11 + ((int) ((contentHeight - i11) * f10))) - getTop());
                this.f29753c = getTop();
                return;
            }
            return;
        }
        int i12 = this.f29754d;
        o0.j(this, (i12 + ((int) ((this.f29752b - i12) * f10))) - getTop());
        this.f29753c = getTop();
    }

    public abstract void l();

    @Override // w6.c
    public final void reset() {
        h(0);
        l();
    }
}
