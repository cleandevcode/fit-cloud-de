package tm;

/* loaded from: classes2.dex */
public final class i<T> extends h<T, T> {
    public i(int i10, xl.f fVar, rm.f fVar2, sm.f fVar3) {
        super(i10, fVar, fVar2, fVar3);
    }

    public i(sm.f fVar, wm.c cVar, int i10, rm.f fVar2, int i11) {
        super((i11 & 4) != 0 ? -3 : i10, (i11 & 2) != 0 ? xl.g.f30632a : cVar, (i11 & 8) != 0 ? rm.f.SUSPEND : fVar2, fVar);
    }

    @Override // tm.f
    public final f<T> g(xl.f fVar, int i10, rm.f fVar2) {
        return new i(i10, fVar, fVar2, this.f28318d);
    }

    @Override // tm.f
    public final sm.f<T> h() {
        return (sm.f<T>) this.f28318d;
    }

    @Override // tm.h
    public final Object j(sm.g<? super T> gVar, xl.d<? super tl.l> dVar) {
        Object a10 = this.f28318d.a(gVar, dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
