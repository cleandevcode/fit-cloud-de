package g9;

import h8.t0;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n implements q {

    /* renamed from: a */
    public final Executor f15045a;

    /* renamed from: b */
    public final Object f15046b = new Object();

    /* renamed from: c */
    public d f15047c;

    public n(s sVar, d dVar) {
        this.f15045a = sVar;
        this.f15047c = dVar;
    }

    @Override // g9.q
    public final void a(t tVar) {
        if (!tVar.b() && !tVar.f15060d) {
            synchronized (this.f15046b) {
                if (this.f15047c == null) {
                    return;
                }
                this.f15045a.execute(new t0(this, tVar, 1));
            }
        }
    }
}
