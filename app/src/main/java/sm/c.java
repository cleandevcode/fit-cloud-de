package sm;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class c<T> extends tm.f<T> {

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f27125f = AtomicIntegerFieldUpdater.newUpdater(c.class, "consumed");
    private volatile /* synthetic */ int consumed;

    /* renamed from: d */
    public final rm.v<T> f27126d;

    /* renamed from: e */
    public final boolean f27127e;

    public /* synthetic */ c(rm.v vVar, boolean z10) {
        this(vVar, z10, xl.g.f30632a, -3, rm.f.SUSPEND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(rm.v<? extends T> vVar, boolean z10, xl.f fVar, int i10, rm.f fVar2) {
        super(fVar, i10, fVar2);
        this.f27126d = vVar;
        this.f27127e = z10;
        this.consumed = 0;
    }

    @Override // tm.f, sm.f
    public final Object a(g<? super T> gVar, xl.d<? super tl.l> dVar) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        if (this.f28313b == -3) {
            j();
            Object a10 = j.a(gVar, this.f27126d, this.f27127e, dVar);
            if (a10 == aVar) {
                return a10;
            }
            return tl.l.f28297a;
        }
        Object a11 = super.a(gVar, dVar);
        if (a11 == aVar) {
            return a11;
        }
        return tl.l.f28297a;
    }

    @Override // tm.f
    public final String e() {
        StringBuilder a10 = android.support.v4.media.d.a("channel=");
        a10.append(this.f27126d);
        return a10.toString();
    }

    @Override // tm.f
    public final Object f(rm.t<? super T> tVar, xl.d<? super tl.l> dVar) {
        Object a10 = j.a(new tm.u(tVar), this.f27126d, this.f27127e, dVar);
        if (a10 == yl.a.COROUTINE_SUSPENDED) {
            return a10;
        }
        return tl.l.f28297a;
    }

    @Override // tm.f
    public final tm.f<T> g(xl.f fVar, int i10, rm.f fVar2) {
        return new c(this.f27126d, this.f27127e, fVar, i10, fVar2);
    }

    @Override // tm.f
    public final f<T> h() {
        return new c(this.f27126d, this.f27127e);
    }

    @Override // tm.f
    public final rm.v<T> i(pm.e0 e0Var) {
        j();
        return this.f28313b == -3 ? this.f27126d : super.i(e0Var);
    }

    public final void j() {
        if (this.f27127e) {
            if (!(f27125f.getAndSet(this, 1) == 0)) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }
}
