package bl;

import fl.z;
import java.util.Objects;
import tk.l;
import tk.n;

/* loaded from: classes2.dex */
public final class k extends tk.i {

    /* renamed from: a */
    public final /* synthetic */ int f4481a;

    /* renamed from: b */
    public final Object f4482b;

    public /* synthetic */ k(int i10, Object obj) {
        this.f4481a = i10;
        this.f4482b = obj;
    }

    @Override // tk.i
    public final void z(n nVar) {
        switch (this.f4481a) {
            case 0:
                ((tk.c) this.f4482b).a(new z(nVar));
                return;
            case 1:
                try {
                    Object obj = ((wk.g) this.f4482b).get();
                    Objects.requireNonNull(obj, "The supplier returned a null ObservableSource");
                    ((l) obj).d(nVar);
                    return;
                } catch (Throwable th2) {
                    h7.a.y(th2);
                    nVar.a(xk.c.INSTANCE);
                    nVar.onError(th2);
                    return;
                }
            default:
                ((l) this.f4482b).d(nVar);
                return;
        }
    }
}
