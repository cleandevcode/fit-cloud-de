package a0;

import a0.u1;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends u1.e {

    /* renamed from: a */
    public final m0 f63a;

    /* renamed from: b */
    public final List<m0> f64b;

    /* renamed from: c */
    public final String f65c;

    /* renamed from: d */
    public final int f66d;

    /* loaded from: classes.dex */
    public static final class a extends u1.e.a {

        /* renamed from: a */
        public m0 f67a;

        /* renamed from: b */
        public List<m0> f68b;

        /* renamed from: c */
        public String f69c;

        /* renamed from: d */
        public Integer f70d;

        public final g a() {
            String str;
            if (this.f67a == null) {
                str = " surface";
            } else {
                str = "";
            }
            if (this.f68b == null) {
                str = a.b.b(str, " sharedSurfaces");
            }
            if (this.f70d == null) {
                str = a.b.b(str, " surfaceGroupId");
            }
            if (str.isEmpty()) {
                return new g(this.f67a, this.f68b, this.f69c, this.f70d.intValue());
            }
            throw new IllegalStateException(a.b.b("Missing required properties:", str));
        }
    }

    public g(m0 m0Var, List list, String str, int i10) {
        this.f63a = m0Var;
        this.f64b = list;
        this.f65c = str;
        this.f66d = i10;
    }

    @Override // a0.u1.e
    public final String b() {
        return this.f65c;
    }

    @Override // a0.u1.e
    public final List<m0> c() {
        return this.f64b;
    }

    @Override // a0.u1.e
    public final m0 d() {
        return this.f63a;
    }

    @Override // a0.u1.e
    public final int e() {
        return this.f66d;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1.e) {
            u1.e eVar = (u1.e) obj;
            return this.f63a.equals(eVar.d()) && this.f64b.equals(eVar.c()) && ((str = this.f65c) != null ? str.equals(eVar.b()) : eVar.b() == null) && this.f66d == eVar.e();
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f63a.hashCode() ^ 1000003) * 1000003) ^ this.f64b.hashCode()) * 1000003;
        String str = this.f65c;
        return ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f66d;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("OutputConfig{surface=");
        a10.append(this.f63a);
        a10.append(", sharedSurfaces=");
        a10.append(this.f64b);
        a10.append(", physicalCameraId=");
        a10.append(this.f65c);
        a10.append(", surfaceGroupId=");
        return q.b(a10, this.f66d, "}");
    }
}
