package a0;

import androidx.camera.core.t;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public interface b0 extends y.g, t.b {

    /* loaded from: classes.dex */
    public enum a {
        f20b(0),
        f21c(1),
        f22d(2),
        f23e(3),
        f24f(4),
        f25g(5),
        f26h(6);
        

        /* renamed from: a */
        public final boolean f28a;

        a(int i10) {
            this.f28a = r1;
        }
    }

    g1 a();

    @Override // y.g
    y.n b();

    void e(t tVar);

    s.r g();

    t h();

    void i(boolean z10);

    void j(Collection<androidx.camera.core.t> collection);

    void k(ArrayList arrayList);

    s.e0 l();
}
