package dagger.hilt.android.internal.managers;

import android.content.Context;
import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import dagger.hilt.android.internal.managers.c;
import gm.l;
import ih.v;

/* loaded from: classes2.dex */
public final class b implements v0.b {

    /* renamed from: a */
    public final /* synthetic */ Context f12953a;

    public b(Context context) {
        this.f12953a = context;
    }

    @Override // androidx.lifecycle.v0.b
    public final s0 a(Class cls, d2.c cVar) {
        return b(cls);
    }

    @Override // androidx.lifecycle.v0.b
    public final <T extends s0> T b(Class<T> cls) {
        Context context = this.f12953a;
        l.f(context, "context");
        return new c.b(new of.d(((c.a) v.f(h7.a.j(context.getApplicationContext()), c.a.class)).f().f23090a));
    }
}
