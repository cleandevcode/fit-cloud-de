package l2;

import java.util.List;
import l2.l2;

/* loaded from: classes.dex */
public final class m2<Key, Value> {

    /* renamed from: a */
    public final List<l2.b.c<Key, Value>> f19097a;

    /* renamed from: b */
    public final Integer f19098b;

    /* renamed from: c */
    public final a2 f19099c;

    /* renamed from: d */
    public final int f19100d;

    public m2(List<l2.b.c<Key, Value>> list, Integer num, a2 a2Var, int i10) {
        gm.l.f(a2Var, "config");
        this.f19097a = list;
        this.f19098b = num;
        this.f19099c = a2Var;
        this.f19100d = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m2) {
            m2 m2Var = (m2) obj;
            if (gm.l.a(this.f19097a, m2Var.f19097a) && gm.l.a(this.f19098b, m2Var.f19098b) && gm.l.a(this.f19099c, m2Var.f19099c) && this.f19100d == m2Var.f19100d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f19097a.hashCode();
        Integer num = this.f19098b;
        return this.f19099c.hashCode() + hashCode + (num != null ? num.hashCode() : 0) + this.f19100d;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("PagingState(pages=");
        a10.append(this.f19097a);
        a10.append(", anchorPosition=");
        a10.append(this.f19098b);
        a10.append(", config=");
        a10.append(this.f19099c);
        a10.append(", leadingPlaceholderCount=");
        return a1.b.a(a10, this.f19100d, ')');
    }
}
