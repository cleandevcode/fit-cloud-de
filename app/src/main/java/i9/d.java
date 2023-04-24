package i9;

import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.util.WeakHashMap;
import k1.e0;
import k1.i2;
import k1.n2;
import k1.o0;

/* loaded from: classes.dex */
public final class d implements e0 {

    /* renamed from: a */
    public final /* synthetic */ CollapsingToolbarLayout f16736a;

    public d(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f16736a = collapsingToolbarLayout;
    }

    @Override // k1.e0
    public final n2 a(View view, n2 n2Var) {
        n2 n2Var2;
        CollapsingToolbarLayout collapsingToolbarLayout = this.f16736a;
        collapsingToolbarLayout.getClass();
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        if (o0.d.b(collapsingToolbarLayout)) {
            n2Var2 = n2Var;
        } else {
            n2Var2 = null;
        }
        if (!j1.b.a(collapsingToolbarLayout.f6219y, n2Var2)) {
            collapsingToolbarLayout.f6219y = n2Var2;
            collapsingToolbarLayout.requestLayout();
        }
        return n2Var.f18130a.c();
    }
}
