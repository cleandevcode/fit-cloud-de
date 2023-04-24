package cn.sharesdk.framework.authorize;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class ResizeLayout extends LinearLayout {

    /* renamed from: a */
    private OnResizeListener f5194a;

    /* loaded from: classes.dex */
    public interface OnResizeListener {
        void OnResize(int i10, int i11, int i12, int i13);
    }

    public ResizeLayout(Context context) {
        super(context);
    }

    public ResizeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a(OnResizeListener onResizeListener) {
        this.f5194a = onResizeListener;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        OnResizeListener onResizeListener = this.f5194a;
        if (onResizeListener != null) {
            onResizeListener.OnResize(i10, i11, i12, i13);
        }
    }
}
