package y;

import y.q;

/* loaded from: classes.dex */
public final class e extends q.a {

    /* renamed from: a */
    public final int f30687a;

    /* renamed from: b */
    public final Throwable f30688b;

    public e(int i10, Throwable th2) {
        this.f30687a = i10;
        this.f30688b = th2;
    }

    @Override // y.q.a
    public final Throwable a() {
        return this.f30688b;
    }

    @Override // y.q.a
    public final int b() {
        return this.f30687a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q.a) {
            q.a aVar = (q.a) obj;
            if (this.f30687a == aVar.b()) {
                Throwable th2 = this.f30688b;
                Throwable a10 = aVar.a();
                if (th2 == null) {
                    if (a10 == null) {
                        return true;
                    }
                } else if (th2.equals(a10)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f30687a ^ 1000003) * 1000003;
        Throwable th2 = this.f30688b;
        return i10 ^ (th2 == null ? 0 : th2.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("StateError{code=");
        a10.append(this.f30687a);
        a10.append(", cause=");
        a10.append(this.f30688b);
        a10.append("}");
        return a10.toString();
    }
}
