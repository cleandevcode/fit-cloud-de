package sj;

import gm.l;
import java.util.ArrayList;
import java.util.List;
import jh.v;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a */
    public final byte f27087a;

    /* renamed from: b */
    public final int f27088b;

    /* renamed from: c */
    public final int f27089c;

    /* renamed from: d */
    public final List<a> f27090d;

    /* renamed from: e */
    public final byte f27091e;

    /* renamed from: f */
    public final int f27092f;

    public c(byte b10, int i10, int i11, ArrayList arrayList, byte b11, int i12) {
        this.f27087a = b10;
        this.f27088b = i10;
        this.f27089c = i11;
        this.f27090d = arrayList;
        this.f27091e = b11;
        this.f27092f = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f27087a == cVar.f27087a && this.f27088b == cVar.f27088b && this.f27089c == cVar.f27089c && l.a(this.f27090d, cVar.f27090d) && this.f27091e == cVar.f27091e && this.f27092f == cVar.f27092f;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f27089c + ((this.f27088b + (this.f27087a * 31)) * 31)) * 31;
        List<a> list = this.f27090d;
        int hashCode = list == null ? 0 : list.hashCode();
        return this.f27092f + ((this.f27091e + ((i10 + hashCode) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder c10 = v.c("FcDialSpace(dialType=");
        c10.append((int) this.f27087a);
        c10.append(", dialNum=");
        c10.append(this.f27088b);
        c10.append(", binVersion=");
        c10.append(this.f27089c);
        c10.append(", components=");
        c10.append(this.f27090d);
        c10.append(", binFlag=");
        c10.append((int) this.f27091e);
        c10.append(", spaceSize=");
        return v.b(c10, this.f27092f, ')');
    }
}
