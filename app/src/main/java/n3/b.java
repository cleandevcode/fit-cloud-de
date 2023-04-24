package n3;

import androidx.work.impl.WorkDatabase;
import o3.p;
import o3.r;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ WorkDatabase f21932a;

    /* renamed from: b */
    public final /* synthetic */ String f21933b;

    /* renamed from: c */
    public final /* synthetic */ androidx.work.impl.foreground.a f21934c;

    public b(androidx.work.impl.foreground.a aVar, WorkDatabase workDatabase, String str) {
        this.f21934c = aVar;
        this.f21932a = workDatabase;
        this.f21933b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p h10 = ((r) this.f21932a.w()).h(this.f21933b);
        if (h10 == null || !h10.b()) {
            return;
        }
        synchronized (this.f21934c.f3728d) {
            this.f21934c.f3731g.put(this.f21933b, h10);
            this.f21934c.f3732h.add(h10);
            androidx.work.impl.foreground.a aVar = this.f21934c;
            aVar.f3733i.b(aVar.f3732h);
        }
    }
}
