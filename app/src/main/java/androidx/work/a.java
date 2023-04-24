package androidx.work;

import f3.j;
import f3.v;
import f3.w;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import x2.i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final ExecutorService f3637a = a(false);

    /* renamed from: b */
    public final ExecutorService f3638b = a(true);

    /* renamed from: c */
    public final w f3639c;

    /* renamed from: d */
    public final j f3640d;

    /* renamed from: e */
    public final i f3641e;

    /* renamed from: f */
    public final int f3642f;

    /* renamed from: g */
    public final int f3643g;

    /* renamed from: h */
    public final int f3644h;

    /* renamed from: androidx.work.a$a */
    /* loaded from: classes.dex */
    public static final class C0037a {

        /* renamed from: a */
        public w f3645a;
    }

    /* loaded from: classes.dex */
    public interface b {
        a a();
    }

    public a(C0037a c0037a) {
        w wVar = c0037a.f3645a;
        if (wVar == null) {
            String str = w.f14119a;
            wVar = new v();
        }
        this.f3639c = wVar;
        this.f3640d = new j();
        this.f3641e = new i(1, 0);
        this.f3642f = 4;
        this.f3643g = Integer.MAX_VALUE;
        this.f3644h = 20;
    }

    public static ExecutorService a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new f3.b(z10));
    }
}
