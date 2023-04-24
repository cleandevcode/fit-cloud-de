package l3;

import android.content.Context;
import android.os.Build;
import f3.m;
import f3.n;
import m3.i;
import o3.p;

/* loaded from: classes.dex */
public final class e extends c<k3.b> {

    /* renamed from: e */
    public static final String f19389e = m.e("NetworkMeteredCtrlr");

    public e(Context context, r3.a aVar) {
        super(i.a(context, aVar).f20352c);
    }

    @Override // l3.c
    public final boolean b(p pVar) {
        if (pVar.f22634j.f14066a == n.METERED) {
            return true;
        }
        return false;
    }

    @Override // l3.c
    public final boolean c(k3.b bVar) {
        k3.b bVar2 = bVar;
        boolean z10 = true;
        if (Build.VERSION.SDK_INT < 26) {
            m.c().a(f19389e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !bVar2.f18188a;
        }
        if (bVar2.f18188a && bVar2.f18190c) {
            z10 = false;
        }
        return z10;
    }
}
