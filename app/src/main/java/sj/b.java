package sj;

import gm.l;
import i2.t;
import java.util.ArrayList;
import java.util.List;
import jh.v;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a */
    public final int f27078a;

    /* renamed from: b */
    public final int f27079b;

    /* renamed from: c */
    public final int f27080c;

    /* renamed from: d */
    public final e f27081d;

    /* renamed from: e */
    public final String f27082e;

    /* renamed from: f */
    public final List<c> f27083f;

    /* renamed from: g */
    public final int f27084g;

    /* renamed from: h */
    public final int f27085h;

    /* renamed from: i */
    public final int f27086i;

    public b(int i10, int i11, int i12, e eVar, String str, ArrayList arrayList, int i13, int i14, int i15) {
        l.f(str, "toolVersion");
        this.f27078a = i10;
        this.f27079b = i11;
        this.f27080c = i12;
        this.f27081d = eVar;
        this.f27082e = str;
        this.f27083f = arrayList;
        this.f27084g = i13;
        this.f27085h = i14;
        this.f27086i = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f27078a == bVar.f27078a && this.f27079b == bVar.f27079b && this.f27080c == bVar.f27080c && l.a(this.f27081d, bVar.f27081d) && l.a(this.f27082e, bVar.f27082e) && l.a(this.f27083f, bVar.f27083f) && this.f27084g == bVar.f27084g && this.f27085h == bVar.f27085h && this.f27086i == bVar.f27086i;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = this.f27079b;
        int i11 = (this.f27080c + ((i10 + (this.f27078a * 31)) * 31)) * 31;
        e eVar = this.f27081d;
        int i12 = 0;
        if (eVar == null) {
            hashCode = 0;
        } else {
            hashCode = eVar.hashCode();
        }
        int a10 = t.a(this.f27082e, (i11 + hashCode) * 31, 31);
        List<c> list = this.f27083f;
        if (list != null) {
            i12 = list.hashCode();
        }
        int i13 = this.f27084g;
        int i14 = this.f27085h;
        return this.f27086i + ((i14 + ((i13 + ((a10 + i12) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder c10 = v.c("FcDialPushInfo(uiNum=");
        c10.append(this.f27078a);
        c10.append(", uiSerial=");
        c10.append(this.f27079b);
        c10.append(", lcd=");
        c10.append(this.f27080c);
        c10.append(", shape=");
        c10.append(this.f27081d);
        c10.append(", toolVersion=");
        c10.append(this.f27082e);
        c10.append(", dialSpaces=");
        c10.append(this.f27083f);
        c10.append(", currentDialNum=");
        c10.append(this.f27084g);
        c10.append(", currentBinVersion=");
        c10.append(this.f27085h);
        c10.append(", currentPosition=");
        return v.b(c10, this.f27086i, ')');
    }
}
