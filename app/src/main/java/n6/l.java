package n6;

import android.os.Bundle;
import android.text.TextUtils;
import d6.m0;
import java.util.ArrayList;
import n6.p;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l implements m0.a {

    /* renamed from: a */
    public final /* synthetic */ Bundle f22097a;

    /* renamed from: b */
    public final /* synthetic */ k f22098b;

    /* renamed from: c */
    public final /* synthetic */ p.d f22099c;

    public l(Bundle bundle, k kVar, p.d dVar) {
        this.f22097a = bundle;
        this.f22098b = kVar;
        this.f22099c = dVar;
    }

    @Override // d6.m0.a
    public final void a(o5.p pVar) {
        String message;
        p e10 = this.f22098b.e();
        p.d dVar = this.f22098b.e().f22117g;
        if (pVar == null) {
            message = null;
        } else {
            message = pVar.getMessage();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("Caught exception");
        if (message != null) {
            arrayList.add(message);
        }
        e10.d(new p.e(dVar, p.e.a.ERROR, null, TextUtils.join(": ", arrayList), null));
    }

    @Override // d6.m0.a
    public final void b(JSONObject jSONObject) {
        String string;
        try {
            Bundle bundle = this.f22097a;
            if (jSONObject == null) {
                string = null;
            } else {
                string = jSONObject.getString("id");
            }
            bundle.putString("com.facebook.platform.extra.USER_ID", string);
            this.f22098b.p(this.f22097a, this.f22099c);
        } catch (JSONException e10) {
            p e11 = this.f22098b.e();
            p.d dVar = this.f22098b.e().f22117g;
            String message = e10.getMessage();
            ArrayList arrayList = new ArrayList();
            arrayList.add("Caught exception");
            if (message != null) {
                arrayList.add(message);
            }
            e11.d(new p.e(dVar, p.e.a.ERROR, null, TextUtils.join(": ", arrayList), null));
        }
    }
}
