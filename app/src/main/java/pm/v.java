package pm;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a */
    public final Object f24401a;

    /* renamed from: b */
    public final fm.l<Throwable, tl.l> f24402b;

    /* JADX WARN: Multi-variable type inference failed */
    public v(Object obj, fm.l<? super Throwable, tl.l> lVar) {
        this.f24401a = obj;
        this.f24402b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return gm.l.a(this.f24401a, vVar.f24401a) && gm.l.a(this.f24402b, vVar.f24402b);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f24401a;
        return this.f24402b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("CompletedWithCancellation(result=");
        a10.append(this.f24401a);
        a10.append(", onCancellation=");
        a10.append(this.f24402b);
        a10.append(')');
        return a10.toString();
    }
}
