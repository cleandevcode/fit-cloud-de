package sj;

import gm.l;
import jh.v;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a */
    public final int f27093a;

    /* renamed from: b */
    public final e f27094b;

    public d(int i10, e eVar) {
        this.f27093a = i10;
        this.f27094b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f27093a == dVar.f27093a && l.a(this.f27094b, dVar.f27094b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27094b.hashCode() + (this.f27093a * 31);
    }

    public final String toString() {
        StringBuilder c10 = v.c("FcLcdShape(lcd=");
        c10.append(this.f27093a);
        c10.append(", shape=");
        c10.append(this.f27094b);
        c10.append(')');
        return c10.toString();
    }
}
