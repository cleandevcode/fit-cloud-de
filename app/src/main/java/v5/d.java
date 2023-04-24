package v5;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import s.q;
import v5.e;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final d f29075a = new d();

    public static final void b(Context context) {
        AtomicBoolean atomicBoolean;
        e a10;
        if (i6.a.b(d.class)) {
            return;
        }
        try {
            if (j.a("com.android.billingclient.api.Purchase") == null) {
                return;
            }
            synchronized (e.f29076s) {
                AtomicBoolean atomicBoolean2 = null;
                if (i6.a.b(e.class)) {
                    atomicBoolean = null;
                } else {
                    atomicBoolean = e.f29077t;
                }
                if (!atomicBoolean.get()) {
                    e.b.a(context);
                    if (!i6.a.b(e.class)) {
                        atomicBoolean2 = e.f29077t;
                    }
                    atomicBoolean2.set(true);
                }
                a10 = e.a();
            }
            if (a10 != null && e.b.c().get()) {
                if (g.d()) {
                    q5.a aVar = new q5.a(1);
                    if (!i6.a.b(a10)) {
                        a10.c(new q(a10, aVar, 14));
                        return;
                    }
                    return;
                }
                a10.b(new s.j(1));
            }
        } catch (Throwable th2) {
            i6.a.a(d.class, th2);
        }
    }

    public final void a() {
        ConcurrentHashMap concurrentHashMap;
        if (i6.a.b(this)) {
            return;
        }
        try {
            g gVar = g.f29110a;
            e.b bVar = e.f29076s;
            ConcurrentHashMap b10 = e.b.b();
            if (!i6.a.b(e.class)) {
                concurrentHashMap = e.f29081x;
            } else {
                concurrentHashMap = null;
            }
            g.e(b10, concurrentHashMap);
            e.b.b().clear();
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }
}
