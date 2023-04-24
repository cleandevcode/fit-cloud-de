package h8;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class x0 extends i0 {

    /* renamed from: b */
    public final g9.h f16038b;

    public x0(int i10, g9.h hVar) {
        super(i10);
        this.f16038b = hVar;
    }

    @Override // h8.d1
    public final void a(Status status) {
        this.f16038b.b(new g8.b(status));
    }

    @Override // h8.d1
    public final void b(RuntimeException runtimeException) {
        this.f16038b.b(runtimeException);
    }

    @Override // h8.d1
    public final void c(c0 c0Var) {
        try {
            h(c0Var);
        } catch (DeadObjectException e10) {
            a(d1.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(d1.e(e11));
        } catch (RuntimeException e12) {
            this.f16038b.b(e12);
        }
    }

    public abstract void h(c0 c0Var);
}
