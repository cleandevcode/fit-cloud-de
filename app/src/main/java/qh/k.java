package qh;

import android.view.View;
import fm.l;
import gm.m;
import java.util.List;
import qh.j;
import vf.r;

/* loaded from: classes2.dex */
public final class k extends m implements l<View, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ j.a f24838b;

    /* renamed from: c */
    public final /* synthetic */ j f24839c;

    /* renamed from: d */
    public final /* synthetic */ List<r> f24840d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j.a aVar, j jVar, List<r> list) {
        super(1);
        this.f24838b = aVar;
        this.f24839c = jVar;
        this.f24840d = list;
    }

    @Override // fm.l
    public final tl.l k(View view) {
        mh.a<r> aVar;
        gm.l.f(view, "it");
        int d10 = this.f24838b.d();
        if (d10 != -1 && (aVar = this.f24839c.f24836g) != null) {
            aVar.a(this.f24840d.get(d10));
        }
        return tl.l.f28297a;
    }
}
