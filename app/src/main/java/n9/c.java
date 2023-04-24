package n9;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import l1.n;

/* loaded from: classes.dex */
public final class c implements n {

    /* renamed from: a */
    public final /* synthetic */ int f22208a;

    /* renamed from: b */
    public final /* synthetic */ BottomSheetBehavior f22209b;

    public c(BottomSheetBehavior bottomSheetBehavior, int i10) {
        this.f22209b = bottomSheetBehavior;
        this.f22208a = i10;
    }

    @Override // l1.n
    public final boolean a(View view) {
        this.f22209b.C(this.f22208a);
        return true;
    }
}
