package yf;

import android.support.v4.media.d;
import gm.l;
import l2.o0;
import t0.e;
import vf.c;
import vf.f;
import vf.k;
import vf.m;
import vf.r;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final int f31454a;

    /* renamed from: b */
    public final float f31455b;

    /* renamed from: c */
    public final int f31456c;

    /* renamed from: d */
    public final f f31457d;

    /* renamed from: e */
    public final k f31458e;

    /* renamed from: f */
    public final c f31459f;

    /* renamed from: g */
    public final r f31460g;

    /* renamed from: h */
    public final m f31461h;

    /* renamed from: i */
    public final boolean f31462i;

    public a(int i10, float f10, int i11, f fVar, k kVar, c cVar, r rVar, m mVar, boolean z10) {
        this.f31454a = i10;
        this.f31455b = f10;
        this.f31456c = i11;
        this.f31457d = fVar;
        this.f31458e = kVar;
        this.f31459f = cVar;
        this.f31460g = rVar;
        this.f31461h = mVar;
        this.f31462i = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f31454a == aVar.f31454a && Float.compare(this.f31455b, aVar.f31455b) == 0 && this.f31456c == aVar.f31456c && l.a(this.f31457d, aVar.f31457d) && l.a(this.f31458e, aVar.f31458e) && l.a(this.f31459f, aVar.f31459f) && l.a(this.f31460g, aVar.f31460g) && l.a(this.f31461h, aVar.f31461h) && this.f31462i == aVar.f31462i;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int b10 = (e.b(this.f31455b, this.f31454a * 31, 31) + this.f31456c) * 31;
        f fVar = this.f31457d;
        int i10 = 0;
        if (fVar == null) {
            hashCode = 0;
        } else {
            hashCode = fVar.hashCode();
        }
        int i11 = (b10 + hashCode) * 31;
        k kVar = this.f31458e;
        if (kVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = kVar.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        c cVar = this.f31459f;
        if (cVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = cVar.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        r rVar = this.f31460g;
        if (rVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = rVar.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        m mVar = this.f31461h;
        if (mVar != null) {
            i10 = mVar.hashCode();
        }
        int i15 = (i14 + i10) * 31;
        boolean z10 = this.f31462i;
        int i16 = z10;
        if (z10 != 0) {
            i16 = 1;
        }
        return i15 + i16;
    }

    public final String toString() {
        StringBuilder a10 = d.a("FriendTotalData(step=");
        a10.append(this.f31454a);
        a10.append(", distance=");
        a10.append(this.f31455b);
        a10.append(", sleepTime=");
        a10.append(this.f31456c);
        a10.append(", heartRate=");
        a10.append(this.f31457d);
        a10.append(", oxygen=");
        a10.append(this.f31458e);
        a10.append(", bloodPressure=");
        a10.append(this.f31459f);
        a10.append(", temperature=");
        a10.append(this.f31460g);
        a10.append(", pressure=");
        a10.append(this.f31461h);
        a10.append(", isEcgEnabled=");
        return o0.a(a10, this.f31462i, ')');
    }
}
