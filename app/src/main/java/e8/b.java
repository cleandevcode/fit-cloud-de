package e8;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c */
    public static final ReentrantLock f13488c = new ReentrantLock();

    /* renamed from: d */
    public static b f13489d;

    /* renamed from: a */
    public final ReentrantLock f13490a = new ReentrantLock();

    /* renamed from: b */
    public final SharedPreferences f13491b;

    public b(Context context) {
        this.f13491b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static b a(Context context) {
        i8.p.f(context);
        ReentrantLock reentrantLock = f13488c;
        reentrantLock.lock();
        try {
            if (f13489d == null) {
                f13489d = new b(context.getApplicationContext());
            }
            b bVar = f13489d;
            reentrantLock.unlock();
            return bVar;
        } catch (Throwable th2) {
            f13488c.unlock();
            throw th2;
        }
    }

    public static final String g(String str, String str2) {
        return android.support.v4.media.a.a(str, ":", str2);
    }

    public final GoogleSignInAccount b() {
        String e10;
        String e11 = e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(e11) && (e10 = e(g("googleSignInAccount", e11))) != null) {
            try {
                return GoogleSignInAccount.f(e10);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final GoogleSignInOptions c() {
        String e10;
        String e11 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e11) || (e10 = e(g("googleSignInOptions", e11))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.e(e10);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void d(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        i8.p.f(googleSignInOptions);
        f("defaultGoogleSignInAccount", googleSignInAccount.f6011i);
        String str = googleSignInAccount.f6011i;
        String g10 = g("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f6004b;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f6005c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f6006d;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f6007e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f6013k;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f6014l;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f6008f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f6009g;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f6010h);
            jSONObject.put("obfuscatedIdentifier", googleSignInAccount.f6011i);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.f6012j;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: d8.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).f6050b.compareTo(((Scope) obj2).f6050b);
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f6050b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            f(g10, jSONObject.toString());
            String g11 = g("googleSignInOptions", str);
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(googleSignInOptions.f6022b, GoogleSignInOptions.f6020p);
                Iterator it = googleSignInOptions.f6022b.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).f6050b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f6023c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f6024d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f6026f);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f6025e);
                if (!TextUtils.isEmpty(googleSignInOptions.f6027g)) {
                    jSONObject2.put("serverClientId", googleSignInOptions.f6027g);
                }
                if (!TextUtils.isEmpty(googleSignInOptions.f6028h)) {
                    jSONObject2.put("hostedDomain", googleSignInOptions.f6028h);
                }
                f(g11, jSONObject2.toString());
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        } catch (JSONException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final String e(String str) {
        this.f13490a.lock();
        try {
            return this.f13491b.getString(str, null);
        } finally {
            this.f13490a.unlock();
        }
    }

    public final void f(String str, String str2) {
        this.f13490a.lock();
        try {
            this.f13491b.edit().putString(str, str2).apply();
        } finally {
            this.f13490a.unlock();
        }
    }
}
