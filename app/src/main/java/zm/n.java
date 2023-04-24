package zm;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import zm.s;

/* loaded from: classes2.dex */
public final class n extends z {

    /* renamed from: d */
    public static final s f32639d;

    /* renamed from: b */
    public final List<String> f32640b;

    /* renamed from: c */
    public final List<String> f32641c;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: c */
        public final Charset f32644c = null;

        /* renamed from: a */
        public final ArrayList f32642a = new ArrayList();

        /* renamed from: b */
        public final ArrayList f32643b = new ArrayList();
    }

    static {
        s.f32677f.getClass();
        f32639d = s.a.a("application/x-www-form-urlencoded");
    }

    public n(ArrayList arrayList, ArrayList arrayList2) {
        gm.l.f(arrayList, "encodedNames");
        gm.l.f(arrayList2, "encodedValues");
        this.f32640b = an.c.t(arrayList);
        this.f32641c = an.c.t(arrayList2);
    }

    @Override // zm.z
    public final long a() {
        return d(null, true);
    }

    @Override // zm.z
    public final s b() {
        return f32639d;
    }

    @Override // zm.z
    public final void c(ln.f fVar) {
        d(fVar, false);
    }

    public final long d(ln.f fVar, boolean z10) {
        ln.e d10;
        if (z10) {
            d10 = new ln.e();
        } else {
            gm.l.c(fVar);
            d10 = fVar.d();
        }
        int size = this.f32640b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                d10.b0(38);
            }
            d10.p0(this.f32640b.get(i10));
            d10.b0(61);
            d10.p0(this.f32641c.get(i10));
        }
        if (z10) {
            long j10 = d10.f20098b;
            d10.a();
            return j10;
        }
        return 0L;
    }
}
