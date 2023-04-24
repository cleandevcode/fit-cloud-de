package gm;

/* loaded from: classes2.dex */
public class h extends c implements g, mm.c {

    /* renamed from: g */
    public final int f15501g;

    /* renamed from: h */
    public final int f15502h;

    public h(int i10, Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, false);
        this.f15501g = i10;
        this.f15502h = 0;
    }

    @Override // gm.c
    public final mm.a c() {
        b0.f15488a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f15493d.equals(hVar.f15493d) && this.f15494e.equals(hVar.f15494e) && this.f15502h == hVar.f15502h && this.f15501g == hVar.f15501g && l.a(this.f15491b, hVar.f15491b) && l.a(d(), hVar.d())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof mm.c)) {
            return false;
        } else {
            return obj.equals(a());
        }
    }

    @Override // gm.g
    public final int h() {
        return this.f15501g;
    }

    public final int hashCode() {
        int hashCode;
        if (d() == null) {
            hashCode = 0;
        } else {
            hashCode = d().hashCode() * 31;
        }
        return this.f15494e.hashCode() + i2.t.a(this.f15493d, hashCode, 31);
    }

    public final String toString() {
        mm.a a10 = a();
        if (a10 != this) {
            return a10.toString();
        }
        if ("<init>".equals(this.f15493d)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return androidx.activity.e.b(android.support.v4.media.d.a("function "), this.f15493d, " (Kotlin reflection is not available)");
    }
}
