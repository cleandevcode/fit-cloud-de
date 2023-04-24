package y3;

import androidx.activity.ComponentActivity;

/* loaded from: classes.dex */
public final class o extends f1 {

    /* renamed from: a */
    public final ComponentActivity f30995a;

    /* renamed from: b */
    public final Object f30996b;

    /* renamed from: c */
    public final androidx.fragment.app.r f30997c;

    /* renamed from: d */
    public final androidx.lifecycle.y0 f30998d;

    /* renamed from: e */
    public final q2.a f30999e;

    public o(ComponentActivity componentActivity, Object obj, androidx.fragment.app.r rVar, androidx.lifecycle.y0 y0Var, q2.a aVar) {
        gm.l.f(rVar, "fragment");
        gm.l.f(y0Var, "owner");
        gm.l.f(aVar, "savedStateRegistry");
        this.f30995a = componentActivity;
        this.f30996b = obj;
        this.f30997c = rVar;
        this.f30998d = y0Var;
        this.f30999e = aVar;
    }

    @Override // y3.f1
    public final ComponentActivity a() {
        return this.f30995a;
    }

    @Override // y3.f1
    public final Object b() {
        return this.f30996b;
    }

    @Override // y3.f1
    public final androidx.lifecycle.y0 c() {
        return this.f30998d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (gm.l.a(this.f30995a, oVar.f30995a) && gm.l.a(this.f30996b, oVar.f30996b) && gm.l.a(this.f30997c, oVar.f30997c) && gm.l.a(this.f30998d, oVar.f30998d) && gm.l.a(this.f30999e, oVar.f30999e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f30995a.hashCode() * 31;
        Object obj = this.f30996b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int hashCode3 = this.f30997c.hashCode();
        int hashCode4 = this.f30998d.hashCode();
        return this.f30999e.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + hashCode) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("FragmentViewModelContext(activity=");
        a10.append(this.f30995a);
        a10.append(", args=");
        a10.append(this.f30996b);
        a10.append(", fragment=");
        a10.append(this.f30997c);
        a10.append(", owner=");
        a10.append(this.f30998d);
        a10.append(", savedStateRegistry=");
        a10.append(this.f30999e);
        a10.append(')');
        return a10.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o(androidx.fragment.app.x r8, java.lang.Object r9, androidx.fragment.app.r r10) {
        /*
            r7 = this;
            q2.b r0 = r10.f2517f0
            q2.a r6 = r0.f24512b
            java.lang.String r0 = "fragment.savedStateRegistry"
            gm.l.e(r6, r0)
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.o.<init>(androidx.fragment.app.x, java.lang.Object, androidx.fragment.app.r):void");
    }
}
