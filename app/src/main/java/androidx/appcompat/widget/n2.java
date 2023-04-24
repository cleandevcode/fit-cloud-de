package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class n2 implements View.OnClickListener {

    /* renamed from: a */
    public final l.a f1443a;

    /* renamed from: b */
    public final /* synthetic */ o2 f1444b;

    public n2(o2 o2Var) {
        this.f1444b = o2Var;
        this.f1443a = new l.a(o2Var.f1459a.getContext(), o2Var.f1467i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o2 o2Var = this.f1444b;
        Window.Callback callback = o2Var.f1470l;
        if (callback == null || !o2Var.f1471m) {
            return;
        }
        callback.onMenuItemSelected(0, this.f1443a);
    }
}
