package w1;

import cn.sharesdk.framework.Platform;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import w1.w;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b */
    public static volatile o f29655b;

    /* renamed from: c */
    public static final o f29656c;

    /* renamed from: a */
    public final Map<a, w.e<?, ?>> f29657a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final Object f29658a;

        /* renamed from: b */
        public final int f29659b;

        public a(int i10, Object obj) {
            this.f29658a = obj;
            this.f29659b = i10;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f29658a == aVar.f29658a && this.f29659b == aVar.f29659b;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f29658a) * Platform.CUSTOMER_ACTION_MASK) + this.f29659b;
        }
    }

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        f29656c = new o(0);
    }

    public o() {
        this.f29657a = new HashMap();
    }

    public o(int i10) {
        this.f29657a = Collections.emptyMap();
    }

    public static o a() {
        o oVar = f29655b;
        if (oVar == null) {
            synchronized (o.class) {
                oVar = f29655b;
                if (oVar == null) {
                    Class<?> cls = n.f29645a;
                    if (cls != null) {
                        try {
                            oVar = (o) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                        f29655b = oVar;
                    }
                    oVar = f29656c;
                    f29655b = oVar;
                }
            }
        }
        return oVar;
    }
}
