package xh;

import android.view.View;
import xh.f;

/* loaded from: classes2.dex */
public final class g extends gm.m implements fm.l<View, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ f.b f30564b;

    /* renamed from: c */
    public final /* synthetic */ f f30565c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f.b bVar, f fVar) {
        super(1);
        this.f30564b = bVar;
        this.f30565c = fVar;
    }

    @Override // fm.l
    public final tl.l k(View view) {
        gm.l.f(view, "it");
        int d10 = this.f30564b.d();
        if (d10 != -1) {
            f fVar = this.f30565c;
            fVar.f30560d = d10;
            fVar.h();
            f.a aVar = this.f30565c.f30562f;
            if (aVar != null) {
                aVar.a(d10);
            }
        }
        return tl.l.f28297a;
    }
}
