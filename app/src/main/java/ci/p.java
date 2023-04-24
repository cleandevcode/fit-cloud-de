package ci;

import android.view.View;
import ci.o;

/* loaded from: classes2.dex */
public final class p extends gm.m implements fm.l<View, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ o f4815b;

    /* renamed from: c */
    public final /* synthetic */ o.a f4816c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, o.a aVar) {
        super(1);
        this.f4815b = oVar;
        this.f4816c = aVar;
    }

    @Override // fm.l
    public final tl.l k(View view) {
        gm.l.f(view, "it");
        o.b bVar = this.f4815b.f4811e;
        if (bVar != null) {
            bVar.a(this.f4816c.d());
        }
        return tl.l.f28297a;
    }
}
