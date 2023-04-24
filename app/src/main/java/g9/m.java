package g9;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m implements q {

    /* renamed from: a */
    public final Executor f15042a;

    /* renamed from: b */
    public final Object f15043b = new Object();

    /* renamed from: c */
    public c f15044c;

    public m(Executor executor, c cVar) {
        this.f15042a = executor;
        this.f15044c = cVar;
    }

    @Override // g9.q
    public final void a(t tVar) {
        synchronized (this.f15043b) {
            if (this.f15044c == null) {
                return;
            }
            this.f15042a.execute(new l(this, tVar));
        }
    }
}
