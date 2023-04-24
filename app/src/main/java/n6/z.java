package n6;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import d6.i0;
import d6.m0;
import java.util.ArrayList;
import n6.p;
import n6.w;

/* loaded from: classes.dex */
public abstract class z extends w {

    /* renamed from: c */
    public final o5.g f22191c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Parcel parcel) {
        super(parcel);
        gm.l.f(parcel, "source");
        this.f22191c = o5.g.f22721b;
    }

    public z(p pVar) {
        super(pVar);
        this.f22191c = o5.g.f22721b;
    }

    @Override // n6.w
    public final boolean i(int i10, int i11, Intent intent) {
        p.e eVar;
        String string;
        String str;
        p.e eVar2;
        String string2;
        Object obj;
        p.e.a aVar = p.e.a.CANCEL;
        p.e.a aVar2 = p.e.a.ERROR;
        p.d dVar = e().f22117g;
        if (intent == null) {
            eVar = new p.e(dVar, aVar, null, "Operation canceled", null);
        } else {
            String str2 = null;
            if (i11 == 0) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    string = null;
                } else {
                    string = extras.getString("error");
                }
                if (string == null) {
                    if (extras == null) {
                        string = null;
                    } else {
                        string = extras.getString("error_type");
                    }
                }
                if (extras == null || (obj = extras.get("error_code")) == null) {
                    str = null;
                } else {
                    str = obj.toString();
                }
                int i12 = i0.f12694a;
                if (gm.l.a("CONNECTION_FAILURE", str)) {
                    if (extras == null) {
                        string2 = null;
                    } else {
                        string2 = extras.getString("error_message");
                    }
                    if (string2 == null) {
                        if (extras != null) {
                            str2 = extras.getString("error_description");
                        }
                    } else {
                        str2 = string2;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (string != null) {
                        arrayList.add(string);
                    }
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                    eVar2 = new p.e(dVar, aVar2, null, TextUtils.join(": ", arrayList), str);
                } else {
                    eVar2 = new p.e(dVar, aVar, null, string, null);
                }
                p(eVar2);
            } else if (i11 != -1) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("Unexpected resultCode from authorization.");
                eVar = new p.e(dVar, aVar2, null, TextUtils.join(": ", arrayList2), null);
            } else {
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add("Unexpected null from returned authorization data.");
                    p(new p.e(dVar, aVar2, null, TextUtils.join(": ", arrayList3), null));
                    return true;
                }
                String string3 = extras2.getString("error");
                if (string3 == null) {
                    string3 = extras2.getString("error_type");
                }
                Object obj2 = extras2.get("error_code");
                if (obj2 != null) {
                    str2 = obj2.toString();
                }
                String string4 = extras2.getString("error_message");
                if (string4 == null) {
                    string4 = extras2.getString("error_description");
                }
                String string5 = extras2.getString("e2e");
                if (!m0.A(string5)) {
                    h(string5);
                }
                if (string3 == null && str2 == null && string4 == null && dVar != null) {
                    if (extras2.containsKey("code") && !m0.A(extras2.getString("code"))) {
                        o5.v.c().execute(new s.k(this, dVar, extras2, 4));
                    } else {
                        s(extras2, dVar);
                    }
                } else {
                    r(dVar, string3, string4, str2);
                }
            }
            return true;
        }
        p(eVar);
        return true;
    }

    public final void p(p.e eVar) {
        if (eVar != null) {
            e().e(eVar);
        } else {
            e().j();
        }
    }

    public o5.g q() {
        return this.f22191c;
    }

    public final void r(p.d dVar, String str, String str2, String str3) {
        p.e eVar;
        if (str != null && gm.l.a(str, "logged_out")) {
            b.f22046i = true;
        } else {
            int i10 = i0.f12694a;
            if (!h7.a.q("service_disabled", "AndroidAuthKillSwitchException").contains(str)) {
                if (h7.a.q("access_denied", "OAuthAccessDeniedException").contains(str)) {
                    eVar = new p.e(dVar, p.e.a.CANCEL, null, null, null);
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (str != null) {
                        arrayList.add(str);
                    }
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                    eVar = new p.e(dVar, p.e.a.ERROR, null, TextUtils.join(": ", arrayList), str3);
                }
                p(eVar);
                return;
            }
        }
        p(null);
    }

    public final void s(Bundle bundle, p.d dVar) {
        try {
            p(new p.e(dVar, p.e.a.SUCCESS, w.a.b(dVar.f22124b, bundle, q(), dVar.f22126d), w.a.c(bundle, dVar.f22137o), null, null));
        } catch (o5.p e10) {
            String message = e10.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            p(new p.e(dVar, p.e.a.ERROR, null, TextUtils.join(": ", arrayList), null));
        }
    }
}
