package fi;

import android.widget.Button;
import com.topstep.fitcloud.pro.model.friend.FriendMsg;
import fi.c;
import fm.l;
import gm.m;
import java.util.List;

/* loaded from: classes2.dex */
public final class d extends m implements l<Button, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ c.a f14288b;

    /* renamed from: c */
    public final /* synthetic */ c f14289c;

    /* renamed from: d */
    public final /* synthetic */ List<FriendMsg> f14290d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c.a aVar, c cVar, List<FriendMsg> list) {
        super(1);
        this.f14288b = aVar;
        this.f14289c = cVar;
        this.f14290d = list;
    }

    @Override // fm.l
    public final tl.l k(Button button) {
        c.b bVar;
        gm.l.f(button, "it");
        int d10 = this.f14288b.d();
        if (d10 != -1 && (bVar = this.f14289c.f14286f) != null) {
            bVar.a(d10, this.f14290d.get(d10));
        }
        return tl.l.f28297a;
    }
}
