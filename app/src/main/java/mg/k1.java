package mg;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class k1 implements fm.l {

    /* renamed from: a */
    public final /* synthetic */ int f21185a;

    /* renamed from: b */
    public final /* synthetic */ long f21186b;

    /* renamed from: c */
    public final /* synthetic */ List f21187c;

    /* renamed from: d */
    public final /* synthetic */ Object f21188d;

    public /* synthetic */ k1(Object obj, long j10, List list, int i10) {
        this.f21185a = i10;
        this.f21188d = obj;
        this.f21186b = j10;
        this.f21187c = list;
    }

    @Override // fm.l
    public final Object k(Object obj) {
        switch (this.f21185a) {
            case 0:
                w1 w1Var = (w1) this.f21188d;
                w1Var.getClass();
                return h1.l(w1Var, this.f21186b, this.f21187c, (xl.d) obj);
            case 1:
                x4 x4Var = (x4) this.f21188d;
                x4Var.getClass();
                return w3.v(x4Var, this.f21186b, this.f21187c, (xl.d) obj);
            default:
                s8 s8Var = (s8) this.f21188d;
                s8Var.getClass();
                return v7.v(s8Var, this.f21186b, this.f21187c, (xl.d) obj);
        }
    }
}
