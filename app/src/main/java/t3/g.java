package t3;

import a.e;
import gm.j;
import hj.o;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public final /* synthetic */ c4.f f27563a;

    public g(e.a aVar) {
        this.f27563a = aVar;
    }

    public final void a(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("register success ==> productKey ");
        sb2.append(str);
        sb2.append(" deviceName ==> ");
        sb2.append(str2);
        sb2.append(" timeStamp ==> ");
        o.a(sb2, str4, " sonce ==> ", str5, " deviceSecret ==> ");
        sb2.append(str3);
        j.e("AliLpImpl", sb2.toString());
        o8.b.f22884c = str2;
        o8.b.f22885d = str3;
        o8.b.f22886e = str;
        o8.b.f22887f = str4;
        o8.b.f22888g = str5;
        a.f27524f = str4;
        c4.f fVar = this.f27563a;
        if (fVar != null) {
            e.a aVar = (e.a) fVar;
            try {
                aVar.f5a.b(o8.b.m(str2, str3, str, str4, str5), new a.d(aVar));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }
}
