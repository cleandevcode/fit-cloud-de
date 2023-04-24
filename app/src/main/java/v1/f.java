package v1;

import gm.l;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import qa.p;
import s.c0;
import s1.m;
import s1.q;
import u1.d;
import u1.e;
import u1.f;
import ul.q;
import ul.z;
import v1.d;
import w1.k;
import w1.y;

/* loaded from: classes.dex */
public final class f implements m<d> {

    /* renamed from: a */
    public static final f f28990a = new f();

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28991a;

        static {
            int[] iArr = new int[ij.b._values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[6] = 3;
            iArr[2] = 4;
            iArr[3] = 5;
            iArr[4] = 6;
            iArr[5] = 7;
            iArr[7] = 8;
            f28991a = iArr;
        }
    }

    @Override // s1.m
    public final v1.a a() {
        return new v1.a(true, 1);
    }

    @Override // s1.m
    public final v1.a b(FileInputStream fileInputStream) {
        int i10;
        d.a<?> aVar;
        Object valueOf;
        d.a<?> k10;
        Object valueOf2;
        try {
            u1.d t10 = u1.d.t(fileInputStream);
            v1.a aVar2 = new v1.a(false, 1);
            d.b[] bVarArr = (d.b[]) Arrays.copyOf(new d.b[0], 0);
            l.f(bVarArr, "pairs");
            aVar2.c();
            if (bVarArr.length <= 0) {
                Map<String, u1.f> r10 = t10.r();
                l.e(r10, "preferencesProto.preferencesMap");
                for (Map.Entry<String, u1.f> entry : r10.entrySet()) {
                    String key = entry.getKey();
                    u1.f value = entry.getValue();
                    l.e(key, "name");
                    l.e(value, "value");
                    int F = value.F();
                    if (F == 0) {
                        i10 = -1;
                    } else {
                        i10 = a.f28991a[c0.b(F)];
                    }
                    switch (i10) {
                        case -1:
                            throw new s1.a("Value case is null.");
                        case 0:
                        default:
                            throw new p();
                        case 1:
                            aVar = new d.a<>(key);
                            valueOf = Boolean.valueOf(value.x());
                            aVar2.e(aVar, valueOf);
                        case 2:
                            aVar = new d.a<>(key);
                            valueOf = Float.valueOf(value.A());
                            aVar2.e(aVar, valueOf);
                        case 3:
                            aVar = new d.a<>(key);
                            valueOf = Double.valueOf(value.z());
                            aVar2.e(aVar, valueOf);
                        case 4:
                            k10 = rm.l.k(key);
                            valueOf2 = Integer.valueOf(value.B());
                            aVar2.e(k10, valueOf2);
                        case 5:
                            aVar = new d.a<>(key);
                            valueOf = Long.valueOf(value.C());
                            aVar2.e(aVar, valueOf);
                        case 6:
                            k10 = rm.l.w(key);
                            valueOf2 = value.D();
                            l.e(valueOf2, "value.string");
                            aVar2.e(k10, valueOf2);
                        case 7:
                            aVar = new d.a<>(key);
                            y.c s10 = value.E().s();
                            l.e(s10, "value.stringSet.stringsList");
                            valueOf = q.b0(s10);
                            aVar2.e(aVar, valueOf);
                        case 8:
                            throw new s1.a("Value not set.");
                    }
                }
                return new v1.a((Map<d.a<?>, Object>) z.H(aVar2.a()), true);
            }
            bVarArr[0].getClass();
            aVar2.e(null, null);
            throw null;
        } catch (w1.z e10) {
            throw new s1.a(e10);
        }
    }

    @Override // s1.m
    public final tl.l c(Object obj, q.b bVar) {
        f.a G;
        Map<d.a<?>, Object> a10 = ((d) obj).a();
        d.a s10 = u1.d.s();
        for (Map.Entry<d.a<?>, Object> entry : a10.entrySet()) {
            Object value = entry.getValue();
            String str = entry.getKey().f28986a;
            if (value instanceof Boolean) {
                G = u1.f.G();
                boolean booleanValue = ((Boolean) value).booleanValue();
                G.l();
                u1.f.u((u1.f) G.f29716b, booleanValue);
            } else if (value instanceof Float) {
                G = u1.f.G();
                float floatValue = ((Number) value).floatValue();
                G.l();
                u1.f.v((u1.f) G.f29716b, floatValue);
            } else if (value instanceof Double) {
                G = u1.f.G();
                double doubleValue = ((Number) value).doubleValue();
                G.l();
                u1.f.s((u1.f) G.f29716b, doubleValue);
            } else if (value instanceof Integer) {
                G = u1.f.G();
                int intValue = ((Number) value).intValue();
                G.l();
                u1.f.w((u1.f) G.f29716b, intValue);
            } else if (value instanceof Long) {
                G = u1.f.G();
                long longValue = ((Number) value).longValue();
                G.l();
                u1.f.p((u1.f) G.f29716b, longValue);
            } else if (value instanceof String) {
                G = u1.f.G();
                G.l();
                u1.f.q((u1.f) G.f29716b, (String) value);
            } else if (value instanceof Set) {
                G = u1.f.G();
                e.a t10 = u1.e.t();
                t10.l();
                u1.e.q((u1.e) t10.f29716b, (Set) value);
                G.l();
                u1.f.r((u1.f) G.f29716b, t10);
            } else {
                throw new IllegalStateException(l.k(value.getClass().getName(), "PreferencesSerializer does not support type: "));
            }
            s10.getClass();
            str.getClass();
            s10.l();
            u1.d.q((u1.d) s10.f29716b).put(str, G.h());
        }
        u1.d h10 = s10.h();
        int e10 = h10.e();
        Logger logger = k.f29621b;
        if (e10 > 4096) {
            e10 = 4096;
        }
        k.d dVar = new k.d(bVar, e10);
        h10.d(dVar);
        if (dVar.f29626f > 0) {
            dVar.K0();
        }
        return tl.l.f28297a;
    }
}
