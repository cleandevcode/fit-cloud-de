package ci;

import java.util.List;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a */
    public final List<a> f4756a;

    /* renamed from: b */
    public final List<n> f4757b;

    public f(List<a> list, List<n> list2) {
        this.f4756a = list;
        this.f4757b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return gm.l.a(this.f4756a, fVar.f4756a) && gm.l.a(this.f4757b, fVar.f4757b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4757b.hashCode() + (this.f4756a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("AudioSelectParams(audios=");
        a10.append(this.f4756a);
        a10.append(", directories=");
        return fb.b.a(a10, this.f4757b, ')');
    }
}
