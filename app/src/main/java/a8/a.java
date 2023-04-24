package a8;

import a8.d;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class a extends d.a {

    /* renamed from: d */
    public static d<a> f363d;

    /* renamed from: b */
    public float f364b;

    /* renamed from: c */
    public float f365c;

    static {
        d<a> a10 = d.a(DfuBaseService.ERROR_REMOTE_TYPE_LEGACY, new a(0));
        f363d = a10;
        a10.f378f = 0.5f;
    }

    public a() {
    }

    public a(int i10) {
        this.f364b = 0.0f;
        this.f365c = 0.0f;
    }

    public static a b(float f10, float f11) {
        a b10 = f363d.b();
        b10.f364b = f10;
        b10.f365c = f11;
        return b10;
    }

    @Override // a8.d.a
    public final d.a a() {
        return new a(0);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f364b == aVar.f364b && this.f365c == aVar.f365c;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f364b) ^ Float.floatToIntBits(this.f365c);
    }

    public final String toString() {
        return this.f364b + "x" + this.f365c;
    }
}
