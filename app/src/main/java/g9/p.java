package g9;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class p implements q {

    /* renamed from: a */
    public final Executor f15050a;

    /* renamed from: b */
    public final Object f15051b = new Object();

    /* renamed from: c */
    public e f15052c;

    public p(s sVar, e eVar) {
        this.f15050a = sVar;
        this.f15052c = eVar;
    }

    @Override // g9.q
    public final void a(t tVar) {
        if (tVar.b()) {
            synchronized (this.f15051b) {
                if (this.f15052c == null) {
                    return;
                }
                this.f15050a.execute(new o(this, tVar));
            }
        }
    }
}
