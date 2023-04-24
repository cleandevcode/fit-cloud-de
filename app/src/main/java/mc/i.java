package mc;

import android.os.DeadObjectException;
import fl.g;
import qc.y;

/* loaded from: classes.dex */
public abstract class i<T> implements y<T> {
    public abstract void a(g.a aVar, w.d dVar);

    public abstract lc.g c(DeadObjectException deadObjectException);

    @Override // java.lang.Comparable
    public final int compareTo(y<?> yVar) {
        yVar.p();
        return 0;
    }

    @Override // qc.y
    public final void p() {
    }

    @Override // qc.y
    public final tk.i<T> y(w.d dVar) {
        return tk.i.e(new h(this, dVar));
    }
}
