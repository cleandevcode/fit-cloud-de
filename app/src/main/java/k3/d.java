package k3;

import android.content.Context;
import f3.m;
import java.util.Collection;
import l3.c;
import l3.e;
import l3.f;
import l3.g;
import l3.h;

/* loaded from: classes.dex */
public final class d implements c.a {

    /* renamed from: d */
    public static final String f18192d = m.e("WorkConstraintsTracker");

    /* renamed from: a */
    public final c f18193a;

    /* renamed from: b */
    public final l3.c<?>[] f18194b;

    /* renamed from: c */
    public final Object f18195c;

    public d(Context context, r3.a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f18193a = cVar;
        this.f18194b = new l3.c[]{new l3.a(applicationContext, aVar), new l3.b(applicationContext, aVar), new h(applicationContext, aVar), new l3.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
        this.f18195c = new Object();
    }

    public final boolean a(String str) {
        l3.c<?>[] cVarArr;
        boolean z10;
        synchronized (this.f18195c) {
            for (l3.c<?> cVar : this.f18194b) {
                Object obj = cVar.f19386b;
                if (obj != null && cVar.c(obj) && cVar.f19385a.contains(str)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    m.c().a(f18192d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public final void b(Collection collection) {
        l3.c<?>[] cVarArr;
        l3.c<?>[] cVarArr2;
        synchronized (this.f18195c) {
            for (l3.c<?> cVar : this.f18194b) {
                if (cVar.f19388d != null) {
                    cVar.f19388d = null;
                    cVar.e(null, cVar.f19386b);
                }
            }
            for (l3.c<?> cVar2 : this.f18194b) {
                cVar2.d(collection);
            }
            for (l3.c<?> cVar3 : this.f18194b) {
                if (cVar3.f19388d != this) {
                    cVar3.f19388d = this;
                    cVar3.e(this, cVar3.f19386b);
                }
            }
        }
    }

    public final void c() {
        l3.c<?>[] cVarArr;
        synchronized (this.f18195c) {
            for (l3.c<?> cVar : this.f18194b) {
                if (!cVar.f19385a.isEmpty()) {
                    cVar.f19385a.clear();
                    m3.d<?> dVar = cVar.f19387c;
                    synchronized (dVar.f20337c) {
                        if (dVar.f20338d.remove(cVar) && dVar.f20338d.isEmpty()) {
                            dVar.d();
                        }
                    }
                }
            }
        }
    }
}
