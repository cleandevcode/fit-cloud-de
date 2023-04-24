package r5;

import a0.a2;
import bi.z0;
import cn.sharesdk.framework.InnerShareParams;
import d6.c0;
import gm.l;
import i2.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import o5.g0;
import o5.v;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public static final HashSet<Integer> f25262a = z0.e(200, 202);

    /* renamed from: b */
    public static final HashSet<Integer> f25263b = z0.e(503, 504, 429);

    /* renamed from: c */
    public static a f25264c;

    /* renamed from: d */
    public static List<Map<String, Object>> f25265d;

    /* renamed from: e */
    public static int f25266e;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final String f25267a;

        /* renamed from: b */
        public final String f25268b;

        /* renamed from: c */
        public final String f25269c;

        public a(String str, String str2, String str3) {
            l.f(str2, "cloudBridgeURL");
            this.f25267a = str;
            this.f25268b = str2;
            this.f25269c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return l.a(this.f25267a, aVar.f25267a) && l.a(this.f25268b, aVar.f25268b) && l.a(this.f25269c, aVar.f25269c);
            }
            return false;
        }

        public final int hashCode() {
            return this.f25269c.hashCode() + t.a(this.f25268b, this.f25267a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("CloudBridgeCredentials(datasetID=");
            a10.append(this.f25267a);
            a10.append(", cloudBridgeURL=");
            a10.append(this.f25268b);
            a10.append(", accessKey=");
            return a2.a(a10, this.f25269c, ')');
        }
    }

    public static final void a(String str, String str2, String str3) {
        l.f(str2, InnerShareParams.URL);
        c0.a aVar = c0.f12645d;
        v.i(g0.APP_EVENTS);
        f25264c = new a(str, str2, str3);
        f25265d = new ArrayList();
    }

    public static List b() {
        List<Map<String, Object>> list = f25265d;
        if (list != null) {
            return list;
        }
        l.l("transformedEvents");
        throw null;
    }
}
