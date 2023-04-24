package s;

import android.os.Build;
import android.view.View;
import d6.s;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k1.n2;
import k1.o0;
import z9.r;

/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements o.a, s.a, r.b {

    /* renamed from: a */
    public final /* synthetic */ int f26001a;

    public /* synthetic */ j0(int i10) {
        this.f26001a = i10;
    }

    @Override // o.a
    public final Object apply(Object obj) {
        switch (this.f26001a) {
            case 0:
                Void r22 = (Void) obj;
                return Boolean.TRUE;
            default:
                return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
        }
    }

    @Override // z9.r.b
    public final k1.n2 b(View view, k1.n2 n2Var, r.c cVar) {
        int i10;
        n2.e bVar;
        a1.c a10 = n2Var.a(7);
        gm.l.e(a10, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        cVar.f32169d = a10.f217d;
        WeakHashMap<View, k1.i2> weakHashMap = k1.o0.f18161a;
        boolean z10 = true;
        if (o0.e.d(view) != 1) {
            z10 = false;
        }
        int i11 = a10.f214a;
        int i12 = a10.f216c;
        int i13 = cVar.f32166a;
        if (z10) {
            i10 = i12;
        } else {
            i10 = i11;
        }
        cVar.f32166a = i13 + i10;
        int i14 = cVar.f32168c;
        if (!z10) {
            i11 = i12;
        }
        cVar.f32168c = i14 + i11;
        cVar.a(view);
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 30) {
            bVar = new n2.d(n2Var);
        } else if (i15 >= 29) {
            bVar = new n2.c(n2Var);
        } else {
            bVar = new n2.b(n2Var);
        }
        bVar.c(7, a1.c.b(0, a10.f215b, 0, 0));
        return bVar.b();
    }

    @Override // d6.s.a
    public final void c(boolean z10) {
        switch (this.f26001a) {
            case 3:
                o5.v vVar = o5.v.f22837a;
                if (z10) {
                    int i10 = p5.o.f23929a;
                    if (!i6.a.b(p5.o.class)) {
                        try {
                            d6.w.f12816f.add(new p5.n());
                            d6.w.c();
                            return;
                        } catch (Throwable th2) {
                            i6.a.a(p5.o.class, th2);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                if (z10) {
                    v5.h hVar = v5.h.f29114a;
                    if (!i6.a.b(v5.h.class)) {
                        try {
                            v5.h.f29115b.set(true);
                            v5.h.a();
                            return;
                        } catch (Throwable th3) {
                            i6.a.a(v5.h.class, th3);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                x5.d dVar = x5.d.f30285a;
                if (z10) {
                    s5.c cVar = s5.c.f26581a;
                    if (!i6.a.b(s5.c.class)) {
                        try {
                            s5.c.f26586f.set(true);
                            return;
                        } catch (Throwable th4) {
                            i6.a.a(s5.c.class, th4);
                            return;
                        }
                    }
                    return;
                }
                s5.c cVar2 = s5.c.f26581a;
                if (!i6.a.b(s5.c.class)) {
                    try {
                        s5.c.f26586f.set(false);
                        return;
                    } catch (Throwable th5) {
                        i6.a.a(s5.c.class, th5);
                        return;
                    }
                }
                return;
            default:
                if (z10) {
                    AtomicBoolean atomicBoolean = g6.c.f15013a;
                    synchronized (g6.c.class) {
                        if (!i6.a.b(g6.c.class) && !g6.c.f15013a.getAndSet(true)) {
                            o5.v vVar2 = o5.v.f22837a;
                            if (o5.q0.b()) {
                                g6.c.a();
                            }
                            int i11 = g6.a.f15008a;
                            if (!i6.a.b(g6.a.class)) {
                                g6.a.f15009b.scheduleAtFixedRate(g6.a.f15011d, 0L, 500, TimeUnit.MILLISECONDS);
                            }
                        }
                    }
                    return;
                }
                return;
        }
    }
}
