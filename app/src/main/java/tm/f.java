package tm;

import a0.a2;
import java.util.ArrayList;
import pm.e0;
import pm.o0;
import pm.z;
import xl.e;

/* loaded from: classes2.dex */
public abstract class f<T> implements o<T> {

    /* renamed from: a */
    public final xl.f f28312a;

    /* renamed from: b */
    public final int f28313b;

    /* renamed from: c */
    public final rm.f f28314c;

    public f(xl.f fVar, int i10, rm.f fVar2) {
        this.f28312a = fVar;
        this.f28313b = i10;
        this.f28314c = fVar2;
    }

    @Override // sm.f
    public Object a(sm.g<? super T> gVar, xl.d<? super tl.l> dVar) {
        Object s10 = bi.r.s(new d(null, gVar, this), dVar);
        return s10 == yl.a.COROUTINE_SUSPENDED ? s10 : tl.l.f28297a;
    }

    @Override // tm.o
    public final sm.f<T> b(xl.f fVar, int i10, rm.f fVar2) {
        xl.f s10 = fVar.s(this.f28312a);
        if (fVar2 == rm.f.SUSPEND) {
            int i11 = this.f28313b;
            if (i11 != -3) {
                if (i10 != -3) {
                    if (i11 != -2) {
                        if (i10 != -2 && (i11 = i11 + i10) < 0) {
                            i10 = Integer.MAX_VALUE;
                        }
                    }
                }
                i10 = i11;
            }
            fVar2 = this.f28314c;
        }
        return (gm.l.a(s10, this.f28312a) && i10 == this.f28313b && fVar2 == this.f28314c) ? this : g(s10, i10, fVar2);
    }

    public String e() {
        return null;
    }

    public abstract Object f(rm.t<? super T> tVar, xl.d<? super tl.l> dVar);

    public abstract f<T> g(xl.f fVar, int i10, rm.f fVar2);

    public sm.f<T> h() {
        return null;
    }

    public rm.v<T> i(e0 e0Var) {
        xl.f fVar = this.f28312a;
        int i10 = this.f28313b;
        if (i10 == -3) {
            i10 = -2;
        }
        rm.f fVar2 = this.f28314c;
        fm.p eVar = new e(this, null);
        rm.a a10 = jh.v.a(i10, fVar2, 4);
        xl.f a11 = z.a(e0Var.E(), fVar, true);
        wm.c cVar = o0.f24381a;
        if (a11 != cVar && a11.b(e.a.f30630a) == null) {
            a11 = a11.s(cVar);
        }
        rm.s sVar = new rm.s(a11, a10);
        sVar.A0(3, sVar, eVar);
        return sVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String e10 = e();
        if (e10 != null) {
            arrayList.add(e10);
        }
        if (this.f28312a != xl.g.f30632a) {
            StringBuilder a10 = android.support.v4.media.d.a("context=");
            a10.append(this.f28312a);
            arrayList.add(a10.toString());
        }
        if (this.f28313b != -3) {
            StringBuilder a11 = android.support.v4.media.d.a("capacity=");
            a11.append(this.f28313b);
            arrayList.add(a11.toString());
        }
        if (this.f28314c != rm.f.SUSPEND) {
            StringBuilder a12 = android.support.v4.media.d.a("onBufferOverflow=");
            a12.append(this.f28314c);
            arrayList.add(a12.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return a2.a(sb2, ul.q.M(arrayList, ", ", null, null, null, 62), ']');
    }
}
