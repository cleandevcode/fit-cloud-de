package di;

import android.view.View;
import com.topstep.fitcloud.pro.model.sport.push.SportPacket;
import di.m;
import java.util.List;

/* loaded from: classes2.dex */
public final class n extends gm.m implements fm.l<View, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ m.a f13086b;

    /* renamed from: c */
    public final /* synthetic */ m f13087c;

    /* renamed from: d */
    public final /* synthetic */ List<SportPacket> f13088d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m.a aVar, m mVar, List<SportPacket> list) {
        super(1);
        this.f13086b = aVar;
        this.f13087c = mVar;
        this.f13088d = list;
    }

    @Override // fm.l
    public final tl.l k(View view) {
        m.b bVar;
        gm.l.f(view, "it");
        int d10 = this.f13086b.d();
        if (d10 != -1 && (bVar = this.f13087c.f13081e) != null) {
            bVar.a(this.f13088d.get(d10));
        }
        return tl.l.f28297a;
    }
}
