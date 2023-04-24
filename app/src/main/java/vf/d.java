package vf;

import java.util.List;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a */
    public final int f29273a;

    /* renamed from: b */
    public List<Integer> f29274b;

    public d() {
        this(0);
    }

    public /* synthetic */ d(int i10) {
        this(0, null);
    }

    public d(int i10, List<Integer> list) {
        this.f29273a = i10;
        this.f29274b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f29273a == dVar.f29273a && gm.l.a(this.f29274b, dVar.f29274b);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f29273a * 31;
        List<Integer> list = this.f29274b;
        return i10 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("EcgAlgorithmResult(hrAvg=");
        a10.append(this.f29273a);
        a10.append(", results=");
        return fb.b.a(a10, this.f29274b, ')');
    }
}
