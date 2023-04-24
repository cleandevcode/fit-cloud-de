package fi;

import android.view.View;
import com.topstep.fitcloud.pro.model.friend.Friend;
import fi.a;
import fm.l;
import gm.m;
import java.util.List;

/* loaded from: classes2.dex */
public final class b extends m implements l<View, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ a.C0254a f14281b;

    /* renamed from: c */
    public final /* synthetic */ a f14282c;

    /* renamed from: d */
    public final /* synthetic */ List<Friend> f14283d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a.C0254a c0254a, a aVar, List<Friend> list) {
        super(1);
        this.f14281b = c0254a;
        this.f14282c = aVar;
        this.f14283d = list;
    }

    @Override // fm.l
    public final tl.l k(View view) {
        a.b bVar;
        gm.l.f(view, "it");
        int d10 = this.f14281b.d();
        if (d10 != -1 && (bVar = this.f14282c.f14279f) != null) {
            bVar.a(this.f14283d.get(d10));
        }
        return tl.l.f28297a;
    }
}
