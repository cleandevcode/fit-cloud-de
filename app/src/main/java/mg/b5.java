package mg;

import java.util.Calendar;
import java.util.Date;

/* loaded from: classes2.dex */
public final /* synthetic */ class b5 implements fm.l {

    /* renamed from: a */
    public final /* synthetic */ int f20706a;

    /* renamed from: b */
    public final /* synthetic */ long f20707b;

    /* renamed from: c */
    public final /* synthetic */ Calendar f20708c;

    /* renamed from: d */
    public final /* synthetic */ Date f20709d;

    /* renamed from: e */
    public final /* synthetic */ int f20710e;

    /* renamed from: f */
    public final /* synthetic */ Object f20711f;

    public /* synthetic */ b5(Object obj, long j10, Calendar calendar, Date date, int i10, int i11) {
        this.f20706a = i11;
        this.f20711f = obj;
        this.f20707b = j10;
        this.f20708c = calendar;
        this.f20709d = date;
        this.f20710e = i10;
    }

    @Override // fm.l
    public final Object k(Object obj) {
        switch (this.f20706a) {
            case 0:
                a6 a6Var = (a6) this.f20711f;
                a6Var.getClass();
                return y4.p(a6Var, this.f20707b, this.f20708c, this.f20709d, this.f20710e, (xl.d) obj);
            default:
                la laVar = (la) this.f20711f;
                laVar.getClass();
                return l9.p(laVar, this.f20707b, this.f20708c, this.f20709d, this.f20710e, (xl.d) obj);
        }
    }
}
