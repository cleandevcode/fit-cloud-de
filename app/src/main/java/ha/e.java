package ha;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* loaded from: classes.dex */
public final class e extends k1.a {

    /* renamed from: d */
    public final /* synthetic */ BaseTransientBottomBar f16066d;

    public e(BaseTransientBottomBar baseTransientBottomBar) {
        this.f16066d = baseTransientBottomBar;
    }

    @Override // k1.a
    public final void d(View view, l1.j jVar) {
        this.f18085a.onInitializeAccessibilityNodeInfo(view, jVar.f18670a);
        jVar.a(1048576);
        jVar.f18670a.setDismissable(true);
    }

    @Override // k1.a
    public final boolean g(View view, int i10, Bundle bundle) {
        if (i10 == 1048576) {
            this.f16066d.a();
            return true;
        }
        return super.g(view, i10, bundle);
    }
}
