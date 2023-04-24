package ci;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a */
    public final String f4807a;

    /* renamed from: b */
    public final List<a> f4808b;

    public n(String str, ArrayList arrayList) {
        gm.l.f(arrayList, "audios");
        this.f4807a = str;
        this.f4808b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return gm.l.a(this.f4807a, nVar.f4807a) && gm.l.a(this.f4808b, nVar.f4808b);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4807a;
        return this.f4808b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("DirectoryInfo(directory=");
        a10.append(this.f4807a);
        a10.append(", audios=");
        return fb.b.a(a10, this.f4808b, ')');
    }
}
