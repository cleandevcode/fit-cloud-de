package ga;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a */
    public final c f15064a;

    /* renamed from: b */
    public final float f15065b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f15064a;
            f10 += ((b) cVar).f15065b;
        }
        this.f15064a = cVar;
        this.f15065b = f10;
    }

    @Override // ga.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f15064a.a(rectF) + this.f15065b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f15064a.equals(bVar.f15064a) && this.f15065b == bVar.f15065b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15064a, Float.valueOf(this.f15065b)});
    }
}
