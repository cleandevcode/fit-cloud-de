package androidx.fragment.app;

import androidx.fragment.app.f1;

/* loaded from: classes.dex */
public final class d1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ f1.a f2343a;

    /* renamed from: b */
    public final /* synthetic */ f1 f2344b;

    public d1(f1 f1Var, f1.a aVar) {
        this.f2344b = f1Var;
        this.f2343a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2344b.f2362b.contains(this.f2343a)) {
            f1.a aVar = this.f2343a;
            i1.a(aVar.f2367a, aVar.f2369c.H);
        }
    }
}
