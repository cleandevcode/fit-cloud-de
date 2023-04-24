package ui;

import android.util.Log;
import gm.j;
import java.nio.charset.StandardCharsets;
import p000do.a;
import wi.d;

/* loaded from: classes2.dex */
public final class c implements c4.c {

    /* renamed from: a */
    public final /* synthetic */ b f28836a;

    public c(b bVar) {
        this.f28836a = bVar;
    }

    @Override // c4.c
    public final void a() {
        a.b bVar = p000do.a.f13275a;
        bVar.t("AliAgent");
        bVar.h("checkFgsState success", new Object[0]);
        if (this.f28836a.f28824a.f() == d.CONNECTED) {
            bVar.t("AliAgent");
            bVar.h("connectLp start", new Object[0]);
            t3.a aVar = this.f28836a.f28825b;
            aVar.getClass();
            byte[] bArr = {1, 13, 0, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51};
            t3.a.f27524f = String.valueOf(System.currentTimeMillis());
            StringBuilder a10 = android.support.v4.media.d.a("get timestamp:");
            a10.append(t3.a.f27524f);
            Log.w("AliAgentImpl", a10.toString());
            byte[] bytes = t3.a.f27524f.getBytes(StandardCharsets.UTF_8);
            for (int i10 = 0; i10 < 13; i10++) {
                bArr[i10 + 3] = bytes[i10];
            }
            byte[] c10 = x3.b.c("FND", x3.a.a(bArr));
            StringBuilder a11 = android.support.v4.media.d.a("connectLp ==> ");
            a11.append(aVar.f27526b);
            j.e("AliAgentImpl", a11.toString());
            b4.a aVar2 = aVar.f27526b;
            if (aVar2 != null) {
                aVar2.b(c10, new s0.j());
            }
        }
    }

    @Override // c4.c
    public final void b(int i10, String str) {
        a.b bVar = p000do.a.f13275a;
        bVar.t("AliAgent");
        bVar.h("checkFgsState fail " + str + "->" + i10, new Object[0]);
    }
}
