package h8;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import g8.a;

/* loaded from: classes.dex */
public final class z0 extends d1 {

    /* renamed from: b */
    public final com.google.android.gms.common.api.internal.a f16042b;

    public z0(e8.l lVar) {
        super(1);
        this.f16042b = lVar;
    }

    @Override // h8.d1
    public final void a(Status status) {
        try {
            this.f16042b.j(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // h8.d1
    public final void b(RuntimeException runtimeException) {
        try {
            this.f16042b.j(new Status(10, android.support.v4.media.a.a(runtimeException.getClass().getSimpleName(), ": ", runtimeException.getLocalizedMessage())));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // h8.d1
    public final void c(c0 c0Var) {
        try {
            com.google.android.gms.common.api.internal.a aVar = this.f16042b;
            a.e eVar = c0Var.f15908b;
            aVar.getClass();
            try {
                try {
                    aVar.i(eVar);
                } catch (DeadObjectException e10) {
                    aVar.j(new Status(1, 8, e10.getLocalizedMessage(), null, null));
                    throw e10;
                }
            } catch (RemoteException e11) {
                aVar.j(new Status(1, 8, e11.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e12) {
            b(e12);
        }
    }

    @Override // h8.d1
    public final void d(s sVar, boolean z10) {
        com.google.android.gms.common.api.internal.a aVar = this.f16042b;
        sVar.f16018a.put(aVar, Boolean.valueOf(z10));
        aVar.a(new q(sVar, aVar));
    }
}
