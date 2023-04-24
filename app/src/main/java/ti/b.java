package ti;

import fm.l;
import gm.m;

/* loaded from: classes2.dex */
public final class b extends m implements l<bj.b, Boolean> {

    /* renamed from: b */
    public final /* synthetic */ bj.b f28255b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(bj.b bVar) {
        super(1);
        this.f28255b = bVar;
    }

    @Override // fm.l
    public final Boolean k(bj.b bVar) {
        boolean z10;
        bj.b bVar2 = bVar;
        bj.b bVar3 = this.f28255b;
        bVar2.getClass();
        gm.l.f(bVar3, "other");
        if (bVar2.f4397a == bVar3.f4397a && bVar2.f4398b == bVar3.f4398b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
