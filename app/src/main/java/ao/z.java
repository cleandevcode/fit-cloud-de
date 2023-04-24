package ao;

import java.util.ArrayList;
import java.util.regex.Pattern;
import zm.n;
import zm.p;
import zm.q;
import zm.s;
import zm.t;
import zm.w;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: l */
    public static final char[] f3907l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    public static final Pattern f3908m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    public final String f3909a;

    /* renamed from: b */
    public final zm.q f3910b;

    /* renamed from: c */
    public String f3911c;

    /* renamed from: d */
    public q.a f3912d;

    /* renamed from: e */
    public final w.a f3913e = new w.a();

    /* renamed from: f */
    public final p.a f3914f;

    /* renamed from: g */
    public zm.s f3915g;

    /* renamed from: h */
    public final boolean f3916h;

    /* renamed from: i */
    public t.a f3917i;

    /* renamed from: j */
    public n.a f3918j;

    /* renamed from: k */
    public zm.z f3919k;

    /* loaded from: classes2.dex */
    public static class a extends zm.z {

        /* renamed from: b */
        public final zm.z f3920b;

        /* renamed from: c */
        public final zm.s f3921c;

        public a(zm.z zVar, zm.s sVar) {
            this.f3920b = zVar;
            this.f3921c = sVar;
        }

        @Override // zm.z
        public final long a() {
            return this.f3920b.a();
        }

        @Override // zm.z
        public final zm.s b() {
            return this.f3921c;
        }

        @Override // zm.z
        public final void c(ln.f fVar) {
            this.f3920b.c(fVar);
        }
    }

    public z(String str, zm.q qVar, String str2, zm.p pVar, zm.s sVar, boolean z10, boolean z11, boolean z12) {
        this.f3909a = str;
        this.f3910b = qVar;
        this.f3911c = str2;
        this.f3915g = sVar;
        this.f3916h = z10;
        this.f3914f = pVar != null ? pVar.i() : new p.a();
        if (z11) {
            this.f3918j = new n.a();
        } else if (z12) {
            t.a aVar = new t.a();
            this.f3917i = aVar;
            zm.s sVar2 = zm.t.f32682g;
            gm.l.f(sVar2, "type");
            if (gm.l.a(sVar2.f32679b, "multipart")) {
                aVar.f32691b = sVar2;
                return;
            }
            throw new IllegalArgumentException(("multipart != " + sVar2).toString());
        }
    }

    public final void a(String str, String str2, boolean z10) {
        n.a aVar = this.f3918j;
        aVar.getClass();
        if (z10) {
            gm.l.f(str, "name");
            ArrayList arrayList = aVar.f32642a;
            q.b bVar = zm.q.f32656l;
            arrayList.add(q.b.a(bVar, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f32644c, 83));
            aVar.f32643b.add(q.b.a(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, aVar.f32644c, 83));
            return;
        }
        gm.l.f(str, "name");
        ArrayList arrayList2 = aVar.f32642a;
        q.b bVar2 = zm.q.f32656l;
        arrayList2.add(q.b.a(bVar2, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar.f32644c, 91));
        aVar.f32643b.add(q.b.a(bVar2, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, aVar.f32644c, 91));
    }

    public final void b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                zm.s.f32677f.getClass();
                this.f3915g = s.a.a(str2);
                return;
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException(a.b.b("Malformed content type: ", str2), e10);
            }
        }
        this.f3914f.a(str, str2);
    }

    public final void c(String str, String str2, boolean z10) {
        q.a aVar;
        String str3 = this.f3911c;
        String str4 = null;
        if (str3 != null) {
            zm.q qVar = this.f3910b;
            qVar.getClass();
            try {
                aVar = new q.a();
                aVar.c(qVar, str3);
            } catch (IllegalArgumentException unused) {
                aVar = null;
            }
            this.f3912d = aVar;
            if (aVar != null) {
                this.f3911c = null;
            } else {
                StringBuilder a10 = android.support.v4.media.d.a("Malformed URL. Base: ");
                a10.append(this.f3910b);
                a10.append(", Relative: ");
                a10.append(this.f3911c);
                throw new IllegalArgumentException(a10.toString());
            }
        }
        q.a aVar2 = this.f3912d;
        aVar2.getClass();
        if (z10) {
            gm.l.f(str, "encodedName");
            if (aVar2.f32673g == null) {
                aVar2.f32673g = new ArrayList();
            }
            ArrayList arrayList = aVar2.f32673g;
            gm.l.c(arrayList);
            q.b bVar = zm.q.f32656l;
            arrayList.add(q.b.a(bVar, str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211));
            ArrayList arrayList2 = aVar2.f32673g;
            gm.l.c(arrayList2);
            if (str2 != null) {
                str4 = q.b.a(bVar, str2, 0, 0, " \"'<>#&=", true, false, true, false, null, 211);
            }
            arrayList2.add(str4);
            return;
        }
        gm.l.f(str, "name");
        if (aVar2.f32673g == null) {
            aVar2.f32673g = new ArrayList();
        }
        ArrayList arrayList3 = aVar2.f32673g;
        gm.l.c(arrayList3);
        q.b bVar2 = zm.q.f32656l;
        arrayList3.add(q.b.a(bVar2, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219));
        ArrayList arrayList4 = aVar2.f32673g;
        gm.l.c(arrayList4);
        if (str2 != null) {
            str4 = q.b.a(bVar2, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219);
        }
        arrayList4.add(str4);
    }
}
