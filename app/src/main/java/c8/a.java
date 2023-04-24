package c8;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import g8.a;
import i8.n;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final g8.a<GoogleSignInOptions> f4582a;

    @Deprecated
    /* renamed from: c8.a$a */
    /* loaded from: classes.dex */
    public static class C0069a implements a.c {

        /* renamed from: c */
        public static final C0069a f4583c = new C0069a(new C0070a());

        /* renamed from: a */
        public final boolean f4584a;

        /* renamed from: b */
        public final String f4585b;

        @Deprecated
        /* renamed from: c8.a$a$a */
        /* loaded from: classes.dex */
        public static class C0070a {

            /* renamed from: a */
            public Boolean f4586a;

            /* renamed from: b */
            public String f4587b;

            public C0070a() {
                this.f4586a = Boolean.FALSE;
            }

            public C0070a(C0069a c0069a) {
                this.f4586a = Boolean.FALSE;
                C0069a c0069a2 = C0069a.f4583c;
                c0069a.getClass();
                this.f4586a = Boolean.valueOf(c0069a.f4584a);
                this.f4587b = c0069a.f4585b;
            }
        }

        public C0069a(C0070a c0070a) {
            this.f4584a = c0070a.f4586a.booleanValue();
            this.f4585b = c0070a.f4587b;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C0069a) {
                C0069a c0069a = (C0069a) obj;
                c0069a.getClass();
                return n.a(null, null) && this.f4584a == c0069a.f4584a && n.a(this.f4585b, c0069a.f4585b);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f4584a), this.f4585b});
        }
    }

    static {
        a.f fVar = new a.f();
        new d();
        e eVar = new e();
        g8.a<c> aVar = b.f4588a;
        f4582a = new g8.a<>("Auth.GOOGLE_SIGN_IN_API", eVar, fVar);
    }
}
