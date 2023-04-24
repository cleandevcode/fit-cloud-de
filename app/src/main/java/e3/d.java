package e3;

import android.graphics.Rect;
import gm.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public final d3.a f13334a;

    public d(Rect rect) {
        this.f13334a = new d3.a(rect);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !l.a(d.class, obj.getClass())) {
            return false;
        }
        return l.a(this.f13334a, ((d) obj).f13334a);
    }

    public final int hashCode() {
        return this.f13334a.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("WindowMetrics { bounds: ");
        d3.a aVar = this.f13334a;
        aVar.getClass();
        a10.append(new Rect(aVar.f12616a, aVar.f12617b, aVar.f12618c, aVar.f12619d));
        a10.append(" }");
        return a10.toString();
    }
}
