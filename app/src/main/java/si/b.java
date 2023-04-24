package si;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import fm.l;
import gm.m;

/* loaded from: classes2.dex */
public final class b extends m implements l<View, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ a f27061b;

    /* renamed from: c */
    public final /* synthetic */ c f27062c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, c cVar) {
        super(1);
        this.f27061b = aVar;
        this.f27062c = cVar;
    }

    @Override // fm.l
    public final tl.l k(View view) {
        gm.l.f(view, "it");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(this.f27062c.f27065c.f27068c));
        this.f27061b.b1(intent);
        return tl.l.f28297a;
    }
}
