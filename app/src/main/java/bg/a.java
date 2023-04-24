package bg;

import android.support.v4.media.d;
import com.topstep.fitcloud.pro.model.sport.push.SportPacket;
import fb.b;
import gm.l;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final List<SportPacket> f4183a;

    /* renamed from: b */
    public final List<uj.a> f4184b;

    public a(ArrayList arrayList, ArrayList arrayList2) {
        this.f4183a = arrayList;
        this.f4184b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return l.a(this.f4183a, aVar.f4183a) && l.a(this.f4184b, aVar.f4184b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4184b.hashCode() + (this.f4183a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a10 = d.a("SportPushParams(packets=");
        a10.append(this.f4183a);
        a10.append(", pushableSpaces=");
        return b.a(a10, this.f4184b, ')');
    }
}
