package tm;

import java.util.Arrays;
import tm.c;

/* loaded from: classes2.dex */
public abstract class b<S extends c<?>> {

    /* renamed from: a */
    public S[] f28301a;

    /* renamed from: b */
    public int f28302b;

    /* renamed from: c */
    public int f28303c;

    /* renamed from: d */
    public w f28304d;

    public final S e() {
        S s10;
        w wVar;
        synchronized (this) {
            S[] sArr = this.f28301a;
            if (sArr == null) {
                sArr = (S[]) g();
                this.f28301a = sArr;
            } else if (this.f28302b >= sArr.length) {
                Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                gm.l.e(copyOf, "copyOf(this, newSize)");
                this.f28301a = (S[]) ((c[]) copyOf);
                sArr = (S[]) ((c[]) copyOf);
            }
            int i10 = this.f28303c;
            do {
                s10 = sArr[i10];
                if (s10 == null) {
                    s10 = f();
                    sArr[i10] = s10;
                }
                i10++;
                if (i10 >= sArr.length) {
                    i10 = 0;
                }
            } while (!s10.a(this));
            this.f28303c = i10;
            this.f28302b++;
            wVar = this.f28304d;
        }
        if (wVar != null) {
            synchronized (wVar) {
                Object[] objArr = wVar.f27324h;
                gm.l.c(objArr);
                wVar.d(Integer.valueOf(((Number) objArr[(objArr.length - 1) & ((int) ((wVar.f27325i + ((int) ((wVar.q() + wVar.f27327k) - wVar.f27325i))) - 1))]).intValue() + 1));
            }
        }
        return s10;
    }

    public abstract S f();

    public abstract c[] g();

    public final void h(S s10) {
        w wVar;
        int i10;
        xl.d[] b10;
        Object[] objArr;
        synchronized (this) {
            int i11 = this.f28302b - 1;
            this.f28302b = i11;
            wVar = this.f28304d;
            if (i11 == 0) {
                this.f28303c = 0;
            }
            b10 = s10.b(this);
        }
        for (xl.d dVar : b10) {
            if (dVar != null) {
                dVar.l(tl.l.f28297a);
            }
        }
        if (wVar != null) {
            synchronized (wVar) {
                gm.l.c(wVar.f27324h);
                wVar.d(Integer.valueOf(((Number) objArr[((int) ((wVar.f27325i + ((int) ((wVar.q() + wVar.f27327k) - wVar.f27325i))) - 1)) & (objArr.length - 1)]).intValue() - 1));
            }
        }
    }

    public final w o() {
        w wVar;
        synchronized (this) {
            wVar = this.f28304d;
            if (wVar == null) {
                wVar = new w(this.f28302b);
                this.f28304d = wVar;
            }
        }
        return wVar;
    }
}
