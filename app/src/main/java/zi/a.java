package zi;

import fl.g;
import gm.l;
import tk.i;

/* loaded from: classes2.dex */
public abstract class a<T> implements b<T> {
    public abstract void a(g.a aVar, ej.a aVar2);

    @Override // zi.b
    public final i b(ej.b bVar) {
        return new g(new androidx.camera.lifecycle.b(this, bVar));
    }

    @Override // java.lang.Comparable
    public final int compareTo(b<?> bVar) {
        b<?> bVar2 = bVar;
        l.f(bVar2, "other");
        bVar2.p();
        p();
        return 0;
    }

    @Override // zi.b
    public void p() {
    }
}
