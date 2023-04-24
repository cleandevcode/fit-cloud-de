package dj;

import kc.w0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final w0 f13089a;

    /* renamed from: b */
    public final String f13090b;

    /* renamed from: c */
    public final String f13091c;

    /* renamed from: d */
    public final int f13092d;

    /* renamed from: e */
    public final uc.d f13093e;

    public a(w0 w0Var, String str, String str2, int i10, uc.d dVar) {
        this.f13089a = w0Var;
        this.f13090b = str;
        this.f13091c = str2;
        this.f13092d = i10;
        this.f13093e = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f13089a.b().equals(((a) obj).f13089a.b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f13089a.b().hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("FcScanResult(bleDevice=");
        a10.append(this.f13089a);
        a10.append(", address=");
        a10.append(this.f13090b);
        a10.append(", name=");
        a10.append(this.f13091c);
        a10.append(", rssi=");
        a10.append(this.f13092d);
        a10.append(", scanRecord=");
        a10.append(this.f13093e);
        a10.append(')');
        return a10.toString();
    }
}
