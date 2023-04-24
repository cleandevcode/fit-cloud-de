package l9;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes.dex */
public final class b extends FloatingActionButton.a {

    /* renamed from: a */
    public final /* synthetic */ int f19406a;

    /* renamed from: b */
    public final /* synthetic */ BottomAppBar f19407b;

    /* loaded from: classes.dex */
    public class a extends FloatingActionButton.a {
        public a() {
            b.this = r1;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public final void b() {
            BottomAppBar bottomAppBar = b.this.f19407b;
            int i10 = BottomAppBar.f6262n0;
            bottomAppBar.getClass();
        }
    }

    public b(BottomAppBar bottomAppBar, int i10) {
        this.f19407b = bottomAppBar;
        this.f19406a = i10;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public final void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f19407b.y(this.f19406a));
        floatingActionButton.o(new a(), true);
    }
}
