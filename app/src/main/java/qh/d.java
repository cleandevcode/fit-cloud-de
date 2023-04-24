package qh;

import android.view.View;
import fm.l;
import gm.m;
import java.util.List;
import qh.a;

/* loaded from: classes2.dex */
public final class d extends m implements l<View, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ a.C0450a f24824b;

    /* renamed from: c */
    public final /* synthetic */ e f24825c;

    /* renamed from: d */
    public final /* synthetic */ List<vf.f> f24826d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a.C0450a c0450a, e eVar, List<vf.f> list) {
        super(1);
        this.f24824b = c0450a;
        this.f24825c = eVar;
        this.f24826d = list;
    }

    @Override // fm.l
    public final tl.l k(View view) {
        mh.a<T> aVar;
        gm.l.f(view, "it");
        int d10 = this.f24824b.d();
        if (d10 != -1 && (aVar = this.f24825c.f24819f) != 0) {
            aVar.a(this.f24826d.get(d10));
        }
        return tl.l.f28297a;
    }
}
