package s;

import android.util.Size;
import s.a0;

/* loaded from: classes.dex */
public final class b extends a0.e {

    /* renamed from: a */
    public final String f25915a;

    /* renamed from: b */
    public final Class<?> f25916b;

    /* renamed from: c */
    public final a0.u1 f25917c;

    /* renamed from: d */
    public final a0.h2<?> f25918d;

    /* renamed from: e */
    public final Size f25919e;

    public b(String str, Class<?> cls, a0.u1 u1Var, a0.h2<?> h2Var, Size size) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f25915a = str;
        this.f25916b = cls;
        if (u1Var == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f25917c = u1Var;
        if (h2Var == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f25918d = h2Var;
        this.f25919e = size;
    }

    @Override // s.a0.e
    public final a0.u1 a() {
        return this.f25917c;
    }

    @Override // s.a0.e
    public final Size b() {
        return this.f25919e;
    }

    @Override // s.a0.e
    public final a0.h2<?> c() {
        return this.f25918d;
    }

    @Override // s.a0.e
    public final String d() {
        return this.f25915a;
    }

    @Override // s.a0.e
    public final Class<?> e() {
        return this.f25916b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e) {
            a0.e eVar = (a0.e) obj;
            if (this.f25915a.equals(eVar.d()) && this.f25916b.equals(eVar.e()) && this.f25917c.equals(eVar.a()) && this.f25918d.equals(eVar.c())) {
                Size size = this.f25919e;
                Size b10 = eVar.b();
                if (size == null) {
                    if (b10 == null) {
                        return true;
                    }
                } else if (size.equals(b10)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f25915a.hashCode() ^ 1000003) * 1000003) ^ this.f25916b.hashCode()) * 1000003) ^ this.f25917c.hashCode()) * 1000003) ^ this.f25918d.hashCode()) * 1000003;
        Size size = this.f25919e;
        return hashCode ^ (size == null ? 0 : size.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("UseCaseInfo{useCaseId=");
        a10.append(this.f25915a);
        a10.append(", useCaseType=");
        a10.append(this.f25916b);
        a10.append(", sessionConfig=");
        a10.append(this.f25917c);
        a10.append(", useCaseConfig=");
        a10.append(this.f25918d);
        a10.append(", surfaceResolution=");
        a10.append(this.f25919e);
        a10.append("}");
        return a10.toString();
    }
}
