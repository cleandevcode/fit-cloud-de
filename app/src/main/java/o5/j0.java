package o5;

import android.content.Intent;
import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: d */
    public static final a f22774d = new a();

    /* renamed from: e */
    public static volatile j0 f22775e;

    /* renamed from: a */
    public final g2.a f22776a;

    /* renamed from: b */
    public final i0 f22777b;

    /* renamed from: c */
    public h0 f22778c;

    /* loaded from: classes.dex */
    public static final class a {
        public final synchronized j0 a() {
            j0 j0Var;
            try {
                if (j0.f22775e == null) {
                    g2.a a10 = g2.a.a(v.a());
                    gm.l.e(a10, "getInstance(applicationContext)");
                    j0.f22775e = new j0(a10, new i0());
                }
                j0Var = j0.f22775e;
                if (j0Var == null) {
                    gm.l.l("instance");
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return j0Var;
        }
    }

    public j0(g2.a aVar, i0 i0Var) {
        this.f22776a = aVar;
        this.f22777b = i0Var;
    }

    public final void a(h0 h0Var, boolean z10) {
        h0 h0Var2 = this.f22778c;
        this.f22778c = h0Var;
        if (z10) {
            i0 i0Var = this.f22777b;
            if (h0Var != null) {
                i0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", h0Var.f22745a);
                    jSONObject.put("first_name", h0Var.f22746b);
                    jSONObject.put("middle_name", h0Var.f22747c);
                    jSONObject.put("last_name", h0Var.f22748d);
                    jSONObject.put("name", h0Var.f22749e);
                    Uri uri = h0Var.f22750f;
                    if (uri != null) {
                        jSONObject.put("link_uri", uri.toString());
                    }
                    Uri uri2 = h0Var.f22751g;
                    if (uri2 != null) {
                        jSONObject.put("picture_uri", uri2.toString());
                    }
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    i0Var.f22753a.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject.toString()).apply();
                }
            } else {
                i0Var.f22753a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (!d6.m0.a(h0Var2, h0Var)) {
            Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
            intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", h0Var2);
            intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", h0Var);
            this.f22776a.c(intent);
        }
    }
}
