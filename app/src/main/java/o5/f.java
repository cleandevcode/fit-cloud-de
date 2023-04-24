package o5;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import o5.a;
import o5.d0;
import o5.f;
import o5.y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: f */
    public static final a f22706f = new a();

    /* renamed from: g */
    public static f f22707g;

    /* renamed from: a */
    public final g2.a f22708a;

    /* renamed from: b */
    public final o5.b f22709b;

    /* renamed from: c */
    public o5.a f22710c;

    /* renamed from: d */
    public final AtomicBoolean f22711d = new AtomicBoolean(false);

    /* renamed from: e */
    public Date f22712e = new Date(0);

    /* loaded from: classes.dex */
    public static final class a {
        public final f a() {
            f fVar;
            f fVar2 = f.f22707g;
            if (fVar2 == null) {
                synchronized (this) {
                    fVar = f.f22707g;
                    if (fVar == null) {
                        g2.a a10 = g2.a.a(v.a());
                        gm.l.e(a10, "getInstance(applicationContext)");
                        f fVar3 = new f(a10, new o5.b());
                        f.f22707g = fVar3;
                        fVar = fVar3;
                    }
                }
                return fVar;
            }
            return fVar2;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements e {
        @Override // o5.f.e
        public final String a() {
            return "fb_extend_sso_token";
        }

        @Override // o5.f.e
        public final String b() {
            return "oauth/access_token";
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements e {
        @Override // o5.f.e
        public final String a() {
            return "ig_refresh_token";
        }

        @Override // o5.f.e
        public final String b() {
            return "refresh_access_token";
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public String f22713a;

        /* renamed from: b */
        public int f22714b;

        /* renamed from: c */
        public int f22715c;

        /* renamed from: d */
        public Long f22716d;

        /* renamed from: e */
        public String f22717e;
    }

    /* loaded from: classes.dex */
    public interface e {
        String a();

        String b();
    }

    public f(g2.a aVar, o5.b bVar) {
        this.f22708a = aVar;
        this.f22709b = bVar;
    }

    public final void a(a.InterfaceC0407a interfaceC0407a) {
        e bVar;
        o5.a aVar = this.f22710c;
        if (aVar == null) {
            if (interfaceC0407a != null) {
                new p("No current access token to refresh");
                interfaceC0407a.a();
            }
        } else if (!this.f22711d.compareAndSet(false, true)) {
            if (interfaceC0407a != null) {
                new p("Refresh already in progress");
                interfaceC0407a.a();
            }
        } else {
            this.f22712e = new Date();
            final HashSet hashSet = new HashSet();
            final HashSet hashSet2 = new HashSet();
            final HashSet hashSet3 = new HashSet();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            d dVar = new d();
            y[] yVarArr = new y[2];
            y.b bVar2 = new y.b() { // from class: o5.c
                @Override // o5.y.b
                public final void b(e0 e0Var) {
                    JSONArray optJSONArray;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    Set set = hashSet;
                    Set set2 = hashSet2;
                    Set set3 = hashSet3;
                    gm.l.f(atomicBoolean2, "$permissionsCallSucceeded");
                    gm.l.f(set, "$permissions");
                    gm.l.f(set2, "$declinedPermissions");
                    gm.l.f(set3, "$expiredPermissions");
                    JSONObject jSONObject = e0Var.f22705d;
                    if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
                        atomicBoolean2.set(true);
                        int i10 = 0;
                        int length = optJSONArray.length();
                        if (length <= 0) {
                            return;
                        }
                        while (true) {
                            int i11 = i10 + 1;
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                            if (optJSONObject != null) {
                                String optString = optJSONObject.optString("permission");
                                String optString2 = optJSONObject.optString("status");
                                if (!d6.m0.A(optString) && !d6.m0.A(optString2)) {
                                    gm.l.e(optString2, "status");
                                    Locale locale = Locale.US;
                                    gm.l.e(locale, "US");
                                    String lowerCase = optString2.toLowerCase(locale);
                                    gm.l.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                                    int hashCode = lowerCase.hashCode();
                                    if (hashCode != -1309235419) {
                                        if (hashCode != 280295099) {
                                            if (hashCode == 568196142 && lowerCase.equals("declined")) {
                                                set2.add(optString);
                                            }
                                            Log.w("AccessTokenManager", gm.l.k(lowerCase, "Unexpected status: "));
                                        } else {
                                            if (lowerCase.equals("granted")) {
                                                set.add(optString);
                                            }
                                            Log.w("AccessTokenManager", gm.l.k(lowerCase, "Unexpected status: "));
                                        }
                                    } else {
                                        if (lowerCase.equals("expired")) {
                                            set3.add(optString);
                                        }
                                        Log.w("AccessTokenManager", gm.l.k(lowerCase, "Unexpected status: "));
                                    }
                                }
                            }
                            if (i11 < length) {
                                i10 = i11;
                            } else {
                                return;
                            }
                        }
                    }
                }
            };
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            String str = y.f22858j;
            y g10 = y.c.g(aVar, "me/permissions", bVar2);
            g10.f22864d = bundle;
            f0 f0Var = f0.GET;
            g10.k(f0Var);
            yVarArr[0] = g10;
            o5.d dVar2 = new o5.d(0, dVar);
            String str2 = aVar.f22677k;
            if (str2 == null) {
                str2 = "facebook";
            }
            if (gm.l.a(str2, "instagram")) {
                bVar = new c();
            } else {
                bVar = new b();
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("grant_type", bVar.a());
            bundle2.putString("client_id", aVar.f22674h);
            bundle2.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            y g11 = y.c.g(aVar, bVar.b(), dVar2);
            g11.f22864d = bundle2;
            g11.k(f0Var);
            yVarArr[1] = g11;
            d0 d0Var = new d0(yVarArr);
            d0.a aVar2 = new d0.a(aVar, interfaceC0407a, atomicBoolean, hashSet, hashSet2, hashSet3, this) { // from class: o5.e

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ a f22695b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ AtomicBoolean f22696c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ Set f22697d;

                /* renamed from: e  reason: collision with root package name */
                public final /* synthetic */ Set f22698e;

                /* renamed from: f  reason: collision with root package name */
                public final /* synthetic */ Set f22699f;

                /* renamed from: g  reason: collision with root package name */
                public final /* synthetic */ f f22700g;

                {
                    this.f22696c = atomicBoolean;
                    this.f22697d = hashSet;
                    this.f22698e = hashSet2;
                    this.f22699f = hashSet3;
                    this.f22700g = this;
                }

                @Override // o5.d0.a
                public final void a(d0 d0Var2) {
                    String str3;
                    Date date;
                    f.d dVar3 = f.d.this;
                    a aVar3 = this.f22695b;
                    AtomicBoolean atomicBoolean2 = this.f22696c;
                    Set<String> set = this.f22697d;
                    Set<String> set2 = this.f22698e;
                    Set<String> set3 = this.f22699f;
                    f fVar = this.f22700g;
                    gm.l.f(dVar3, "$refreshResult");
                    gm.l.f(atomicBoolean2, "$permissionsCallSucceeded");
                    gm.l.f(set, "$permissions");
                    gm.l.f(set2, "$declinedPermissions");
                    gm.l.f(set3, "$expiredPermissions");
                    gm.l.f(fVar, "this$0");
                    String str4 = dVar3.f22713a;
                    int i10 = dVar3.f22714b;
                    Long l10 = dVar3.f22716d;
                    String str5 = dVar3.f22717e;
                    try {
                        f.a aVar4 = f.f22706f;
                        if (aVar4.a().f22710c != null) {
                            a aVar5 = aVar4.a().f22710c;
                            if (aVar5 == null) {
                                str3 = null;
                            } else {
                                str3 = aVar5.f22675i;
                            }
                            if (str3 == aVar3.f22675i) {
                                if (atomicBoolean2.get() || str4 != null || i10 != 0) {
                                    Date date2 = aVar3.f22667a;
                                    if (dVar3.f22714b != 0) {
                                        date2 = new Date(dVar3.f22714b * 1000);
                                    } else if (dVar3.f22715c != 0) {
                                        date2 = new Date((dVar3.f22715c * 1000) + new Date().getTime());
                                    }
                                    Date date3 = date2;
                                    if (str4 == null) {
                                        str4 = aVar3.f22671e;
                                    }
                                    String str6 = str4;
                                    String str7 = aVar3.f22674h;
                                    String str8 = aVar3.f22675i;
                                    if (!atomicBoolean2.get()) {
                                        set = aVar3.f22668b;
                                    }
                                    Set<String> set4 = set;
                                    if (!atomicBoolean2.get()) {
                                        set2 = aVar3.f22669c;
                                    }
                                    Set<String> set5 = set2;
                                    if (!atomicBoolean2.get()) {
                                        set3 = aVar3.f22670d;
                                    }
                                    Set<String> set6 = set3;
                                    g gVar = aVar3.f22672f;
                                    Date date4 = new Date();
                                    if (l10 != null) {
                                        date = new Date(l10.longValue() * 1000);
                                    } else {
                                        date = aVar3.f22676j;
                                    }
                                    Date date5 = date;
                                    if (str5 == null) {
                                        str5 = aVar3.f22677k;
                                    }
                                    aVar4.a().c(new a(str6, str7, str8, set4, set5, set6, gVar, date3, date4, date5, str5), true);
                                }
                            }
                        }
                    } finally {
                        fVar.f22711d.set(false);
                    }
                }
            };
            if (!d0Var.f22693d.contains(aVar2)) {
                d0Var.f22693d.add(aVar2);
            }
            d6.n0.e(d0Var);
            new c0(d0Var).executeOnExecutor(v.c(), new Void[0]);
        }
    }

    public final void b(o5.a aVar, o5.a aVar2) {
        Intent intent = new Intent(v.a(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", aVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", aVar2);
        this.f22708a.c(intent);
    }

    public final void c(o5.a aVar, boolean z10) {
        Date date;
        PendingIntent broadcast;
        o5.a aVar2 = this.f22710c;
        this.f22710c = aVar;
        this.f22711d.set(false);
        this.f22712e = new Date(0L);
        if (z10) {
            o5.b bVar = this.f22709b;
            if (aVar != null) {
                bVar.getClass();
                try {
                    bVar.f22678a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", aVar.a().toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                bVar.f22678a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                v vVar = v.f22837a;
                d6.m0 m0Var = d6.m0.f12709a;
                d6.m0.d(v.a());
            }
        }
        if (!d6.m0.a(aVar2, aVar)) {
            b(aVar2, aVar);
            Context a10 = v.a();
            Date date2 = o5.a.f22664l;
            o5.a b10 = a.c.b();
            AlarmManager alarmManager = (AlarmManager) a10.getSystemService("alarm");
            if (a.c.c()) {
                if (b10 == null) {
                    date = null;
                } else {
                    date = b10.f22667a;
                }
                if (date != null && alarmManager != null) {
                    Intent intent = new Intent(a10, CurrentAccessTokenExpirationBroadcastReceiver.class);
                    intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                    if (Build.VERSION.SDK_INT >= 23) {
                        broadcast = PendingIntent.getBroadcast(a10, 0, intent, 67108864);
                    } else {
                        broadcast = PendingIntent.getBroadcast(a10, 0, intent, 0);
                    }
                    try {
                        alarmManager.set(1, b10.f22667a.getTime(), broadcast);
                    } catch (Exception unused2) {
                    }
                }
            }
        }
    }
}
