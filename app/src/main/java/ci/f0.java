package ci;

import android.widget.ImageView;
import ci.e0;
import java.util.List;

/* loaded from: classes2.dex */
public final class f0 extends gm.m implements fm.l<ImageView, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ e0.a f4758b;

    /* renamed from: c */
    public final /* synthetic */ e0 f4759c;

    /* renamed from: d */
    public final /* synthetic */ List<xc.a> f4760d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f0(e0.a aVar, e0 e0Var, List<? extends xc.a> list) {
        super(1);
        this.f4758b = aVar;
        this.f4759c = e0Var;
        this.f4760d = list;
    }

    @Override // fm.l
    public final tl.l k(ImageView imageView) {
        mh.b<xc.a> bVar;
        gm.l.f(imageView, "it");
        int d10 = this.f4758b.d();
        if (d10 != -1 && (bVar = this.f4759c.f4754e) != null) {
            bVar.b(d10, this.f4760d.get(d10));
        }
        return tl.l.f28297a;
    }
}
