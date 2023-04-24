package g8;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.fragment.app.k0;
import androidx.fragment.app.x;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import g8.a;
import g8.a.c;
import h8.b1;
import h8.c1;
import h8.g0;
import h8.h;
import h8.l1;
import h8.n0;
import h8.t;
import h8.w0;
import i8.d;
import i8.p;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.WeakHashMap;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import w.o;

/* loaded from: classes.dex */
public abstract class c<O extends a.c> {

    /* renamed from: a */
    public final Context f15017a;

    /* renamed from: b */
    public final String f15018b;

    /* renamed from: c */
    public final g8.a f15019c;

    /* renamed from: d */
    public final a.c f15020d;

    /* renamed from: e */
    public final h8.a f15021e;

    /* renamed from: f */
    public final Looper f15022f;

    /* renamed from: g */
    public final int f15023g;
    @NotOnlyInitialized

    /* renamed from: h */
    public final g0 f15024h;

    /* renamed from: i */
    public final o f15025i;

    /* renamed from: j */
    public final h8.d f15026j;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c */
        public static final a f15027c = new a(new o(), Looper.getMainLooper());

        /* renamed from: a */
        public final o f15028a;

        /* renamed from: b */
        public final Looper f15029b;

        public a(o oVar, Looper looper) {
            this.f15028a = oVar;
            this.f15029b = looper;
        }
    }

    public c() {
        throw null;
    }

    public c(Context context, x xVar, g8.a aVar, a.c cVar, a aVar2) {
        l1 l1Var;
        if (context == null) {
            throw new NullPointerException("Null context is not permitted.");
        }
        if (aVar == null) {
            throw new NullPointerException("Api must not be null.");
        }
        if (aVar2 != null) {
            Context applicationContext = context.getApplicationContext();
            p.g(applicationContext, "The provided context did not have an application context.");
            this.f15017a = applicationContext;
            String str = null;
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            this.f15018b = str;
            this.f15019c = aVar;
            this.f15020d = cVar;
            this.f15022f = aVar2.f15029b;
            h8.a aVar3 = new h8.a(aVar, cVar, str);
            this.f15021e = aVar3;
            this.f15024h = new g0(this);
            h8.d g10 = h8.d.g(this.f15017a);
            this.f15026j = g10;
            this.f15023g = g10.f15932h.getAndIncrement();
            this.f15025i = aVar2.f15028a;
            if (xVar != null && !(xVar instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
                WeakHashMap weakHashMap = l1.f15991o0;
                WeakReference weakReference = (WeakReference) weakHashMap.get(xVar);
                if (weakReference == null || (l1Var = (l1) weakReference.get()) == null) {
                    try {
                        l1Var = (l1) xVar.J().E("SupportLifecycleFragmentImpl");
                        if (l1Var == null || l1Var.f2527l) {
                            l1Var = new l1();
                            k0 J = xVar.J();
                            J.getClass();
                            androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(J);
                            aVar4.g(0, l1Var, "SupportLifecycleFragmentImpl", 1);
                            aVar4.e(true);
                        }
                        weakHashMap.put(xVar, new WeakReference(l1Var));
                    } catch (ClassCastException e10) {
                        throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
                    }
                }
                t tVar = (t) l1Var.o(t.class);
                if (tVar == null) {
                    Object obj = f8.d.f14179c;
                    tVar = new t(l1Var, g10);
                }
                tVar.f16021f.add(aVar3);
                g10.a(tVar);
            }
            v8.j jVar = g10.f15938n;
            jVar.sendMessage(jVar.obtainMessage(7, this));
            return;
        }
        throw new NullPointerException("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
    }

    public c(Context context, g8.a<O> aVar, O o10, a aVar2) {
        this(context, null, aVar, o10, aVar2);
    }

    public final d.a a() {
        Account b10;
        Collection emptySet;
        GoogleSignInAccount a10;
        GoogleSignInAccount a11;
        d.a aVar = new d.a();
        a.c cVar = this.f15020d;
        if ((cVar instanceof a.c.b) && (a11 = ((a.c.b) cVar).a()) != null) {
            String str = a11.f6006d;
            if (str != null) {
                b10 = new Account(str, "com.google");
            }
            b10 = null;
        } else {
            a.c cVar2 = this.f15020d;
            if (cVar2 instanceof a.c.InterfaceC0269a) {
                b10 = ((a.c.InterfaceC0269a) cVar2).b();
            }
            b10 = null;
        }
        aVar.f16617a = b10;
        a.c cVar3 = this.f15020d;
        if ((cVar3 instanceof a.c.b) && (a10 = ((a.c.b) cVar3).a()) != null) {
            emptySet = a10.e();
        } else {
            emptySet = Collections.emptySet();
        }
        if (aVar.f16618b == null) {
            aVar.f16618b = new o0.d();
        }
        aVar.f16618b.addAll(emptySet);
        aVar.f16620d = this.f15017a.getClass().getName();
        aVar.f16619c = this.f15017a.getPackageName();
        return aVar;
    }

    @ResultIgnorabilityUnspecified
    public final g9.t b(h.a<?> aVar, int i10) {
        h8.d dVar = this.f15026j;
        dVar.getClass();
        g9.h hVar = new g9.h();
        dVar.f(hVar, i10, this);
        c1 c1Var = new c1(aVar, hVar);
        v8.j jVar = dVar.f15938n;
        jVar.sendMessage(jVar.obtainMessage(13, new n0(c1Var, dVar.f15933i.get(), this)));
        return hVar.f15034a;
    }

    public final g9.t c(int i10, w0 w0Var) {
        g9.h hVar = new g9.h();
        h8.d dVar = this.f15026j;
        o oVar = this.f15025i;
        dVar.getClass();
        dVar.f(hVar, w0Var.f16002c, this);
        b1 b1Var = new b1(i10, w0Var, hVar, oVar);
        v8.j jVar = dVar.f15938n;
        jVar.sendMessage(jVar.obtainMessage(4, new n0(b1Var, dVar.f15933i.get(), this)));
        return hVar.f15034a;
    }
}
