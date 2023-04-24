package xh;

import android.widget.ImageView;
import com.topstep.fitcloud.pro.model.dial.DialSpacePacket;
import java.util.List;
import xh.c;

/* loaded from: classes2.dex */
public final class e extends gm.m implements fm.l<ImageView, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ c.a f30557b;

    /* renamed from: c */
    public final /* synthetic */ c f30558c;

    /* renamed from: d */
    public final /* synthetic */ List<DialSpacePacket> f30559d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c.a aVar, c cVar, List<DialSpacePacket> list) {
        super(1);
        this.f30557b = aVar;
        this.f30558c = cVar;
        this.f30559d = list;
    }

    @Override // fm.l
    public final tl.l k(ImageView imageView) {
        c.b bVar;
        gm.l.f(imageView, "it");
        int d10 = this.f30557b.d();
        if (d10 != -1 && (bVar = this.f30558c.f30551f) != null) {
            bVar.a(d10, this.f30559d.get(d10));
        }
        return tl.l.f28297a;
    }
}
