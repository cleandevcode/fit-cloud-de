package ha;

import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import k1.e0;
import k1.n2;

/* loaded from: classes.dex */
public final class d implements e0 {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f16065a;

    public d(BaseTransientBottomBar baseTransientBottomBar) {
        this.f16065a = baseTransientBottomBar;
    }

    @Override // k1.e0
    public final n2 a(View view, n2 n2Var) {
        this.f16065a.f6639g = n2Var.b();
        this.f16065a.f6640h = n2Var.c();
        this.f16065a.f6641i = n2Var.d();
        this.f16065a.h();
        return n2Var;
    }
}
