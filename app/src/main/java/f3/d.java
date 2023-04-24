package f3;

import android.net.Uri;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public final HashSet f14076a = new HashSet();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final Uri f14077a;

        /* renamed from: b */
        public final boolean f14078b;

        public a(boolean z10, Uri uri) {
            this.f14077a = uri;
            this.f14078b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f14078b == aVar.f14078b && this.f14077a.equals(aVar.f14077a);
        }

        public final int hashCode() {
            return (this.f14077a.hashCode() * 31) + (this.f14078b ? 1 : 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f14076a.equals(((d) obj).f14076a);
    }

    public final int hashCode() {
        return this.f14076a.hashCode();
    }
}
