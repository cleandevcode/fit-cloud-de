package x8;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import androidx.appcompat.widget.u0;
import java.util.Arrays;
import java.util.List;
import s.h1;

/* loaded from: classes.dex */
public final class t extends j8.a {
    public static final Parcelable.Creator<t> CREATOR = new j0();

    /* renamed from: a */
    public final int f30434a;

    /* renamed from: b */
    public final int f30435b;

    /* renamed from: c */
    public final String f30436c;

    /* renamed from: d */
    public final String f30437d;

    /* renamed from: e */
    public final int f30438e;

    /* renamed from: f */
    public final String f30439f;

    /* renamed from: g */
    public final t f30440g;

    /* renamed from: h */
    public final f0 f30441h;

    static {
        Process.myUid();
        Process.myPid();
    }

    public t(int i10, int i11, String str, String str2, String str3, int i12, List list, t tVar) {
        g0 g0Var;
        f0 f0Var;
        this.f30434a = i10;
        this.f30435b = i11;
        this.f30436c = str;
        this.f30437d = str2;
        this.f30439f = str3;
        this.f30438e = i12;
        d0 d0Var = f0.f30411b;
        if (list instanceof c0) {
            f0Var = ((c0) list).i();
            if (f0Var.k()) {
                Object[] array = f0Var.toArray();
                int length = array.length;
                if (length != 0) {
                    g0Var = new g0(length, array);
                    f0Var = g0Var;
                }
                f0Var = g0.f30415e;
            }
        } else {
            Object[] array2 = list.toArray();
            int length2 = array2.length;
            for (int i13 = 0; i13 < length2; i13++) {
                if (array2[i13] == null) {
                    throw new NullPointerException(u0.a("at index ", i13));
                }
            }
            if (length2 != 0) {
                g0Var = new g0(length2, array2);
                f0Var = g0Var;
            }
            f0Var = g0.f30415e;
        }
        this.f30441h = f0Var;
        this.f30440g = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            return this.f30434a == tVar.f30434a && this.f30435b == tVar.f30435b && this.f30438e == tVar.f30438e && this.f30436c.equals(tVar.f30436c) && h1.t(this.f30437d, tVar.f30437d) && h1.t(this.f30439f, tVar.f30439f) && h1.t(this.f30440g, tVar.f30440g) && this.f30441h.equals(tVar.f30441h);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f30434a), this.f30436c, this.f30437d, this.f30439f});
    }

    public final String toString() {
        int length = this.f30436c.length() + 18;
        String str = this.f30437d;
        if (str != null) {
            length += str.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f30434a);
        sb2.append("/");
        sb2.append(this.f30436c);
        if (this.f30437d != null) {
            sb2.append("[");
            if (this.f30437d.startsWith(this.f30436c)) {
                sb2.append((CharSequence) this.f30437d, this.f30436c.length(), this.f30437d.length());
            } else {
                sb2.append(this.f30437d);
            }
            sb2.append("]");
        }
        if (this.f30439f != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(this.f30439f.hashCode()));
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.z(parcel, 1, this.f30434a);
        o8.b.z(parcel, 2, this.f30435b);
        o8.b.C(parcel, 3, this.f30436c);
        o8.b.C(parcel, 4, this.f30437d);
        o8.b.z(parcel, 5, this.f30438e);
        o8.b.C(parcel, 6, this.f30439f);
        o8.b.B(parcel, 7, this.f30440g, i10);
        o8.b.E(parcel, 8, this.f30441h);
        o8.b.J(parcel, F);
    }
}
