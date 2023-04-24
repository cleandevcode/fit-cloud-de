package z;

import android.content.res.Configuration;
import androidx.fragment.app.j0;
import androidx.fragment.app.x;
import x0.o;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements j1.a {

    /* renamed from: a */
    public final /* synthetic */ int f31826a;

    /* renamed from: b */
    public final /* synthetic */ Object f31827b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f31826a = i10;
        this.f31827b = obj;
    }

    @Override // j1.a
    public final void accept(Object obj) {
        switch (this.f31826a) {
            case 0:
                c cVar = (c) this.f31827b;
                e eVar = (e) obj;
                cVar.getClass();
                p.b.f();
                cVar.a();
                throw null;
            case 1:
                Configuration configuration = (Configuration) obj;
                ((x) this.f31827b).f2610o.a();
                return;
            default:
                j0 j0Var = (j0) this.f31827b;
                o oVar = (o) obj;
                if (j0Var.L()) {
                    j0Var.n(oVar.f30126a, false);
                    return;
                }
                return;
        }
    }
}
