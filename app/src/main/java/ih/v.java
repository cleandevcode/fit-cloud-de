package ih;

import androidx.appcompat.widget.e2;
import com.topstep.fitcloudpro.R;
import i2.b0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import nj.a;
import nj.b;
import nj.d;
import nj.e;
import nj.f;
import nj.g;
import nj.j;
import nj.k;
import nj.l;
import pm.c0;
import pm.g2;
import pm.m0;

/* loaded from: classes2.dex */
public class v implements m7.f {
    public static final Map A(AbstractMap abstractMap) {
        gm.l.f(abstractMap, "<this>");
        Map.Entry entry = (Map.Entry) abstractMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        gm.l.e(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0080, code lost:
        if (r4 == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object B(xl.d r8) {
        /*
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            xl.f r1 = r8.e()
            bi.m0.j(r1)
            xl.d r8 = mf.a0.i(r8)
            boolean r2 = r8 instanceof um.g
            r3 = 0
            if (r2 == 0) goto L15
            um.g r8 = (um.g) r8
            goto L16
        L15:
            r8 = r3
        L16:
            if (r8 != 0) goto L1a
            goto L83
        L1a:
            pm.b0 r2 = r8.f28903d
            boolean r2 = r2.p0(r1)
            r4 = 1
            if (r2 == 0) goto L2f
            tl.l r2 = tl.l.f28297a
            r8.f28905f = r2
            r8.f24369c = r4
            pm.b0 r2 = r8.f28903d
            r2.n0(r1, r8)
            goto L8b
        L2f:
            pm.i2 r2 = new pm.i2
            r2.<init>()
            xl.f r1 = r1.s(r2)
            tl.l r5 = tl.l.f28297a
            r8.f28905f = r5
            r8.f24369c = r4
            pm.b0 r6 = r8.f28903d
            r6.n0(r1, r8)
            boolean r1 = r2.f24349b
            if (r1 == 0) goto L8b
            pm.u0 r1 = pm.c2.a()
            um.a<pm.m0<?>> r2 = r1.f24400e
            r6 = 0
            if (r2 == 0) goto L59
            int r7 = r2.f28885b
            int r2 = r2.f28886c
            if (r7 != r2) goto L57
            goto L59
        L57:
            r2 = 0
            goto L5a
        L59:
            r2 = 1
        L5a:
            if (r2 == 0) goto L5d
            goto L7f
        L5d:
            boolean r2 = r1.w0()
            if (r2 == 0) goto L6b
            r8.f28905f = r5
            r8.f24369c = r4
            r1.t0(r8)
            goto L80
        L6b:
            r1.u0(r4)
            r8.run()     // Catch: java.lang.Throwable -> L78
        L71:
            boolean r2 = r1.y0()     // Catch: java.lang.Throwable -> L78
            if (r2 != 0) goto L71
            goto L7c
        L78:
            r2 = move-exception
            r8.j(r2, r3)     // Catch: java.lang.Throwable -> L86
        L7c:
            r1.q0(r4)
        L7f:
            r4 = 0
        L80:
            if (r4 == 0) goto L83
            goto L8b
        L83:
            tl.l r8 = tl.l.f28297a
            goto L8c
        L86:
            r8 = move-exception
            r1.q0(r4)
            throw r8
        L8b:
            r8 = r0
        L8c:
            if (r8 != r0) goto L8f
            return r8
        L8f:
            tl.l r8 = tl.l.f28297a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ih.v.B(xl.d):java.lang.Object");
    }

    public static final void b(Throwable th2, Throwable th3) {
        gm.l.f(th2, "<this>");
        gm.l.f(th3, "exception");
        if (th2 != th3) {
            am.b.f631a.a(th2, th3);
        }
    }

    public static final void c(int i10) {
        if (new lm.j(2, 36).k(i10)) {
            return;
        }
        StringBuilder a10 = e2.a("radix ", i10, " was not in valid range ");
        a10.append(new lm.j(2, 36));
        throw new IllegalArgumentException(a10.toString());
    }

    public static final b0.a d() {
        b0.a aVar = new b0.a();
        aVar.f16247g = R.anim.scale_enter_anim;
        aVar.f16248h = R.anim.scale_exit_anim;
        aVar.f16249i = R.anim.scale_pop_enter_anim;
        aVar.f16250j = R.anim.scale_pop_exit_anim;
        return aVar;
    }

    public static final boolean e(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (z10) {
            char upperCase = Character.toUpperCase(c10);
            char upperCase2 = Character.toUpperCase(c11);
            return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
        }
        return false;
    }

    public static Object f(Object obj, Class cls) {
        if (obj instanceof lk.a) {
            return cls.cast(obj);
        }
        if (obj instanceof lk.b) {
            return f(((lk.b) obj).h(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), lk.a.class, lk.b.class));
    }

    public static final void g(xl.f fVar, Throwable th2) {
        try {
            pm.c0 c0Var = (pm.c0) fVar.b(c0.a.f24326a);
            if (c0Var != null) {
                c0Var.q(fVar, th2);
            } else {
                pm.d0.a(fVar, th2);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                b(runtimeException, th2);
                th2 = runtimeException;
            }
            pm.d0.a(fVar, th2);
        }
    }

    public static final boolean h(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    public static final gm.b i(Object[] objArr) {
        gm.l.f(objArr, "array");
        return new gm.b(objArr);
    }

    public static final int j(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final Map k(tl.f fVar) {
        gm.l.f(fVar, "pair");
        Map singletonMap = Collections.singletonMap(fVar.f28286a, fVar.f28287b);
        gm.l.e(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final void l(i2.m mVar, i2.w wVar) {
        try {
            mVar.l(wVar.b(), wVar.a(), d().a());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static final void m(i2.m mVar, i2.w wVar, i2.b0 b0Var) {
        try {
            mVar.l(wVar.b(), wVar.a(), b0Var);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static final void n(m0 m0Var, xl.d dVar, boolean z10) {
        Object k10 = m0Var.k();
        Throwable d10 = m0Var.d(k10);
        Object f10 = d10 != null ? mf.a0.f(d10) : m0Var.h(k10);
        if (!z10) {
            dVar.l(f10);
            return;
        }
        um.g gVar = (um.g) dVar;
        xl.d<T> dVar2 = gVar.f28904e;
        Object obj = gVar.f28906g;
        xl.f e10 = dVar2.e();
        Object c10 = um.z.c(e10, obj);
        g2<?> b10 = c10 != um.z.f28944a ? pm.z.b(dVar2, e10, c10) : null;
        try {
            gVar.f28904e.l(f10);
            tl.l lVar = tl.l.f28297a;
        } finally {
            if (b10 == null || b10.B0()) {
                um.z.a(e10, c10);
            }
        }
    }

    public static final int o(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    public static void p(AtomicReference atomicReference, uk.c cVar, Class cls) {
        boolean z10;
        Objects.requireNonNull(cVar, "next is null");
        while (true) {
            if (atomicReference.compareAndSet(null, cVar)) {
                z10 = true;
                break;
            } else if (atomicReference.get() != null) {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            cVar.c();
            if (atomicReference.get() != xk.b.f30613a) {
                String name = cls.getName();
                ol.a.a(new vk.c("It is not allowed to subscribe with a(n) " + name + " multiple times. Please create a fresh instance of " + name + " and subscribe that to the target source instead."));
            }
        }
    }

    public static final String q(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        exc.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        gm.l.e(stringWriter2, "sw.toString()");
        return stringWriter2;
    }

    public static final a.C0404a r(nj.a aVar) {
        return new a.C0404a(aVar.a());
    }

    public static final b.a s(nj.b bVar) {
        return new b.a(bVar.a());
    }

    public static final d.a t(nj.d dVar) {
        return new d.a(dVar.a());
    }

    public static final e.a u(nj.e eVar) {
        return new e.a(eVar.a());
    }

    public static final f.a v(nj.f fVar) {
        return new f.a(fVar.a());
    }

    public static final g.a w(nj.g gVar) {
        return new g.a(gVar.a());
    }

    public static final j.a x(nj.j jVar) {
        return new j.a(jVar.a());
    }

    public static final k.b y(nj.k kVar) {
        return new k.b(kVar.a());
    }

    public static final l.a z(nj.l lVar) {
        return new l.a(lVar.a());
    }

    @Override // m7.f
    public String a(int i10, int i11) {
        Locale locale = bi.m0.f4330a;
        if (locale != null) {
            return o5.a0.a(new Object[]{Integer.valueOf(i11)}, 1, locale, ".%d", "format(locale, format, *args)");
        }
        gm.l.l("systemLocale");
        throw null;
    }
}
