package rc;

import fl.o0;
import fl.y0;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class z implements tk.m<q, q> {

    /* renamed from: a */
    public final /* synthetic */ int f25530a;

    /* renamed from: b */
    public final /* synthetic */ long f25531b;

    /* renamed from: c */
    public final /* synthetic */ y f25532c;

    /* loaded from: classes.dex */
    public class a implements wk.e<tk.i<Object>, tk.l<?>> {
        public a() {
            z.this = r1;
        }

        @Override // wk.e
        public final tk.l<?> apply(tk.i<Object> iVar) {
            z zVar = z.this;
            return iVar.h(zVar.f25531b, TimeUnit.MILLISECONDS, zVar.f25532c.f25517a);
        }
    }

    public z(y yVar, int i10, long j10) {
        this.f25532c = yVar;
        this.f25530a = i10;
        this.f25531b = j10;
    }

    @Override // tk.m
    public final tk.i a(tk.i iVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tk.o oVar = this.f25532c.f25517a;
        iVar.getClass();
        return new o0(new y0(iVar, tk.i.E(this.f25530a, timeUnit, oVar)), new a());
    }
}
