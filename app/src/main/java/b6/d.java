package b6;

import android.app.Activity;
import b6.e;
import cn.sharesdk.framework.InnerShareParams;
import d6.v;
import d6.w;
import gm.l;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final d f4011a = new d();

    /* renamed from: b */
    public static final AtomicBoolean f4012b = new AtomicBoolean(false);

    /* renamed from: c */
    public static final LinkedHashSet f4013c = new LinkedHashSet();

    /* renamed from: d */
    public static final LinkedHashSet f4014d = new LinkedHashSet();

    public static final void c(Activity activity) {
        if (i6.a.b(d.class)) {
            return;
        }
        try {
            l.f(activity, InnerShareParams.ACTIVITY);
            try {
                if (f4012b.get()) {
                    a aVar = a.f3999a;
                    boolean z10 = false;
                    if (!i6.a.b(a.class)) {
                        try {
                            z10 = a.f4004f;
                        } catch (Throwable th2) {
                            i6.a.a(a.class, th2);
                        }
                    }
                    if (z10 && (!f4013c.isEmpty() || !f4014d.isEmpty())) {
                        HashMap hashMap = e.f4015d;
                        e.a.a(activity);
                        return;
                    }
                }
                HashMap hashMap2 = e.f4015d;
                e.a.b(activity);
            } catch (Exception unused) {
            }
        } catch (Throwable th3) {
            i6.a.a(d.class, th3);
        }
    }

    public final void a() {
        String str;
        File d10;
        if (i6.a.b(this)) {
            return;
        }
        try {
            w wVar = w.f12811a;
            v f10 = w.f(o5.v.b(), false);
            if (f10 == null || (str = f10.f12806l) == null) {
                return;
            }
            b(str);
            if ((!(!f4013c.isEmpty()) && !(!f4014d.isEmpty())) || (d10 = y5.d.d()) == null) {
                return;
            }
            a.d(d10);
            WeakReference<Activity> weakReference = x5.d.f30296l;
            Activity activity = null;
            if (weakReference != null) {
                activity = weakReference.get();
            }
            if (activity != null) {
                c(activity);
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    public final void b(String str) {
        JSONArray jSONArray;
        int length;
        JSONArray jSONArray2;
        int length2;
        if (i6.a.b(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i10 = 0;
            if (jSONObject.has("production_events") && (length2 = (jSONArray2 = jSONObject.getJSONArray("production_events")).length()) > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    LinkedHashSet linkedHashSet = f4013c;
                    String string = jSONArray2.getString(i11);
                    l.e(string, "jsonArray.getString(i)");
                    linkedHashSet.add(string);
                    if (i12 >= length2) {
                        break;
                    }
                    i11 = i12;
                }
            }
            if (!jSONObject.has("eligible_for_prediction_events") || (length = (jSONArray = jSONObject.getJSONArray("eligible_for_prediction_events")).length()) <= 0) {
                return;
            }
            while (true) {
                int i13 = i10 + 1;
                LinkedHashSet linkedHashSet2 = f4014d;
                String string2 = jSONArray.getString(i10);
                l.e(string2, "jsonArray.getString(i)");
                linkedHashSet2.add(string2);
                if (i13 >= length) {
                    return;
                }
                i10 = i13;
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }
}
