package l3;

import android.content.Context;
import android.os.Build;
import f3.n;
import m3.i;
import o3.p;

/* loaded from: classes.dex */
public final class g extends c<k3.b> {
    public g(Context context, r3.a aVar) {
        super(i.a(context, aVar).f20352c);
    }

    @Override // l3.c
    public final boolean b(p pVar) {
        n nVar = pVar.f22634j.f14066a;
        if (nVar != n.UNMETERED && (Build.VERSION.SDK_INT < 30 || nVar != n.TEMPORARILY_UNMETERED)) {
            return false;
        }
        return true;
    }

    @Override // l3.c
    public final boolean c(k3.b bVar) {
        k3.b bVar2 = bVar;
        if (bVar2.f18188a && !bVar2.f18190c) {
            return false;
        }
        return true;
    }
}
