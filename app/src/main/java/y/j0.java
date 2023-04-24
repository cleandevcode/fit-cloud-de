package y;

import androidx.camera.core.h;
import d6.s;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements o.a, s.a {

    /* renamed from: a */
    public final /* synthetic */ int f30722a;

    public /* synthetic */ j0(int i10) {
        this.f30722a = i10;
    }

    @Override // o.a
    public final Object apply(Object obj) {
        List list = (List) obj;
        h.C0023h c0023h = androidx.camera.core.h.H;
        return null;
    }

    @Override // d6.s.a
    public final void c(boolean z10) {
        switch (this.f30722a) {
            case 1:
                if (z10) {
                    o5.v.f22851o = true;
                    return;
                } else {
                    o5.v vVar = o5.v.f22837a;
                    return;
                }
            default:
                if (z10) {
                    q5.b bVar = q5.b.f24590a;
                    if (!i6.a.b(q5.b.class)) {
                        try {
                            try {
                                o5.v.c().execute(new q5.a(0));
                                return;
                            } catch (Exception unused) {
                                d6.m0 m0Var = d6.m0.f12709a;
                                o5.v vVar2 = o5.v.f22837a;
                                return;
                            }
                        } catch (Throwable th2) {
                            i6.a.a(q5.b.class, th2);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }
}
