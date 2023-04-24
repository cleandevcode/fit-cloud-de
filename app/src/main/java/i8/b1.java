package i8;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: d */
    public static final Uri f16601d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    public final String f16602a;

    /* renamed from: b */
    public final String f16603b;

    /* renamed from: c */
    public final boolean f16604c;

    public b1(String str, String str2, boolean z10) {
        p.d(str);
        this.f16602a = str;
        p.d(str2);
        this.f16603b = str2;
        this.f16604c = z10;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        if (this.f16602a != null) {
            if (this.f16604c) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.f16602a);
                try {
                    bundle = context.getContentResolver().call(f16601d, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e10) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                    bundle = null;
                }
                r2 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
                if (r2 == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f16602a)));
                }
            }
            return r2 == null ? new Intent(this.f16602a).setPackage(this.f16603b) : r2;
        }
        return new Intent().setComponent(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            return n.a(this.f16602a, b1Var.f16602a) && n.a(this.f16603b, b1Var.f16603b) && n.a(null, null) && this.f16604c == b1Var.f16604c;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16602a, this.f16603b, null, 4225, Boolean.valueOf(this.f16604c)});
    }

    public final String toString() {
        String str = this.f16602a;
        if (str != null) {
            return str;
        }
        p.f(null);
        throw null;
    }
}
