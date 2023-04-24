package z5;

import android.os.Bundle;
import d6.m0;
import d6.v;
import d6.w;
import gm.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import p5.d;
import ul.q;
import z5.c;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public static final b f31962a = new b();

    public static final Bundle a(c.a aVar, String str, List<d> list) {
        if (i6.a.b(b.class)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("event", aVar.f31968a);
            bundle.putString("app_id", str);
            if (c.a.CUSTOM_APP_EVENTS == aVar) {
                JSONArray b10 = f31962a.b(str, list);
                if (b10.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", b10.toString());
            }
            return bundle;
        } catch (Throwable th2) {
            i6.a.a(b.class, th2);
            return null;
        }
    }

    public final JSONArray b(String str, List list) {
        boolean a10;
        v f10;
        if (i6.a.b(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList Z = q.Z(list);
            u5.a.b(Z);
            boolean z10 = false;
            if (!i6.a.b(this) && (f10 = w.f(str, false)) != null) {
                z10 = f10.f12795a;
            }
            Iterator it = Z.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f23900e == null) {
                    a10 = true;
                } else {
                    String jSONObject = dVar.f23896a.toString();
                    l.e(jSONObject, "jsonObject.toString()");
                    a10 = l.a(d.a.a(jSONObject), dVar.f23900e);
                }
                if (a10) {
                    boolean z11 = dVar.f23897b;
                    if ((!z11) || (z11 && z10)) {
                        jSONArray.put(dVar.f23896a);
                    }
                } else {
                    m0 m0Var = m0.f12709a;
                    l.k(dVar, "Event with invalid checksum: ");
                    o5.v vVar = o5.v.f22837a;
                }
            }
            return jSONArray;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }
}
