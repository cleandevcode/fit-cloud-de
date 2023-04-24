package dn;

import androidx.fragment.app.a0;
import gm.m;
import java.security.cert.Certificate;
import java.util.List;
import zm.o;

/* loaded from: classes2.dex */
public final class g extends m implements fm.a<List<? extends Certificate>> {

    /* renamed from: b */
    public final /* synthetic */ zm.f f13238b;

    /* renamed from: c */
    public final /* synthetic */ o f13239c;

    /* renamed from: d */
    public final /* synthetic */ zm.a f13240d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(zm.f fVar, o oVar, zm.a aVar) {
        super(0);
        this.f13238b = fVar;
        this.f13239c = oVar;
        this.f13240d = aVar;
    }

    @Override // fm.a
    public final List<? extends Certificate> m() {
        a0 a0Var = this.f13238b.f32587b;
        gm.l.c(a0Var);
        return a0Var.r(this.f13240d.f32518a.f32661e, this.f13239c.a());
    }
}
