package vb;

import android.support.v4.media.d;
import com.huawei.hms.framework.common.Logger;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public static final ConcurrentHashMap f29191a = new ConcurrentHashMap(16);

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final long f29192a;

        /* renamed from: b */
        public final long f29193b;

        public a(long j10, long j11) {
            this.f29192a = j10;
            this.f29193b = j11;
        }
    }

    public static a a(String str) {
        StringBuilder a10 = d.a("map size of get is before:");
        ConcurrentHashMap concurrentHashMap = f29191a;
        a10.append(concurrentHashMap.size());
        Logger.v("RequestUtil", a10.toString());
        a aVar = (a) concurrentHashMap.get(str);
        StringBuilder a11 = d.a("map size of get is after:");
        a11.append(concurrentHashMap.size());
        Logger.v("RequestUtil", a11.toString());
        return aVar;
    }

    public static void b(String str, a aVar) {
        StringBuilder a10 = d.a("map size of put is before:");
        ConcurrentHashMap concurrentHashMap = f29191a;
        a10.append(concurrentHashMap.size());
        Logger.v("RequestUtil", a10.toString());
        concurrentHashMap.put(str, aVar);
        Logger.v("RequestUtil", "map size of put is after:" + concurrentHashMap.size());
    }
}
