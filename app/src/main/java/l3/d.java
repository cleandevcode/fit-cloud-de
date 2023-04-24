package l3;

import android.content.Context;
import android.os.Build;
import f3.n;
import m3.i;
import o3.p;

/* loaded from: classes.dex */
public final class d extends c<k3.b> {
    public d(Context context, r3.a aVar) {
        super(i.a(context, aVar).f20352c);
    }

    @Override // l3.c
    public final boolean b(p pVar) {
        if (pVar.f22634j.f14066a == n.CONNECTED) {
            return true;
        }
        return false;
    }

    @Override // l3.c
    public final boolean c(k3.b bVar) {
        k3.b bVar2 = bVar;
        if (Build.VERSION.SDK_INT >= 26) {
            if (!bVar2.f18188a || !bVar2.f18189b) {
                return true;
            }
            return false;
        }
        return true ^ bVar2.f18188a;
    }
}
