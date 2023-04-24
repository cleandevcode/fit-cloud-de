package j7;

import com.github.kilnn.tool.widget.bottomsheet.BottomSheetLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes.dex */
public final class b extends FloatingActionButton.a {

    /* renamed from: a */
    public final /* synthetic */ int f17512a;

    /* renamed from: b */
    public final /* synthetic */ BottomSheetLayout f17513b;

    /* loaded from: classes.dex */
    public class a extends FloatingActionButton.a {
        public a() {
            b.this = r1;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public final void b() {
            BottomSheetLayout bottomSheetLayout = b.this.f17513b;
            int i10 = BottomSheetLayout.f5929j;
            bottomSheetLayout.getClass();
        }
    }

    public b(BottomSheetLayout bottomSheetLayout, int i10) {
        this.f17513b = bottomSheetLayout;
        this.f17512a = i10;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public final void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f17513b.e(this.f17512a));
        floatingActionButton.o(new a(), true);
    }
}
