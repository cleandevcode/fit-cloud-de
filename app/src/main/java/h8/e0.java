package h8;

import android.util.Log;
import g8.a;

/* loaded from: classes.dex */
public final class e0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ f8.a f15943a;

    /* renamed from: b */
    public final /* synthetic */ f0 f15944b;

    public e0(f0 f0Var, f8.a aVar) {
        this.f15944b = f0Var;
        this.f15943a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        i8.j jVar;
        f0 f0Var = this.f15944b;
        c0 c0Var = (c0) f0Var.f15950f.f15934j.get(f0Var.f15946b);
        if (c0Var == null) {
            return;
        }
        f8.a aVar = this.f15943a;
        if (aVar.f14170b == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f0 f0Var2 = this.f15944b;
            f0Var2.f15949e = true;
            if (f0Var2.f15945a.l()) {
                f0 f0Var3 = this.f15944b;
                if (f0Var3.f15949e && (jVar = f0Var3.f15947c) != null) {
                    f0Var3.f15945a.g(jVar, f0Var3.f15948d);
                    return;
                }
                return;
            }
            try {
                a.e eVar = this.f15944b.f15945a;
                eVar.g(null, eVar.a());
                return;
            } catch (SecurityException e10) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                this.f15944b.f15945a.b("Failed to get service from broker.");
                aVar = new f8.a(10);
            }
        }
        c0Var.p(aVar, null);
    }
}
