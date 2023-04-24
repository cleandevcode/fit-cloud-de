package ai;

import ai.k;
import android.view.View;
import com.topstep.fitcloud.pro.model.game.push.GameSkin;
import java.util.List;

/* loaded from: classes2.dex */
public final class l extends gm.m implements fm.l<View, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ k.a f571b;

    /* renamed from: c */
    public final /* synthetic */ k f572c;

    /* renamed from: d */
    public final /* synthetic */ List<GameSkin> f573d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k.a aVar, k kVar, List<GameSkin> list) {
        super(1);
        this.f571b = aVar;
        this.f572c = kVar;
        this.f573d = list;
    }

    @Override // fm.l
    public final tl.l k(View view) {
        k.b bVar;
        gm.l.f(view, "it");
        int d10 = this.f571b.d();
        if (d10 != -1 && (bVar = this.f572c.f568d) != null) {
            bVar.a(this.f573d.get(d10));
        }
        return tl.l.f28297a;
    }
}
