package zm;

import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a */
    public final Set<b> f32586a;

    /* renamed from: b */
    public final androidx.fragment.app.a0 f32587b;

    /* renamed from: d */
    public static final a f32585d = new a();

    /* renamed from: c */
    public static final f f32584c = new f(ul.q.b0(new ArrayList()), null);

    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                bVar.getClass();
                if (!gm.l.a(null, null)) {
                    return false;
                }
                bVar.getClass();
                if (!gm.l.a(null, null)) {
                    return false;
                }
                bVar.getClass();
                return !(gm.l.a(null, null) ^ true);
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((String) null);
            sb2.append('/');
            throw null;
        }
    }

    public f(Set<b> set, androidx.fragment.app.a0 a0Var) {
        gm.l.f(set, "pins");
        this.f32586a = set;
        this.f32587b = a0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (gm.l.a(fVar.f32586a, this.f32586a) && gm.l.a(fVar.f32587b, this.f32587b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f32586a.hashCode() + 1517) * 41;
        androidx.fragment.app.a0 a0Var = this.f32587b;
        return hashCode + (a0Var != null ? a0Var.hashCode() : 0);
    }
}
