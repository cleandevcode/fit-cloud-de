package j1;

/* loaded from: classes.dex */
public final class c<F, S> {

    /* renamed from: a */
    public final F f17257a;

    /* renamed from: b */
    public final S f17258b;

    public c(F f10, S s10) {
        this.f17257a = f10;
        this.f17258b = s10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!b.a(cVar.f17257a, this.f17257a) || !b.a(cVar.f17258b, this.f17258b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        F f10 = this.f17257a;
        int hashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f17258b;
        return hashCode ^ (s10 != null ? s10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Pair{");
        a10.append(this.f17257a);
        a10.append(" ");
        a10.append(this.f17258b);
        a10.append("}");
        return a10.toString();
    }
}
