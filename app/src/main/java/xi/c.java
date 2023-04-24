package xi;

import fm.l;
import gm.m;
import p000do.a;

/* loaded from: classes2.dex */
public final class c extends m implements l<Boolean, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ d f30596b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(1);
        this.f30596b = dVar;
    }

    @Override // fm.l
    public final tl.l k(Boolean bool) {
        Boolean bool2 = bool;
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#EnvironmentHelper");
        bVar.h("adapterEnabled:%b", bool2);
        if (!bool2.booleanValue()) {
            this.f30596b.f30602f.clear();
        }
        return tl.l.f28297a;
    }
}
