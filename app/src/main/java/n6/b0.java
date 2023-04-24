package n6;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import d6.m0;
import java.util.ArrayList;
import n6.p;
import n6.w;

/* loaded from: classes.dex */
public abstract class b0 extends w {

    /* renamed from: c */
    public String f22052c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Parcel parcel) {
        super(parcel);
        gm.l.f(parcel, "source");
    }

    public b0(p pVar) {
        super(pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle p(n6.p.d r8) {
        /*
            r7 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            d6.m0 r1 = d6.m0.f12709a
            java.util.Set<java.lang.String> r1 = r8.f22124b
            r2 = 0
            if (r1 == 0) goto L15
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 0
            goto L16
        L15:
            r1 = 1
        L16:
            if (r1 != 0) goto L28
            java.util.Set<java.lang.String> r1 = r8.f22124b
            java.lang.String r3 = ","
            java.lang.String r1 = android.text.TextUtils.join(r3, r1)
            java.lang.String r3 = "scope"
            r0.putString(r3, r1)
            r7.a(r1, r3)
        L28:
            n6.d r1 = r8.f22125c
            if (r1 != 0) goto L2e
            n6.d r1 = n6.d.NONE
        L2e:
            java.lang.String r1 = r1.f22072a
            java.lang.String r3 = "default_audience"
            r0.putString(r3, r1)
            java.lang.String r8 = r8.f22127e
            java.lang.String r8 = r7.d(r8)
            java.lang.String r1 = "state"
            r0.putString(r1, r8)
            java.util.Date r8 = o5.a.f22664l
            o5.a r8 = o5.a.c.b()
            if (r8 != 0) goto L4a
            r8 = 0
            goto L4c
        L4a:
            java.lang.String r8 = r8.f22671e
        L4c:
            java.lang.String r1 = "0"
            java.lang.String r3 = "1"
            java.lang.String r4 = "access_token"
            if (r8 == 0) goto L7d
            n6.p r5 = r7.e()
            androidx.fragment.app.x r5 = r5.f()
            if (r5 != 0) goto L62
            android.content.Context r5 = o5.v.a()
        L62:
            java.lang.String r6 = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY"
            android.content.SharedPreferences r2 = r5.getSharedPreferences(r6, r2)
            java.lang.String r5 = "TOKEN"
            java.lang.String r6 = ""
            java.lang.String r2 = r2.getString(r5, r6)
            boolean r2 = gm.l.a(r8, r2)
            if (r2 == 0) goto L7d
            r0.putString(r4, r8)
            r7.a(r3, r4)
            goto L8e
        L7d:
            n6.p r8 = r7.e()
            androidx.fragment.app.x r8 = r8.f()
            if (r8 != 0) goto L88
            goto L8b
        L88:
            d6.m0.d(r8)
        L8b:
            r7.a(r1, r4)
        L8e:
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r4)
            java.lang.String r2 = "cbt"
            r0.putString(r2, r8)
            o5.v r8 = o5.v.f22837a
            boolean r8 = o5.q0.b()
            if (r8 == 0) goto La4
            r1 = r3
        La4:
            java.lang.String r8 = "ies"
            r0.putString(r8, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.b0.p(n6.p$d):android.os.Bundle");
    }

    public abstract o5.g q();

    public final void r(p.d dVar, Bundle bundle, o5.p pVar) {
        String message;
        String str;
        p.e eVar;
        p.e.a aVar = p.e.a.ERROR;
        p e10 = e();
        this.f22052c = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f22052c = bundle.getString("e2e");
            }
            try {
                o5.a b10 = w.a.b(dVar.f22124b, bundle, q(), dVar.f22126d);
                eVar = new p.e(e10.f22117g, p.e.a.SUCCESS, b10, w.a.c(bundle, dVar.f22137o), null, null);
                if (e10.f() != null) {
                    try {
                        CookieSyncManager.createInstance(e10.f()).sync();
                    } catch (Exception unused) {
                    }
                    if (b10 != null) {
                        String str2 = b10.f22671e;
                        Context f10 = e().f();
                        if (f10 == null) {
                            f10 = o5.v.a();
                        }
                        f10.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str2).apply();
                    }
                }
            } catch (o5.p e11) {
                p.d dVar2 = e10.f22117g;
                String message2 = e11.getMessage();
                ArrayList arrayList = new ArrayList();
                if (message2 != null) {
                    arrayList.add(message2);
                }
                eVar = new p.e(dVar2, aVar, null, TextUtils.join(": ", arrayList), null);
            }
        } else if (pVar instanceof o5.r) {
            eVar = new p.e(e10.f22117g, p.e.a.CANCEL, null, "User canceled log in.", null);
        } else {
            this.f22052c = null;
            if (pVar == null) {
                message = null;
            } else {
                message = pVar.getMessage();
            }
            if (pVar instanceof o5.x) {
                o5.s sVar = ((o5.x) pVar).f22857b;
                String valueOf = String.valueOf(sVar.f22823b);
                message = sVar.toString();
                str = valueOf;
            } else {
                str = null;
            }
            p.d dVar3 = e10.f22117g;
            ArrayList arrayList2 = new ArrayList();
            if (message != null) {
                arrayList2.add(message);
            }
            eVar = new p.e(dVar3, aVar, null, TextUtils.join(": ", arrayList2), str);
        }
        m0 m0Var = m0.f12709a;
        if (!m0.A(this.f22052c)) {
            h(this.f22052c);
        }
        e10.e(eVar);
    }
}
