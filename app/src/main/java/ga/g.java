package ga;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g implements c {

    /* renamed from: a */
    public final float f15114a;

    public g(float f10) {
        this.f15114a = f10;
    }

    @Override // ga.c
    public final float a(RectF rectF) {
        return rectF.height() * this.f15114a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f15114a == ((g) obj).f15114a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f15114a)});
    }
}
