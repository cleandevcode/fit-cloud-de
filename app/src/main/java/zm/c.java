package zm;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: n */
    public static final b f32559n = new b();

    /* renamed from: a */
    public final boolean f32560a;

    /* renamed from: b */
    public final boolean f32561b;

    /* renamed from: c */
    public final int f32562c;

    /* renamed from: d */
    public final int f32563d;

    /* renamed from: e */
    public final boolean f32564e;

    /* renamed from: f */
    public final boolean f32565f;

    /* renamed from: g */
    public final boolean f32566g;

    /* renamed from: h */
    public final int f32567h;

    /* renamed from: i */
    public final int f32568i;

    /* renamed from: j */
    public final boolean f32569j;

    /* renamed from: k */
    public final boolean f32570k;

    /* renamed from: l */
    public final boolean f32571l;

    /* renamed from: m */
    public String f32572m;

    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* loaded from: classes2.dex */
    public static final class b {
        /* JADX WARN: Removed duplicated region for block: B:144:0x004a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static zm.c a(zm.p r27) {
            /*
                Method dump skipped, instructions count: 492
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: zm.c.b.a(zm.p):zm.c");
        }
    }

    static {
        new a();
        new a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        gm.l.f(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public c(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f32560a = z10;
        this.f32561b = z11;
        this.f32562c = i10;
        this.f32563d = i11;
        this.f32564e = z12;
        this.f32565f = z13;
        this.f32566g = z14;
        this.f32567h = i12;
        this.f32568i = i13;
        this.f32569j = z15;
        this.f32570k = z16;
        this.f32571l = z17;
        this.f32572m = str;
    }

    public final String toString() {
        String str = this.f32572m;
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f32560a) {
                sb2.append("no-cache, ");
            }
            if (this.f32561b) {
                sb2.append("no-store, ");
            }
            if (this.f32562c != -1) {
                sb2.append("max-age=");
                sb2.append(this.f32562c);
                sb2.append(", ");
            }
            if (this.f32563d != -1) {
                sb2.append("s-maxage=");
                sb2.append(this.f32563d);
                sb2.append(", ");
            }
            if (this.f32564e) {
                sb2.append("private, ");
            }
            if (this.f32565f) {
                sb2.append("public, ");
            }
            if (this.f32566g) {
                sb2.append("must-revalidate, ");
            }
            if (this.f32567h != -1) {
                sb2.append("max-stale=");
                sb2.append(this.f32567h);
                sb2.append(", ");
            }
            if (this.f32568i != -1) {
                sb2.append("min-fresh=");
                sb2.append(this.f32568i);
                sb2.append(", ");
            }
            if (this.f32569j) {
                sb2.append("only-if-cached, ");
            }
            if (this.f32570k) {
                sb2.append("no-transform, ");
            }
            if (this.f32571l) {
                sb2.append("immutable, ");
            }
            if (sb2.length() == 0) {
                return "";
            }
            sb2.delete(sb2.length() - 2, sb2.length());
            String sb3 = sb2.toString();
            gm.l.e(sb3, "StringBuilder().apply(builderAction).toString()");
            this.f32572m = sb3;
            return sb3;
        }
        return str;
    }
}
