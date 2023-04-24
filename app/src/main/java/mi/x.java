package mi;

import androidx.recyclerview.widget.q;
import mi.z;

/* loaded from: classes2.dex */
public final class x extends q.e<z> {
    @Override // androidx.recyclerview.widget.q.e
    public final boolean a(z zVar, z zVar2) {
        z zVar3 = zVar;
        z zVar4 = zVar2;
        gm.l.f(zVar3, "oldItem");
        gm.l.f(zVar4, "newItem");
        return gm.l.a(zVar3, zVar4);
    }

    @Override // androidx.recyclerview.widget.q.e
    public final boolean b(z zVar, z zVar2) {
        boolean z10;
        boolean z11;
        z zVar3 = zVar;
        z zVar4 = zVar2;
        gm.l.f(zVar3, "oldItem");
        gm.l.f(zVar4, "newItem");
        if ((zVar3 instanceof z.a) && (zVar4 instanceof z.a) && gm.l.a(((z.a) zVar3).f21875a.f9627a, ((z.a) zVar4).f21875a.f9627a)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((zVar3 instanceof z.b) && (zVar4 instanceof z.b) && gm.l.a(((z.b) zVar3).f21876a, ((z.b) zVar4).f21876a)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 || z11) {
            return true;
        }
        return false;
    }
}
