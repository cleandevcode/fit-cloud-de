package wf;

import android.support.v4.media.d;
import cn.sharesdk.framework.InnerShareParams;
import gm.l;
import i2.t;
import l2.o0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final String f29802a;

    /* renamed from: b */
    public final String f29803b;

    /* renamed from: c */
    public final boolean f29804c;

    public a(String str, String str2, boolean z10) {
        l.f(str, InnerShareParams.ADDRESS);
        l.f(str2, "name");
        this.f29802a = str;
        this.f29803b = str2;
        this.f29804c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return l.a(this.f29802a, aVar.f29802a) && l.a(this.f29803b, aVar.f29803b) && this.f29804c == aVar.f29804c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int a10 = t.a(this.f29803b, this.f29802a.hashCode() * 31, 31);
        boolean z10 = this.f29804c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return a10 + i10;
    }

    public final String toString() {
        StringBuilder a10 = d.a("ConnectorDevice(address=");
        a10.append(this.f29802a);
        a10.append(", name=");
        a10.append(this.f29803b);
        a10.append(", isTryingBind=");
        return o0.a(a10, this.f29804c, ')');
    }
}
