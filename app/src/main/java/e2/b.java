package e2;

import android.os.Bundle;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.s0;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import e2.a;
import e8.f;
import f2.a;
import f2.b;
import java.io.PrintWriter;
import o0.i;

/* loaded from: classes.dex */
public final class b extends e2.a {

    /* renamed from: a */
    public final u f13321a;

    /* renamed from: b */
    public final c f13322b;

    /* loaded from: classes.dex */
    public static class a<D> extends a0<D> implements b.a<D> {

        /* renamed from: n */
        public final f2.b<D> f13325n;

        /* renamed from: o */
        public u f13326o;

        /* renamed from: p */
        public C0235b<D> f13327p;

        /* renamed from: l */
        public final int f13323l = 0;

        /* renamed from: m */
        public final Bundle f13324m = null;

        /* renamed from: q */
        public f2.b<D> f13328q = null;

        public a(f fVar) {
            this.f13325n = fVar;
            if (fVar.f14045b == null) {
                fVar.f14045b = this;
                fVar.f14044a = 0;
                return;
            }
            throw new IllegalStateException("There is already a listener registered");
        }

        @Override // androidx.lifecycle.LiveData
        public final void g() {
            f2.b<D> bVar = this.f13325n;
            bVar.f14046c = true;
            bVar.f14048e = false;
            bVar.f14047d = false;
            f fVar = (f) bVar;
            fVar.f13495j.drainPermits();
            fVar.a();
            fVar.f14040h = new a.RunnableC0247a();
            fVar.b();
        }

        @Override // androidx.lifecycle.LiveData
        public final void h() {
            this.f13325n.f14046c = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public final void i(b0<? super D> b0Var) {
            super.i(b0Var);
            this.f13326o = null;
            this.f13327p = null;
        }

        @Override // androidx.lifecycle.a0, androidx.lifecycle.LiveData
        public final void j(D d10) {
            super.j(d10);
            f2.b<D> bVar = this.f13328q;
            if (bVar != null) {
                bVar.f14048e = true;
                bVar.f14046c = false;
                bVar.f14047d = false;
                bVar.f14049f = false;
                this.f13328q = null;
            }
        }

        public final void l() {
            u uVar = this.f13326o;
            C0235b<D> c0235b = this.f13327p;
            if (uVar == null || c0235b == null) {
                return;
            }
            super.i(c0235b);
            e(uVar, c0235b);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f13323l);
            sb2.append(" : ");
            tb.a.d(this.f13325n, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* renamed from: e2.b$b */
    /* loaded from: classes.dex */
    public static class C0235b<D> implements b0<D> {

        /* renamed from: a */
        public final a.InterfaceC0234a<D> f13329a;

        /* renamed from: b */
        public boolean f13330b = false;

        public C0235b(f2.b bVar, e8.u uVar) {
            this.f13329a = uVar;
        }

        @Override // androidx.lifecycle.b0
        public final void a(D d10) {
            e8.u uVar = (e8.u) this.f13329a;
            uVar.getClass();
            Void r42 = (Void) d10;
            SignInHubActivity signInHubActivity = uVar.f13504a;
            signInHubActivity.setResult(signInHubActivity.f6041w, signInHubActivity.f6042x);
            uVar.f13504a.finish();
            this.f13330b = true;
        }

        public final String toString() {
            return this.f13329a.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends s0 {

        /* renamed from: f */
        public static final a f13331f = new a();

        /* renamed from: d */
        public i<a> f13332d = new i<>();

        /* renamed from: e */
        public boolean f13333e = false;

        /* loaded from: classes.dex */
        public static class a implements v0.b {
            @Override // androidx.lifecycle.v0.b
            public final s0 a(Class cls, d2.c cVar) {
                return b(cls);
            }

            @Override // androidx.lifecycle.v0.b
            public final <T extends s0> T b(Class<T> cls) {
                return new c();
            }
        }

        @Override // androidx.lifecycle.s0
        public final void c() {
            int f10 = this.f13332d.f();
            for (int i10 = 0; i10 < f10; i10++) {
                a g10 = this.f13332d.g(i10);
                g10.f13325n.a();
                g10.f13325n.f14047d = true;
                C0235b<D> c0235b = g10.f13327p;
                if (c0235b != 0) {
                    g10.i(c0235b);
                    if (c0235b.f13330b) {
                        c0235b.f13329a.getClass();
                    }
                }
                f2.b<D> bVar = g10.f13325n;
                Object obj = bVar.f14045b;
                if (obj != null) {
                    if (obj == g10) {
                        bVar.f14045b = null;
                        bVar.f14048e = true;
                        bVar.f14046c = false;
                        bVar.f14047d = false;
                        bVar.f14049f = false;
                    } else {
                        throw new IllegalArgumentException("Attempting to unregister the wrong listener");
                    }
                } else {
                    throw new IllegalStateException("No listener register");
                }
            }
            i<a> iVar = this.f13332d;
            int i11 = iVar.f22557d;
            Object[] objArr = iVar.f22556c;
            for (int i12 = 0; i12 < i11; i12++) {
                objArr[i12] = null;
            }
            iVar.f22557d = 0;
            iVar.f22554a = false;
        }
    }

    public b(u uVar, x0 x0Var) {
        this.f13321a = uVar;
        this.f13322b = (c) new v0(x0Var, c.f13331f).a(c.class);
    }

    @Deprecated
    public final void b(String str, PrintWriter printWriter) {
        boolean z10;
        c cVar = this.f13322b;
        if (cVar.f13332d.f() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i10 = 0; i10 < cVar.f13332d.f(); i10++) {
                a g10 = cVar.f13332d.g(i10);
                printWriter.print(str);
                printWriter.print("  #");
                i<a> iVar = cVar.f13332d;
                if (iVar.f22554a) {
                    iVar.c();
                }
                printWriter.print(iVar.f22555b[i10]);
                printWriter.print(": ");
                printWriter.println(g10.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(g10.f13323l);
                printWriter.print(" mArgs=");
                printWriter.println(g10.f13324m);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(g10.f13325n);
                Object obj = g10.f13325n;
                String b10 = a.b.b(str2, "  ");
                f2.a aVar = (f2.a) obj;
                aVar.getClass();
                printWriter.print(b10);
                printWriter.print("mId=");
                printWriter.print(aVar.f14044a);
                printWriter.print(" mListener=");
                printWriter.println(aVar.f14045b);
                if (aVar.f14046c || aVar.f14049f) {
                    printWriter.print(b10);
                    printWriter.print("mStarted=");
                    printWriter.print(aVar.f14046c);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(aVar.f14049f);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (aVar.f14047d || aVar.f14048e) {
                    printWriter.print(b10);
                    printWriter.print("mAbandoned=");
                    printWriter.print(aVar.f14047d);
                    printWriter.print(" mReset=");
                    printWriter.println(aVar.f14048e);
                }
                if (aVar.f14040h != null) {
                    printWriter.print(b10);
                    printWriter.print("mTask=");
                    printWriter.print(aVar.f14040h);
                    printWriter.print(" waiting=");
                    aVar.f14040h.getClass();
                    printWriter.println(false);
                }
                if (aVar.f14041i != null) {
                    printWriter.print(b10);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(aVar.f14041i);
                    printWriter.print(" waiting=");
                    aVar.f14041i.getClass();
                    printWriter.println(false);
                }
                if (g10.f13327p != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(g10.f13327p);
                    C0235b<D> c0235b = g10.f13327p;
                    c0235b.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(c0235b.f13330b);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                Object obj2 = g10.f13325n;
                D d10 = g10.d();
                obj2.getClass();
                StringBuilder sb2 = new StringBuilder(64);
                tb.a.d(d10, sb2);
                sb2.append("}");
                printWriter.println(sb2.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                if (g10.f2640c > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                printWriter.println(z10);
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        tb.a.d(this.f13321a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
