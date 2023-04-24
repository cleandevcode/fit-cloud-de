package k1;

import android.view.View;
import k1.o0;

/* loaded from: classes.dex */
public final class k0 extends o0.b<Boolean> {
    public k0(int i10) {
        super(i10, Boolean.class, 0, 28);
    }

    @Override // k1.o0.b
    public final Boolean b(View view) {
        return Boolean.valueOf(o0.m.d(view));
    }

    @Override // k1.o0.b
    public final void c(View view, Boolean bool) {
        o0.m.i(view, bool.booleanValue());
    }

    @Override // k1.o0.b
    public final boolean f(Boolean bool, Boolean bool2) {
        return !o0.b.a(bool, bool2);
    }
}
