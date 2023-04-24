package s;

import a0.h0;
import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import x.e;

/* loaded from: classes.dex */
public class h0 implements h0.b {

    /* renamed from: a */
    public static final h0 f25976a = new h0();

    @Override // a0.h0.b
    public void a(a0.w0 w0Var, h0.a aVar) {
        a0.h0 B = w0Var.B();
        a0.l0 l0Var = a0.n1.A;
        a0.d dVar = a0.h0.f80h;
        HashSet hashSet = new HashSet();
        a0.j1 B2 = a0.j1.B();
        ArrayList arrayList = new ArrayList();
        a0.k1 c10 = a0.k1.c();
        ArrayList arrayList2 = new ArrayList(hashSet);
        a0.n1 A = a0.n1.A(B2);
        a0.d2 d2Var = a0.d2.f45b;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : c10.b()) {
            arrayMap.put(str, c10.a(str));
        }
        a0.d2 d2Var2 = new a0.d2(arrayMap);
        int i10 = -1;
        new a0.h0(arrayList2, A, -1, arrayList, false, d2Var2, null);
        if (B != null) {
            i10 = B.f84c;
            aVar.a(B.f85d);
            l0Var = B.f83b;
        }
        aVar.f90b = a0.j1.C(l0Var);
        aVar.f91c = ((Integer) w0Var.e(r.a.f25143z, Integer.valueOf(i10))).intValue();
        aVar.b(new j1((CameraCaptureSession.CaptureCallback) w0Var.e(r.a.D, new g0())));
        aVar.c(e.a.d(w0Var).a());
    }
}
