package o5;

import java.util.Arrays;
import java.util.Locale;
import n6.h;
import o5.y;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements y.b {

    /* renamed from: a */
    public final /* synthetic */ int f22878a;

    /* renamed from: b */
    public final /* synthetic */ Object f22879b;

    public /* synthetic */ z(int i10, Object obj) {
        this.f22878a = i10;
        this.f22879b = obj;
    }

    @Override // o5.y.b
    public final void b(e0 e0Var) {
        switch (this.f22878a) {
            case 0:
                y.d dVar = (y.d) this.f22879b;
                if (dVar != null) {
                    dVar.a();
                    return;
                }
                return;
            default:
                n6.h hVar = (n6.h) this.f22879b;
                int i10 = n6.h.M0;
                gm.l.f(hVar, "this$0");
                if (!hVar.J0) {
                    s sVar = e0Var.f22704c;
                    if (sVar != null) {
                        p pVar = sVar.f22830i;
                        if (pVar == null) {
                            pVar = new p();
                        }
                        hVar.m1(pVar);
                        return;
                    }
                    JSONObject jSONObject = e0Var.f22703b;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    h.c cVar = new h.c();
                    try {
                        String string = jSONObject.getString("user_code");
                        cVar.f22087b = string;
                        String format = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{string}, 1));
                        gm.l.e(format, "java.lang.String.format(locale, format, *args)");
                        cVar.f22086a = format;
                        cVar.f22088c = jSONObject.getString("code");
                        cVar.f22089d = jSONObject.getLong("interval");
                        hVar.q1(cVar);
                        return;
                    } catch (JSONException e10) {
                        hVar.m1(new p(e10));
                        return;
                    }
                }
                return;
        }
    }
}
