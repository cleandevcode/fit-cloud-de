package dj;

import android.util.SparseArray;
import dj.f;
import fm.l;
import gm.m;
import p000do.a;

/* loaded from: classes2.dex */
public final class i extends m implements l<uc.e, f.b> {

    /* renamed from: b */
    public static final i f13122b = new i();

    public i() {
        super(1);
    }

    @Override // fm.l
    public final f.b k(uc.e eVar) {
        int i10;
        boolean z10;
        uc.e eVar2 = eVar;
        SparseArray<byte[]> c10 = eVar2.f28672e.c();
        if (c10 != null) {
            if (c10.size() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                c10 = null;
            }
            if (c10 != null) {
                i10 = c10.keyAt(0);
                String name = eVar2.f28668a.getName();
                a.b bVar = p000do.a.f13275a;
                bVar.t("Fc#Scanner");
                bVar.h("Found device address:%s name:%s companyId：%#x", eVar2.f28668a.c(), name, Integer.valueOf(i10));
                return new f.b(eVar2, name, i10);
            }
        }
        i10 = 0;
        String name2 = eVar2.f28668a.getName();
        a.b bVar2 = p000do.a.f13275a;
        bVar2.t("Fc#Scanner");
        bVar2.h("Found device address:%s name:%s companyId：%#x", eVar2.f28668a.c(), name2, Integer.valueOf(i10));
        return new f.b(eVar2, name2, i10);
    }
}
