package o5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AuthenticationTokenManager;
import java.io.IOException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: a */
    public final String f22739a;

    /* renamed from: b */
    public final String f22740b;

    /* renamed from: c */
    public final k f22741c;

    /* renamed from: d */
    public final j f22742d;

    /* renamed from: e */
    public final String f22743e;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "source");
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i10) {
            return new h[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static void a(h hVar) {
            AuthenticationTokenManager.a aVar = AuthenticationTokenManager.f5808d;
            AuthenticationTokenManager authenticationTokenManager = AuthenticationTokenManager.f5809e;
            if (authenticationTokenManager == null) {
                synchronized (aVar) {
                    authenticationTokenManager = AuthenticationTokenManager.f5809e;
                    if (authenticationTokenManager == null) {
                        g2.a a10 = g2.a.a(v.a());
                        gm.l.e(a10, "getInstance(applicationContext)");
                        AuthenticationTokenManager authenticationTokenManager2 = new AuthenticationTokenManager(a10, new i());
                        AuthenticationTokenManager.f5809e = authenticationTokenManager2;
                        authenticationTokenManager = authenticationTokenManager2;
                    }
                }
            }
            h hVar2 = authenticationTokenManager.f5812c;
            authenticationTokenManager.f5812c = hVar;
            i iVar = authenticationTokenManager.f5811b;
            if (hVar != null) {
                iVar.getClass();
                try {
                    iVar.f22752a.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", hVar.a().toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                iVar.f22752a.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
                d6.m0 m0Var = d6.m0.f12709a;
                d6.m0.d(v.a());
            }
            if (!d6.m0.a(hVar2, hVar)) {
                Intent intent = new Intent(v.a(), AuthenticationTokenManager.CurrentAuthenticationTokenChangedBroadcastReceiver.class);
                intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
                intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", hVar2);
                intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", hVar);
                authenticationTokenManager.f5810a.c(intent);
            }
        }
    }

    public h(Parcel parcel) {
        gm.l.f(parcel, "parcel");
        String readString = parcel.readString();
        d6.n0.f(readString, "token");
        this.f22739a = readString;
        String readString2 = parcel.readString();
        d6.n0.f(readString2, "expectedNonce");
        this.f22740b = readString2;
        Parcelable readParcelable = parcel.readParcelable(k.class.getClassLoader());
        if (readParcelable == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f22741c = (k) readParcelable;
        Parcelable readParcelable2 = parcel.readParcelable(j.class.getClassLoader());
        if (readParcelable2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f22742d = (j) readParcelable2;
        String readString3 = parcel.readString();
        d6.n0.f(readString3, "signature");
        this.f22743e = readString3;
    }

    public h(String str, String str2) {
        gm.l.f(str2, "expectedNonce");
        d6.n0.d(str, "token");
        d6.n0.d(str2, "expectedNonce");
        boolean z10 = false;
        List s02 = om.l.s0(str, new String[]{"."}, 0, 6);
        if (!(s02.size() == 3)) {
            throw new IllegalArgumentException("Invalid IdToken string".toString());
        }
        String str3 = (String) s02.get(0);
        String str4 = (String) s02.get(1);
        String str5 = (String) s02.get(2);
        this.f22739a = str;
        this.f22740b = str2;
        k kVar = new k(str3);
        this.f22741c = kVar;
        this.f22742d = new j(str4, str2);
        try {
            String c10 = m6.c.c(kVar.f22781c);
            if (c10 != null) {
                PublicKey b10 = m6.c.b(c10);
                z10 = m6.c.d(b10, str3 + '.' + str4, str5);
            }
        } catch (IOException | InvalidKeySpecException unused) {
        }
        if (!z10) {
            throw new IllegalArgumentException("Invalid Signature".toString());
        }
        this.f22743e = str5;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.f22739a);
        jSONObject.put("expected_nonce", this.f22740b);
        k kVar = this.f22741c;
        kVar.getClass();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("alg", kVar.f22779a);
        jSONObject2.put("typ", kVar.f22780b);
        jSONObject2.put("kid", kVar.f22781c);
        jSONObject.put("header", jSONObject2);
        jSONObject.put("claims", this.f22742d.a());
        jSONObject.put("signature", this.f22743e);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return gm.l.a(this.f22739a, hVar.f22739a) && gm.l.a(this.f22740b, hVar.f22740b) && gm.l.a(this.f22741c, hVar.f22741c) && gm.l.a(this.f22742d, hVar.f22742d) && gm.l.a(this.f22743e, hVar.f22743e);
        }
        return false;
    }

    public final int hashCode() {
        int a10 = i2.t.a(this.f22740b, i2.t.a(this.f22739a, 527, 31), 31);
        int hashCode = this.f22742d.hashCode();
        return this.f22743e.hashCode() + ((hashCode + ((this.f22741c.hashCode() + a10) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "dest");
        parcel.writeString(this.f22739a);
        parcel.writeString(this.f22740b);
        parcel.writeParcelable(this.f22741c, i10);
        parcel.writeParcelable(this.f22742d, i10);
        parcel.writeString(this.f22743e);
    }
}
