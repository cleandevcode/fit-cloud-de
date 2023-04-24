package i8;

import g8.a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class t implements a.c {

    /* renamed from: b */
    public static final t f16715b = new t();

    /* renamed from: a */
    public final String f16716a = null;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            return n.a(this.f16716a, ((t) obj).f16716a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16716a});
    }
}
