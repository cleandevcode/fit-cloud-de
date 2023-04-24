package yb;

import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class x implements d0 {

    /* renamed from: a */
    public String f31414a;

    /* renamed from: b */
    public String f31415b;

    /* renamed from: c */
    public String f31416c;

    /* renamed from: d */
    public List<h0> f31417d;

    public x(String str, String str2, String str3, List list) {
        this.f31414a = str;
        this.f31415b = str2;
        this.f31416c = str3;
        this.f31417d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<h0> list = this.f31417d;
        if (list != null && list.size() != 0) {
            r.a().f31380a.getClass();
            if (g0.a(y.s(), 10485760, "cached_v2_1")) {
                StringBuilder a10 = android.support.v4.media.d.a("The cacheFile is full,Can not writing data! reqID:");
                a10.append(this.f31415b);
                m2.f.e("hmsSdk", a10.toString());
                return;
            }
            String e10 = y.e(this.f31414a, this.f31416c);
            String b10 = l.b(y.s(), "cached_v2_1", e10);
            HashMap hashMap = new HashMap();
            l0.b(e10, b10, hashMap);
            List list2 = (List) hashMap.get(e10);
            if (list2 != null && list2.size() != 0) {
                this.f31417d.addAll(list2);
            }
            JSONArray jSONArray = new JSONArray();
            for (h0 h0Var : this.f31417d) {
                try {
                    jSONArray.put(h0Var.c());
                } catch (JSONException unused) {
                    m2.f.e("hmsSdk", "event to json error");
                }
            }
            String jSONArray2 = jSONArray.toString();
            r.a().f31380a.getClass();
            if (jSONArray2.length() > 5242880) {
                m2.f.e("hmsSdk", "this failed data is too long,can not writing it");
                this.f31417d = null;
                return;
            }
            StringBuilder a11 = android.support.v4.media.d.a("data send failed, write to cache file...reqID:");
            a11.append(this.f31415b);
            m2.f.d(a11.toString());
            l.e(y.s(), "cached_v2_1", e10, jSONArray2);
            l.c(y.s(), "backup_event", y.f(this.f31414a, this.f31416c, this.f31415b));
            return;
        }
        m2.f.d("failed events is empty");
    }
}
