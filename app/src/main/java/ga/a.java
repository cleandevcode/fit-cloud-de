package ga;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a */
    public final float f15063a;

    public a(float f10) {
        this.f15063a = f10;
    }

    @Override // ga.c
    public final float a(RectF rectF) {
        return this.f15063a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f15063a == ((a) obj).f15063a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f15063a)});
    }
}