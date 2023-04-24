package ci;

import android.os.Bundle;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class h0 implements i2.w {

    /* renamed from: a */
    public final int f4770a;

    /* renamed from: b */
    public final int f4771b;

    public h0(int i10, int i11) {
        this.f4770a = i10;
        this.f4771b = i11;
    }

    @Override // i2.w
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("formats", this.f4770a);
        bundle.putInt("remainingSize", this.f4771b);
        return bundle;
    }

    @Override // i2.w
    public final int b() {
        return R.id.toSelect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            return this.f4770a == h0Var.f4770a && this.f4771b == h0Var.f4771b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f4770a * 31) + this.f4771b;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("ToSelect(formats=");
        a10.append(this.f4770a);
        a10.append(", remainingSize=");
        return a1.b.a(a10, this.f4771b, ')');
    }
}
