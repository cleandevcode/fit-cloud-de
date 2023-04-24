package mg;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements fm.l {

    /* renamed from: a */
    public final /* synthetic */ int f21096a;

    /* renamed from: b */
    public final /* synthetic */ long f21097b;

    /* renamed from: c */
    public final /* synthetic */ List f21098c;

    /* renamed from: d */
    public final /* synthetic */ Object f21099d;

    public /* synthetic */ i(Object obj, long j10, List list, int i10) {
        this.f21096a = i10;
        this.f21099d = obj;
        this.f21097b = j10;
        this.f21098c = list;
    }

    @Override // fm.l
    public final Object k(Object obj) {
        switch (this.f21096a) {
            case 0:
                i0 i0Var = (i0) this.f21099d;
                i0Var.getClass();
                return e.v(i0Var, this.f21097b, this.f21098c, (xl.d) obj);
            case 1:
                a3 a3Var = (a3) this.f21099d;
                a3Var.getClass();
                return z1.v(a3Var, this.f21097b, this.f21098c, (xl.d) obj);
            case 2:
                x4 x4Var = (x4) this.f21099d;
                x4Var.getClass();
                return w3.t(x4Var, this.f21097b, this.f21098c, (xl.d) obj);
            case 3:
                c7 c7Var = (c7) this.f21099d;
                c7Var.getClass();
                return c6.v(c7Var, this.f21097b, this.f21098c, (xl.d) obj);
            default:
                s8 s8Var = (s8) this.f21099d;
                s8Var.getClass();
                return v7.x(s8Var, this.f21097b, this.f21098c, (xl.d) obj);
        }
    }
}
