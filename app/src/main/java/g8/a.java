package g8;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import g8.a.c;
import g8.d;
import h8.b0;
import i8.b;
import java.util.Set;

/* loaded from: classes.dex */
public final class a<O extends c> {

    /* renamed from: a */
    public final AbstractC0268a f15014a;

    /* renamed from: b */
    public final String f15015b;

    /* renamed from: g8.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0268a<T extends e, O> extends d<T, O> {
        @Deprecated
        public e a(Context context, Looper looper, i8.d dVar, c cVar, d.a aVar, d.b bVar) {
            return b(context, looper, dVar, cVar, aVar, bVar);
        }

        public e b(Context context, Looper looper, i8.d dVar, c cVar, h8.c cVar2, h8.j jVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* loaded from: classes.dex */
    public static class b<C> {
    }

    /* loaded from: classes.dex */
    public interface c {
        public static final C0270c G = new C0270c(0);

        /* renamed from: g8.a$c$a */
        /* loaded from: classes.dex */
        public interface InterfaceC0269a extends c {
            Account b();
        }

        /* loaded from: classes.dex */
        public interface b extends c {
            GoogleSignInAccount a();
        }

        /* renamed from: g8.a$c$c */
        /* loaded from: classes.dex */
        public static final class C0270c implements c {
            public C0270c() {
            }

            public /* synthetic */ C0270c(int i10) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d<T, O> {
    }

    /* loaded from: classes.dex */
    public interface e {
        Set<Scope> a();

        void b(String str);

        boolean c();

        String d();

        boolean e();

        void f(b0 b0Var);

        void g(i8.j jVar, Set<Scope> set);

        boolean h();

        int i();

        f8.c[] j();

        String k();

        boolean l();

        void m(b.c cVar);
    }

    /* loaded from: classes.dex */
    public static final class f<C extends e> extends b<C> {
    }

    public <C extends e> a(String str, AbstractC0268a<C, O> abstractC0268a, f<C> fVar) {
        this.f15015b = str;
        this.f15014a = abstractC0268a;
    }
}
