package uh;

import cn.sharesdk.framework.InnerShareParams;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a */
    public final String f28819a;

    /* renamed from: b */
    public String f28820b;

    /* renamed from: c */
    public int f28821c;

    public z(String str, String str2, int i10) {
        gm.l.f(str, InnerShareParams.ADDRESS);
        this.f28819a = str;
        this.f28820b = str2;
        this.f28821c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (gm.l.a(z.class, obj != null ? obj.getClass() : null)) {
            gm.l.d(obj, "null cannot be cast to non-null type com.topstep.fitcloud.pro.ui.device.bind.ScanDevice");
            return gm.l.a(this.f28819a, ((z) obj).f28819a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28819a.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("ScanDevice(address='");
        a10.append(this.f28819a);
        a10.append("', name='");
        a10.append(this.f28820b);
        a10.append("', rssi=");
        return a1.b.a(a10, this.f28821c, ')');
    }
}
