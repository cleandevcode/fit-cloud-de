package i9;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class h<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a */
    public i f16752a;

    /* renamed from: b */
    public int f16753b;

    public h() {
        this.f16753b = 0;
    }

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16753b = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        t(coordinatorLayout, v10, i10);
        if (this.f16752a == null) {
            this.f16752a = new i(v10);
        }
        i iVar = this.f16752a;
        iVar.f16755b = iVar.f16754a.getTop();
        iVar.f16756c = iVar.f16754a.getLeft();
        this.f16752a.a();
        int i11 = this.f16753b;
        if (i11 != 0) {
            this.f16752a.b(i11);
            this.f16753b = 0;
            return true;
        }
        return true;
    }

    public final int s() {
        i iVar = this.f16752a;
        if (iVar != null) {
            return iVar.f16757d;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        coordinatorLayout.s(v10, i10);
    }
}
