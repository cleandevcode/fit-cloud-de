package i9;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;
import k1.e0;
import k1.i2;
import k1.n2;
import k1.o0;

/* loaded from: classes.dex */
public final class a implements e0 {

    /* renamed from: a */
    public final /* synthetic */ AppBarLayout f16735a;

    public a(AppBarLayout appBarLayout) {
        this.f16735a = appBarLayout;
    }

    @Override // k1.e0
    public final n2 a(View view, n2 n2Var) {
        n2 n2Var2;
        boolean z10;
        AppBarLayout appBarLayout = this.f16735a;
        appBarLayout.getClass();
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        if (o0.d.b(appBarLayout)) {
            n2Var2 = n2Var;
        } else {
            n2Var2 = null;
        }
        if (!j1.b.a(appBarLayout.f6165g, n2Var2)) {
            appBarLayout.f6165g = n2Var2;
            if (appBarLayout.f6176r != null && appBarLayout.getTopInset() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            appBarLayout.setWillNotDraw(!z10);
            appBarLayout.requestLayout();
        }
        return n2Var;
    }
}
