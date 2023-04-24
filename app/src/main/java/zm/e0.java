package zm;

/* loaded from: classes2.dex */
public enum e0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: a */
    public final String f32583a;

    /* loaded from: classes2.dex */
    public static final class a {
        public static e0 a(String str) {
            gm.l.f(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return e0.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return e0.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return e0.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return e0.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return e0.SSL_3_0;
            }
            throw new IllegalArgumentException(a.b.b("Unexpected TLS version: ", str));
        }
    }

    e0(String str) {
        this.f32583a = str;
    }
}
