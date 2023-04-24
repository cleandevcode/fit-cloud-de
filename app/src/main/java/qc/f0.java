package qc;

import android.os.DeadObjectException;
import com.polidea.rxandroidble3.internal.RxBleLog;
import fl.g;

/* loaded from: classes.dex */
public abstract class f0<SCAN_RESULT_TYPE, SCAN_CALLBACK_TYPE> extends mc.i<SCAN_RESULT_TYPE> {

    /* renamed from: a */
    public final tc.l0 f24708a;

    public f0(tc.l0 l0Var) {
        this.f24708a = l0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mc.i
    public final void a(g.a aVar, w.d dVar) {
        Object d10 = d(aVar);
        try {
            aVar.e(new e0(this, d10));
            RxBleLog.i("Scan operation is requested to start.", new Object[0]);
            if (!e(this.f24708a, d10)) {
                aVar.f(new lc.n(0));
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // mc.i
    public final lc.g c(DeadObjectException deadObjectException) {
        return new lc.n(1, deadObjectException);
    }

    public abstract Object d(g.a aVar);

    public abstract boolean e(tc.l0 l0Var, SCAN_CALLBACK_TYPE scan_callback_type);

    public abstract void f(tc.l0 l0Var, SCAN_CALLBACK_TYPE scan_callback_type);
}
