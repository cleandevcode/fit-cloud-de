package i9;

import android.view.View;
import k1.o0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public final View f16754a;

    /* renamed from: b */
    public int f16755b;

    /* renamed from: c */
    public int f16756c;

    /* renamed from: d */
    public int f16757d;

    public i(View view) {
        this.f16754a = view;
    }

    public final void a() {
        View view = this.f16754a;
        o0.j(view, this.f16757d - (view.getTop() - this.f16755b));
        View view2 = this.f16754a;
        o0.i(view2, 0 - (view2.getLeft() - this.f16756c));
    }

    public final boolean b(int i10) {
        if (this.f16757d != i10) {
            this.f16757d = i10;
            a();
            return true;
        }
        return false;
    }
}
