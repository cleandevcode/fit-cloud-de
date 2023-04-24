package p5;

import android.content.Context;
import android.os.Bundle;
import d6.m0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o5.v;
import o5.y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p5.d;
import x5.f;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a */
    public final d6.b f23942a;

    /* renamed from: b */
    public final String f23943b;

    /* renamed from: c */
    public ArrayList f23944c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f23945d = new ArrayList();

    /* renamed from: e */
    public int f23946e;

    public t(d6.b bVar, String str) {
        this.f23942a = bVar;
        this.f23943b = str;
    }

    public final synchronized void a(d dVar) {
        if (i6.a.b(this)) {
            return;
        }
        gm.l.f(dVar, "event");
        if (this.f23944c.size() + this.f23945d.size() >= 1000) {
            this.f23946e++;
        } else {
            this.f23944c.add(dVar);
        }
    }

    public final synchronized void b(boolean z10) {
        if (i6.a.b(this)) {
            return;
        }
        if (z10) {
            this.f23944c.addAll(this.f23945d);
        }
        this.f23945d.clear();
        this.f23946e = 0;
    }

    public final synchronized List<d> c() {
        if (i6.a.b(this)) {
            return null;
        }
        ArrayList arrayList = this.f23944c;
        this.f23944c = new ArrayList();
        return arrayList;
    }

    public final int d(y yVar, Context context, boolean z10, boolean z11) {
        boolean a10;
        if (i6.a.b(this)) {
            return 0;
        }
        try {
            synchronized (this) {
                int i10 = this.f23946e;
                u5.a aVar = u5.a.f28515a;
                u5.a.b(this.f23944c);
                this.f23945d.addAll(this.f23944c);
                this.f23944c.clear();
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f23945d.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar.f23900e == null) {
                        a10 = true;
                    } else {
                        String jSONObject = dVar.f23896a.toString();
                        gm.l.e(jSONObject, "jsonObject.toString()");
                        a10 = gm.l.a(d.a.a(jSONObject), dVar.f23900e);
                    }
                    if (a10) {
                        if (z10 || !dVar.f23897b) {
                            jSONArray.put(dVar.f23896a);
                        }
                    } else {
                        m0 m0Var = m0.f12709a;
                        gm.l.k(dVar, "Event with invalid checksum: ");
                        v vVar = v.f22837a;
                    }
                }
                if (jSONArray.length() == 0) {
                    return 0;
                }
                tl.l lVar = tl.l.f28297a;
                e(yVar, context, i10, jSONArray, z11);
                return jSONArray.length();
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return 0;
        }
    }

    public final void e(y yVar, Context context, int i10, JSONArray jSONArray, boolean z10) {
        JSONObject jSONObject;
        try {
            if (i6.a.b(this)) {
                return;
            }
            try {
                HashMap hashMap = x5.f.f30298a;
                jSONObject = x5.f.a(f.a.CUSTOM_APP_EVENTS, this.f23942a, this.f23943b, z10, context);
                if (this.f23946e > 0) {
                    jSONObject.put("num_skipped_events", i10);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            yVar.f22863c = jSONObject;
            Bundle bundle = yVar.f22864d;
            String jSONArray2 = jSONArray.toString();
            gm.l.e(jSONArray2, "events.toString()");
            bundle.putString("custom_events", jSONArray2);
            yVar.f22865e = jSONArray2;
            yVar.f22864d = bundle;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }
}
