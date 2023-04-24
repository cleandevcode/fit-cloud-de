package gj;

import cn.sharesdk.framework.InnerShareParams;
import fl.g;
import gm.l;
import java.io.File;
import java.util.concurrent.TimeUnit;
import zm.u;
import zm.w;

/* loaded from: classes2.dex */
public final class f extends c {

    /* renamed from: c */
    public final u f15372c;

    public f(File file) {
        super(file);
        boolean z10;
        p000do.a.f13275a.h("Init OkHttpDownloader", new Object[0]);
        u.a aVar = new u.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        l.f(timeUnit, "unit");
        byte[] bArr = an.c.f635a;
        long millis = timeUnit.toMillis(30000L);
        if (millis <= Integer.MAX_VALUE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (millis != 0) {
                aVar.f32739r = (int) millis;
                this.f15372c = new u(aVar);
                return;
            }
            throw new IllegalArgumentException("timeout too small.".toString());
        }
        throw new IllegalArgumentException("timeout too large.".toString());
    }

    @Override // gj.c
    public final void a(g.a aVar, File file, final String str) {
        l.f(str, InnerShareParams.URL);
        u uVar = this.f15372c;
        w.a aVar2 = new w.a();
        aVar2.e(str);
        w a10 = aVar2.a();
        uVar.getClass();
        final dn.e eVar = new dn.e(uVar, a10, false);
        aVar.e(new wk.c() { // from class: gj.d
            @Override // wk.c
            public final void cancel() {
                String str2 = str;
                zm.d dVar = eVar;
                l.f(str2, "$url");
                l.f(dVar, "$call");
                p000do.a.f13275a.h(a.b.b("cancel download:", str2), new Object[0]);
                dVar.cancel();
            }
        });
        eVar.s(new e(aVar, this, file));
    }
}
