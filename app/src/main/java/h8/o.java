package h8;

/* loaded from: classes.dex */
public abstract class o<A, ResultT> {

    /* renamed from: a */
    public final f8.c[] f16000a;

    /* renamed from: b */
    public final boolean f16001b;

    /* renamed from: c */
    public final int f16002c;

    /* loaded from: classes.dex */
    public static class a<A, ResultT> {

        /* renamed from: a */
        public m f16003a;

        /* renamed from: c */
        public f8.c[] f16005c;

        /* renamed from: b */
        public boolean f16004b = true;

        /* renamed from: d */
        public int f16006d = 0;

        public final w0 a() {
            i8.p.a("execute parameter required", this.f16003a != null);
            return new w0(this, this.f16005c, this.f16004b, this.f16006d);
        }
    }

    public o(f8.c[] cVarArr, boolean z10, int i10) {
        this.f16000a = cVarArr;
        boolean z11 = false;
        if (cVarArr != null && z10) {
            z11 = true;
        }
        this.f16001b = z11;
        this.f16002c = i10;
    }
}
