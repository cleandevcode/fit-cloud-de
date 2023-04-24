package v1;

import gm.l;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class d {

    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a */
        public final String f28986a;

        public a(String str) {
            l.f(str, "name");
            this.f28986a = str;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return l.a(this.f28986a, ((a) obj).f28986a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f28986a.hashCode();
        }

        public final String toString() {
            return this.f28986a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> {
    }

    public abstract Map<a<?>, Object> a();

    public abstract <T> T b(a<T> aVar);
}
