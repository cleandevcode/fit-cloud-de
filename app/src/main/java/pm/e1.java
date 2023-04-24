package pm;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class e1 extends i1 {

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24335f = AtomicIntegerFieldUpdater.newUpdater(e1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: e */
    public final fm.l<Throwable, tl.l> f24336e;

    /* JADX WARN: Multi-variable type inference failed */
    public e1(fm.l<? super Throwable, tl.l> lVar) {
        this.f24336e = lVar;
    }

    @Override // pm.w
    public final void R(Throwable th2) {
        if (f24335f.compareAndSet(this, 0, 1)) {
            this.f24336e.k(th2);
        }
    }

    @Override // fm.l
    public final /* bridge */ /* synthetic */ tl.l k(Throwable th2) {
        R(th2);
        return tl.l.f28297a;
    }
}
