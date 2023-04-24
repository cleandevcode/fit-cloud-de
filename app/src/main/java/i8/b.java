package i8;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class b<T extends IInterface> {

    /* renamed from: w */
    public static final f8.c[] f16576w = new f8.c[0];

    /* renamed from: a */
    public volatile String f16577a;

    /* renamed from: b */
    public h1 f16578b;

    /* renamed from: c */
    public final Context f16579c;

    /* renamed from: d */
    public final h f16580d;

    /* renamed from: e */
    public final r0 f16581e;

    /* renamed from: f */
    public final Object f16582f;

    /* renamed from: g */
    public final Object f16583g;

    /* renamed from: h */
    public l f16584h;

    /* renamed from: i */
    public c f16585i;

    /* renamed from: j */
    public IInterface f16586j;

    /* renamed from: k */
    public final ArrayList f16587k;

    /* renamed from: l */
    public u0 f16588l;

    /* renamed from: m */
    public int f16589m;

    /* renamed from: n */
    public final a f16590n;

    /* renamed from: o */
    public final InterfaceC0293b f16591o;

    /* renamed from: p */
    public final int f16592p;

    /* renamed from: q */
    public final String f16593q;

    /* renamed from: r */
    public volatile String f16594r;

    /* renamed from: s */
    public f8.a f16595s;

    /* renamed from: t */
    public boolean f16596t;

    /* renamed from: u */
    public volatile x0 f16597u;

    /* renamed from: v */
    public AtomicInteger f16598v;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: i8.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0293b {
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(f8.a aVar);
    }

    /* loaded from: classes.dex */
    public class d implements c {

        /* renamed from: a */
        public final /* synthetic */ b f16599a;

        public d(f9.a aVar) {
            this.f16599a = aVar;
        }

        @Override // i8.b.c
        public final void a(f8.a aVar) {
            boolean z10;
            if (aVar.f14170b == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                b bVar = this.f16599a;
                bVar.g(null, bVar.t());
                return;
            }
            InterfaceC0293b interfaceC0293b = this.f16599a.f16591o;
            if (interfaceC0293b != null) {
                ((c0) interfaceC0293b).f16607a.k(aVar);
            }
        }
    }

    public b(Context context, Looper looper, f1 f1Var, int i10, b0 b0Var, c0 c0Var, String str) {
        Object obj = f8.d.f14179c;
        this.f16577a = null;
        this.f16582f = new Object();
        this.f16583g = new Object();
        this.f16587k = new ArrayList();
        this.f16589m = 1;
        this.f16595s = null;
        this.f16596t = false;
        this.f16597u = null;
        this.f16598v = new AtomicInteger(0);
        if (context != null) {
            this.f16579c = context;
            if (looper != null) {
                if (f1Var != null) {
                    this.f16580d = f1Var;
                    this.f16581e = new r0(this, looper);
                    this.f16592p = i10;
                    this.f16590n = b0Var;
                    this.f16591o = c0Var;
                    this.f16593q = str;
                    return;
                }
                throw new NullPointerException("Supervisor must not be null");
            }
            throw new NullPointerException("Looper must not be null");
        }
        throw new NullPointerException("Context must not be null");
    }

    public static /* bridge */ /* synthetic */ boolean A(b bVar, int i10, int i11, IInterface iInterface) {
        synchronized (bVar.f16582f) {
            if (bVar.f16589m != i10) {
                return false;
            }
            bVar.B(i11, iInterface);
            return true;
        }
    }

    public final void B(int i10, IInterface iInterface) {
        boolean z10;
        boolean z11;
        h1 h1Var;
        boolean z12 = false;
        if (i10 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (iInterface == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 == z11) {
            z12 = true;
        }
        if (z12) {
            synchronized (this.f16582f) {
                try {
                    this.f16589m = i10;
                    this.f16586j = iInterface;
                    if (i10 != 1) {
                        if (i10 != 2 && i10 != 3) {
                            if (i10 == 4) {
                                p.f(iInterface);
                                System.currentTimeMillis();
                            }
                        } else {
                            u0 u0Var = this.f16588l;
                            if (u0Var != null && (h1Var = this.f16578b) != null) {
                                String str = h1Var.f16674a;
                                Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + str + " on com.google.android.gms");
                                h hVar = this.f16580d;
                                String str2 = this.f16578b.f16674a;
                                p.f(str2);
                                this.f16578b.getClass();
                                if (this.f16593q == null) {
                                    this.f16579c.getClass();
                                }
                                hVar.a(str2, "com.google.android.gms", u0Var, this.f16578b.f16675b);
                                this.f16598v.incrementAndGet();
                            }
                            u0 u0Var2 = new u0(this, this.f16598v.get());
                            this.f16588l = u0Var2;
                            String w10 = w();
                            boolean x10 = x();
                            this.f16578b = new h1(w10, x10);
                            if (x10 && i() < 17895000) {
                                throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f16578b.f16674a)));
                            }
                            h hVar2 = this.f16580d;
                            String str3 = this.f16578b.f16674a;
                            p.f(str3);
                            this.f16578b.getClass();
                            String str4 = this.f16593q;
                            if (str4 == null) {
                                str4 = this.f16579c.getClass().getName();
                            }
                            boolean z13 = this.f16578b.f16675b;
                            r();
                            if (!hVar2.b(new b1(str3, "com.google.android.gms", z13), u0Var2, str4, null)) {
                                String str5 = this.f16578b.f16674a;
                                Log.w("GmsClient", "unable to connect to service: " + str5 + " on com.google.android.gms");
                                int i11 = this.f16598v.get();
                                r0 r0Var = this.f16581e;
                                r0Var.sendMessage(r0Var.obtainMessage(7, i11, -1, new w0(this, 16)));
                            }
                        }
                    } else {
                        u0 u0Var3 = this.f16588l;
                        if (u0Var3 != null) {
                            h hVar3 = this.f16580d;
                            String str6 = this.f16578b.f16674a;
                            p.f(str6);
                            this.f16578b.getClass();
                            if (this.f16593q == null) {
                                this.f16579c.getClass();
                            }
                            hVar3.a(str6, "com.google.android.gms", u0Var3, this.f16578b.f16675b);
                            this.f16588l = null;
                        }
                    }
                } finally {
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void b(String str) {
        this.f16577a = str;
        o();
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f16582f) {
            int i10 = this.f16589m;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public final String d() {
        if (!e() || this.f16578b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return "com.google.android.gms";
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f16582f) {
            z10 = this.f16589m == 4;
        }
        return z10;
    }

    public final void f(h8.b0 b0Var) {
        b0Var.f15903a.f15919m.f15938n.post(new h8.a0(b0Var));
    }

    public final void g(j jVar, Set<Scope> set) {
        Bundle s10 = s();
        int i10 = this.f16592p;
        String str = this.f16594r;
        int i11 = f8.e.f14181a;
        Scope[] scopeArr = f.f16637o;
        Bundle bundle = new Bundle();
        f8.c[] cVarArr = f.f16638p;
        f fVar = new f(6, i10, i11, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        fVar.f16642d = this.f16579c.getPackageName();
        fVar.f16645g = s10;
        if (set != null) {
            fVar.f16644f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (l()) {
            Account p10 = p();
            if (p10 == null) {
                p10 = new Account("<<default account>>", "com.google");
            }
            fVar.f16646h = p10;
            if (jVar != null) {
                fVar.f16643e = jVar.asBinder();
            }
        }
        fVar.f16647i = f16576w;
        fVar.f16648j = q();
        if (z()) {
            fVar.f16651m = true;
        }
        try {
            synchronized (this.f16583g) {
                l lVar = this.f16584h;
                if (lVar != null) {
                    lVar.Z(new t0(this, this.f16598v.get()), fVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            r0 r0Var = this.f16581e;
            r0Var.sendMessage(r0Var.obtainMessage(6, this.f16598v.get(), 3));
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i12 = this.f16598v.get();
            r0 r0Var2 = this.f16581e;
            r0Var2.sendMessage(r0Var2.obtainMessage(1, i12, -1, new v0(this, 8, null, null)));
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i122 = this.f16598v.get();
            r0 r0Var22 = this.f16581e;
            r0Var22.sendMessage(r0Var22.obtainMessage(1, i122, -1, new v0(this, 8, null, null)));
        }
    }

    public final boolean h() {
        return true;
    }

    public int i() {
        return f8.e.f14181a;
    }

    public final f8.c[] j() {
        x0 x0Var = this.f16597u;
        if (x0Var == null) {
            return null;
        }
        return x0Var.f16727b;
    }

    public final String k() {
        return this.f16577a;
    }

    public boolean l() {
        return false;
    }

    public final void m(c cVar) {
        this.f16585i = cVar;
        B(2, null);
    }

    public abstract T n(IBinder iBinder);

    public final void o() {
        this.f16598v.incrementAndGet();
        synchronized (this.f16587k) {
            try {
                int size = this.f16587k.size();
                for (int i10 = 0; i10 < size; i10++) {
                    s0 s0Var = (s0) this.f16587k.get(i10);
                    synchronized (s0Var) {
                        s0Var.f16712a = null;
                    }
                }
                this.f16587k.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f16583g) {
            this.f16584h = null;
        }
        B(1, null);
    }

    public Account p() {
        return null;
    }

    public f8.c[] q() {
        return f16576w;
    }

    public void r() {
    }

    public Bundle s() {
        return new Bundle();
    }

    public Set<Scope> t() {
        return Collections.emptySet();
    }

    public final T u() {
        T t10;
        synchronized (this.f16582f) {
            try {
                if (this.f16589m != 5) {
                    if (e()) {
                        t10 = (T) this.f16586j;
                        p.g(t10, "Client is connected but service is null");
                    } else {
                        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                    }
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    public abstract String v();

    public abstract String w();

    public boolean x() {
        return i() >= 211700000;
    }

    public void y() {
        System.currentTimeMillis();
    }

    public boolean z() {
        return this instanceof t8.a;
    }
}
