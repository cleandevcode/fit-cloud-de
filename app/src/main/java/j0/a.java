package j0;

import java.util.List;

/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: a */
    public final List<d> f17225a;

    public a(List<d> list) {
        if (list == null) {
            throw new NullPointerException("Null surfaces");
        }
        this.f17225a = list;
    }

    @Override // j0.e
    public final List<d> a() {
        return this.f17225a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.f17225a.equals(((e) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f17225a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("SurfaceEdge{surfaces=");
        a10.append(this.f17225a);
        a10.append("}");
        return a10.toString();
    }
}
