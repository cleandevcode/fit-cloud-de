package f3;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class k extends gm.m implements fm.l<Throwable, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ l<Object> f14090b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l<Object> lVar) {
        super(1);
        this.f14090b = lVar;
    }

    @Override // fm.l
    public final tl.l k(Throwable th2) {
        Throwable th3 = th2;
        if (th3 == null) {
            if (!this.f14090b.f14092b.isDone()) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (th3 instanceof CancellationException) {
            this.f14090b.f14092b.cancel(true);
        } else {
            q3.c<Object> cVar = this.f14090b.f14092b;
            Throwable cause = th3.getCause();
            if (cause != null) {
                th3 = cause;
            }
            cVar.j(th3);
        }
        return tl.l.f28297a;
    }
}
