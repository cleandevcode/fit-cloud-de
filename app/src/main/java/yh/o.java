package yh;

import com.topstep.fitcloud.pro.model.dial.DialPacket;
import com.topstep.fitcloud.pro.model.dial.DialPushParams;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a */
    public final DialPushParams f31768a;

    /* renamed from: b */
    public final List<DialPacket> f31769b;

    public o(DialPushParams dialPushParams, ArrayList arrayList) {
        gm.l.f(dialPushParams, "pushParams");
        this.f31768a = dialPushParams;
        this.f31769b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return gm.l.a(this.f31768a, oVar.f31768a) && gm.l.a(this.f31769b, oVar.f31769b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31769b.hashCode() + (this.f31768a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("pushParams:");
        a10.append(this.f31768a);
        a10.append(" , packets size:");
        a10.append(this.f31769b.size());
        return a10.toString();
    }
}
