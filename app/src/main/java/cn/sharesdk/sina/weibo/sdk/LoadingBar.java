package cn.sharesdk.sina.weibo.sdk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public class LoadingBar extends TextView {

    /* renamed from: a */
    private int f5382a;

    /* renamed from: b */
    private int f5383b;

    /* renamed from: c */
    private Paint f5384c;

    /* renamed from: d */
    private Handler f5385d;

    /* renamed from: e */
    private Runnable f5386e;

    public LoadingBar(Context context) {
        super(context);
        this.f5386e = new Runnable() { // from class: cn.sharesdk.sina.weibo.sdk.LoadingBar.1
            @Override // java.lang.Runnable
            public void run() {
                LoadingBar.this.f5382a++;
                LoadingBar loadingBar = LoadingBar.this;
                loadingBar.a(loadingBar.f5382a);
            }
        };
        a(context);
    }

    public LoadingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public LoadingBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context);
    }

    private void a(Context context) {
        this.f5385d = new Handler();
        this.f5384c = new Paint();
        a();
    }

    private Rect b() {
        int left = getLeft();
        int top = getTop();
        return new Rect(0, 0, ((((getRight() - getLeft()) * this.f5382a) / 100) + getLeft()) - left, getBottom() - top);
    }

    public void a() {
        this.f5383b = -11693826;
    }

    public void a(int i10) {
        if (i10 < 7) {
            this.f5385d.postDelayed(this.f5386e, 70L);
        } else {
            this.f5385d.removeCallbacks(this.f5386e);
            this.f5382a = i10;
        }
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f5384c.setColor(this.f5383b);
        canvas.drawRect(b(), this.f5384c);
    }
}
