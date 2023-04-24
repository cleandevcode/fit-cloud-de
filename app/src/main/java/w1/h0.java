package w1;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: b */
    public static final a f29586b = new a();

    /* renamed from: a */
    public final o0 f29587a;

    /* loaded from: classes.dex */
    public static class a implements o0 {
        @Override // w1.o0
        public final n0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // w1.o0
        public final boolean b(Class<?> cls) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements o0 {

        /* renamed from: a */
        public o0[] f29588a;

        public b(o0... o0VarArr) {
            this.f29588a = o0VarArr;
        }

        @Override // w1.o0
        public final n0 a(Class<?> cls) {
            o0[] o0VarArr;
            for (o0 o0Var : this.f29588a) {
                if (o0Var.b(cls)) {
                    return o0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException(k.f.a(cls, android.support.v4.media.d.a("No factory is available for message type: ")));
        }

        @Override // w1.o0
        public final boolean b(Class<?> cls) {
            for (o0 o0Var : this.f29588a) {
                if (o0Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public h0() {
        o0 o0Var;
        o0[] o0VarArr = new o0[2];
        o0VarArr[0] = v.f29714a;
        try {
            o0Var = (o0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            o0Var = f29586b;
        }
        o0VarArr[1] = o0Var;
        b bVar = new b(o0VarArr);
        Charset charset = y.f29729a;
        this.f29587a = bVar;
    }
}
