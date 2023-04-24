package h8;

import com.google.android.gms.common.api.internal.BasePendingResult;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes.dex */
public final class g0 extends v {
    @NotOnlyInitialized

    /* renamed from: b */
    public final g8.c f15953b;

    public g0(g8.c cVar) {
        this.f15953b = cVar;
    }

    public final com.google.android.gms.common.api.internal.a a(e8.l lVar) {
        boolean z10;
        g8.c cVar = this.f15953b;
        cVar.getClass();
        if (!lVar.f6070i && !((Boolean) BasePendingResult.f6061j.get()).booleanValue()) {
            z10 = false;
        } else {
            z10 = true;
        }
        lVar.f6070i = z10;
        d dVar = cVar.f15026j;
        dVar.getClass();
        z0 z0Var = new z0(lVar);
        v8.j jVar = dVar.f15938n;
        jVar.sendMessage(jVar.obtainMessage(4, new n0(z0Var, dVar.f15933i.get(), cVar)));
        return lVar;
    }
}
