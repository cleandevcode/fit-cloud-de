package ga;

import android.graphics.Canvas;
import android.graphics.Matrix;
import ga.l;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k extends l.f {

    /* renamed from: b */
    public final /* synthetic */ List f15154b;

    /* renamed from: c */
    public final /* synthetic */ Matrix f15155c;

    public k(ArrayList arrayList, Matrix matrix) {
        this.f15154b = arrayList;
        this.f15155c = matrix;
    }

    @Override // ga.l.f
    public final void a(Matrix matrix, fa.a aVar, int i10, Canvas canvas) {
        for (l.f fVar : this.f15154b) {
            fVar.a(this.f15155c, aVar, i10, canvas);
        }
    }
}
