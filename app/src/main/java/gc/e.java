package gc;

import tk.n;

/* loaded from: classes.dex */
public final class e<T> extends d {

    /* renamed from: a */
    public final d f15216a;

    /* renamed from: b */
    public boolean f15217b;

    /* renamed from: c */
    public a<T> f15218c;

    public e(c cVar) {
        this.f15216a = cVar;
    }

    @Override // gc.d
    public final boolean H() {
        return this.f15216a.H();
    }

    @Override // gc.d, wk.d
    public final void accept(T t10) {
        a<T> aVar;
        synchronized (this) {
            try {
                int i10 = 0;
                if (this.f15217b) {
                    a<T> aVar2 = this.f15218c;
                    if (aVar2 == null) {
                        aVar2 = new a<>();
                        this.f15218c = aVar2;
                    }
                    int i11 = aVar2.f15196c;
                    if (i11 == 4) {
                        Object[] objArr = new Object[5];
                        aVar2.f15195b[4] = objArr;
                        aVar2.f15195b = objArr;
                    } else {
                        i10 = i11;
                    }
                    aVar2.f15195b[i10] = t10;
                    aVar2.f15196c = i10 + 1;
                    return;
                }
                this.f15217b = true;
                this.f15216a.accept(t10);
                while (true) {
                    synchronized (this) {
                        aVar = this.f15218c;
                        if (aVar == null) {
                            this.f15217b = false;
                            return;
                        }
                        this.f15218c = null;
                    }
                    d dVar = this.f15216a;
                    for (Object[] objArr2 = aVar.f15194a; objArr2 != null; objArr2 = (Object[]) objArr2[4]) {
                        for (int i12 = 0; i12 < 4; i12++) {
                            Object obj = objArr2[i12];
                            if (obj == null) {
                                break;
                            }
                            dVar.accept(obj);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // tk.i
    public final void z(n<? super T> nVar) {
        this.f15216a.d(nVar);
    }
}
