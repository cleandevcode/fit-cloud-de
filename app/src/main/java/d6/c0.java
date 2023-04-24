package d6;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: d */
    public static final a f12645d = new a();

    /* renamed from: e */
    public static final HashMap<String, String> f12646e = new HashMap<>();

    /* renamed from: a */
    public final o5.g0 f12647a = o5.g0.REQUESTS;

    /* renamed from: b */
    public final String f12648b;

    /* renamed from: c */
    public StringBuilder f12649c;

    /* loaded from: classes.dex */
    public static final class a {
        public static void a(o5.g0 g0Var, String str, String str2) {
            gm.l.f(str, "tag");
            gm.l.f(str2, "string");
            b(g0Var, str, str2);
        }

        public static void b(o5.g0 g0Var, String str, String str2) {
            gm.l.f(g0Var, "behavior");
            gm.l.f(str, "tag");
            gm.l.f(str2, "string");
            o5.v.i(g0Var);
        }

        public final synchronized void c(String str) {
            gm.l.f(str, "accessToken");
            o5.v vVar = o5.v.f22837a;
            o5.v.i(o5.g0.INCLUDE_ACCESS_TOKENS);
            synchronized (this) {
                c0.f12646e.put(str, "ACCESS_TOKEN_REMOVED");
            }
        }
    }

    public c0() {
        n0.f("Request", "tag");
        this.f12648b = gm.l.k("Request", "FacebookSDK.");
        this.f12649c = new StringBuilder();
    }

    public final void a(Object obj, String str) {
        gm.l.f(str, "key");
        gm.l.f(obj, "value");
        c();
    }

    public final void b() {
        String sb2 = this.f12649c.toString();
        gm.l.e(sb2, "contents.toString()");
        a.b(this.f12647a, this.f12648b, sb2);
        this.f12649c = new StringBuilder();
    }

    public final void c() {
        o5.v vVar = o5.v.f22837a;
        o5.v.i(this.f12647a);
    }
}
