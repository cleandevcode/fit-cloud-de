package eh;

import l2.o0;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a */
    public final String f13681a;

    /* renamed from: b */
    public final boolean f13682b;

    public l(String str, boolean z10) {
        gm.l.f(str, "username");
        this.f13681a = str;
        this.f13682b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return gm.l.a(this.f13681a, lVar.f13681a) && this.f13682b == lVar.f13682b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f13681a.hashCode() * 31;
        boolean z10 = this.f13682b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("UsernameResult(username=");
        a10.append(this.f13681a);
        a10.append(", isPhoneNumber=");
        return o0.a(a10, this.f13682b, ')');
    }
}
