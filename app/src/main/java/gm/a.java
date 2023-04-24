package gm;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class a implements g, Serializable {

    /* renamed from: a */
    public final Object f15478a;

    /* renamed from: b */
    public final Class f15479b = pm.q.class;

    /* renamed from: c */
    public final String f15480c = "complete";

    /* renamed from: d */
    public final String f15481d = "complete(Ljava/lang/Object;)Z";

    /* renamed from: e */
    public final boolean f15482e = false;

    /* renamed from: f */
    public final int f15483f = 1;

    /* renamed from: g */
    public final int f15484g = 4;

    public a(pm.r rVar) {
        this.f15478a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f15482e == aVar.f15482e && this.f15483f == aVar.f15483f && this.f15484g == aVar.f15484g && l.a(this.f15478a, aVar.f15478a) && l.a(this.f15479b, aVar.f15479b) && this.f15480c.equals(aVar.f15480c) && this.f15481d.equals(aVar.f15481d);
        }
        return false;
    }

    @Override // gm.g
    public final int h() {
        return this.f15483f;
    }

    public final int hashCode() {
        int i10;
        int i11;
        Object obj = this.f15478a;
        int i12 = 0;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        Class cls = this.f15479b;
        if (cls != null) {
            i12 = cls.hashCode();
        }
        int a10 = i2.t.a(this.f15481d, i2.t.a(this.f15480c, (i13 + i12) * 31, 31), 31);
        if (this.f15482e) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return ((((a10 + i11) * 31) + this.f15483f) * 31) + this.f15484g;
    }

    public final String toString() {
        b0.f15488a.getClass();
        return c0.a(this);
    }
}
