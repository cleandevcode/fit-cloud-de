package d6;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import o5.y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a */
    public static final u f12789a = new u();

    /* renamed from: b */
    public static final AtomicBoolean f12790b;

    /* renamed from: c */
    public static final ConcurrentLinkedQueue<a> f12791c;

    /* renamed from: d */
    public static final ConcurrentHashMap f12792d;

    /* renamed from: e */
    public static Long f12793e;

    /* renamed from: f */
    public static w.d f12794f;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    static {
        gm.b0.a(u.class).a();
        f12790b = new AtomicBoolean(false);
        f12791c = new ConcurrentLinkedQueue<>();
        f12792d = new ConcurrentHashMap();
    }

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        o5.v vVar = o5.v.f22837a;
        bundle.putString(HianalyticsBaseData.SDK_VERSION, "14.1.0");
        bundle.putString("fields", "gatekeepers");
        String str = o5.y.f22858j;
        String format = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        gm.l.e(format, "java.lang.String.format(format, *args)");
        o5.y g10 = y.c.g(null, format, null);
        g10.f22864d = bundle;
        JSONObject jSONObject = g10.c().f22705d;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    public static final boolean b(String str, String str2, boolean z10) {
        HashMap hashMap;
        ConcurrentHashMap concurrentHashMap;
        gm.l.f(str, "name");
        f12789a.getClass();
        ArrayList<e6.a> arrayList = null;
        c(null);
        if (!f12792d.containsKey(str2)) {
            hashMap = new HashMap();
        } else {
            w.d dVar = f12794f;
            if (dVar != null && (concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) dVar.f29489a).get(str2)) != null) {
                arrayList = new ArrayList(concurrentHashMap.size());
                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                    arrayList.add((e6.a) entry.getValue());
                }
            }
            if (arrayList != null) {
                hashMap = new HashMap();
                for (e6.a aVar : arrayList) {
                    hashMap.put(aVar.f13483a, Boolean.valueOf(aVar.f13484b));
                }
            } else {
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = (JSONObject) f12792d.get(str2);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    gm.l.e(next, "key");
                    hashMap2.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                w.d dVar2 = f12794f;
                if (dVar2 == null) {
                    dVar2 = new w.d(3);
                }
                ArrayList arrayList2 = new ArrayList(hashMap2.size());
                for (Map.Entry entry2 : hashMap2.entrySet()) {
                    arrayList2.add(new e6.a((String) entry2.getKey(), ((Boolean) entry2.getValue()).booleanValue()));
                }
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    e6.a aVar2 = (e6.a) it.next();
                    concurrentHashMap2.put(aVar2.f13483a, aVar2);
                }
                ((ConcurrentHashMap) dVar2.f29489a).put(str2, concurrentHashMap2);
                f12794f = dVar2;
                hashMap = hashMap2;
            }
        }
        if (hashMap.containsKey(str)) {
            Boolean bool = (Boolean) hashMap.get(str);
            if (bool == null) {
                return z10;
            }
            return bool.booleanValue();
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0082 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0084 A[Catch: all -> 0x003c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:45:0x0005, B:46:0x000a, B:54:0x002f, B:56:0x0037, B:61:0x003e, B:63:0x0066, B:67:0x0073, B:68:0x0076, B:72:0x0084, B:65:0x006d, B:49:0x001a), top: B:79:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized void c(d6.t r8) {
        /*
            java.lang.Class<d6.u> r0 = d6.u.class
            monitor-enter(r0)
            if (r8 == 0) goto La
            java.util.concurrent.ConcurrentLinkedQueue<d6.u$a> r1 = d6.u.f12791c     // Catch: java.lang.Throwable -> L3c
            r1.add(r8)     // Catch: java.lang.Throwable -> L3c
        La:
            java.lang.String r8 = o5.v.b()     // Catch: java.lang.Throwable -> L3c
            d6.u r1 = d6.u.f12789a     // Catch: java.lang.Throwable -> L3c
            java.lang.Long r2 = d6.u.f12793e     // Catch: java.lang.Throwable -> L3c
            r1.getClass()     // Catch: java.lang.Throwable -> L3c
            r1 = 0
            r3 = 1
            if (r2 != 0) goto L1a
            goto L2c
        L1a:
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3c
            long r6 = r2.longValue()     // Catch: java.lang.Throwable -> L3c
            long r4 = r4 - r6
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L2c
            r2 = 1
            goto L2d
        L2c:
            r2 = 0
        L2d:
            if (r2 == 0) goto L3e
            java.util.concurrent.ConcurrentHashMap r2 = d6.u.f12792d     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r2.containsKey(r8)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L3e
            e()     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            return
        L3c:
            r8 = move-exception
            goto L8f
        L3e:
            android.content.Context r2 = o5.v.a()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = "com.facebook.internal.APP_GATEKEEPERS.%s"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L3c
            r5[r1] = r8     // Catch: java.lang.Throwable -> L3c
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = "java.lang.String.format(format, *args)"
            gm.l.e(r4, r5)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = "com.facebook.internal.preferences.APP_GATEKEEPERS"
            android.content.SharedPreferences r5 = r2.getSharedPreferences(r5, r1)     // Catch: java.lang.Throwable -> L3c
            r6 = 0
            java.lang.String r5 = r5.getString(r4, r6)     // Catch: java.lang.Throwable -> L3c
            boolean r7 = d6.m0.A(r5)     // Catch: java.lang.Throwable -> L3c
            if (r7 != 0) goto L76
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3c org.json.JSONException -> L6d
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L3c org.json.JSONException -> L6d
            r6 = r7
            goto L71
        L6d:
            d6.m0 r5 = d6.m0.f12709a     // Catch: java.lang.Throwable -> L3c
            o5.v r5 = o5.v.f22837a     // Catch: java.lang.Throwable -> L3c
        L71:
            if (r6 == 0) goto L76
            d(r8, r6)     // Catch: java.lang.Throwable -> L3c
        L76:
            java.util.concurrent.Executor r5 = o5.v.c()     // Catch: java.lang.Throwable -> L3c
            java.util.concurrent.atomic.AtomicBoolean r6 = d6.u.f12790b     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r6.compareAndSet(r1, r3)     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L84
            monitor-exit(r0)
            return
        L84:
            s.k r1 = new s.k     // Catch: java.lang.Throwable -> L3c
            r3 = 2
            r1.<init>(r8, r2, r4, r3)     // Catch: java.lang.Throwable -> L3c
            r5.execute(r1)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            return
        L8f:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.u.c(d6.t):void");
    }

    public static final synchronized JSONObject d(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (u.class) {
            jSONObject2 = (JSONObject) f12792d.get(str);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            int i10 = 0;
            JSONObject jSONObject3 = null;
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            if (optJSONArray != null) {
                jSONObject3 = optJSONArray.optJSONObject(0);
            }
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
            if (optJSONArray2 == null) {
                optJSONArray2 = new JSONArray();
            }
            int length = optJSONArray2.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    try {
                        JSONObject jSONObject4 = optJSONArray2.getJSONObject(i10);
                        jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean("value"));
                    } catch (JSONException unused) {
                        m0 m0Var = m0.f12709a;
                        o5.v vVar = o5.v.f22837a;
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            f12792d.put(str, jSONObject2);
        }
        return jSONObject2;
    }

    public static void e() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<a> concurrentLinkedQueue = f12791c;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            a poll = concurrentLinkedQueue.poll();
            if (poll != null) {
                handler.post(new androidx.activity.h(6, poll));
            }
        }
    }
}
