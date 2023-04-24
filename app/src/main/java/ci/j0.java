package ci;

import java.util.List;

/* loaded from: classes2.dex */
public final class j0 {

    /* renamed from: a */
    public final int f4780a;

    /* renamed from: b */
    public final m f4781b;

    /* renamed from: c */
    public final List<xc.a> f4782c;

    /* JADX WARN: Multi-variable type inference failed */
    public j0(int i10, m mVar, List<? extends xc.a> list) {
        gm.l.f(mVar, "info");
        this.f4780a = i10;
        this.f4781b = mVar;
        this.f4782c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            return this.f4780a == j0Var.f4780a && gm.l.a(this.f4781b, j0Var.f4781b) && gm.l.a(this.f4782c, j0Var.f4782c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f4781b.hashCode() + (this.f4780a * 31)) * 31;
        List<xc.a> list = this.f4782c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("SongPushParams(freeSpace=");
        a10.append(this.f4780a);
        a10.append(", info=");
        a10.append(this.f4781b);
        a10.append(", songs=");
        return fb.b.a(a10, this.f4782c, ')');
    }
}
