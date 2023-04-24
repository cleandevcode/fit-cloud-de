package gm;

/* loaded from: classes2.dex */
public abstract class w extends c implements mm.h {
    public w() {
    }

    public w(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (d().equals(wVar.d()) && this.f15493d.equals(wVar.f15493d) && this.f15494e.equals(wVar.f15494e) && l.a(this.f15491b, wVar.f15491b)) {
                return true;
            }
            return false;
        } else if (!(obj instanceof mm.h)) {
            return false;
        } else {
            return obj.equals(a());
        }
    }

    public final int hashCode() {
        return this.f15494e.hashCode() + i2.t.a(this.f15493d, d().hashCode() * 31, 31);
    }

    public final String toString() {
        mm.a a10 = a();
        if (a10 != this) {
            return a10.toString();
        }
        return androidx.activity.e.b(android.support.v4.media.d.a("property "), this.f15493d, " (Kotlin reflection is not available)");
    }
}
