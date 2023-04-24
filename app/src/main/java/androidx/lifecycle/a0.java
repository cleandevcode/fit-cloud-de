package androidx.lifecycle;

/* loaded from: classes.dex */
public class a0<T> extends LiveData<T> {
    public a0() {
    }

    public a0(T t10) {
        super(t10);
    }

    @Override // androidx.lifecycle.LiveData
    public void j(T t10) {
        super.j(t10);
    }

    public final void k(T t10) {
        boolean z10;
        synchronized (this.f2638a) {
            z10 = this.f2643f == LiveData.f2637k;
            this.f2643f = t10;
        }
        if (z10) {
            m.a.C().D(this.f2647j);
        }
    }
}
