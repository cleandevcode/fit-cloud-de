package d3;

import a0.q;
import android.graphics.Rect;
import gm.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final int f12616a;

    /* renamed from: b */
    public final int f12617b;

    /* renamed from: c */
    public final int f12618c;

    /* renamed from: d */
    public final int f12619d;

    public a(Rect rect) {
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        this.f12616a = i10;
        this.f12617b = i11;
        this.f12618c = i12;
        this.f12619d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (l.a(a.class, obj == null ? null : obj.getClass())) {
            if (obj != null) {
                a aVar = (a) obj;
                return this.f12616a == aVar.f12616a && this.f12617b == aVar.f12617b && this.f12618c == aVar.f12618c && this.f12619d == aVar.f12619d;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f12616a * 31) + this.f12617b) * 31) + this.f12618c) * 31) + this.f12619d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) a.class.getSimpleName());
        sb2.append(" { [");
        sb2.append(this.f12616a);
        sb2.append(',');
        sb2.append(this.f12617b);
        sb2.append(',');
        sb2.append(this.f12618c);
        sb2.append(',');
        return q.b(sb2, this.f12619d, "] }");
    }
}
