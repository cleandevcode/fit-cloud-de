package l3;

import android.content.Context;
import android.os.Build;
import f3.m;
import f3.n;
import m3.i;
import o3.p;

/* loaded from: classes.dex */
public final class f extends c<k3.b> {

    /* renamed from: e */
    public static final String f19390e = m.e("NetworkNotRoamingCtrlr");

    public f(Context context, r3.a aVar) {
        super(i.a(context, aVar).f20352c);
    }

    @Override // l3.c
    public final boolean b(p pVar) {
        if (pVar.f22634j.f14066a == n.NOT_ROAMING) {
            return true;
        }
        return false;
    }

    @Override // l3.c
    public final boolean c(k3.b bVar) {
        k3.b bVar2 = bVar;
        boolean z10 = true;
        if (Build.VERSION.SDK_INT < 24) {
            m.c().a(f19390e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !bVar2.f18188a;
        }
        if (bVar2.f18188a && bVar2.f18191d) {
            z10 = false;
        }
        return z10;
    }
}
