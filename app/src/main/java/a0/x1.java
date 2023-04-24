package a0;

import d0.i;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class x1 implements b1 {

    /* renamed from: a */
    public int f208a;

    /* renamed from: b */
    public final Object f209b;

    public /* synthetic */ x1(androidx.camera.core.j jVar, String str) {
        y.o0 d02 = jVar.d0();
        if (d02 == null) {
            throw new IllegalArgumentException("ImageProxy has no associated ImageInfo");
        }
        Integer num = (Integer) d02.b().a(str);
        if (num == null) {
            throw new IllegalArgumentException("ImageProxy has no associated tag");
        }
        this.f208a = num.intValue();
        this.f209b = jVar;
    }

    @Override // a0.b1
    public final na.a a(int i10) {
        if (i10 != this.f208a) {
            return new i.a(new IllegalArgumentException("Capture id does not exist in the bundle"));
        }
        return d0.f.e((androidx.camera.core.j) this.f209b);
    }

    @Override // a0.b1
    public final List b() {
        return Collections.singletonList(Integer.valueOf(this.f208a));
    }

    public final void c(Object obj) {
        int i10 = this.f208a;
        Object[] objArr = (Object[]) this.f209b;
        if (i10 < objArr.length) {
            objArr[i10] = obj;
            this.f208a = i10 + 1;
        }
    }
}
