package s;

import a0.f2;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import t.g;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f26223a;

    /* renamed from: b */
    public final /* synthetic */ Object f26224b;

    /* renamed from: c */
    public final /* synthetic */ Object f26225c;

    /* renamed from: d */
    public final /* synthetic */ Object f26226d;

    /* renamed from: e */
    public final /* synthetic */ Object f26227e;

    public /* synthetic */ w(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f26223a = i10;
        this.f26224b = obj;
        this.f26225c = obj2;
        this.f26226d = obj3;
        this.f26227e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26223a) {
            case 0:
                a0 a0Var = (a0) this.f26224b;
                String str = (String) this.f26225c;
                a0.u1 u1Var = (a0.u1) this.f26226d;
                a0.h2<?> h2Var = (a0.h2) this.f26227e;
                a0Var.getClass();
                a0Var.q("Use case " + str + " ACTIVE", null);
                a0.f2 f2Var = a0Var.f25869a;
                f2.a aVar = (f2.a) f2Var.f58b.get(str);
                if (aVar == null) {
                    aVar = new f2.a(u1Var, h2Var);
                    f2Var.f58b.put(str, aVar);
                }
                aVar.f62d = true;
                a0Var.f25869a.e(str, u1Var, h2Var);
                a0Var.H();
                return;
            case 1:
                a0 a0Var2 = (a0) this.f26224b;
                String str2 = (String) this.f26225c;
                a0Var2.getClass();
                a0Var2.q("Use case " + str2 + " RESET", null);
                a0Var2.f25869a.e(str2, (a0.u1) this.f26226d, (a0.h2) this.f26227e);
                a0Var2.A();
                a0Var2.H();
                if (a0Var2.f25873e == 4) {
                    a0Var2.x();
                    return;
                }
                return;
            default:
                ((g.b) this.f26224b).f27413a.onCaptureProgressed((CameraCaptureSession) this.f26225c, (CaptureRequest) this.f26226d, (CaptureResult) this.f26227e);
                return;
        }
    }
}
