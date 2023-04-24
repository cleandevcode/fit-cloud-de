package mg;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class n9 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ List f21320a;

    /* renamed from: b */
    public final /* synthetic */ la f21321b;

    public n9(la laVar, ArrayList arrayList) {
        this.f21321b = laVar;
        this.f21320a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21321b.f21260a.c();
        try {
            this.f21321b.f21262c.f(this.f21320a);
            this.f21321b.f21260a.p();
            return tl.l.f28297a;
        } finally {
            this.f21321b.f21260a.l();
        }
    }
}
