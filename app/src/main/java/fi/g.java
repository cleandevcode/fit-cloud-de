package fi;

import android.view.View;
import com.topstep.fitcloud.pro.model.config.UserInfo;
import fi.f;
import fm.l;
import gm.m;
import java.util.List;

/* loaded from: classes2.dex */
public final class g extends m implements l<View, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ f.a f14297b;

    /* renamed from: c */
    public final /* synthetic */ f f14298c;

    /* renamed from: d */
    public final /* synthetic */ List<UserInfo> f14299d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f.a aVar, f fVar, List<UserInfo> list) {
        super(1);
        this.f14297b = aVar;
        this.f14298c = fVar;
        this.f14299d = list;
    }

    @Override // fm.l
    public final tl.l k(View view) {
        f.b bVar;
        gm.l.f(view, "it");
        int d10 = this.f14297b.d();
        if (d10 != -1 && (bVar = this.f14298c.f14295e) != null) {
            bVar.a(this.f14299d.get(d10));
        }
        return tl.l.f28297a;
    }
}
