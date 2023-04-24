package tc;

import android.content.IntentFilter;
import fl.g;

/* loaded from: classes.dex */
public final class b0 implements tk.k<Boolean> {

    /* renamed from: a */
    public final /* synthetic */ c0 f27962a;

    public b0(c0 c0Var) {
        this.f27962a = c0Var;
    }

    @Override // tk.k
    public final void a(g.a aVar) {
        boolean a10 = this.f27962a.f27965b.a();
        z zVar = new z(this, aVar);
        aVar.d(Boolean.valueOf(a10));
        this.f27962a.f27964a.registerReceiver(zVar, new IntentFilter("android.location.MODE_CHANGED"));
        aVar.e(new a0(this, zVar));
    }
}
