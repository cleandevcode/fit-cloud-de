package rh;

import android.view.View;
import com.topstep.fitcloud.pro.model.data.SimpleEcgRecord;
import java.util.List;
import qh.a;

/* loaded from: classes2.dex */
public final class a extends gm.m implements fm.l<View, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ a.C0450a f25664b;

    /* renamed from: c */
    public final /* synthetic */ b f25665c;

    /* renamed from: d */
    public final /* synthetic */ List<SimpleEcgRecord> f25666d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a.C0450a c0450a, b bVar, List<SimpleEcgRecord> list) {
        super(1);
        this.f25664b = c0450a;
        this.f25665c = bVar;
        this.f25666d = list;
    }

    @Override // fm.l
    public final tl.l k(View view) {
        mh.a<T> aVar;
        gm.l.f(view, "it");
        int d10 = this.f25664b.d();
        if (d10 != -1 && (aVar = this.f25665c.f24819f) != 0) {
            aVar.a(this.f25666d.get(d10));
        }
        return tl.l.f28297a;
    }
}
