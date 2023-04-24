package th;

import java.util.ArrayList;
import y3.d1;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a */
    public final y3.b<ArrayList<rj.a>> f28212a;

    public q() {
        this(0);
    }

    public /* synthetic */ q(int i10) {
        this(d1.f30940b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(y3.b<? extends ArrayList<rj.a>> bVar) {
        gm.l.f(bVar, "requestAlarms");
        this.f28212a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && gm.l.a(this.f28212a, ((q) obj).f28212a);
    }

    public final int hashCode() {
        return this.f28212a.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("AlarmState(requestAlarms=");
        a10.append(this.f28212a);
        a10.append(')');
        return a10.toString();
    }
}
