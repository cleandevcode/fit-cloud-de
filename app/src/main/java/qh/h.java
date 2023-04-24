package qh;

import android.view.View;
import fm.l;
import gm.m;
import java.util.List;
import qh.a;

/* loaded from: classes2.dex */
public final class h extends m implements l<View, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ a.C0450a f24830b;

    /* renamed from: c */
    public final /* synthetic */ i f24831c;

    /* renamed from: d */
    public final /* synthetic */ List<vf.m> f24832d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a.C0450a c0450a, i iVar, List<vf.m> list) {
        super(1);
        this.f24830b = c0450a;
        this.f24831c = iVar;
        this.f24832d = list;
    }

    @Override // fm.l
    public final tl.l k(View view) {
        mh.a<T> aVar;
        gm.l.f(view, "it");
        int d10 = this.f24830b.d();
        if (d10 != -1 && (aVar = this.f24831c.f24819f) != 0) {
            aVar.a(this.f24832d.get(d10));
        }
        return tl.l.f28297a;
    }
}
