package com.github.kilnn.swipeback;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.github.kilnn.swipeback.a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public class SwipeBackLayout extends FrameLayout {

    /* renamed from: r */
    public static final int[] f5868r = {1, 2, 8, 11};

    /* renamed from: a */
    public int f5869a;

    /* renamed from: b */
    public float f5870b;

    /* renamed from: c */
    public boolean f5871c;

    /* renamed from: d */
    public View f5872d;

    /* renamed from: e */
    public com.github.kilnn.swipeback.a f5873e;

    /* renamed from: f */
    public float f5874f;

    /* renamed from: g */
    public int f5875g;

    /* renamed from: h */
    public int f5876h;

    /* renamed from: i */
    public ArrayList f5877i;

    /* renamed from: j */
    public Drawable f5878j;

    /* renamed from: k */
    public Drawable f5879k;

    /* renamed from: l */
    public Drawable f5880l;

    /* renamed from: m */
    public float f5881m;

    /* renamed from: n */
    public int f5882n;

    /* renamed from: o */
    public boolean f5883o;

    /* renamed from: p */
    public Rect f5884p;

    /* renamed from: q */
    public int f5885q;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();

        void c();
    }

    /* loaded from: classes.dex */
    public class b extends a.c {

        /* renamed from: a */
        public boolean f5886a;

        public b() {
            SwipeBackLayout.this = r1;
        }

        /* JADX WARN: Removed duplicated region for block: B:69:0x008b A[LOOP:0: B:67:0x0085->B:69:0x008b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x009f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x00a0  */
        @Override // com.github.kilnn.swipeback.a.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(int r5, int r6) {
            /*
                r4 = this;
                com.github.kilnn.swipeback.SwipeBackLayout r0 = com.github.kilnn.swipeback.SwipeBackLayout.this
                int r1 = r0.f5885q
                r2 = r1 & 1
                if (r2 == 0) goto L14
                float r1 = (float) r5
                android.view.View r2 = r0.f5872d
                int r2 = r2.getWidth()
                com.github.kilnn.swipeback.SwipeBackLayout r3 = com.github.kilnn.swipeback.SwipeBackLayout.this
                android.graphics.drawable.Drawable r3 = r3.f5878j
                goto L23
            L14:
                r2 = r1 & 2
                if (r2 == 0) goto L28
                float r1 = (float) r5
                android.view.View r2 = r0.f5872d
                int r2 = r2.getWidth()
                com.github.kilnn.swipeback.SwipeBackLayout r3 = com.github.kilnn.swipeback.SwipeBackLayout.this
                android.graphics.drawable.Drawable r3 = r3.f5879k
            L23:
                int r3 = r3.getIntrinsicWidth()
                goto L3b
            L28:
                r1 = r1 & 8
                if (r1 == 0) goto L44
                float r1 = (float) r6
                android.view.View r2 = r0.f5872d
                int r2 = r2.getHeight()
                com.github.kilnn.swipeback.SwipeBackLayout r3 = com.github.kilnn.swipeback.SwipeBackLayout.this
                android.graphics.drawable.Drawable r3 = r3.f5880l
                int r3 = r3.getIntrinsicHeight()
            L3b:
                int r3 = r3 + r2
                float r2 = (float) r3
                float r1 = r1 / r2
                float r1 = java.lang.Math.abs(r1)
                r0.f5874f = r1
            L44:
                com.github.kilnn.swipeback.SwipeBackLayout r0 = com.github.kilnn.swipeback.SwipeBackLayout.this
                r0.f5875g = r5
                r0.f5876h = r6
                r0.invalidate()
                com.github.kilnn.swipeback.SwipeBackLayout r5 = com.github.kilnn.swipeback.SwipeBackLayout.this
                float r6 = r5.f5874f
                float r0 = r5.f5870b
                r1 = 1
                int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r6 >= 0) goto L5e
                boolean r6 = r4.f5886a
                if (r6 != 0) goto L5e
                r4.f5886a = r1
            L5e:
                java.util.ArrayList r5 = r5.f5877i
                if (r5 == 0) goto L95
                boolean r5 = r5.isEmpty()
                if (r5 != 0) goto L95
                com.github.kilnn.swipeback.SwipeBackLayout r5 = com.github.kilnn.swipeback.SwipeBackLayout.this
                com.github.kilnn.swipeback.a r6 = r5.f5873e
                int r6 = r6.f5889a
                if (r6 != r1) goto L95
                float r6 = r5.f5874f
                float r0 = r5.f5870b
                int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r6 < 0) goto L95
                boolean r6 = r4.f5886a
                if (r6 == 0) goto L95
                r6 = 0
                r4.f5886a = r6
                java.util.ArrayList r5 = r5.f5877i
                java.util.Iterator r5 = r5.iterator()
            L85:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L95
                java.lang.Object r6 = r5.next()
                com.github.kilnn.swipeback.SwipeBackLayout$a r6 = (com.github.kilnn.swipeback.SwipeBackLayout.a) r6
                r6.b()
                goto L85
            L95:
                com.github.kilnn.swipeback.SwipeBackLayout r5 = com.github.kilnn.swipeback.SwipeBackLayout.this
                float r5 = r5.f5874f
                r6 = 1065353216(0x3f800000, float:1.0)
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 >= 0) goto La0
                return
            La0:
                r5 = 0
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.kilnn.swipeback.SwipeBackLayout.b.a(int, int):void");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeBackLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10 = R.attr.SwipeBackLayoutStyle;
        this.f5870b = 0.3f;
        this.f5871c = true;
        this.f5882n = -1728053248;
        this.f5884p = new Rect();
        this.f5873e = new com.github.kilnn.swipeback.a(getContext(), this, new b());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SwipeBackLayout, i10, R.style.SwipeBackLayout);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SwipeBackLayout_edge_size, -1);
        if (dimensionPixelSize > 0) {
            setEdgeSize(dimensionPixelSize);
        }
        setEdgeTrackingEnabled(f5868r[obtainStyledAttributes.getInt(R.styleable.SwipeBackLayout_edge_flag, 0)]);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.SwipeBackLayout_shadow_left, R.drawable.shadow_left);
        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.SwipeBackLayout_shadow_right, R.drawable.shadow_right);
        int resourceId3 = obtainStyledAttributes.getResourceId(R.styleable.SwipeBackLayout_shadow_bottom, R.drawable.shadow_bottom);
        a(resourceId, 1);
        a(resourceId2, 2);
        a(resourceId3, 8);
        obtainStyledAttributes.recycle();
        float f10 = getResources().getDisplayMetrics().density * 400.0f;
        com.github.kilnn.swipeback.a aVar = this.f5873e;
        aVar.f5902n = f10;
        aVar.f5901m = f10 * 2.0f;
    }

    private void setContentView(View view) {
        this.f5872d = view;
    }

    public final void a(int i10, int i11) {
        Drawable drawable = getResources().getDrawable(i10);
        if ((i11 & 1) != 0) {
            this.f5878j = drawable;
        } else if ((i11 & 2) != 0) {
            this.f5879k = drawable;
        } else if ((i11 & 8) != 0) {
            this.f5880l = drawable;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void computeScroll() {
        boolean z10;
        this.f5881m = 1.0f - this.f5874f;
        com.github.kilnn.swipeback.a aVar = this.f5873e;
        if (aVar.f5889a == 2) {
            boolean computeScrollOffset = aVar.f5905q.f22594a.computeScrollOffset();
            int currX = aVar.f5905q.f22594a.getCurrX();
            int currY = aVar.f5905q.f22594a.getCurrY();
            int left = currX - aVar.f5907s.getLeft();
            int top = currY - aVar.f5907s.getTop();
            if (left != 0) {
                aVar.f5907s.offsetLeftAndRight(left);
            }
            if (top != 0) {
                aVar.f5907s.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                aVar.f5906r.a(currX, currY);
            }
            if (computeScrollOffset && currX == aVar.f5905q.f22594a.getFinalX() && currY == aVar.f5905q.f22594a.getFinalY()) {
                aVar.f5905q.f22594a.abortAnimation();
                computeScrollOffset = aVar.f5905q.f22594a.isFinished();
            }
            if (!computeScrollOffset) {
                aVar.f5909u.post(aVar.f5910v);
            }
        }
        if (aVar.f5889a == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.d.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        if (view == this.f5872d) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (this.f5881m > 0.0f && z10 && this.f5873e.f5889a != 0) {
            Rect rect = this.f5884p;
            view.getHitRect(rect);
            if ((this.f5869a & 1) != 0) {
                Drawable drawable = this.f5878j;
                drawable.setBounds(rect.left - drawable.getIntrinsicWidth(), rect.top, rect.left, rect.bottom);
                this.f5878j.setAlpha((int) (this.f5881m * 255.0f));
                this.f5878j.draw(canvas);
            }
            if ((this.f5869a & 2) != 0) {
                Drawable drawable2 = this.f5879k;
                int i10 = rect.right;
                drawable2.setBounds(i10, rect.top, drawable2.getIntrinsicWidth() + i10, rect.bottom);
                this.f5879k.setAlpha((int) (this.f5881m * 255.0f));
                this.f5879k.draw(canvas);
            }
            if ((this.f5869a & 8) != 0) {
                Drawable drawable3 = this.f5880l;
                int i11 = rect.left;
                int i12 = rect.bottom;
                drawable3.setBounds(i11, i12, rect.right, drawable3.getIntrinsicHeight() + i12);
                this.f5880l.setAlpha((int) (this.f5881m * 255.0f));
                this.f5880l.draw(canvas);
            }
            int i13 = this.f5882n;
            int i14 = (i13 & 16777215) | (((int) ((((-16777216) & i13) >>> 24) * this.f5881m)) << 24);
            int i15 = this.f5885q;
            if ((i15 & 1) != 0) {
                canvas.clipRect(0, 0, view.getLeft(), getHeight());
            } else if ((i15 & 2) != 0) {
                canvas.clipRect(view.getRight(), 0, getRight(), getHeight());
            } else if ((i15 & 8) != 0) {
                canvas.clipRect(view.getLeft(), view.getBottom(), getRight(), getHeight());
            }
            canvas.drawColor(i14);
        }
        return drawChild;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f5871c) {
            try {
                return this.f5873e.o(motionEvent);
            } catch (ArrayIndexOutOfBoundsException unused) {
                return false;
            }
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f5883o = true;
        View view = this.f5872d;
        if (view != null) {
            int i14 = this.f5875g;
            view.layout(i14, this.f5876h, view.getMeasuredWidth() + i14, this.f5872d.getMeasuredHeight() + this.f5876h);
        }
        this.f5883o = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x00a2, code lost:
        if ((r0.f5896h[r2] & r0.f5904p) != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x01e3, code lost:
        if ((r0.f5896h[r14] & r0.f5904p) != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x01e5, code lost:
        r0.f5906r.getClass();
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.kilnn.swipeback.SwipeBackLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f5883o) {
            return;
        }
        super.requestLayout();
    }

    public void setEdgeLeftFullScreen(boolean z10) {
        this.f5873e.f5911w = z10;
    }

    public void setEdgeSize(int i10) {
        this.f5873e.f5903o = i10;
    }

    public void setEdgeTrackingEnabled(int i10) {
        this.f5869a = i10;
        this.f5873e.f5904p = i10;
    }

    public void setEnableGesture(boolean z10) {
        this.f5871c = z10;
    }

    public void setScrimColor(int i10) {
        this.f5882n = i10;
        invalidate();
    }

    public void setScrollThresHold(float f10) {
        if (f10 >= 1.0f || f10 <= 0.0f) {
            throw new IllegalArgumentException("Threshold value should be between 0 and 1.0");
        }
        this.f5870b = f10;
    }

    @Deprecated
    public void setSwipeListener(a aVar) {
        if (this.f5877i == null) {
            this.f5877i = new ArrayList();
        }
        this.f5877i.add(aVar);
    }
}
