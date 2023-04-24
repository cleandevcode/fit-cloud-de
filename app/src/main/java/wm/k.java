package wm;

import bi.z0;
import java.util.concurrent.TimeUnit;
import um.y;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a */
    public static final long f30052a = z0.q("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* renamed from: b */
    public static final int f30053b;

    /* renamed from: c */
    public static final int f30054c;

    /* renamed from: d */
    public static final long f30055d;

    /* renamed from: e */
    public static e f30056e;

    /* renamed from: f */
    public static final i f30057f;

    /* renamed from: g */
    public static final i f30058g;

    static {
        int i10 = y.f28943a;
        if (i10 < 2) {
            i10 = 2;
        }
        f30053b = z0.r("kotlinx.coroutines.scheduler.core.pool.size", i10, 1, 0, 8);
        f30054c = z0.r("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f30055d = TimeUnit.SECONDS.toNanos(z0.q("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f30056e = e.f30046a;
        f30057f = new i(0);
        f30058g = new i(1);
    }
}
