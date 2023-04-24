package d6;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import o5.y;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a */
    public static final w f12811a = new w();

    /* renamed from: b */
    public static final String f12812b = w.class.getSimpleName();

    /* renamed from: c */
    public static final List<String> f12813c = h7.a.q("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting");

    /* renamed from: d */
    public static final ConcurrentHashMap f12814d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final AtomicReference<a> f12815e = new AtomicReference<>(a.NOT_LOADED);

    /* renamed from: f */
    public static final ConcurrentLinkedQueue<b> f12816f = new ConcurrentLinkedQueue<>();

    /* renamed from: g */
    public static boolean f12817g;

    /* loaded from: classes.dex */
    public enum a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            return (a[]) Arrays.copyOf(values(), 4);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b();
    }

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f12813c);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        String str = o5.y.f22858j;
        o5.y g10 = y.c.g(null, "app", null);
        g10.f22869i = true;
        g10.f22864d = bundle;
        JSONObject jSONObject = g10.c().f22705d;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    public static final v b(String str) {
        return (v) f12814d.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c() {
        /*
            d6.w$a r0 = d6.w.a.LOADING
            d6.w$a r1 = d6.w.a.ERROR
            android.content.Context r2 = o5.v.a()
            java.lang.String r3 = o5.v.b()
            boolean r4 = d6.m0.A(r3)
            if (r4 == 0) goto L1d
            java.util.concurrent.atomic.AtomicReference<d6.w$a> r0 = d6.w.f12815e
            r0.set(r1)
            d6.w r0 = d6.w.f12811a
            r0.e()
            return
        L1d:
            java.util.concurrent.ConcurrentHashMap r4 = d6.w.f12814d
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L32
            java.util.concurrent.atomic.AtomicReference<d6.w$a> r0 = d6.w.f12815e
            d6.w$a r1 = d6.w.a.SUCCESS
            r0.set(r1)
            d6.w r0 = d6.w.f12811a
            r0.e()
            return
        L32:
            java.util.concurrent.atomic.AtomicReference<d6.w$a> r4 = d6.w.f12815e
            d6.w$a r5 = d6.w.a.NOT_LOADED
        L36:
            boolean r6 = r4.compareAndSet(r5, r0)
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L40
            r4 = 1
            goto L47
        L40:
            java.lang.Object r6 = r4.get()
            if (r6 == r5) goto L36
            r4 = 0
        L47:
            if (r4 != 0) goto L5f
            java.util.concurrent.atomic.AtomicReference<d6.w$a> r4 = d6.w.f12815e
        L4b:
            boolean r5 = r4.compareAndSet(r1, r0)
            if (r5 == 0) goto L53
            r0 = 1
            goto L5a
        L53:
            java.lang.Object r5 = r4.get()
            if (r5 == r1) goto L4b
            r0 = 0
        L5a:
            if (r0 == 0) goto L5d
            goto L5f
        L5d:
            r0 = 0
            goto L60
        L5f:
            r0 = 1
        L60:
            if (r0 != 0) goto L68
            d6.w r0 = d6.w.f12811a
            r0.e()
            return
        L68:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r3
            java.lang.String r1 = "com.facebook.internal.APP_SETTINGS.%s"
            java.lang.String r4 = "java.lang.String.format(format, *args)"
            java.lang.String r0 = androidx.fragment.app.i1.d(r0, r7, r1, r4)
            java.util.concurrent.Executor r1 = o5.v.c()
            m2.p r4 = new m2.p
            r4.<init>()
            r1.execute(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.w.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:211:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0219 A[LOOP:1: B:175:0x014b->B:217:0x0219, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0223 A[EDGE_INSN: B:227:0x0223->B:218:0x0223 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static d6.v d(java.lang.String r34, org.json.JSONObject r35) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.w.d(java.lang.String, org.json.JSONObject):d6.v");
    }

    public static final v f(String str, boolean z10) {
        gm.l.f(str, "applicationId");
        if (!z10) {
            ConcurrentHashMap concurrentHashMap = f12814d;
            if (concurrentHashMap.containsKey(str)) {
                return (v) concurrentHashMap.get(str);
            }
        }
        w wVar = f12811a;
        wVar.getClass();
        v d10 = d(str, a());
        if (gm.l.a(str, o5.v.b())) {
            f12815e.set(a.SUCCESS);
            wVar.e();
        }
        return d10;
    }

    public final synchronized void e() {
        a aVar = f12815e.get();
        if (a.NOT_LOADED != aVar && a.LOADING != aVar) {
            v vVar = (v) f12814d.get(o5.v.b());
            Handler handler = new Handler(Looper.getMainLooper());
            if (a.ERROR == aVar) {
                while (true) {
                    ConcurrentLinkedQueue<b> concurrentLinkedQueue = f12816f;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    handler.post(new androidx.activity.b(8, concurrentLinkedQueue.poll()));
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<b> concurrentLinkedQueue2 = f12816f;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    handler.post(new t.n(concurrentLinkedQueue2.poll(), vVar, 11));
                }
            }
        }
    }
}
