package w6;

import android.view.View;
import com.github.kilnn.refreshloadlayout.RefreshLoadLayout;
import k1.o0;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a */
    public RefreshLoadLayout f29755a;

    /* renamed from: b */
    public int f29756b = Integer.MIN_VALUE;

    /* renamed from: c */
    public int f29757c;

    /* renamed from: d */
    public int f29758d;

    @Override // w6.c
    public final void a(boolean z10) {
    }

    @Override // w6.c
    public final void b() {
        this.f29758d = this.f29757c;
    }

    @Override // w6.c
    public final void c() {
        View targetView = this.f29755a.getTargetView();
        if (targetView == null) {
            return;
        }
        int measuredWidth = (this.f29755a.getMeasuredWidth() - this.f29755a.getPaddingLeft()) - this.f29755a.getPaddingRight();
        int measuredHeight = (this.f29755a.getMeasuredHeight() - this.f29755a.getPaddingTop()) - this.f29755a.getPaddingBottom();
        int paddingLeft = this.f29755a.getPaddingLeft();
        int i10 = this.f29757c;
        targetView.layout(paddingLeft, i10, measuredWidth + paddingLeft, measuredHeight + i10);
    }

    @Override // w6.c
    public final void d() {
    }

    @Override // w6.c
    public final void e() {
    }

    @Override // w6.c
    public final void f(float f10) {
    }

    @Override // w6.c
    public final void g() {
    }

    @Override // w6.c
    public final void h(int i10) {
        View targetView = this.f29755a.getTargetView();
        if (targetView == null) {
            return;
        }
        o0.j(targetView, (this.f29756b + i10) - this.f29757c);
        this.f29757c = targetView.getTop();
    }

    @Override // w6.c
    public final void i() {
        View targetView = this.f29755a.getTargetView();
        if (targetView == null) {
            return;
        }
        targetView.measure(View.MeasureSpec.makeMeasureSpec((this.f29755a.getMeasuredWidth() - this.f29755a.getPaddingLeft()) - this.f29755a.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((this.f29755a.getMeasuredHeight() - this.f29755a.getPaddingTop()) - this.f29755a.getPaddingBottom(), 1073741824));
        int paddingTop = this.f29755a.getPaddingTop();
        if (this.f29756b != paddingTop) {
            this.f29756b = paddingTop;
            this.f29757c = paddingTop;
        }
    }

    @Override // w6.c
    public final void j(int i10, float f10) {
        View targetView;
        d refreshView;
        if (i10 != 1 && i10 != 4) {
            if ((i10 == 2 || i10 == 3) && (targetView = this.f29755a.getTargetView()) != null && (refreshView = this.f29755a.getRefreshView()) != null) {
                int contentHeight = refreshView.getContentHeight() + this.f29755a.getPaddingTop();
                int i11 = this.f29758d;
                o0.j(targetView, (i11 + ((int) ((contentHeight - i11) * f10))) - targetView.getTop());
                this.f29757c = targetView.getTop();
                return;
            }
            return;
        }
        View targetView2 = this.f29755a.getTargetView();
        if (targetView2 != null) {
            int i12 = this.f29758d;
            o0.j(targetView2, (i12 + ((int) ((this.f29756b - i12) * f10))) - targetView2.getTop());
            this.f29757c = targetView2.getTop();
        }
    }

    @Override // w6.c
    public final void k() {
    }

    @Override // w6.c
    public final void reset() {
        h(0);
    }
}
