package fi;

import android.widget.Button;
import com.topstep.fitcloud.pro.model.friend.FriendMsg;
import fi.c;
import fm.l;
import gm.m;
import java.util.List;

/* loaded from: classes2.dex */
public final class e extends m implements l<Button, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ c.a f14291b;

    /* renamed from: c */
    public final /* synthetic */ c f14292c;

    /* renamed from: d */
    public final /* synthetic */ List<FriendMsg> f14293d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c.a aVar, c cVar, List<FriendMsg> list) {
        super(1);
        this.f14291b = aVar;
        this.f14292c = cVar;
        this.f14293d = list;
    }

    @Override // fm.l
    public final tl.l k(Button button) {
        c.b bVar;
        gm.l.f(button, "it");
        int d10 = this.f14291b.d();
        if (d10 != -1 && (bVar = this.f14292c.f14286f) != null) {
            bVar.b(d10, this.f14293d.get(d10));
        }
        return tl.l.f28297a;
    }
}
