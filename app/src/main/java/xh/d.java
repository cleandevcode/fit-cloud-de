package xh;

import android.widget.ImageView;
import com.topstep.fitcloud.pro.model.dial.DialSpacePacket;
import java.util.List;
import xh.c;

/* loaded from: classes2.dex */
public final class d extends gm.m implements fm.l<ImageView, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ c.a f30554b;

    /* renamed from: c */
    public final /* synthetic */ c f30555c;

    /* renamed from: d */
    public final /* synthetic */ List<DialSpacePacket> f30556d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c.a aVar, c cVar, List<DialSpacePacket> list) {
        super(1);
        this.f30554b = aVar;
        this.f30555c = cVar;
        this.f30556d = list;
    }

    @Override // fm.l
    public final tl.l k(ImageView imageView) {
        c.b bVar;
        gm.l.f(imageView, "it");
        int d10 = this.f30554b.d();
        if (d10 != -1 && (bVar = this.f30555c.f30551f) != null) {
            bVar.b(d10, this.f30556d.get(d10));
        }
        return tl.l.f28297a;
    }
}
