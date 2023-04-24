package p5;

import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.fragment.app.i1;
import com.facebook.common.R;
import d6.j0;
import d6.v;
import d6.w;
import java.util.Date;
import java.util.EnumSet;
import n6.h;
import o5.e0;
import o5.y;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements y.b {

    /* renamed from: a */
    public final /* synthetic */ int f23908a;

    /* renamed from: b */
    public final /* synthetic */ Object f23909b;

    /* renamed from: c */
    public final /* synthetic */ Object f23910c;

    /* renamed from: d */
    public final /* synthetic */ Object f23911d;

    /* renamed from: e */
    public final /* synthetic */ Object f23912e;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f23908a = i10;
        this.f23909b = obj;
        this.f23910c = obj2;
        this.f23911d = obj3;
        this.f23912e = obj4;
    }

    @Override // o5.y.b
    public final void b(e0 e0Var) {
        EnumSet<j0> enumSet;
        switch (this.f23908a) {
            case 0:
                a aVar = (a) this.f23909b;
                y yVar = (y) this.f23910c;
                t tVar = (t) this.f23911d;
                fb.a aVar2 = (fb.a) this.f23912e;
                if (!i6.a.b(i.class)) {
                    try {
                        gm.l.f(aVar, "$accessTokenAppId");
                        gm.l.f(yVar, "$postRequest");
                        gm.l.f(tVar, "$appEvents");
                        gm.l.f(aVar2, "$flushState");
                        i.e(yVar, e0Var, aVar, tVar, aVar2);
                        return;
                    } catch (Throwable th2) {
                        i6.a.a(i.class, th2);
                        return;
                    }
                }
                return;
            default:
                final n6.h hVar = (n6.h) this.f23909b;
                final String str = (String) this.f23910c;
                final Date date = (Date) this.f23911d;
                final Date date2 = (Date) this.f23912e;
                int i10 = n6.h.M0;
                gm.l.f(hVar, "this$0");
                gm.l.f(str, "$accessToken");
                if (!hVar.F0.get()) {
                    o5.s sVar = e0Var.f22704c;
                    if (sVar != null) {
                        o5.p pVar = sVar.f22830i;
                        if (pVar == null) {
                            pVar = new o5.p();
                        }
                        hVar.m1(pVar);
                        return;
                    }
                    try {
                        JSONObject jSONObject = e0Var.f22703b;
                        if (jSONObject == null) {
                            jSONObject = new JSONObject();
                        }
                        final String string = jSONObject.getString("id");
                        gm.l.e(string, "jsonObject.getString(\"id\")");
                        final h.b a10 = h.a.a(jSONObject);
                        String string2 = jSONObject.getString("name");
                        gm.l.e(string2, "jsonObject.getString(\"name\")");
                        h.c cVar = hVar.I0;
                        if (cVar != null) {
                            c6.a aVar3 = c6.a.f4540a;
                            c6.a.a(cVar.f22087b);
                        }
                        w wVar = w.f12811a;
                        v b10 = w.b(o5.v.b());
                        Boolean bool = null;
                        if (b10 != null && (enumSet = b10.f12797c) != null) {
                            bool = Boolean.valueOf(enumSet.contains(j0.f12697d));
                        }
                        if (gm.l.a(bool, Boolean.TRUE) && !hVar.K0) {
                            hVar.K0 = true;
                            String string3 = hVar.n0().getString(R.string.com_facebook_smart_login_confirmation_title);
                            gm.l.e(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
                            String string4 = hVar.n0().getString(R.string.com_facebook_smart_login_confirmation_continue_as);
                            gm.l.e(string4, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
                            String string5 = hVar.n0().getString(R.string.com_facebook_smart_login_confirmation_cancel);
                            gm.l.e(string5, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
                            String d10 = i1.d(new Object[]{string2}, 1, string4, "java.lang.String.format(format, *args)");
                            AlertDialog.Builder builder = new AlertDialog.Builder(hVar.i0());
                            builder.setMessage(string3).setCancelable(true).setNegativeButton(d10, new DialogInterface.OnClickListener() { // from class: n6.f
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i11) {
                                    h hVar2 = h.this;
                                    String str2 = string;
                                    h.b bVar = a10;
                                    String str3 = str;
                                    Date date3 = date;
                                    Date date4 = date2;
                                    int i12 = h.M0;
                                    gm.l.f(hVar2, "this$0");
                                    gm.l.f(str2, "$userId");
                                    gm.l.f(bVar, "$permissions");
                                    gm.l.f(str3, "$accessToken");
                                    hVar2.i1(str2, bVar, str3, date3, date4);
                                }
                            }).setPositiveButton(string5, new n6.g(hVar, 0));
                            builder.create().show();
                            return;
                        }
                        hVar.i1(string, a10, str, date, date2);
                        return;
                    } catch (JSONException e10) {
                        hVar.m1(new o5.p(e10));
                        return;
                    }
                }
                return;
        }
    }
}
