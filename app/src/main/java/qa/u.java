package qa;

import java.math.BigDecimal;

/* loaded from: classes.dex */
public abstract class u implements v {

    /* renamed from: a */
    public static final a f24666a;

    /* renamed from: b */
    public static final b f24667b;

    /* renamed from: c */
    public static final /* synthetic */ u[] f24668c;

    /* loaded from: classes.dex */
    public enum a extends u {
        public a() {
            super("DOUBLE", 0);
        }

        @Override // qa.v
        public final Number a(ya.a aVar) {
            return Double.valueOf(aVar.J());
        }
    }

    /* loaded from: classes.dex */
    public enum b extends u {
        public b() {
            super("LAZILY_PARSED_NUMBER", 1);
        }

        @Override // qa.v
        public final Number a(ya.a aVar) {
            return new sa.n(aVar.b0());
        }
    }

    static {
        a aVar = new a();
        f24666a = aVar;
        b bVar = new b();
        f24667b = bVar;
        f24668c = new u[]{aVar, bVar, new u() { // from class: qa.u.c
            @Override // qa.v
            public final Number a(ya.a aVar2) {
                String b02 = aVar2.b0();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(b02));
                    } catch (NumberFormatException unused) {
                        Double valueOf = Double.valueOf(b02);
                        if ((!valueOf.isInfinite() && !valueOf.isNaN()) || aVar2.f31248b) {
                            return valueOf;
                        }
                        throw new ya.c("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar2.C());
                    }
                } catch (NumberFormatException e10) {
                    StringBuilder a10 = androidx.activity.result.d.a("Cannot parse ", b02, "; at path ");
                    a10.append(aVar2.C());
                    throw new p(a10.toString(), e10);
                }
            }
        }, new u() { // from class: qa.u.d
            @Override // qa.v
            public final Number a(ya.a aVar2) {
                String b02 = aVar2.b0();
                try {
                    return new BigDecimal(b02);
                } catch (NumberFormatException e10) {
                    StringBuilder a10 = androidx.activity.result.d.a("Cannot parse ", b02, "; at path ");
                    a10.append(aVar2.C());
                    throw new p(a10.toString(), e10);
                }
            }
        }};
    }

    public u() {
        throw null;
    }

    public u(String str, int i10) {
        super(str, i10);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f24668c.clone();
    }
}
