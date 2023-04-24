package q0;

import java.util.ArrayList;
import p.g;
import q0.c;

/* loaded from: classes.dex */
public class b implements c.a {

    /* renamed from: d */
    public a f24466d;

    /* renamed from: a */
    public e f24463a = null;

    /* renamed from: b */
    public float f24464b = 0.0f;

    /* renamed from: c */
    public ArrayList<e> f24465c = new ArrayList<>();

    /* renamed from: e */
    public boolean f24467e = false;

    /* loaded from: classes.dex */
    public interface a {
        float a(e eVar, boolean z10);

        int b();

        void c(e eVar, float f10, boolean z10);

        void clear();

        float d(b bVar, boolean z10);

        e e(int i10);

        void f();

        float g(int i10);

        boolean h(e eVar);

        void i(e eVar, float f10);

        float j(e eVar);

        void k(float f10);
    }

    public b() {
    }

    public b(g gVar) {
        this.f24466d = new q0.a(this, gVar);
    }

    @Override // q0.c.a
    public e a(boolean[] zArr) {
        return f(zArr, null);
    }

    public final void b(c cVar, int i10) {
        this.f24466d.i(cVar.k(i10), 1.0f);
        this.f24466d.i(cVar.k(i10), -1.0f);
    }

    public final void c(e eVar, e eVar2, e eVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f24464b = i10;
        }
        if (z10) {
            this.f24466d.i(eVar, 1.0f);
            this.f24466d.i(eVar2, -1.0f);
            this.f24466d.i(eVar3, -1.0f);
            return;
        }
        this.f24466d.i(eVar, -1.0f);
        this.f24466d.i(eVar2, 1.0f);
        this.f24466d.i(eVar3, 1.0f);
    }

    public final void d(e eVar, e eVar2, e eVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f24464b = i10;
        }
        if (z10) {
            this.f24466d.i(eVar, 1.0f);
            this.f24466d.i(eVar2, -1.0f);
            this.f24466d.i(eVar3, 1.0f);
            return;
        }
        this.f24466d.i(eVar, -1.0f);
        this.f24466d.i(eVar2, 1.0f);
        this.f24466d.i(eVar3, -1.0f);
    }

    public boolean e() {
        return this.f24463a == null && this.f24464b == 0.0f && this.f24466d.b() == 0;
    }

    public final e f(boolean[] zArr, e eVar) {
        int i10;
        int b10 = this.f24466d.b();
        e eVar2 = null;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < b10; i11++) {
            float g10 = this.f24466d.g(i11);
            if (g10 < 0.0f) {
                e e10 = this.f24466d.e(i11);
                if ((zArr == null || !zArr[e10.f24492b]) && e10 != eVar && (((i10 = e10.f24499i) == 3 || i10 == 4) && g10 < f10)) {
                    f10 = g10;
                    eVar2 = e10;
                }
            }
        }
        return eVar2;
    }

    public final void g(e eVar) {
        e eVar2 = this.f24463a;
        if (eVar2 != null) {
            this.f24466d.i(eVar2, -1.0f);
            this.f24463a.f24493c = -1;
            this.f24463a = null;
        }
        float a10 = this.f24466d.a(eVar, true) * (-1.0f);
        this.f24463a = eVar;
        if (a10 == 1.0f) {
            return;
        }
        this.f24464b /= a10;
        this.f24466d.k(a10);
    }

    public final void h(c cVar, e eVar, boolean z10) {
        if (eVar == null || !eVar.f24496f) {
            return;
        }
        float j10 = this.f24466d.j(eVar);
        this.f24464b = (eVar.f24495e * j10) + this.f24464b;
        this.f24466d.a(eVar, z10);
        if (z10) {
            eVar.c(this);
        }
        if (this.f24466d.b() == 0) {
            this.f24467e = true;
            cVar.f24470a = true;
        }
    }

    public void i(c cVar, b bVar, boolean z10) {
        float d10 = this.f24466d.d(bVar, z10);
        this.f24464b = (bVar.f24464b * d10) + this.f24464b;
        if (z10) {
            bVar.f24463a.c(this);
        }
        if (this.f24463a == null || this.f24466d.b() != 0) {
            return;
        }
        this.f24467e = true;
        cVar.f24470a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r9 = this;
            q0.e r0 = r9.f24463a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L16
        L7:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = android.support.v4.media.d.a(r0)
            q0.e r1 = r9.f24463a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L16:
            java.lang.String r1 = " = "
            java.lang.String r0 = a.b.b(r0, r1)
            float r1 = r9.f24464b
            r2 = 0
            r3 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L33
            java.lang.StringBuilder r0 = android.support.v4.media.d.a(r0)
            float r1 = r9.f24464b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            goto L34
        L33:
            r1 = 0
        L34:
            q0.b$a r4 = r9.f24466d
            int r4 = r4.b()
        L3a:
            if (r3 >= r4) goto L9f
            q0.b$a r5 = r9.f24466d
            q0.e r5 = r5.e(r3)
            if (r5 != 0) goto L45
            goto L9c
        L45:
            q0.b$a r6 = r9.f24466d
            float r6 = r6.g(r3)
            int r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r7 != 0) goto L50
            goto L9c
        L50:
            java.lang.String r5 = r5.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L63
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 >= 0) goto L7e
            java.lang.StringBuilder r0 = android.support.v4.media.d.a(r0)
            java.lang.String r1 = "- "
            goto L75
        L63:
            java.lang.StringBuilder r0 = android.support.v4.media.d.a(r0)
            if (r7 <= 0) goto L73
            java.lang.String r1 = " + "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L7e
        L73:
            java.lang.String r1 = " - "
        L75:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            float r6 = r6 * r8
        L7e:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L8a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L97
        L8a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " "
        L97:
            java.lang.String r0 = androidx.activity.e.b(r1, r0, r5)
            r1 = 1
        L9c:
            int r3 = r3 + 1
            goto L3a
        L9f:
            if (r1 != 0) goto La7
            java.lang.String r1 = "0.0"
            java.lang.String r0 = a.b.b(r0, r1)
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.b.toString():java.lang.String");
    }
}
