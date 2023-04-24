package n6;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.CustomTabMainActivity;
import d6.i0;
import d6.m0;
import java.math.BigInteger;
import java.util.Random;
import n6.c;
import n6.p;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b extends b0 {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: i */
    public static boolean f22046i;

    /* renamed from: d */
    public String f22047d;

    /* renamed from: e */
    public String f22048e;

    /* renamed from: f */
    public String f22049f;

    /* renamed from: g */
    public final String f22050g;

    /* renamed from: h */
    public final o5.g f22051h;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "source");
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Parcel parcel) {
        super(parcel);
        gm.l.f(parcel, "source");
        this.f22050g = "custom_tab";
        this.f22051h = o5.g.f22724e;
        this.f22048e = parcel.readString();
        String[] strArr = d6.g.f12679a;
        this.f22049f = d6.g.c(super.g());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // n6.w
    public final String f() {
        return this.f22050g;
    }

    @Override // n6.w
    public final String g() {
        return this.f22049f;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00f9  */
    @Override // n6.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(int r7, int r8, android.content.Intent r9) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.b.i(int, int, android.content.Intent):boolean");
    }

    @Override // n6.w
    public final void k(JSONObject jSONObject) {
        jSONObject.put("7_challenge", this.f22048e);
    }

    @Override // n6.w
    public final int o(p.d dVar) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        boolean z12;
        String str3;
        String name;
        String str4;
        boolean z13;
        Uri b10;
        String b11;
        String str5;
        y yVar = y.INSTAGRAM;
        p e10 = e();
        if (this.f22049f.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return 0;
        }
        Bundle p10 = p(dVar);
        p10.putString("redirect_uri", this.f22049f);
        if (dVar.f22134l == yVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            str = dVar.f22126d;
            str2 = "app_id";
        } else {
            str = dVar.f22126d;
            str2 = "client_id";
        }
        p10.putString(str2, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        gm.l.e(jSONObject2, "e2e.toString()");
        p10.putString("e2e", jSONObject2);
        if (dVar.f22134l == yVar) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            str3 = "token,signed_request,graph_domain,granted_scopes";
        } else {
            if (dVar.f22124b.contains("openid")) {
                p10.putString("nonce", dVar.f22137o);
            }
            str3 = "id_token,token,signed_request,graph_domain";
        }
        p10.putString("response_type", str3);
        p10.putString("code_challenge", dVar.f22139q);
        n6.a aVar = dVar.f22140r;
        if (aVar == null) {
            name = null;
        } else {
            name = aVar.name();
        }
        p10.putString("code_challenge_method", name);
        p10.putString("return_scopes", "true");
        p10.putString("auth_type", dVar.f22130h);
        p10.putString("login_behavior", dVar.f22123a.name());
        o5.v vVar = o5.v.f22837a;
        p10.putString("sdk", gm.l.k("14.1.0", "android-"));
        p10.putString("sso", "chrome_custom_tab");
        String str6 = "0";
        if (!o5.v.f22849m) {
            str4 = "0";
        } else {
            str4 = "1";
        }
        p10.putString("cct_prefetching", str4);
        if (dVar.f22135m) {
            p10.putString("fx_app", dVar.f22134l.f22190a);
        }
        if (dVar.f22136n) {
            p10.putString("skip_dedupe", "true");
        }
        String str7 = dVar.f22132j;
        if (str7 != null) {
            p10.putString("messenger_page_id", str7);
            if (dVar.f22133k) {
                str6 = "1";
            }
            p10.putString("reset_messenger_state", str6);
        }
        if (f22046i) {
            p10.putString("cct_over_app_switch", "1");
        }
        if (o5.v.f22849m) {
            if (dVar.f22134l == yVar) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                p.e eVar = c.f22053a;
                if (gm.l.a("oauth", "oauth")) {
                    m0 m0Var = m0.f12709a;
                    b11 = i0.b();
                    str5 = "oauth/authorize";
                } else {
                    m0 m0Var2 = m0.f12709a;
                    b11 = i0.b();
                    str5 = o5.v.d() + "/dialog/oauth";
                }
                b10 = m0.b(p10, b11, str5);
            } else {
                p.e eVar2 = c.f22053a;
                m0 m0Var3 = m0.f12709a;
                b10 = m0.b(p10, i0.a(), o5.v.d() + "/dialog/oauth");
            }
            c.a.a(b10);
        }
        androidx.fragment.app.x f10 = e10.f();
        if (f10 == null) {
            return 0;
        }
        Intent intent = new Intent(f10, CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f5817c, "oauth");
        intent.putExtra(CustomTabMainActivity.f5818d, p10);
        String str8 = CustomTabMainActivity.f5819e;
        String str9 = this.f22047d;
        if (str9 == null) {
            str9 = d6.g.a();
            this.f22047d = str9;
        }
        intent.putExtra(str8, str9);
        intent.putExtra(CustomTabMainActivity.f5821g, dVar.f22134l.f22190a);
        androidx.fragment.app.r rVar = e10.f22113c;
        if (rVar != null) {
            rVar.D(intent, 1);
        }
        return 1;
    }

    @Override // n6.b0
    public final o5.g q() {
        return this.f22051h;
    }

    @Override // n6.w, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "dest");
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f22048e);
    }

    public b(p pVar) {
        super(pVar);
        this.f22050g = "custom_tab";
        this.f22051h = o5.g.f22724e;
        m0 m0Var = m0.f12709a;
        String bigInteger = new BigInteger(100, new Random()).toString(32);
        gm.l.e(bigInteger, "BigInteger(length * 5, r).toString(32)");
        this.f22048e = bigInteger;
        f22046i = false;
        String[] strArr = d6.g.f12679a;
        this.f22049f = d6.g.c(super.g());
    }
}
