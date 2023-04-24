package re;

import android.content.Context;
import android.support.v4.media.d;
import android.text.TextUtils;
import java.util.Locale;
import ze.j;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public Context f25551a;

    /* renamed from: b */
    public int f25552b;

    /* renamed from: c */
    public int f25553c;

    /* renamed from: d */
    public int f25554d;

    /* renamed from: e */
    public int f25555e;

    /* renamed from: f */
    public int f25556f;

    /* renamed from: g */
    public int f25557g;

    /* renamed from: h */
    public String f25558h;

    /* renamed from: i */
    public String f25559i;

    /* renamed from: j */
    public int f25560j;

    /* renamed from: k */
    public j f25561k;

    /* renamed from: l */
    public boolean f25562l;

    /* renamed from: m */
    public int f25563m;

    /* renamed from: n */
    public boolean f25564n;

    /* renamed from: o */
    public boolean f25565o;

    /* renamed from: p */
    public int f25566p;

    /* renamed from: q */
    public boolean f25567q;

    /* renamed from: r */
    public boolean f25568r;

    /* renamed from: s */
    public int f25569s;

    /* renamed from: t */
    public int f25570t;

    /* renamed from: u */
    public boolean f25571u;

    /* renamed from: v */
    public int f25572v;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public Context f25573a;

        /* renamed from: c */
        public String f25575c;

        /* renamed from: d */
        public String f25576d;

        /* renamed from: k */
        public j f25583k;

        /* renamed from: p */
        public int f25588p;

        /* renamed from: v */
        public int f25594v;

        /* renamed from: b */
        public int f25574b = 0;

        /* renamed from: e */
        public int f25577e = 3;

        /* renamed from: f */
        public int f25578f = 0;

        /* renamed from: g */
        public int f25579g = 0;

        /* renamed from: h */
        public int f25580h = 0;

        /* renamed from: i */
        public int f25581i = 1;

        /* renamed from: j */
        public int f25582j = -1;

        /* renamed from: l */
        public boolean f25584l = false;

        /* renamed from: m */
        public int f25585m = 0;

        /* renamed from: n */
        public boolean f25586n = false;

        /* renamed from: o */
        public boolean f25587o = true;

        /* renamed from: q */
        public boolean f25589q = false;

        /* renamed from: r */
        public boolean f25590r = false;

        /* renamed from: s */
        public int f25591s = 15;

        /* renamed from: t */
        public int f25592t = 0;

        /* renamed from: u */
        public boolean f25593u = false;

        /* JADX WARN: Code restructure failed: missing block: B:231:0x010d, code lost:
            if (r7 != false) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:257:0x014b, code lost:
            if (r7 != false) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:258:0x014d, code lost:
            r36.f25591s = r1.l();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final re.b a() {
            /*
                Method dump skipped, instructions count: 454
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: re.b.a.a():re.b");
        }
    }

    public b(Context context, int i10, int i11, int i12, int i13, int i14, String str, String str2, int i15, boolean z10, int i16, j jVar, boolean z11, int i17, boolean z12, boolean z13, int i18, int i19, boolean z14, int i20, boolean z15, int i21) {
        this.f25551a = context;
        this.f25552b = i10;
        this.f25553c = i11;
        this.f25554d = i12;
        this.f25555e = i13;
        this.f25557g = i14;
        this.f25558h = str;
        this.f25559i = str2;
        this.f25560j = i15;
        this.f25568r = z10;
        this.f25569s = i16;
        this.f25561k = jVar;
        this.f25562l = z11;
        this.f25563m = i17;
        this.f25564n = z12;
        this.f25565o = z13;
        this.f25556f = i18;
        this.f25566p = i19;
        this.f25567q = z14;
        this.f25570t = i20;
        this.f25571u = z15;
        this.f25572v = i21;
    }

    public final String a() {
        return TextUtils.isEmpty(this.f25559i) ? "BIN" : this.f25559i;
    }

    public final String toString() {
        StringBuilder a10 = d.a("LoadParams{");
        a10.append(String.format("\n\ticType=0x%02X, protocolType=0x%04X, specVersion=0x%02X", Integer.valueOf(this.f25552b), Integer.valueOf(this.f25553c), Integer.valueOf(this.f25554d)));
        a10.append(String.format("\n\tdualBank=%b, updateBank=0x%02X,singleVpPackAllowedAtDualBank=%b", Boolean.valueOf(this.f25568r), Integer.valueOf(this.f25569s), Boolean.valueOf(this.f25571u)));
        a10.append(String.format("\n\tworkMode=0x%02X, preferredFileType=0x%02X, preferredBudRole=0x%02X", Integer.valueOf(this.f25566p), Integer.valueOf(this.f25555e), Integer.valueOf(this.f25556f)));
        a10.append(String.format("\n\tlocation=0x%02X, indicator=0x%08X, path=%s", Integer.valueOf(this.f25557g), Integer.valueOf(this.f25560j), this.f25558h));
        a10.append(String.format(Locale.US, "\n\tvalidate: versionCheck=%b(%d), icCheck=%b, sectionSizeCheck=%b,ignoreException=%b, dataImageValidate=%b", Boolean.valueOf(this.f25562l), Integer.valueOf(this.f25563m), Boolean.valueOf(this.f25564n), Boolean.valueOf(this.f25565o), Boolean.FALSE, Boolean.valueOf(this.f25567q)));
        if (this.f25566p == 24) {
            a10.append(String.format("\n\tvpId=0x%04X", Integer.valueOf(this.f25572v)));
        }
        a10.append("\n}");
        return a10.toString();
    }
}
