package um;

import i2.l0;

/* loaded from: classes2.dex */
public final class r extends gm.m implements fm.l<Throwable, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ fm.l<Object, tl.l> f28936b;

    /* renamed from: c */
    public final /* synthetic */ Object f28937c;

    /* renamed from: d */
    public final /* synthetic */ xl.f f28938d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(fm.l<Object, tl.l> lVar, Object obj, xl.f fVar) {
        super(1);
        this.f28936b = lVar;
        this.f28937c = obj;
        this.f28938d = fVar;
    }

    @Override // fm.l
    public final tl.l k(Throwable th2) {
        fm.l<Object, tl.l> lVar = this.f28936b;
        Object obj = this.f28937c;
        xl.f fVar = this.f28938d;
        f0 a10 = l0.a(lVar, obj, null);
        if (a10 != null) {
            ih.v.g(fVar, a10);
        }
        return tl.l.f28297a;
    }
}
