package z6;

import android.view.View;
import gm.m;
import z6.c;

/* loaded from: classes.dex */
public final class b extends m implements fm.a<d> {

    /* renamed from: b */
    public final /* synthetic */ a<View> f31983b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar) {
        super(0);
        this.f31983b = fVar;
    }

    @Override // fm.a
    public final d m() {
        c.a aVar = this.f31983b.f31975a;
        return new d(aVar.f31991g, aVar.f31992h, aVar.f31993i, aVar.f31994j);
    }
}
