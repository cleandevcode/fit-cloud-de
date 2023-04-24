package m7;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.kilnn.wheelview.R;
import com.github.kilnn.wheelview.WheelView;
import gm.l;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class c implements o7.a {

    /* renamed from: a */
    public LinkedList f20406a;

    /* renamed from: b */
    public final int f20407b;

    /* renamed from: c */
    public final int f20408c;

    /* renamed from: d */
    public final f f20409d;

    public c(int i10, int i11, f fVar) {
        this.f20407b = i10;
        this.f20408c = i11;
        this.f20409d = fVar;
    }

    @Override // o7.a
    public final void a(WheelView.a aVar) {
        if (this.f20406a == null) {
            this.f20406a = new LinkedList();
        }
        this.f20406a.add(aVar);
    }

    @Override // o7.a
    public final /* bridge */ /* synthetic */ void b() {
    }

    @Override // o7.a
    public final void c(WheelView.a aVar) {
        LinkedList linkedList = this.f20406a;
        if (linkedList != null) {
            linkedList.remove(aVar);
        }
    }

    @Override // o7.a
    public final View d(int i10, View view, LinearLayout linearLayout) {
        l.f(linearLayout, "parent");
        String str = null;
        if (i10 < 0 || i10 >= e()) {
            return null;
        }
        if (view == null) {
            view = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.item_default_wheel_int, (ViewGroup) linearLayout, false);
        }
        l.e(view, "resultView");
        SparseArray sparseArray = (SparseArray) view.getTag();
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            view.setTag(sparseArray);
        }
        View view2 = (View) sparseArray.get(16908308);
        if (view2 == null) {
            view2 = view.findViewById(16908308);
            sparseArray.put(16908308, view2);
        }
        if (view2 != null) {
            TextView textView = (TextView) view2;
            int i11 = this.f20407b + i10;
            f fVar = this.f20409d;
            if (fVar != null) {
                str = fVar.a(i10, i11);
            }
            if (str == null) {
                str = String.valueOf(i11);
            }
            textView.setText(str);
            return view;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of com.github.kilnn.wheellayout.WheelLayoutKtxKt.adapterHolder");
    }

    @Override // o7.a
    public final int e() {
        return (this.f20408c - this.f20407b) + 1;
    }
}
