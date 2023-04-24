package p5;

import d6.m0;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class a implements Serializable {

    /* renamed from: a */
    public final String f23885a;

    /* renamed from: b */
    public final String f23886b;

    /* renamed from: p5.a$a */
    /* loaded from: classes.dex */
    public static final class C0430a implements Serializable {

        /* renamed from: a */
        public final String f23887a;

        /* renamed from: b */
        public final String f23888b;

        public C0430a(String str, String str2) {
            gm.l.f(str2, "appId");
            this.f23887a = str;
            this.f23888b = str2;
        }

        private final Object readResolve() {
            return new a(this.f23887a, this.f23888b);
        }
    }

    public a(String str, String str2) {
        gm.l.f(str2, "applicationId");
        this.f23885a = str2;
        this.f23886b = m0.A(str) ? null : str;
    }

    private final Object writeReplace() {
        return new C0430a(this.f23886b, this.f23885a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            m0 m0Var = m0.f12709a;
            a aVar = (a) obj;
            return m0.a(aVar.f23886b, this.f23886b) && m0.a(aVar.f23885a, this.f23885a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f23886b;
        return (str == null ? 0 : str.hashCode()) ^ this.f23885a.hashCode();
    }
}
