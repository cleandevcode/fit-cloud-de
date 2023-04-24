package ci;

import java.util.List;

/* loaded from: classes2.dex */
public final class v0 {

    /* renamed from: a */
    public final List<a> f4849a;

    /* renamed from: b */
    public final int f4850b;

    /* renamed from: c */
    public final int f4851c;

    public v0() {
        this(0);
    }

    public /* synthetic */ v0(int i10) {
        this(0, 0, null);
    }

    public v0(int i10, int i11, List list) {
        this.f4849a = list;
        this.f4850b = i10;
        this.f4851c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v0) {
            v0 v0Var = (v0) obj;
            return gm.l.a(this.f4849a, v0Var.f4849a) && this.f4850b == v0Var.f4850b && this.f4851c == v0Var.f4851c;
        }
        return false;
    }

    public final int hashCode() {
        List<a> list = this.f4849a;
        return ((((list == null ? 0 : list.hashCode()) * 31) + this.f4850b) * 31) + this.f4851c;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("SongTransfer(audios=");
        a10.append(this.f4849a);
        a10.append(", index=");
        a10.append(this.f4850b);
        a10.append(", progress=");
        return a1.b.a(a10, this.f4851c, ')');
    }
}
