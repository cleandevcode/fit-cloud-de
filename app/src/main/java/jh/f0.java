package jh;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.h1;
import com.topstep.fitcloud.pro.model.auth.FillUserInfo;
import com.topstep.fitcloudpro.R;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class f0 implements i2.w {

    /* renamed from: a */
    public final FillUserInfo f17784a;

    /* renamed from: b */
    public final int f17785b = R.id.to_fill_user;

    public f0(FillUserInfo fillUserInfo) {
        this.f17784a = fillUserInfo;
    }

    @Override // i2.w
    public final Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(FillUserInfo.class)) {
            FillUserInfo fillUserInfo = this.f17784a;
            gm.l.d(fillUserInfo, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("parcelArgs", fillUserInfo);
        } else if (Serializable.class.isAssignableFrom(FillUserInfo.class)) {
            FillUserInfo fillUserInfo2 = this.f17784a;
            gm.l.d(fillUserInfo2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("parcelArgs", (Serializable) fillUserInfo2);
        } else {
            throw new UnsupportedOperationException(h1.a(FillUserInfo.class, new StringBuilder(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    @Override // i2.w
    public final int b() {
        return this.f17785b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && gm.l.a(this.f17784a, ((f0) obj).f17784a);
    }

    public final int hashCode() {
        return this.f17784a.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("ToFillUser(parcelArgs=");
        a10.append(this.f17784a);
        a10.append(')');
        return a10.toString();
    }
}
