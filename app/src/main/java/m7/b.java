package m7;

import android.content.Context;
import android.util.SparseArray;
import android.widget.LinearLayout;
import com.github.kilnn.wheellayout.OneWheelLayout;
import com.github.kilnn.wheelview.WheelView;
import gm.l;

/* loaded from: classes.dex */
public final class b extends LinearLayout implements n7.d {

    /* renamed from: a */
    public final OneWheelLayout f20403a;

    /* renamed from: b */
    public final OneWheelLayout f20404b;

    /* renamed from: c */
    public SparseArray<d> f20405c;

    public b(Context context) {
        super(context, null, 0);
        setOrientation(0);
        OneWheelLayout b10 = tb.a.b(this);
        b10.f5957a.f5974l.add(this);
        this.f20403a = b10;
        this.f20404b = tb.a.b(this);
    }

    private final int getFirstValue() {
        return this.f20403a.getValue();
    }

    private final int getSecondValue() {
        int value = this.f20403a.getValue();
        SparseArray<d> sparseArray = this.f20405c;
        return this.f20404b.b(sparseArray == null ? null : sparseArray.get(value));
    }

    @Override // n7.d
    public final void a(WheelView wheelView) {
        c();
    }

    @Override // n7.d
    public final void b(WheelView wheelView) {
    }

    public final void c() {
        SparseArray<d> sparseArray = this.f20405c;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return;
        }
        this.f20404b.setAdapterKey(sparseArray.get(this.f20403a.getValue()));
    }

    public final void d(e eVar, e eVar2, SparseArray<d> sparseArray) {
        this.f20403a.setConfig(eVar);
        this.f20404b.setConfig(eVar2);
        this.f20405c = sparseArray;
    }

    public final void f(int i10, int i11) {
        this.f20403a.setValue(i10);
        c();
        this.f20404b.setValue(i11);
    }

    public final int[] getValue() {
        return new int[]{getFirstValue(), getSecondValue()};
    }

    public final void setValue(int[] iArr) {
        l.f(iArr, "array");
        f(iArr[0], iArr[1]);
    }
}
