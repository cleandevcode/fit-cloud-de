package h8;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class b1 extends i0 {

    /* renamed from: b */
    public final o f15904b;

    /* renamed from: c */
    public final g9.h f15905c;

    /* renamed from: d */
    public final w.o f15906d;

    public b1(int i10, w0 w0Var, g9.h hVar, w.o oVar) {
        super(i10);
        this.f15905c = hVar;
        this.f15904b = w0Var;
        this.f15906d = oVar;
        if (i10 == 2 && w0Var.f16001b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // h8.d1
    public final void a(Status status) {
        g9.h hVar = this.f15905c;
        this.f15906d.getClass();
        hVar.b(s.h1.n(status));
    }

    @Override // h8.d1
    public final void b(RuntimeException runtimeException) {
        this.f15905c.b(runtimeException);
    }

    @Override // h8.d1
    public final void c(c0 c0Var) {
        try {
            o oVar = this.f15904b;
            ((w0) oVar).f16036d.f16003a.a(c0Var.f15908b, this.f15905c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(d1.e(e11));
        } catch (RuntimeException e12) {
            this.f15905c.b(e12);
        }
    }

    @Override // h8.d1
    public final void d(s sVar, boolean z10) {
        g9.h hVar = this.f15905c;
        sVar.f16019b.put(hVar, Boolean.valueOf(z10));
        g9.t tVar = hVar.f15034a;
        r rVar = new r(sVar, hVar);
        tVar.getClass();
        tVar.f15058b.a(new g9.m(g9.i.f15035a, rVar));
        tVar.e();
    }

    @Override // h8.i0
    public final boolean f(c0 c0Var) {
        return this.f15904b.f16001b;
    }

    @Override // h8.i0
    public final f8.c[] g(c0 c0Var) {
        return this.f15904b.f16000a;
    }
}
