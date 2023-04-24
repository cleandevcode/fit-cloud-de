package ii;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.h1;
import com.topstep.fitcloud.pro.ui.settings.AccountBindType;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class b implements i2.f {

    /* renamed from: a */
    public final AccountBindType f16892a;

    /* renamed from: b */
    public final boolean f16893b;

    public b(AccountBindType accountBindType, boolean z10) {
        gm.l.f(accountBindType, "bindType");
        this.f16892a = accountBindType;
        this.f16893b = z10;
    }

    public static final b fromBundle(Bundle bundle) {
        if (ih.c0.b(bundle, "bundle", b.class, "bindType")) {
            if (!Parcelable.class.isAssignableFrom(AccountBindType.class) && !Serializable.class.isAssignableFrom(AccountBindType.class)) {
                throw new UnsupportedOperationException(h1.a(AccountBindType.class, new StringBuilder(), " must implement Parcelable or Serializable or must be an Enum."));
            }
            AccountBindType accountBindType = (AccountBindType) bundle.get("bindType");
            if (accountBindType != null) {
                if (bundle.containsKey("needPassword")) {
                    return new b(accountBindType, bundle.getBoolean("needPassword"));
                }
                throw new IllegalArgumentException("Required argument \"needPassword\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"bindType\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"bindType\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f16892a == bVar.f16892a && this.f16893b == bVar.f16893b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f16892a.hashCode() * 31;
        boolean z10 = this.f16893b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("AccountBindFragmentArgs(bindType=");
        a10.append(this.f16892a);
        a10.append(", needPassword=");
        return l2.o0.a(a10, this.f16893b, ')');
    }
}
