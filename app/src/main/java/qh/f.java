package qh;

import android.view.View;
import fm.l;
import gm.m;
import java.util.List;
import qh.a;

/* loaded from: classes2.dex */
public final class f extends m implements l<View, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ a.C0450a f24827b;

    /* renamed from: c */
    public final /* synthetic */ g f24828c;

    /* renamed from: d */
    public final /* synthetic */ List<vf.k> f24829d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a.C0450a c0450a, g gVar, List<vf.k> list) {
        super(1);
        this.f24827b = c0450a;
        this.f24828c = gVar;
        this.f24829d = list;
    }

    @Override // fm.l
    public final tl.l k(View view) {
        mh.a<T> aVar;
        gm.l.f(view, "it");
        int d10 = this.f24827b.d();
        if (d10 != -1 && (aVar = this.f24828c.f24819f) != 0) {
            aVar.a(this.f24829d.get(d10));
        }
        return tl.l.f28297a;
    }
}
