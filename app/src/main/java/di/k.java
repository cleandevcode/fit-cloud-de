package di;

import android.widget.TextView;
import di.j;

/* loaded from: classes2.dex */
public final class k extends gm.m implements fm.l<TextView, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ j.a f13078b;

    /* renamed from: c */
    public final /* synthetic */ j f13079c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j.a aVar, j jVar) {
        super(1);
        this.f13078b = aVar;
        this.f13079c = jVar;
    }

    @Override // fm.l
    public final tl.l k(TextView textView) {
        gm.l.f(textView, "it");
        int d10 = this.f13078b.d();
        if (d10 != -1) {
            j jVar = this.f13079c;
            if (jVar.f13074g != d10) {
                jVar.f13074g = d10;
                jVar.h();
                j jVar2 = this.f13079c;
                j.b bVar = jVar2.f13073f;
                if (bVar != null) {
                    bVar.a(jVar2.f13072e[jVar2.f13074g]);
                }
            }
        }
        return tl.l.f28297a;
    }
}
