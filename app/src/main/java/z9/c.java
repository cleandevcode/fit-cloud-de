package z9;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class c extends k1.a {

    /* renamed from: d */
    public final /* synthetic */ CheckableImageButton f32074d;

    public c(CheckableImageButton checkableImageButton) {
        this.f32074d = checkableImageButton;
    }

    @Override // k1.a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f32074d.isChecked());
    }

    @Override // k1.a
    public final void d(View view, l1.j jVar) {
        this.f18085a.onInitializeAccessibilityNodeInfo(view, jVar.f18670a);
        jVar.f18670a.setCheckable(this.f32074d.f6621e);
        jVar.f18670a.setChecked(this.f32074d.isChecked());
    }
}
