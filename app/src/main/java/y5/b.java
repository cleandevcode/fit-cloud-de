package y5;

import bi.z0;
import gm.l;
import java.util.HashMap;
import ul.z;
import y5.d;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: m */
    public static final HashMap f31134m = z.C(new tl.f("embedding.weight", "embed.weight"), new tl.f("dense1.weight", "fc1.weight"), new tl.f("dense2.weight", "fc2.weight"), new tl.f("dense3.weight", "fc3.weight"), new tl.f("dense1.bias", "fc1.bias"), new tl.f("dense2.bias", "fc2.bias"), new tl.f("dense3.bias", "fc3.bias"));

    /* renamed from: a */
    public final a f31135a;

    /* renamed from: b */
    public final a f31136b;

    /* renamed from: c */
    public final a f31137c;

    /* renamed from: d */
    public final a f31138d;

    /* renamed from: e */
    public final a f31139e;

    /* renamed from: f */
    public final a f31140f;

    /* renamed from: g */
    public final a f31141g;

    /* renamed from: h */
    public final a f31142h;

    /* renamed from: i */
    public final a f31143i;

    /* renamed from: j */
    public final a f31144j;

    /* renamed from: k */
    public final a f31145k;

    /* renamed from: l */
    public final HashMap f31146l;

    public b() {
        throw null;
    }

    public b(HashMap hashMap) {
        Object obj = hashMap.get("embed.weight");
        if (obj == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f31135a = (a) obj;
        int i10 = e.f31162a;
        Object obj2 = hashMap.get("convs.0.weight");
        if (obj2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f31136b = e.l((a) obj2);
        Object obj3 = hashMap.get("convs.1.weight");
        if (obj3 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f31137c = e.l((a) obj3);
        Object obj4 = hashMap.get("convs.2.weight");
        if (obj4 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f31138d = e.l((a) obj4);
        Object obj5 = hashMap.get("convs.0.bias");
        if (obj5 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f31139e = (a) obj5;
        Object obj6 = hashMap.get("convs.1.bias");
        if (obj6 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f31140f = (a) obj6;
        Object obj7 = hashMap.get("convs.2.bias");
        if (obj7 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f31141g = (a) obj7;
        Object obj8 = hashMap.get("fc1.weight");
        if (obj8 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f31142h = e.k((a) obj8);
        Object obj9 = hashMap.get("fc2.weight");
        if (obj9 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f31143i = e.k((a) obj9);
        Object obj10 = hashMap.get("fc1.bias");
        if (obj10 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f31144j = (a) obj10;
        Object obj11 = hashMap.get("fc2.bias");
        if (obj11 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f31145k = (a) obj11;
        this.f31146l = new HashMap();
        for (String str : z0.p(d.a.MTML_INTEGRITY_DETECT.a(), d.a.MTML_APP_EVENT_PREDICTION.a())) {
            String k10 = l.k(".weight", str);
            String k11 = l.k(".bias", str);
            a aVar = (a) hashMap.get(k10);
            a aVar2 = (a) hashMap.get(k11);
            if (aVar != null) {
                this.f31146l.put(k10, e.k(aVar));
            }
            if (aVar2 != null) {
                this.f31146l.put(k11, aVar2);
            }
        }
    }

    public final a a(a aVar, String[] strArr, String str) {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            int i10 = e.f31162a;
            a c10 = e.c(e.e(strArr, this.f31135a), this.f31136b);
            e.a(c10, this.f31139e);
            e.i(c10);
            a c11 = e.c(c10, this.f31137c);
            e.a(c11, this.f31140f);
            e.i(c11);
            a g10 = e.g(c11, 2);
            a c12 = e.c(g10, this.f31138d);
            e.a(c12, this.f31141g);
            e.i(c12);
            a g11 = e.g(c10, c10.f31131a[1]);
            a g12 = e.g(g10, g10.f31131a[1]);
            a g13 = e.g(c12, c12.f31131a[1]);
            e.f(g11);
            e.f(g12);
            e.f(g13);
            a d10 = e.d(e.b(new a[]{g11, g12, g13, aVar}), this.f31142h, this.f31144j);
            e.i(d10);
            a d11 = e.d(d10, this.f31143i, this.f31145k);
            e.i(d11);
            a aVar2 = (a) this.f31146l.get(l.k(".weight", str));
            a aVar3 = (a) this.f31146l.get(l.k(".bias", str));
            if (aVar2 != null && aVar3 != null) {
                a d12 = e.d(d11, aVar2, aVar3);
                e.j(d12);
                return d12;
            }
            return null;
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }
}
