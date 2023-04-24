package gg;

import android.support.v4.media.d;
import gm.l;
import java.util.Date;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a */
    public final int f15335a;

    /* renamed from: b */
    public final boolean f15336b;

    /* renamed from: c */
    public final int f15337c;

    /* renamed from: d */
    public final int f15338d;

    /* renamed from: e */
    public final int f15339e;

    /* renamed from: f */
    public final int f15340f;

    /* renamed from: g */
    public final int f15341g;

    /* renamed from: h */
    public final Date f15342h;

    public b(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, Date date) {
        l.f(date, "latest");
        this.f15335a = i10;
        this.f15336b = z10;
        this.f15337c = i11;
        this.f15338d = i12;
        this.f15339e = i13;
        this.f15340f = i14;
        this.f15341g = i15;
        this.f15342h = date;
    }

    public static b a(b bVar, int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, Date date, int i16) {
        int i17 = (i16 & 1) != 0 ? bVar.f15335a : i10;
        boolean z11 = (i16 & 2) != 0 ? bVar.f15336b : z10;
        int i18 = (i16 & 4) != 0 ? bVar.f15337c : i11;
        int i19 = (i16 & 8) != 0 ? bVar.f15338d : i12;
        int i20 = (i16 & 16) != 0 ? bVar.f15339e : i13;
        int i21 = (i16 & 32) != 0 ? bVar.f15340f : i14;
        int i22 = (i16 & 64) != 0 ? bVar.f15341g : i15;
        Date date2 = (i16 & 128) != 0 ? bVar.f15342h : date;
        l.f(date2, "latest");
        return new b(i17, z11, i18, i19, i20, i21, i22, date2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f15335a == bVar.f15335a && this.f15336b == bVar.f15336b && this.f15337c == bVar.f15337c && this.f15338d == bVar.f15338d && this.f15339e == bVar.f15339e && this.f15340f == bVar.f15340f && this.f15341g == bVar.f15341g && l.a(this.f15342h, bVar.f15342h);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i10 = this.f15335a * 31;
        boolean z10 = this.f15336b;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        return this.f15342h.hashCode() + ((((((((((((i10 + i11) * 31) + this.f15337c) * 31) + this.f15338d) * 31) + this.f15339e) * 31) + this.f15340f) * 31) + this.f15341g) * 31);
    }

    public final String toString() {
        StringBuilder a10 = d.a("WomenHealthConfig(mode=");
        a10.append(this.f15335a);
        a10.append(", remindDevice=");
        a10.append(this.f15336b);
        a10.append(", remindTime=");
        a10.append(this.f15337c);
        a10.append(", remindAdvance=");
        a10.append(this.f15338d);
        a10.append(", remindType=");
        a10.append(this.f15339e);
        a10.append(", cycle=");
        a10.append(this.f15340f);
        a10.append(", duration=");
        a10.append(this.f15341g);
        a10.append(", latest=");
        a10.append(this.f15342h);
        a10.append(')');
        return a10.toString();
    }
}
