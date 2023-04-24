package n6;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import d6.m0;
import d6.r0;
import n6.p;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c0 extends b0 {
    public static final Parcelable.Creator<c0> CREATOR = new b();

    /* renamed from: d */
    public r0 f22056d;

    /* renamed from: e */
    public String f22057e;

    /* renamed from: f */
    public final String f22058f;

    /* renamed from: g */
    public final o5.g f22059g;

    /* loaded from: classes.dex */
    public final class a extends r0.a {

        /* renamed from: e */
        public String f22060e;

        /* renamed from: f */
        public o f22061f;

        /* renamed from: g */
        public y f22062g;

        /* renamed from: h */
        public boolean f22063h;

        /* renamed from: i */
        public boolean f22064i;

        /* renamed from: j */
        public String f22065j;

        /* renamed from: k */
        public String f22066k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c0 c0Var, androidx.fragment.app.x xVar, String str, Bundle bundle) {
            super(xVar, str, bundle, 0);
            gm.l.f(c0Var, "this$0");
            gm.l.f(str, "applicationId");
            this.f22060e = "fbconnect://success";
            this.f22061f = o.NATIVE_WITH_FALLBACK;
            this.f22062g = y.FACEBOOK;
        }

        public final r0 a() {
            String str;
            Bundle bundle = this.f12748d;
            if (bundle != null) {
                bundle.putString("redirect_uri", this.f22060e);
                bundle.putString("client_id", this.f12746b);
                String str2 = this.f22065j;
                if (str2 != null) {
                    bundle.putString("e2e", str2);
                    if (this.f22062g == y.INSTAGRAM) {
                        str = "token,signed_request,graph_domain,granted_scopes";
                    } else {
                        str = "token,signed_request,graph_domain";
                    }
                    bundle.putString("response_type", str);
                    bundle.putString("return_scopes", "true");
                    String str3 = this.f22066k;
                    if (str3 != null) {
                        bundle.putString("auth_type", str3);
                        bundle.putString("login_behavior", this.f22061f.name());
                        if (this.f22063h) {
                            bundle.putString("fx_app", this.f22062g.f22190a);
                        }
                        if (this.f22064i) {
                            bundle.putString("skip_dedupe", "true");
                        }
                        int i10 = r0.f12731m;
                        Context context = this.f12745a;
                        if (context != null) {
                            y yVar = this.f22062g;
                            r0.c cVar = this.f12747c;
                            gm.l.f(yVar, "targetApp");
                            r0.a(context);
                            return new r0(context, "oauth", bundle, yVar, cVar);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
                    }
                    gm.l.l("authType");
                    throw null;
                }
                gm.l.l("e2e");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<c0> {
        @Override // android.os.Parcelable.Creator
        public final c0 createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "source");
            return new c0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c0[] newArray(int i10) {
            return new c0[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements r0.c {

        /* renamed from: b */
        public final /* synthetic */ p.d f22068b;

        public c(p.d dVar) {
            c0.this = r1;
            this.f22068b = dVar;
        }

        @Override // d6.r0.c
        public final void a(Bundle bundle, o5.p pVar) {
            c0 c0Var = c0.this;
            p.d dVar = this.f22068b;
            c0Var.getClass();
            gm.l.f(dVar, "request");
            c0Var.r(dVar, bundle, pVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Parcel parcel) {
        super(parcel);
        gm.l.f(parcel, "source");
        this.f22058f = "web_view";
        this.f22059g = o5.g.f22723d;
        this.f22057e = parcel.readString();
    }

    public c0(p pVar) {
        super(pVar);
        this.f22058f = "web_view";
        this.f22059g = o5.g.f22723d;
    }

    @Override // n6.w
    public final void b() {
        r0 r0Var = this.f22056d;
        if (r0Var != null) {
            if (r0Var != null) {
                r0Var.cancel();
            }
            this.f22056d = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // n6.w
    public final String f() {
        return this.f22058f;
    }

    @Override // n6.w
    public final int o(p.d dVar) {
        String str;
        Bundle p10 = p(dVar);
        c cVar = new c(dVar);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        gm.l.e(jSONObject2, "e2e.toString()");
        this.f22057e = jSONObject2;
        a(jSONObject2, "e2e");
        androidx.fragment.app.x f10 = e().f();
        if (f10 == null) {
            return 0;
        }
        boolean x10 = m0.x(f10);
        a aVar = new a(this, f10, dVar.f22126d, p10);
        String str2 = this.f22057e;
        if (str2 != null) {
            aVar.f22065j = str2;
            if (x10) {
                str = "fbconnect://chrome_os_success";
            } else {
                str = "fbconnect://success";
            }
            aVar.f22060e = str;
            String str3 = dVar.f22130h;
            gm.l.f(str3, "authType");
            aVar.f22066k = str3;
            o oVar = dVar.f22123a;
            gm.l.f(oVar, "loginBehavior");
            aVar.f22061f = oVar;
            y yVar = dVar.f22134l;
            gm.l.f(yVar, "targetApp");
            aVar.f22062g = yVar;
            aVar.f22063h = dVar.f22135m;
            aVar.f22064i = dVar.f22136n;
            aVar.f12747c = cVar;
            this.f22056d = aVar.a();
            d6.o oVar2 = new d6.o();
            oVar2.a1();
            oVar2.B0 = this.f22056d;
            oVar2.h1(f10.J(), "FacebookDialogFragment");
            return 1;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Override // n6.b0
    public final o5.g q() {
        return this.f22059g;
    }

    @Override // n6.w, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "dest");
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f22057e);
    }
}
