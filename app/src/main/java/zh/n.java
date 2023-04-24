package zh;

import com.topstep.fitcloud.pro.model.dial.DialPushParams;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a */
    public final DialPushParams f32473a;

    /* renamed from: b */
    public final xf.a f32474b;

    public n(DialPushParams dialPushParams, xf.a aVar) {
        gm.l.f(dialPushParams, "pushParams");
        gm.l.f(aVar, "custom");
        this.f32473a = dialPushParams;
        this.f32474b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return gm.l.a(this.f32473a, nVar.f32473a) && gm.l.a(this.f32474b, nVar.f32474b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32474b.hashCode() + (this.f32473a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("pushParams:");
        a10.append(this.f32473a);
        a10.append(" , custom:");
        a10.append(this.f32474b);
        return a10.toString();
    }
}
