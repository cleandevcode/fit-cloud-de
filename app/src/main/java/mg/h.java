package mg;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements fm.l {

    /* renamed from: a */
    public final /* synthetic */ int f21038a;

    /* renamed from: b */
    public final /* synthetic */ long f21039b;

    /* renamed from: c */
    public final /* synthetic */ Object f21040c;

    /* renamed from: d */
    public final /* synthetic */ Object f21041d;

    public /* synthetic */ h(Object obj, long j10, Object obj2, int i10) {
        this.f21038a = i10;
        this.f21041d = obj;
        this.f21039b = j10;
        this.f21040c = obj2;
    }

    @Override // fm.l
    public final Object k(Object obj) {
        switch (this.f21038a) {
            case 0:
                i0 i0Var = (i0) this.f21041d;
                i0Var.getClass();
                return e.t(i0Var, this.f21039b, (List) this.f21040c, (xl.d) obj);
            case 1:
                a3 a3Var = (a3) this.f21041d;
                a3Var.getClass();
                return z1.t(a3Var, this.f21039b, (List) this.f21040c, (xl.d) obj);
            default:
                c7 c7Var = (c7) this.f21041d;
                c7Var.getClass();
                return c6.r(c7Var, this.f21039b, (oj.h) this.f21040c, (xl.d) obj);
        }
    }
}
