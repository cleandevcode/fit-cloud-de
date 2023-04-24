package in;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import ul.z;
import zm.u;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a */
    public static final CopyOnWriteArraySet<Logger> f17207a = new CopyOnWriteArraySet<>();

    /* renamed from: b */
    public static final Map<String, String> f17208b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r12 = u.class.getPackage();
        String name = r12 != null ? r12.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(u.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(gn.e.class.getName(), "okhttp.Http2");
        linkedHashMap.put(cn.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f17208b = z.E(linkedHashMap);
    }
}
