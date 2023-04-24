package o5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import d6.b;
import java.util.concurrent.atomic.AtomicBoolean;
import o5.q0;
import o5.y;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a */
    public static final q0 f22807a = new q0();

    /* renamed from: b */
    public static final String f22808b = q0.class.getName();

    /* renamed from: c */
    public static final AtomicBoolean f22809c = new AtomicBoolean(false);

    /* renamed from: d */
    public static final AtomicBoolean f22810d = new AtomicBoolean(false);

    /* renamed from: e */
    public static final a f22811e = new a("com.facebook.sdk.AutoInitEnabled", true);

    /* renamed from: f */
    public static final a f22812f = new a("com.facebook.sdk.AutoLogAppEventsEnabled", true);

    /* renamed from: g */
    public static final a f22813g = new a("com.facebook.sdk.AdvertiserIDCollectionEnabled", true);

    /* renamed from: h */
    public static final a f22814h = new a("auto_event_setup_enabled", false);

    /* renamed from: i */
    public static final a f22815i = new a("com.facebook.sdk.MonitorEnabled", true);

    /* renamed from: j */
    public static SharedPreferences f22816j;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public boolean f22817a;

        /* renamed from: b */
        public String f22818b;

        /* renamed from: c */
        public Boolean f22819c;

        /* renamed from: d */
        public long f22820d;

        public a(String str, boolean z10) {
            this.f22817a = z10;
            this.f22818b = str;
        }

        public final boolean a() {
            Boolean bool = this.f22819c;
            return bool == null ? this.f22817a : bool.booleanValue();
        }
    }

    public static final boolean a() {
        if (i6.a.b(q0.class)) {
            return false;
        }
        try {
            f22807a.d();
            return f22813g.a();
        } catch (Throwable th2) {
            i6.a.a(q0.class, th2);
            return false;
        }
    }

    public static final boolean b() {
        if (i6.a.b(q0.class)) {
            return false;
        }
        try {
            f22807a.d();
            return f22812f.a();
        } catch (Throwable th2) {
            i6.a.a(q0.class, th2);
            return false;
        }
    }

    public final void c() {
        if (i6.a.b(this)) {
            return;
        }
        try {
            a aVar = f22814h;
            h(aVar);
            final long currentTimeMillis = System.currentTimeMillis();
            if (aVar.f22819c != null && currentTimeMillis - aVar.f22820d < 604800000) {
                return;
            }
            aVar.f22819c = null;
            aVar.f22820d = 0L;
            if (!f22810d.compareAndSet(false, true)) {
                return;
            }
            v.c().execute(new Runnable() { // from class: o5.p0
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    long j10 = currentTimeMillis;
                    if (!i6.a.b(q0.class)) {
                        try {
                            if (q0.f22813g.a()) {
                                d6.w wVar = d6.w.f12811a;
                                d6.v f10 = d6.w.f(v.b(), false);
                                if (f10 != null && f10.f12802h) {
                                    Context a10 = v.a();
                                    d6.b bVar = d6.b.f12632f;
                                    d6.b a11 = b.a.a(a10);
                                    if (a11 != null && a11.a() != null) {
                                        str = a11.a();
                                    } else {
                                        str = null;
                                    }
                                    if (str != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("advertiser_id", str);
                                        bundle.putString("fields", "auto_event_setup_enabled");
                                        String str2 = y.f22858j;
                                        y g10 = y.c.g(null, "app", null);
                                        g10.f22864d = bundle;
                                        JSONObject jSONObject = g10.c().f22703b;
                                        if (jSONObject != null) {
                                            q0.a aVar2 = q0.f22814h;
                                            aVar2.f22819c = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                            aVar2.f22820d = j10;
                                            q0.f22807a.j(aVar2);
                                        }
                                    }
                                }
                            }
                            q0.f22810d.set(false);
                        } catch (Throwable th2) {
                            i6.a.a(q0.class, th2);
                        }
                    }
                }
            });
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    public final void d() {
        if (i6.a.b(this)) {
            return;
        }
        try {
            if (!v.h()) {
                return;
            }
            int i10 = 0;
            if (!f22809c.compareAndSet(false, true)) {
                return;
            }
            SharedPreferences sharedPreferences = v.a().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
            gm.l.e(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
            f22816j = sharedPreferences;
            a[] aVarArr = {f22812f, f22813g, f22811e};
            if (!i6.a.b(this)) {
                while (i10 < 3) {
                    a aVar = aVarArr[i10];
                    i10++;
                    if (aVar == f22814h) {
                        c();
                    } else if (aVar.f22819c == null) {
                        h(aVar);
                        if (aVar.f22819c == null) {
                            e(aVar);
                        }
                    } else {
                        j(aVar);
                    }
                }
            }
            c();
            g();
            f();
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    public final void e(a aVar) {
        Bundle bundle;
        if (i6.a.b(this)) {
            return;
        }
        try {
            i();
            try {
                Context a10 = v.a();
                ApplicationInfo applicationInfo = a10.getPackageManager().getApplicationInfo(a10.getPackageName(), 128);
                if (applicationInfo == null) {
                    bundle = null;
                } else {
                    bundle = applicationInfo.metaData;
                }
                if (bundle != null && applicationInfo.metaData.containsKey(aVar.f22818b)) {
                    aVar.f22819c = Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.f22818b, aVar.f22817a));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                d6.m0 m0Var = d6.m0.f12709a;
                v vVar = v.f22837a;
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.q0.f():void");
    }

    public final void g() {
        if (i6.a.b(this)) {
            return;
        }
        try {
            Context a10 = v.a();
            ApplicationInfo applicationInfo = a10.getPackageManager().getApplicationInfo(a10.getPackageName(), 128);
            if ((applicationInfo == null ? null : applicationInfo.metaData) != null) {
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                    Log.w(f22808b, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w(f22808b, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (a()) {
                    return;
                }
                Log.w(f22808b, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    public final void h(a aVar) {
        boolean z10;
        String str = "";
        if (i6.a.b(this)) {
            return;
        }
        try {
            i();
            try {
                SharedPreferences sharedPreferences = f22816j;
                if (sharedPreferences != null) {
                    String string = sharedPreferences.getString(aVar.f22818b, "");
                    if (string != null) {
                        str = string;
                    }
                    if (str.length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        JSONObject jSONObject = new JSONObject(str);
                        aVar.f22819c = Boolean.valueOf(jSONObject.getBoolean("value"));
                        aVar.f22820d = jSONObject.getLong("last_timestamp");
                        return;
                    }
                    return;
                }
                gm.l.l("userSettingPref");
                throw null;
            } catch (JSONException unused) {
                d6.m0 m0Var = d6.m0.f12709a;
                v vVar = v.f22837a;
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    public final void i() {
        if (i6.a.b(this)) {
            return;
        }
        try {
            if (f22809c.get()) {
                return;
            }
            throw new w("The UserSettingManager has not been initialized successfully");
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    public final void j(a aVar) {
        if (i6.a.b(this)) {
            return;
        }
        try {
            i();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", aVar.f22819c);
                jSONObject.put("last_timestamp", aVar.f22820d);
                SharedPreferences sharedPreferences = f22816j;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString(aVar.f22818b, jSONObject.toString()).apply();
                    f();
                    return;
                }
                gm.l.l("userSettingPref");
                throw null;
            } catch (Exception unused) {
                d6.m0 m0Var = d6.m0.f12709a;
                v vVar = v.f22837a;
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }
}
