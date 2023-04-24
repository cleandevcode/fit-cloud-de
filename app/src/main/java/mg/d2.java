package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class d2 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ rg.g f20822a;

    /* renamed from: b */
    public final /* synthetic */ a3 f20823b;

    public d2(a3 a3Var, rg.g gVar) {
        this.f20823b = a3Var;
        this.f20822a = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f20823b.f20650a.c();
        try {
            this.f20823b.f20652c.e(this.f20822a);
            this.f20823b.f20650a.p();
            return tl.l.f28297a;
        } finally {
            this.f20823b.f20650a.l();
        }
    }
}
