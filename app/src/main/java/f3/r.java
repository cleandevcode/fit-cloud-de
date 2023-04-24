package f3;

import android.os.Build;
import androidx.work.ListenableWorker;
import f3.u;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r extends u {

    /* loaded from: classes.dex */
    public static final class a extends u.a<a, r> {
        public a(Class<? extends ListenableWorker> cls, long j10, TimeUnit timeUnit) {
            super(cls);
            o3.p pVar = this.f14117c;
            long millis = timeUnit.toMillis(j10);
            pVar.getClass();
            long j11 = 900000;
            if (millis < 900000) {
                m.c().f(o3.p.f22624s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
                millis = 900000;
            }
            if (millis < 900000) {
                m.c().f(o3.p.f22624s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
            } else {
                j11 = millis;
            }
            if (millis < 300000) {
                m.c().f(o3.p.f22624s, String.format("Flex duration lesser than minimum allowed value; Changed to %s", 300000L), new Throwable[0]);
                millis = 300000;
            }
            if (millis > j11) {
                m.c().f(o3.p.f22624s, String.format("Flex duration greater than interval duration; Changed to %s", Long.valueOf(j11)), new Throwable[0]);
                millis = j11;
            }
            pVar.f22632h = j11;
            pVar.f22633i = millis;
        }

        @Override // f3.u.a
        public final r b() {
            if (this.f14115a && Build.VERSION.SDK_INT >= 23 && this.f14117c.f22634j.f14068c) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if (!this.f14117c.f22641q) {
                return new r(this);
            }
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }

        @Override // f3.u.a
        public final a c() {
            return this;
        }
    }

    public r(a aVar) {
        super(aVar.f14116b, aVar.f14117c, aVar.f14118d);
    }
}
