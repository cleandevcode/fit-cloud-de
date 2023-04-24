package i2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class p extends gm.m implements fm.l<j, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ gm.x f16371b;

    /* renamed from: c */
    public final /* synthetic */ List<j> f16372c;

    /* renamed from: d */
    public final /* synthetic */ gm.z f16373d;

    /* renamed from: e */
    public final /* synthetic */ m f16374e;

    /* renamed from: f */
    public final /* synthetic */ Bundle f16375f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(gm.x xVar, ArrayList arrayList, gm.z zVar, m mVar, Bundle bundle) {
        super(1);
        this.f16371b = xVar;
        this.f16372c = arrayList;
        this.f16373d = zVar;
        this.f16374e = mVar;
        this.f16375f = bundle;
    }

    @Override // fm.l
    public final tl.l k(j jVar) {
        List<j> list;
        j jVar2 = jVar;
        gm.l.f(jVar2, "entry");
        this.f16371b.f15506a = true;
        int indexOf = this.f16372c.indexOf(jVar2);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            list = this.f16372c.subList(this.f16373d.f15508a, i10);
            this.f16373d.f15508a = i10;
        } else {
            list = ul.s.f28879a;
        }
        this.f16374e.a(jVar2.f16294b, this.f16375f, jVar2, list);
        return tl.l.f28297a;
    }
}
