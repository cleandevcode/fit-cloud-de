package og;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class f0 extends gm.m implements fm.l<Throwable, tk.l<? extends Long>> {

    /* renamed from: b */
    public static final f0 f23342b = new f0();

    public f0() {
        super(1);
    }

    @Override // fm.l
    public final tk.l<? extends Long> k(Throwable th2) {
        Throwable th3 = th2;
        return th3 instanceof lc.f ? tk.i.m(th3) : tk.i.D(7500L, TimeUnit.MILLISECONDS);
    }
}
