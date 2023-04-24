package i2;

import i2.h0;

/* loaded from: classes.dex */
public final class i0 extends gm.m implements fm.l<j, j> {

    /* renamed from: b */
    public final /* synthetic */ h0<v> f16290b;

    /* renamed from: c */
    public final /* synthetic */ b0 f16291c;

    /* renamed from: d */
    public final /* synthetic */ h0.a f16292d = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(h0 h0Var, b0 b0Var) {
        super(1);
        this.f16290b = h0Var;
        this.f16291c = b0Var;
    }

    @Override // fm.l
    public final j k(j jVar) {
        j jVar2 = jVar;
        gm.l.f(jVar2, "backStackEntry");
        v vVar = jVar2.f16294b;
        if (!(vVar instanceof v)) {
            vVar = null;
        }
        if (vVar == null) {
            return null;
        }
        v c10 = this.f16290b.c(vVar, jVar2.f16295c, this.f16291c, this.f16292d);
        if (c10 == null) {
            jVar2 = null;
        } else if (!gm.l.a(c10, vVar)) {
            jVar2 = this.f16290b.b().a(c10, c10.f(jVar2.f16295c));
        }
        return jVar2;
    }
}
