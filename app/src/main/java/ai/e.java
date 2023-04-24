package ai;

import ai.d;
import android.view.View;
import com.topstep.fitcloud.pro.model.game.push.GamePacket;
import java.util.List;

/* loaded from: classes2.dex */
public final class e extends gm.m implements fm.l<View, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ d.a f539b;

    /* renamed from: c */
    public final /* synthetic */ d f540c;

    /* renamed from: d */
    public final /* synthetic */ List<GamePacket> f541d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d.a aVar, d dVar, List<GamePacket> list) {
        super(1);
        this.f539b = aVar;
        this.f540c = dVar;
        this.f541d = list;
    }

    @Override // fm.l
    public final tl.l k(View view) {
        d.b bVar;
        gm.l.f(view, "it");
        int d10 = this.f539b.d();
        if (d10 != -1 && (bVar = this.f540c.f536d) != null) {
            bVar.a(this.f541d.get(d10));
        }
        return tl.l.f28297a;
    }
}
