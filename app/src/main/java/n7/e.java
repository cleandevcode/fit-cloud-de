package n7;

import android.view.View;
import android.widget.LinearLayout;
import com.github.kilnn.wheelview.WheelView;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public final WheelView f22194a;

    /* renamed from: b */
    public List<View> f22195b;

    /* renamed from: c */
    public List<View> f22196c;

    public e(WheelView wheelView) {
        this.f22194a = wheelView;
    }

    public final int a(LinearLayout linearLayout, int i10, a aVar) {
        boolean z10;
        int i11 = i10;
        int i12 = 0;
        while (i12 < linearLayout.getChildCount()) {
            int i13 = aVar.f22192a;
            if (i11 >= i13 && i11 <= (i13 + aVar.f22193b) - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                View childAt = linearLayout.getChildAt(i12);
                int e10 = this.f22194a.getViewAdapter().e();
                if ((i11 < 0 || i11 >= e10) && !this.f22194a.f5967e) {
                    List<View> list = this.f22196c;
                    if (list == null) {
                        list = new LinkedList<>();
                    }
                    list.add(childAt);
                    this.f22196c = list;
                } else {
                    for (int i14 = i11; i14 < 0; i14 += e10) {
                    }
                    List<View> list2 = this.f22195b;
                    if (list2 == null) {
                        list2 = new LinkedList<>();
                    }
                    list2.add(childAt);
                    this.f22195b = list2;
                }
                linearLayout.removeViewAt(i12);
                if (i12 == 0) {
                    i10++;
                }
            } else {
                i12++;
            }
            i11++;
        }
        return i10;
    }
}
