package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class f6 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ rg.p f20997a;

    /* renamed from: b */
    public final /* synthetic */ c7 f20998b;

    public f6(c7 c7Var, rg.p pVar) {
        this.f20998b = c7Var;
        this.f20997a = pVar;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f20998b.f20797b.c();
        try {
            this.f20998b.f20799d.e(this.f20997a);
            this.f20998b.f20797b.p();
            return tl.l.f28297a;
        } finally {
            this.f20998b.f20797b.l();
        }
    }
}
