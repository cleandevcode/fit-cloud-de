package tc;

import kc.m0;
import kc.o0;

/* loaded from: classes.dex */
public final class t implements wk.e<m0.b, tk.i<o0.a>> {

    /* renamed from: a */
    public final /* synthetic */ tk.i f28013a;

    public t(tk.i iVar) {
        this.f28013a = iVar;
    }

    @Override // wk.e
    public final tk.i<o0.a> apply(m0.b bVar) {
        return bVar != m0.b.f18353c ? tk.i.t(o0.a.BLUETOOTH_NOT_ENABLED) : this.f28013a.u(new s());
    }
}
