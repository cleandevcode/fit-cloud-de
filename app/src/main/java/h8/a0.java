package h8;

import g8.a;

/* loaded from: classes.dex */
public final class a0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ b0 f15896a;

    public a0(b0 b0Var) {
        this.f15896a = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.e eVar = this.f15896a.f15903a.f15908b;
        eVar.b(eVar.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
