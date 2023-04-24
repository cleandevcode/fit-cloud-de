package vj;

import gm.k;
import jh.v;
import mg.j;
import s.c0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final int f29431a;

    /* renamed from: b */
    public final int f29432b;

    public a(int i10) {
        k.b(1, "peripheral");
        this.f29431a = 1;
        this.f29432b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f29431a == aVar.f29431a && this.f29432b == aVar.f29432b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f29432b + (c0.b(this.f29431a) * 31);
    }

    public final String toString() {
        StringBuilder c10 = v.c("FcPeripheralRequest(peripheral=");
        c10.append(j.b(this.f29431a));
        c10.append(", requestType=");
        return v.b(c10, this.f29432b, ')');
    }
}
