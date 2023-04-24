package zm;

import java.io.IOException;

/* loaded from: classes2.dex */
public enum v {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: a */
    public final String f32749a;

    /* loaded from: classes2.dex */
    public static final class a {
        public static v a(String str) {
            v vVar = v.HTTP_1_0;
            if (!gm.l.a(str, "http/1.0")) {
                vVar = v.HTTP_1_1;
                if (!gm.l.a(str, "http/1.1")) {
                    vVar = v.H2_PRIOR_KNOWLEDGE;
                    if (!gm.l.a(str, "h2_prior_knowledge")) {
                        vVar = v.HTTP_2;
                        if (!gm.l.a(str, "h2")) {
                            vVar = v.SPDY_3;
                            if (!gm.l.a(str, "spdy/3.1")) {
                                vVar = v.QUIC;
                                if (!gm.l.a(str, "quic")) {
                                    throw new IOException(a.b.b("Unexpected protocol: ", str));
                                }
                            }
                        }
                    }
                }
            }
            return vVar;
        }
    }

    v(String str) {
        this.f32749a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f32749a;
    }
}
