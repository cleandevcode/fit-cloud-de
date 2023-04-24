package a5;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a */
    public static final e f292a;

    /* renamed from: b */
    public static final c f293b;

    /* renamed from: c */
    public static final d f294c;

    /* renamed from: d */
    public static final f f295d;

    /* renamed from: e */
    public static final d f296e;

    /* renamed from: f */
    public static final r4.g<m> f297f;

    /* renamed from: g */
    public static final boolean f298g;

    /* loaded from: classes.dex */
    public static class a extends m {
        @Override // a5.m
        public final int a(int i10, int i11, int i12, int i13) {
            return 2;
        }

        @Override // a5.m
        public final float b(int i10, int i11, int i12, int i13) {
            int min = Math.min(i11 / i13, i10 / i12);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(min);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends m {
        @Override // a5.m
        public final int a(int i10, int i11, int i12, int i13) {
            return 1;
        }

        @Override // a5.m
        public final float b(int i10, int i11, int i12, int i13) {
            int ceil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            int max = Math.max(1, Integer.highestOneBit(ceil));
            return 1.0f / (max << (max >= ceil ? 0 : 1));
        }
    }

    /* loaded from: classes.dex */
    public static class c extends m {
        @Override // a5.m
        public final int a(int i10, int i11, int i12, int i13) {
            if (b(i10, i11, i12, i13) == 1.0f) {
                return 2;
            }
            return m.f292a.a(i10, i11, i12, i13);
        }

        @Override // a5.m
        public final float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, m.f292a.b(i10, i11, i12, i13));
        }
    }

    /* loaded from: classes.dex */
    public static class d extends m {
        @Override // a5.m
        public final int a(int i10, int i11, int i12, int i13) {
            return 2;
        }

        @Override // a5.m
        public final float b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends m {
        @Override // a5.m
        public final int a(int i10, int i11, int i12, int i13) {
            return m.f298g ? 2 : 1;
        }

        @Override // a5.m
        public final float b(int i10, int i11, int i12, int i13) {
            if (m.f298g) {
                return Math.min(i12 / i10, i13 / i11);
            }
            int max = Math.max(i11 / i13, i10 / i12);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(max);
        }
    }

    /* loaded from: classes.dex */
    public static class f extends m {
        @Override // a5.m
        public final int a(int i10, int i11, int i12, int i13) {
            return 2;
        }

        @Override // a5.m
        public final float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    static {
        new a();
        new b();
        f292a = new e();
        f293b = new c();
        d dVar = new d();
        f294c = dVar;
        f295d = new f();
        f296e = dVar;
        f297f = r4.g.a(dVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f298g = true;
    }

    public abstract int a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}
