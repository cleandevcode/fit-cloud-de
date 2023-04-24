package mf;

import android.content.Context;
import bi.z0;
import java.io.Closeable;
import tl.g;
import xl.e;
import xl.f;

/* loaded from: classes.dex */
public class a0 implements hg.c {

    /* renamed from: a */
    public static final a0 f20500a = new a0();

    public static void c(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static final void d(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                ih.v.b(th2, th3);
            }
        }
    }

    public static final xl.d e(Object obj, xl.d dVar, fm.p pVar) {
        gm.l.f(pVar, "<this>");
        gm.l.f(dVar, "completion");
        if (pVar instanceof zl.a) {
            return ((zl.a) pVar).p(obj, dVar);
        }
        xl.f e10 = dVar.e();
        return e10 == xl.g.f30632a ? new yl.b(obj, dVar, pVar) : new yl.c(dVar, e10, pVar, obj);
    }

    public static final g.a f(Throwable th2) {
        gm.l.f(th2, "exception");
        return new g.a(th2);
    }

    public static final Object g(long j10, xl.d dVar) {
        pm.j0 j0Var;
        if (j10 <= 0) {
            return tl.l.f28297a;
        }
        pm.j jVar = new pm.j(1, i(dVar));
        jVar.u();
        if (j10 < Long.MAX_VALUE) {
            f.b b10 = jVar.f24353e.b(e.a.f30630a);
            if (b10 instanceof pm.j0) {
                j0Var = (pm.j0) b10;
            } else {
                j0Var = null;
            }
            if (j0Var == null) {
                j0Var = pm.i0.f24347a;
            }
            j0Var.D(j10, jVar);
        }
        Object t10 = jVar.t();
        if (t10 == yl.a.COROUTINE_SUSPENDED) {
            return t10;
        }
        return tl.l.f28297a;
    }

    public static String h(int i10, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i11]);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = strArr[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public static final xl.d i(xl.d dVar) {
        gm.l.f(dVar, "<this>");
        zl.c cVar = dVar instanceof zl.c ? (zl.c) dVar : null;
        if (cVar != null && (dVar = cVar.f32510c) == null) {
            xl.e eVar = (xl.e) cVar.e().b(e.a.f30630a);
            if (eVar == null || (dVar = eVar.h0(cVar)) == null) {
                dVar = cVar;
            }
            cVar.f32510c = dVar;
        }
        return dVar;
    }

    public static final void j(pm.e0 e0Var, fm.p pVar) {
        gm.l.f(e0Var, "<this>");
        z0.g(e0Var, new hh.e(), 0, pVar, 2);
    }

    public static final void k(Object obj) {
        if (obj instanceof g.a) {
            throw ((g.a) obj).f28289a;
        }
    }

    @Override // hg.c
    public boolean a(Context context) {
        gm.l.f(context, "context");
        return h7.a.n(context);
    }

    @Override // hg.c
    public void b() {
    }
}
