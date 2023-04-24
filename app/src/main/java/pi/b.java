package pi;

import android.content.Context;
import android.util.SparseArray;
import com.topstep.fitcloudpro.R;
import java.util.List;
import ul.q;

/* loaded from: classes2.dex */
public abstract class b extends s7.h {

    /* renamed from: d */
    public List<String> f24255d;

    /* renamed from: e */
    public SparseArray<Float> f24256e;

    /* renamed from: f */
    public SparseArray<Float> f24257f;

    /* renamed from: g */
    public final int f24258g;

    public b(Context context) {
        super(context, R.layout.layout_base_marker_view);
        this.f24258g = g7.a.a(context, 8.0f);
    }

    @Override // s7.h, s7.d
    public final void b(t7.k kVar, v7.c cVar) {
        int b10 = (int) kVar.b();
        List<String> list = this.f24255d;
        String str = (list == null || (str = (String) q.J(b10, list)) == null) ? "" : "";
        SparseArray<Float> sparseArray = this.f24256e;
        Float f10 = sparseArray != null ? sparseArray.get(b10) : null;
        float floatValue = f10 == null ? 0.0f : f10.floatValue();
        SparseArray<Float> sparseArray2 = this.f24257f;
        Float f11 = sparseArray2 != null ? sparseArray2.get(b10) : null;
        c(str, floatValue, f11 != null ? f11.floatValue() : 0.0f);
        super.b(kVar, cVar);
    }

    public abstract void c(String str, float f10, float f11);

    @Override // s7.h
    public a8.c getOffset() {
        return new a8.c((-getWidth()) / 2.0f, (-getHeight()) - this.f24258g);
    }

    public final void setXValues(List<String> list) {
        this.f24255d = list;
    }

    public final void setYValues1(List<? extends t7.k> list) {
        if (list == null || list.isEmpty()) {
            this.f24256e = null;
            return;
        }
        SparseArray<Float> sparseArray = new SparseArray<>(list.size());
        for (t7.k kVar : list) {
            sparseArray.put((int) kVar.b(), Float.valueOf(kVar.a()));
        }
        this.f24256e = sparseArray;
    }

    public final void setYValues2(List<? extends t7.k> list) {
        if (list == null || list.isEmpty()) {
            this.f24257f = null;
            return;
        }
        SparseArray<Float> sparseArray = new SparseArray<>(list.size());
        for (t7.k kVar : list) {
            sparseArray.put((int) kVar.b(), Float.valueOf(kVar.a()));
        }
        this.f24257f = sparseArray;
    }
}
