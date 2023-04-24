package a1;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e */
    public static final c f213e = new c(0, 0, 0, 0);

    /* renamed from: a */
    public final int f214a;

    /* renamed from: b */
    public final int f215b;

    /* renamed from: c */
    public final int f216c;

    /* renamed from: d */
    public final int f217d;

    /* loaded from: classes.dex */
    public static class a {
        public static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    public c(int i10, int i11, int i12, int i13) {
        this.f214a = i10;
        this.f215b = i11;
        this.f216c = i12;
        this.f217d = i13;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f214a, cVar2.f214a), Math.max(cVar.f215b, cVar2.f215b), Math.max(cVar.f216c, cVar2.f216c), Math.max(cVar.f217d, cVar2.f217d));
    }

    public static c b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f213e : new c(i10, i11, i12, i13);
    }

    public static c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return a.a(this.f214a, this.f215b, this.f216c, this.f217d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f217d == cVar.f217d && this.f214a == cVar.f214a && this.f216c == cVar.f216c && this.f215b == cVar.f215b;
    }

    public final int hashCode() {
        return (((((this.f214a * 31) + this.f215b) * 31) + this.f216c) * 31) + this.f217d;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Insets{left=");
        a10.append(this.f214a);
        a10.append(", top=");
        a10.append(this.f215b);
        a10.append(", right=");
        a10.append(this.f216c);
        a10.append(", bottom=");
        return b.a(a10, this.f217d, '}');
    }
}
