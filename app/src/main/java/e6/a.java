package e6;

import android.support.v4.media.d;
import gm.l;
import l2.o0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final String f13483a;

    /* renamed from: b */
    public final boolean f13484b;

    public a(String str, boolean z10) {
        l.f(str, "name");
        this.f13483a = str;
        this.f13484b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return l.a(this.f13483a, aVar.f13483a) && this.f13484b == aVar.f13484b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f13483a.hashCode() * 31;
        boolean z10 = this.f13484b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder a10 = d.a("GateKeeper(name=");
        a10.append(this.f13483a);
        a10.append(", value=");
        return o0.a(a10, this.f13484b, ')');
    }
}
