package mg;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class m0 implements fm.l {

    /* renamed from: a */
    public final /* synthetic */ int f21274a;

    /* renamed from: b */
    public final /* synthetic */ Object f21275b;

    /* renamed from: c */
    public final /* synthetic */ Object f21276c;

    /* renamed from: d */
    public final /* synthetic */ Object f21277d;

    public /* synthetic */ m0(Object obj, Object obj2, Object obj3, int i10) {
        this.f21274a = i10;
        this.f21275b = obj;
        this.f21276c = obj2;
        this.f21277d = obj3;
    }

    @Override // fm.l
    public final Object k(Object obj) {
        switch (this.f21274a) {
            case 0:
                a1 a1Var = (a1) this.f21275b;
                a1Var.getClass();
                return j0.m(a1Var, (pg.b) this.f21276c, (List) this.f21277d, (xl.d) obj);
            default:
                sb sbVar = (sb) this.f21275b;
                sbVar.getClass();
                return hb.m(sbVar, (pg.m) this.f21276c, (pg.m) this.f21277d, (xl.d) obj);
        }
    }
}
