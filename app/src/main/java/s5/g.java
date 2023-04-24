package s5;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import cn.sharesdk.framework.InnerShareParams;
import d6.c0;
import gm.l;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import o5.e0;
import o5.g0;
import o5.v;
import o5.y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s.q;
import s.s;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e */
    public static final String f26608e;

    /* renamed from: a */
    public final Handler f26609a;

    /* renamed from: b */
    public final WeakReference<Activity> f26610b;

    /* renamed from: c */
    public Timer f26611c;

    /* renamed from: d */
    public String f26612d;

    /* loaded from: classes.dex */
    public static final class a {
        public static y a(String str, o5.a aVar, String str2) {
            String str3;
            String str4 = y.f22858j;
            String format = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            l.e(format, "java.lang.String.format(locale, format, *args)");
            y h10 = y.c.h(aVar, format, null, null);
            Bundle bundle = h10.f22864d;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("tree", str);
            int i10 = x5.e.f30297a;
            Context a10 = v.a();
            try {
                str3 = a10.getPackageManager().getPackageInfo(a10.getPackageName(), 0).versionName;
                l.e(str3, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
            } catch (PackageManager.NameNotFoundException unused) {
                str3 = "";
            }
            bundle.putString("app_version", str3);
            bundle.putString("platform", "android");
            bundle.putString("request_type", "app_indexing");
            if (l.a("app_indexing", "app_indexing")) {
                bundle.putString("device_session_id", s5.c.a());
            }
            h10.f22864d = bundle;
            h10.j(new y.b() { // from class: s5.f
                @Override // o5.y.b
                public final void b(e0 e0Var) {
                    c0.a aVar2 = c0.f12645d;
                    c0.a.a(g0.APP_EVENTS, g.a(), "App index sent to FB!");
                }
            });
            return h10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Callable<String> {

        /* renamed from: a */
        public final WeakReference<View> f26613a;

        public b(View view) {
            this.f26613a = new WeakReference<>(view);
        }

        @Override // java.util.concurrent.Callable
        public final String call() {
            View view = this.f26613a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            l.e(encodeToString, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
            return encodeToString;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends TimerTask {
        public c() {
            g.this = r1;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            WeakReference<Activity> weakReference;
            try {
                g gVar = g.this;
                Handler handler = null;
                if (!i6.a.b(g.class)) {
                    weakReference = gVar.f26610b;
                } else {
                    weakReference = null;
                }
                Activity activity = weakReference.get();
                View b10 = x5.e.b(activity);
                if (activity != null && b10 != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    s5.c cVar = s5.c.f26581a;
                    boolean z10 = false;
                    if (!i6.a.b(s5.c.class)) {
                        z10 = s5.c.f26587g.get();
                    }
                    if (!z10) {
                        return;
                    }
                    String str = "";
                    if (l.a(null, Boolean.TRUE)) {
                        t5.e.a("CaptureViewHierarchy", "");
                        return;
                    }
                    FutureTask futureTask = new FutureTask(new b(b10));
                    g gVar2 = g.this;
                    if (!i6.a.b(g.class)) {
                        handler = gVar2.f26609a;
                    }
                    handler.post(futureTask);
                    try {
                        str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                    } catch (Exception e10) {
                        Log.e(g.a(), "Failed to take screenshot.", e10);
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("screenname", simpleName);
                        jSONObject.put("screenshot", str);
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(t5.f.c(b10));
                        jSONObject.put("view", jSONArray);
                    } catch (JSONException unused) {
                        Log.e(g.a(), "Failed to create JSONObject");
                    }
                    String jSONObject2 = jSONObject.toString();
                    l.e(jSONObject2, "viewTree.toString()");
                    g gVar3 = g.this;
                    if (!i6.a.b(g.class)) {
                        gVar3.getClass();
                        if (!i6.a.b(gVar3)) {
                            v.c().execute(new s(jSONObject2, gVar3, 12));
                        }
                    }
                }
            } catch (Exception e11) {
                Log.e(g.a(), "UI Component tree indexing failure!", e11);
            }
        }
    }

    static {
        String canonicalName = g.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f26608e = canonicalName;
    }

    public g(Activity activity) {
        l.f(activity, InnerShareParams.ACTIVITY);
        this.f26610b = new WeakReference<>(activity);
        this.f26612d = null;
        this.f26609a = new Handler(Looper.getMainLooper());
    }

    public static final /* synthetic */ String a() {
        if (i6.a.b(g.class)) {
            return null;
        }
        try {
            return f26608e;
        } catch (Throwable th2) {
            i6.a.a(g.class, th2);
            return null;
        }
    }

    public final void b(y yVar, String str) {
        if (i6.a.b(this) || yVar == null) {
            return;
        }
        try {
            e0 c10 = yVar.c();
            try {
                JSONObject jSONObject = c10.f22703b;
                if (jSONObject != null) {
                    if (l.a("true", jSONObject.optString("success"))) {
                        c0.a aVar = c0.f12645d;
                        c0.a.a(g0.APP_EVENTS, f26608e, "Successfully send UI component tree to server");
                        this.f26612d = str;
                    }
                    if (jSONObject.has("is_app_indexing_enabled")) {
                        boolean z10 = jSONObject.getBoolean("is_app_indexing_enabled");
                        s5.c cVar = s5.c.f26581a;
                        if (!i6.a.b(s5.c.class)) {
                            try {
                                s5.c.f26587g.set(z10);
                                return;
                            } catch (Throwable th2) {
                                i6.a.a(s5.c.class, th2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                Log.e(f26608e, l.k(c10.f22704c, "Error sending UI component tree to Facebook: "));
            } catch (JSONException e10) {
                Log.e(f26608e, "Error decoding server response.", e10);
            }
        } catch (Throwable th3) {
            i6.a.a(this, th3);
        }
    }

    public final void c() {
        if (i6.a.b(this)) {
            return;
        }
        try {
            try {
                v.c().execute(new q(this, new c(), 13));
            } catch (RejectedExecutionException e10) {
                Log.e(f26608e, "Error scheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }
}
