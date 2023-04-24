package w1;

/* loaded from: classes.dex */
public class p1 {

    /* renamed from: c */
    public static final a f29661c;

    /* renamed from: d */
    public static final b f29662d;

    /* renamed from: e */
    public static final c f29663e;

    /* renamed from: f */
    public static final /* synthetic */ p1[] f29664f;

    /* renamed from: a */
    public final q1 f29665a;

    /* renamed from: b */
    public final int f29666b;
    p1 EF0;
    p1 EF1;
    p1 EF2;

    /* loaded from: classes.dex */
    public enum a extends p1 {
        public a() {
            super("STRING", 8, q1.f29672g, 2);
        }
    }

    /* loaded from: classes.dex */
    public enum b extends p1 {
        public b(q1 q1Var) {
            super("GROUP", 9, q1Var, 3);
        }
    }

    /* loaded from: classes.dex */
    public enum c extends p1 {
        public c(q1 q1Var) {
            super("MESSAGE", 10, q1Var, 2);
        }
    }

    static {
        p1 p1Var = new p1("DOUBLE", 0, q1.f29670e, 1);
        p1 p1Var2 = new p1("FLOAT", 1, q1.f29669d, 5);
        q1 q1Var = q1.f29668c;
        p1 p1Var3 = new p1("INT64", 2, q1Var, 0);
        p1 p1Var4 = new p1("UINT64", 3, q1Var, 0);
        q1 q1Var2 = q1.f29667b;
        p1 p1Var5 = new p1("INT32", 4, q1Var2, 0);
        p1 p1Var6 = new p1("FIXED64", 5, q1Var, 1);
        p1 p1Var7 = new p1("FIXED32", 6, q1Var2, 5);
        p1 p1Var8 = new p1("BOOL", 7, q1.f29671f, 0);
        a aVar = new a();
        f29661c = aVar;
        q1 q1Var3 = q1.f29675j;
        b bVar = new b(q1Var3);
        f29662d = bVar;
        c cVar = new c(q1Var3);
        f29663e = cVar;
        f29664f = new p1[]{p1Var, p1Var2, p1Var3, p1Var4, p1Var5, p1Var6, p1Var7, p1Var8, aVar, bVar, cVar, new p1(q1.f29673h) { // from class: w1.p1.d
        }, new p1("UINT32", 12, q1Var2, 0), new p1("ENUM", 13, q1.f29674i, 0), new p1("SFIXED32", 14, q1Var2, 5), new p1("SFIXED64", 15, q1Var, 1), new p1("SINT32", 16, q1Var2, 0), new p1("SINT64", 17, q1Var, 0)};
    }

    public /* synthetic */ p1() {
        throw null;
    }

    public p1(String str, int i10, q1 q1Var, int i11) {
        super(str, i10);
        this.f29665a = q1Var;
        this.f29666b = i11;
    }

    public static p1 valueOf(String str) {
        return (p1) Enum.valueOf(p1.class, str);
    }

    public static p1[] values() {
        return (p1[]) f29664f.clone();
    }
}
