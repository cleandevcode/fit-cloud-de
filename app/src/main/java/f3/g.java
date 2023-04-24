package f3;

import android.app.Notification;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public final int f14086a;

    /* renamed from: b */
    public final int f14087b;

    /* renamed from: c */
    public final Notification f14088c;

    public g(int i10, int i11, Notification notification) {
        this.f14086a = i10;
        this.f14088c = notification;
        this.f14087b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f14086a == gVar.f14086a && this.f14087b == gVar.f14087b) {
            return this.f14088c.equals(gVar.f14088c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14088c.hashCode() + (((this.f14086a * 31) + this.f14087b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f14086a + ", mForegroundServiceType=" + this.f14087b + ", mNotification=" + this.f14088c + '}';
    }
}
