package n6;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import bi.z0;
import d6.n0;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import n6.p;
import n6.s;
import o5.h;
import o5.h0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: f */
    public static final a f22170f = new a();

    /* renamed from: g */
    public static final Set<String> f22171g = z0.p("ads_management", "create_event", "rsvp_event");

    /* renamed from: h */
    public static final String f22172h;

    /* renamed from: i */
    public static volatile v f22173i;

    /* renamed from: c */
    public final SharedPreferences f22176c;

    /* renamed from: a */
    public o f22174a = o.NATIVE_WITH_FALLBACK;

    /* renamed from: b */
    public d f22175b = d.FRIENDS;

    /* renamed from: d */
    public String f22177d = "rerequest";

    /* renamed from: e */
    public y f22178e = y.FACEBOOK;

    /* loaded from: classes.dex */
    public static final class a {
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public static final b f22179a = new b();

        /* renamed from: b */
        public static s f22180b;

        /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
            r3 = r3;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [android.content.Context] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final synchronized n6.s a(android.app.Activity r3) {
            /*
                r2 = this;
                monitor-enter(r2)
                if (r3 != 0) goto L7
                android.content.Context r3 = o5.v.a()     // Catch: java.lang.Throwable -> L1a
            L7:
                n6.s r0 = n6.v.b.f22180b     // Catch: java.lang.Throwable -> L1a
                if (r0 != 0) goto L16
                n6.s r0 = new n6.s     // Catch: java.lang.Throwable -> L1a
                java.lang.String r1 = o5.v.b()     // Catch: java.lang.Throwable -> L1a
                r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L1a
                n6.v.b.f22180b = r0     // Catch: java.lang.Throwable -> L1a
            L16:
                n6.s r3 = n6.v.b.f22180b     // Catch: java.lang.Throwable -> L1a
                monitor-exit(r2)
                return r3
            L1a:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: n6.v.b.a(android.app.Activity):n6.s");
        }
    }

    static {
        String cls = v.class.toString();
        gm.l.e(cls, "LoginManager::class.java.toString()");
        f22172h = cls;
    }

    public v() {
        n0.g();
        SharedPreferences sharedPreferences = o5.v.a().getSharedPreferences("com.facebook.loginManager", 0);
        gm.l.e(sharedPreferences, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        this.f22176c = sharedPreferences;
        if (o5.v.f22849m && d6.g.a() != null) {
            c cVar = new c();
            Context a10 = o5.v.a();
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty("com.android.chrome")) {
                intent.setPackage("com.android.chrome");
            }
            a10.bindService(intent, cVar, 33);
            Context a11 = o5.v.a();
            String packageName = o5.v.a().getPackageName();
            if (packageName != null) {
                Context applicationContext = a11.getApplicationContext();
                p.c cVar2 = new p.c(applicationContext);
                try {
                    Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
                    if (!TextUtils.isEmpty(packageName)) {
                        intent2.setPackage(packageName);
                    }
                    applicationContext.bindService(intent2, cVar2, 33);
                } catch (SecurityException unused) {
                }
            }
        }
    }

    public static v a() {
        a aVar = f22170f;
        if (f22173i == null) {
            synchronized (aVar) {
                f22173i = new v();
                tl.l lVar = tl.l.f28297a;
            }
        }
        v vVar = f22173i;
        if (vVar != null) {
            return vVar;
        }
        gm.l.l("instance");
        throw null;
    }

    public static void b(Activity activity, p.e.a aVar, Map map, o5.p pVar, boolean z10, p.d dVar) {
        String str;
        String message;
        s a10 = b.f22179a.a(activity);
        if (a10 == null) {
            return;
        }
        String str2 = "fb_mobile_login_complete";
        if (dVar == null) {
            ScheduledExecutorService scheduledExecutorService = s.f22163d;
            if (!i6.a.b(s.class)) {
                try {
                    a10.a("fb_mobile_login_complete", "");
                    return;
                } catch (Throwable th2) {
                    i6.a.a(s.class, th2);
                    return;
                }
            }
            return;
        }
        HashMap hashMap = new HashMap();
        if (z10) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("try_login_activity", str);
        String str3 = dVar.f22127e;
        if (dVar.f22135m) {
            str2 = "foa_mobile_login_complete";
        }
        if (!i6.a.b(a10)) {
            try {
                ScheduledExecutorService scheduledExecutorService2 = s.f22163d;
                Bundle a11 = s.a.a(str3);
                if (aVar != null) {
                    a11.putString("2_result", aVar.f22153a);
                }
                JSONObject jSONObject = null;
                if (pVar == null) {
                    message = null;
                } else {
                    message = pVar.getMessage();
                }
                if (message != null) {
                    a11.putString("5_error_message", pVar.getMessage());
                }
                if (!hashMap.isEmpty()) {
                    jSONObject = new JSONObject(hashMap);
                }
                if (map != null) {
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    try {
                        for (Map.Entry entry : map.entrySet()) {
                            String str4 = (String) entry.getKey();
                            String str5 = (String) entry.getValue();
                            if (str4 != null) {
                                jSONObject.put(str4, str5);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
                if (jSONObject != null) {
                    a11.putString("6_extras", jSONObject.toString());
                }
                a10.f22165b.a(a11, str2);
                if (aVar == p.e.a.SUCCESS && !i6.a.b(a10)) {
                    ScheduledExecutorService scheduledExecutorService3 = s.f22163d;
                    s.f22163d.schedule(new s.o(a10, s.a.a(str3), 10), 5L, TimeUnit.SECONDS);
                }
            } catch (Throwable th3) {
                i6.a.a(a10, th3);
            }
        }
    }

    public final void c(int i10, Intent intent, o5.n nVar) {
        p.e.a aVar;
        o5.a aVar2;
        p.d dVar;
        o5.p pVar;
        Map<String, String> map;
        o5.h hVar;
        o5.m mVar;
        o5.h hVar2;
        p.e.a aVar3 = p.e.a.ERROR;
        boolean z10 = false;
        x xVar = null;
        if (intent != null) {
            intent.setExtrasClassLoader(p.e.class.getClassLoader());
            p.e eVar = (p.e) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (eVar != null) {
                dVar = eVar.f22146f;
                p.e.a aVar4 = eVar.f22141a;
                if (i10 != -1) {
                    if (i10 != 0) {
                        mVar = null;
                        pVar = mVar;
                        aVar2 = null;
                        hVar2 = null;
                        hVar = hVar2;
                        map = eVar.f22147g;
                        aVar = aVar4;
                    } else {
                        aVar2 = null;
                        pVar = null;
                        hVar2 = null;
                        z10 = true;
                        hVar = hVar2;
                        map = eVar.f22147g;
                        aVar = aVar4;
                    }
                } else if (aVar4 == p.e.a.SUCCESS) {
                    aVar2 = eVar.f22142b;
                    hVar2 = eVar.f22143c;
                    pVar = null;
                    hVar = hVar2;
                    map = eVar.f22147g;
                    aVar = aVar4;
                } else {
                    mVar = new o5.m(eVar.f22144d);
                    pVar = mVar;
                    aVar2 = null;
                    hVar2 = null;
                    hVar = hVar2;
                    map = eVar.f22147g;
                    aVar = aVar4;
                }
            }
            aVar = aVar3;
            aVar2 = null;
            dVar = null;
            pVar = null;
            map = null;
            hVar = null;
        } else {
            if (i10 == 0) {
                aVar = p.e.a.CANCEL;
                aVar2 = null;
                dVar = null;
                pVar = null;
                map = null;
                hVar = null;
                z10 = true;
            }
            aVar = aVar3;
            aVar2 = null;
            dVar = null;
            pVar = null;
            map = null;
            hVar = null;
        }
        if (pVar == null && aVar2 == null && !z10) {
            pVar = new o5.p("Unexpected call to LoginManager.onActivityResult");
        }
        o5.p pVar2 = pVar;
        b(null, aVar, map, pVar2, true, dVar);
        if (aVar2 != null) {
            Date date = o5.a.f22664l;
            o5.f.f22706f.a().c(aVar2, true);
            String str = h0.f22744h;
            h0.b.a();
        }
        if (hVar != null) {
            h.b.a(hVar);
        }
        if (nVar != null) {
            if (aVar2 != null && dVar != null) {
                Set<String> set = dVar.f22124b;
                LinkedHashSet linkedHashSet = new LinkedHashSet(ul.q.G(aVar2.f22668b));
                if (dVar.f22128f) {
                    linkedHashSet.retainAll(set);
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(ul.q.G(set));
                linkedHashSet2.removeAll(linkedHashSet);
                xVar = new x(aVar2, hVar, linkedHashSet, linkedHashSet2);
            }
            if (!z10 && (xVar == null || !xVar.f22185c.isEmpty())) {
                if (pVar2 != null) {
                    nVar.onError(pVar2);
                    return;
                } else if (aVar2 != null && xVar != null) {
                    SharedPreferences.Editor edit = this.f22176c.edit();
                    edit.putBoolean("express_login_allowed", true);
                    edit.apply();
                    nVar.onSuccess(xVar);
                    return;
                } else {
                    return;
                }
            }
            nVar.onCancel();
        }
    }
}
