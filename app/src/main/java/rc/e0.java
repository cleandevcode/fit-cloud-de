package rc;

import com.polidea.rxandroidble3.internal.RxBleLog;
import java.util.concurrent.TimeUnit;
import tc.j0;
import tc.l0;

/* loaded from: classes.dex */
public final class e0 implements d0 {

    /* renamed from: a */
    public final l0 f25465a;

    /* renamed from: b */
    public final h f25466b;

    /* renamed from: c */
    public final y f25467c;

    /* loaded from: classes.dex */
    public class a implements tk.m<q, q> {

        /* renamed from: a */
        public final /* synthetic */ tk.m f25468a;

        /* renamed from: b */
        public final /* synthetic */ tk.m f25469b;

        public a(tk.m mVar, tk.m mVar2) {
            this.f25468a = mVar;
            this.f25469b = mVar2;
        }

        @Override // tk.m
        public final tk.i a(tk.i iVar) {
            return iVar.c(this.f25468a).c(this.f25469b);
        }
    }

    public e0(l0 l0Var, h hVar, y yVar) {
        this.f25465a = l0Var;
        this.f25466b = hVar;
        this.f25467c = yVar;
    }

    @Override // rc.d0
    public final d6.b0 a(uc.f fVar, uc.c... cVarArr) {
        z zVar;
        tk.m mVar;
        y yVar = this.f25467c;
        int i10 = fVar.f28674a;
        yVar.getClass();
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1) {
                    mVar = j0.f27986a;
                    return new d6.b0(new qc.h0(this.f25465a, this.f25466b, new g(cVarArr)), new a(mVar, this.f25467c.a(fVar.f28675b)));
                }
                zVar = new z(yVar, 2500, Math.max(TimeUnit.SECONDS.toMillis(5L) - 2500, 0L));
                mVar = zVar;
                return new d6.b0(new qc.h0(this.f25465a, this.f25466b, new g(cVarArr)), new a(mVar, this.f25467c.a(fVar.f28675b)));
            }
        } else {
            RxBleLog.w("Cannot emulate opportunistic scan mode since it is OS dependent - fallthrough to low power", new Object[0]);
        }
        zVar = new z(yVar, 500, Math.max(TimeUnit.SECONDS.toMillis(5L) - 500, 0L));
        mVar = zVar;
        return new d6.b0(new qc.h0(this.f25465a, this.f25466b, new g(cVarArr)), new a(mVar, this.f25467c.a(fVar.f28675b)));
    }
}
