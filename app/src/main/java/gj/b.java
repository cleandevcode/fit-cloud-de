package gj;

import a0.m;
import fl.g;
import java.io.File;
import om.l;
import p000do.a;
import tk.k;

/* loaded from: classes2.dex */
public final class b implements k<g<File>> {

    /* renamed from: a */
    public final /* synthetic */ String f15361a;

    /* renamed from: b */
    public final /* synthetic */ String f15362b = null;

    /* renamed from: c */
    public final /* synthetic */ c f15363c;

    /* renamed from: d */
    public final /* synthetic */ boolean f15364d;

    public b(String str, c cVar, boolean z10) {
        this.f15361a = str;
        this.f15363c = cVar;
        this.f15364d = z10;
    }

    @Override // tk.k
    public final void a(g.a aVar) {
        String str;
        a.b bVar = p000do.a.f13275a;
        StringBuilder a10 = android.support.v4.media.d.a("start download:");
        a10.append(this.f15361a);
        a10.append(" md5:");
        a10.append(this.f15362b);
        boolean z10 = false;
        bVar.h(a10.toString(), new Object[0]);
        File file = this.f15363c.f15365a;
        if (file == null) {
            aVar.f(new a(0, 6, null, null));
        } else if (!file.exists() && !this.f15363c.f15365a.mkdirs()) {
            aVar.f(new a(2, 6, null, null));
        } else if (!m.b(this.f15363c.f15365a)) {
            aVar.f(new a(1, 6, null, null));
        } else {
            File file2 = this.f15363c.f15365a;
            String str2 = this.f15361a;
            String substring = str2.substring(l.k0(str2, "/", 6) + 1, str2.length());
            gm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int k02 = l.k0(substring, ".", 6);
            if (k02 != -1) {
                str = substring.substring(k02, substring.length());
                gm.l.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = "";
            }
            File file3 = new File(file2, m.d(str2) + str);
            if (!this.f15364d && file3.exists()) {
                String str3 = this.f15362b;
                if (((str3 == null || str3.length() == 0) ? true : true) && file3.length() > 131072) {
                    aVar.d(new g(100, file3));
                    aVar.b();
                    return;
                }
            }
            this.f15363c.a(aVar, file3, this.f15361a);
        }
    }
}
