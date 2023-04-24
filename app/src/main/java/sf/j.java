package sf;

import java.util.Date;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a */
    public final Date f26940a;

    /* renamed from: b */
    public final Date f26941b;

    public j(Date date, Date date2) {
        this.f26940a = date;
        this.f26941b = date2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return gm.l.a(this.f26940a, jVar.f26940a) && gm.l.a(this.f26941b, jVar.f26941b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26941b.hashCode() + (this.f26940a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("DateInfo(todayStartTime=");
        a10.append(this.f26940a);
        a10.append(", recordLimitDayStartTime=");
        a10.append(this.f26941b);
        a10.append(')');
        return a10.toString();
    }
}
