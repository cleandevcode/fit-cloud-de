package androidx.fragment.app;

import androidx.fragment.app.f1;

/* loaded from: classes.dex */
public final class e1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ f1.a f2353a;

    /* renamed from: b */
    public final /* synthetic */ f1 f2354b;

    public e1(f1 f1Var, f1.a aVar) {
        this.f2354b = f1Var;
        this.f2353a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2354b.f2362b.remove(this.f2353a);
        this.f2354b.f2363c.remove(this.f2353a);
    }
}
