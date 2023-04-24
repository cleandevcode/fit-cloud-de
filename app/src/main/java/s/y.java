package s;

import androidx.camera.core.h;
import androidx.camera.core.k;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f26242a;

    /* renamed from: b */
    public final /* synthetic */ Object f26243b;

    /* renamed from: c */
    public final /* synthetic */ Object f26244c;

    /* renamed from: d */
    public final /* synthetic */ Object f26245d;

    /* renamed from: e */
    public final /* synthetic */ Object f26246e;

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f26242a = i10;
        this.f26243b = obj;
        this.f26244c = obj2;
        this.f26245d = obj3;
        this.f26246e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 0;
        switch (this.f26242a) {
            case 0:
                a0 a0Var = (a0) this.f26243b;
                n1 n1Var = (n1) this.f26244c;
                a0.m0 m0Var = (a0.m0) this.f26245d;
                a0Var.f25885q.remove(n1Var);
                na.a y10 = a0Var.y(n1Var);
                m0Var.a();
                new d0.m(new ArrayList(Arrays.asList(y10, m0Var.d())), false, o8.b.i()).a((Runnable) this.f26246e, o8.b.i());
                return;
            default:
                k.b bVar = (k.b) this.f26244c;
                String str = (String) this.f26245d;
                Throwable th2 = (Throwable) this.f26246e;
                h.c cVar = (h.c) ((androidx.camera.core.k) this.f26243b).f1713f;
                if (bVar == k.b.FILE_IO_FAILED) {
                    i10 = 1;
                }
                cVar.f1670a.b(new y.n0(i10, str, th2));
                return;
        }
    }
}
