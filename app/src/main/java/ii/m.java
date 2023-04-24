package ii;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.h1;
import com.topstep.fitcloud.pro.ui.settings.AccountBindType;
import com.topstep.fitcloudpro.R;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class m implements i2.w {

    /* renamed from: a */
    public final AccountBindType f16964a;

    /* renamed from: b */
    public final boolean f16965b;

    /* renamed from: c */
    public final int f16966c = R.id.toAccountBind;

    public m(AccountBindType accountBindType, boolean z10) {
        this.f16964a = accountBindType;
        this.f16965b = z10;
    }

    @Override // i2.w
    public final Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(AccountBindType.class)) {
            AccountBindType accountBindType = this.f16964a;
            gm.l.d(accountBindType, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("bindType", (Parcelable) accountBindType);
        } else if (Serializable.class.isAssignableFrom(AccountBindType.class)) {
            AccountBindType accountBindType2 = this.f16964a;
            gm.l.d(accountBindType2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("bindType", accountBindType2);
        } else {
            throw new UnsupportedOperationException(h1.a(AccountBindType.class, new StringBuilder(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        bundle.putBoolean("needPassword", this.f16965b);
        return bundle;
    }

    @Override // i2.w
    public final int b() {
        return this.f16966c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return this.f16964a == mVar.f16964a && this.f16965b == mVar.f16965b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f16964a.hashCode() * 31;
        boolean z10 = this.f16965b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("ToAccountBind(bindType=");
        a10.append(this.f16964a);
        a10.append(", needPassword=");
        return l2.o0.a(a10, this.f16965b, ')');
    }
}
