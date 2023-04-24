package com.mob.tools.gui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* loaded from: classes.dex */
public class MobViewPager extends ViewGroup {
    private static final int DECELERATION = 10;
    private static final int SNAP_VELOCITY = 500;
    private static final int TOUCH_STATE_REST = 0;
    private static final int TOUCH_STATE_SCROLLING = 1;
    private ViewPagerAdapter adapter;
    private View currentPage;
    private int currentScreen;
    private int flingVelocity;
    private float lastMotionX;
    private float lastMotionY;
    private int maximumVelocity;
    private View nextPage;
    private int pageWidth;
    private View previousPage;
    private int screenCount;
    private Scroller scroller;
    private boolean skipScreen;
    private int touchSlop;
    private int touchState;
    private VelocityTracker velocityTracker;

    public MobViewPager(Context context) {
        this(context, null);
    }

    public MobViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MobViewPager(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init(context);
    }

    private void adjustScroller() {
        this.skipScreen = true;
        if (this.currentPage != null) {
            View focusedChild = getFocusedChild();
            View view = this.currentPage;
            if (focusedChild == view) {
                view.clearFocus();
            }
        }
        int width = (getWidth() * this.currentScreen) - getScrollX();
        this.scroller.abortAnimation();
        if (width != 0) {
            this.scroller.startScroll(getScrollX(), 0, width, 0, 0);
        }
        invalidate();
    }

    private void handleInterceptMove(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int abs = (int) Math.abs(x10 - this.lastMotionX);
        if (((int) Math.abs(y10 - this.lastMotionY)) >= abs || abs <= this.touchSlop) {
            return;
        }
        this.touchState = 1;
        this.lastMotionX = x10;
    }

    private void handleScrollMove(MotionEvent motionEvent) {
        int right;
        int min;
        if (this.adapter == null) {
            return;
        }
        float x10 = motionEvent.getX();
        int i10 = (int) (this.lastMotionX - x10);
        this.lastMotionX = x10;
        if (i10 < 0) {
            if (getScrollX() <= 0) {
                return;
            }
            min = Math.max(-getScrollX(), i10);
        } else if (i10 <= 0 || getChildCount() == 0 || (right = (getChildAt(getChildCount() - 1).getRight() - getScrollX()) - getWidth()) <= 0) {
            return;
        } else {
            min = Math.min(right, i10);
        }
        scrollBy(min, 0);
    }

    private void init(Context context) {
        this.scroller = new Scroller(context, new Interpolator() { // from class: com.mob.tools.gui.MobViewPager.1
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                return (2.0f - f10) * f10;
            }
        });
        this.touchState = 0;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.touchSlop = viewConfiguration.getScaledTouchSlop();
        this.maximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void onScreenChange(int i10) {
        if (this.adapter != null) {
            if (this.skipScreen && Math.abs(i10 - this.currentScreen) > 2) {
                removeAllViews();
                int i11 = this.currentScreen;
                if (i11 > 0) {
                    View view = this.adapter.getView(i11 - 1, this.previousPage, this);
                    this.previousPage = view;
                    addView(view);
                }
                View view2 = this.adapter.getView(this.currentScreen, this.currentPage, this);
                this.currentPage = view2;
                addView(view2);
                int i12 = this.currentScreen;
                if (i12 < this.screenCount - 1) {
                    View view3 = this.adapter.getView(i12 + 1, this.nextPage, this);
                    this.nextPage = view3;
                    addView(view3);
                }
            } else if (this.currentScreen > i10) {
                for (int i13 = 0; i13 < this.currentScreen - i10; i13++) {
                    int i14 = i10 + i13 + 1;
                    View view4 = this.previousPage;
                    this.previousPage = this.currentPage;
                    this.currentPage = this.nextPage;
                    if (getChildCount() >= 3) {
                        removeViewAt(0);
                    }
                    if (i14 < this.screenCount - 1) {
                        View view5 = this.adapter.getView(i14 + 1, view4, this);
                        this.nextPage = view5;
                        addView(view5);
                    } else {
                        this.nextPage = view4;
                    }
                }
            } else {
                for (int i15 = 0; i15 < i10 - this.currentScreen; i15++) {
                    int i16 = (i10 - i15) - 1;
                    View view6 = this.nextPage;
                    this.nextPage = this.currentPage;
                    this.currentPage = this.previousPage;
                    if (getChildCount() >= 3) {
                        removeViewAt(2);
                    }
                    if (i16 > 0) {
                        View view7 = this.adapter.getView(i16 - 1, view6, this);
                        this.previousPage = view7;
                        addView(view7, 0);
                    } else {
                        this.previousPage = view6;
                    }
                }
            }
            this.adapter.onScreenChange(this.currentScreen, i10);
        }
    }

    public void scrollToScreenOnUIThread(int i10, boolean z10) {
        int i11;
        this.skipScreen = z10;
        if (this.currentPage != null) {
            View focusedChild = getFocusedChild();
            View view = this.currentPage;
            if (focusedChild == view) {
                view.clearFocus();
            }
        }
        int width = (getWidth() * i10) - getScrollX();
        this.scroller.abortAnimation();
        if (width != 0) {
            int i12 = 0;
            if (z10) {
                i11 = 0;
            } else {
                int abs = Math.abs(width) / 2;
                int i13 = this.flingVelocity;
                if (i13 != 0) {
                    int abs2 = Math.abs(i13);
                    i12 = (int) (((abs2 - Math.sqrt((abs2 * abs2) - (Math.abs(width) * 20))) * 1000.0d) / 10.0d);
                }
                i11 = (i12 == 0 || i12 > abs) ? abs : i12;
            }
            this.scroller.startScroll(getScrollX(), 0, width, 0, i11);
        }
        invalidate();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.adapter == null || this.screenCount <= 0) {
            return;
        }
        if (this.scroller.computeScrollOffset()) {
            scrollTo(this.scroller.getCurrX(), this.scroller.getCurrY());
            postInvalidate();
        } else {
            int i10 = this.currentScreen;
            int currX = this.scroller.getCurrX();
            int width = getWidth();
            int i11 = currX / width;
            if (currX % width > width / 2) {
                i11++;
            }
            int max = Math.max(0, Math.min(i11, this.screenCount - 1));
            this.currentScreen = max;
            if (i10 != max) {
                onScreenChange(i10);
            }
        }
        if (this.adapter != null) {
            this.adapter.onScreenChanging(getScrollX() / getWidth());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.adapter == null || this.screenCount <= 0) {
            return;
        }
        long drawingTime = getDrawingTime();
        if (this.currentScreen > 0) {
            drawChild(canvas, this.previousPage, drawingTime);
        }
        drawChild(canvas, this.currentPage, drawingTime);
        if (this.currentScreen < this.screenCount - 1) {
            drawChild(canvas, this.nextPage, drawingTime);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchUnhandledMove(View view, int i10) {
        int i11;
        int i12;
        if (this.adapter == null) {
            return super.dispatchUnhandledMove(view, i10);
        }
        if (i10 == 17) {
            int i13 = this.currentScreen;
            if (i13 > 0) {
                i12 = i13 - 1;
                scrollToScreenOnUIThread(i12, false);
                return true;
            }
            return super.dispatchUnhandledMove(view, i10);
        }
        if (i10 == 66 && (i11 = this.currentScreen) < this.screenCount - 1) {
            i12 = i11 + 1;
            scrollToScreenOnUIThread(i12, false);
            return true;
        }
        return super.dispatchUnhandledMove(view, i10);
    }

    public int getCurrentScreen() {
        return this.currentScreen;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0024, code lost:
        if (r0 != 3) goto L16;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto Ld
            int r3 = r4.touchState
            if (r3 == 0) goto Ld
            return r2
        Ld:
            android.view.VelocityTracker r3 = r4.velocityTracker
            if (r3 != 0) goto L17
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r4.velocityTracker = r3
        L17:
            android.view.VelocityTracker r3 = r4.velocityTracker
            r3.addMovement(r5)
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L2b
            if (r0 == r1) goto L27
            r5 = 3
            if (r0 == r5) goto L2b
            goto L4d
        L27:
            r4.handleInterceptMove(r5)
            goto L4d
        L2b:
            android.view.VelocityTracker r5 = r4.velocityTracker
            if (r5 == 0) goto L35
            r5.recycle()
            r5 = 0
            r4.velocityTracker = r5
        L35:
            r4.touchState = r3
            goto L4d
        L38:
            float r0 = r5.getX()
            float r5 = r5.getY()
            r4.lastMotionX = r0
            r4.lastMotionY = r5
            android.widget.Scroller r5 = r4.scroller
            boolean r5 = r5.isFinished()
            r5 = r5 ^ r2
            r4.touchState = r5
        L4d:
            int r5 = r4.touchState
            if (r5 == 0) goto L52
            goto L53
        L52:
            r2 = 0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.gui.MobViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.adapter == null || this.screenCount <= 0) {
            return;
        }
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int i16 = this.currentScreen;
        int i17 = i16 * i14;
        if (i16 > 0) {
            this.previousPage.layout(i17 - i14, 0, i17, i15);
        }
        int i18 = i17 + i14;
        this.currentPage.layout(i17, 0, i18, i15);
        if (this.currentScreen < this.screenCount - 1) {
            this.nextPage.layout(i18, 0, i14 + i18, i15);
        }
        if (this.pageWidth != getWidth()) {
            int i19 = this.pageWidth;
            this.pageWidth = getWidth();
            if (i19 != 0) {
                adjustScroller();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.adapter == null || this.screenCount <= 0) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).measure(makeMeasureSpec, makeMeasureSpec2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0026, code lost:
        if (r0 != 3) goto L16;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            com.mob.tools.gui.ViewPagerAdapter r0 = r4.adapter
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.view.VelocityTracker r0 = r4.velocityTracker
            if (r0 != 0) goto L10
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r4.velocityTracker = r0
        L10:
            android.view.VelocityTracker r0 = r4.velocityTracker
            r0.addMovement(r5)
            int r0 = r5.getAction()
            float r2 = r5.getX()
            r3 = 1
            if (r0 == 0) goto L90
            if (r0 == r3) goto L42
            r2 = 2
            if (r0 == r2) goto L2e
            r5 = 3
            if (r0 == r5) goto L2a
            goto La3
        L2a:
            r4.touchState = r1
            goto La3
        L2e:
            int r0 = r4.touchState
            if (r0 != r3) goto L37
        L32:
            r4.handleScrollMove(r5)
            goto La3
        L37:
            boolean r0 = r4.onInterceptTouchEvent(r5)
            if (r0 == 0) goto La3
            int r0 = r4.touchState
            if (r0 != r3) goto La3
            goto L32
        L42:
            int r5 = r4.touchState
            if (r5 != r3) goto L2a
            android.view.VelocityTracker r5 = r4.velocityTracker
            r0 = 1000(0x3e8, float:1.401E-42)
            int r2 = r4.maximumVelocity
            float r2 = (float) r2
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r4.velocityTracker
            float r5 = r5.getXVelocity()
            int r5 = (int) r5
            r4.flingVelocity = r5
            r0 = 500(0x1f4, float:7.0E-43)
            if (r5 <= r0) goto L66
            int r0 = r4.currentScreen
            if (r0 <= 0) goto L66
            int r0 = r0 - r3
            r4.scrollToScreenOnUIThread(r0, r1)
            goto L85
        L66:
            r0 = -500(0xfffffffffffffe0c, float:NaN)
            if (r5 >= r0) goto L76
            int r5 = r4.currentScreen
            int r0 = r4.screenCount
            int r0 = r0 - r3
            if (r5 >= r0) goto L76
            int r5 = r5 + r3
            r4.scrollToScreenOnUIThread(r5, r1)
            goto L85
        L76:
            int r5 = r4.getWidth()
            int r0 = r4.getScrollX()
            int r2 = r5 / 2
            int r2 = r2 + r0
            int r2 = r2 / r5
            r4.scrollToScreenOnUIThread(r2, r1)
        L85:
            android.view.VelocityTracker r5 = r4.velocityTracker
            if (r5 == 0) goto L2a
            r5.recycle()
            r5 = 0
            r4.velocityTracker = r5
            goto L2a
        L90:
            int r5 = r4.touchState
            if (r5 == 0) goto La3
            android.widget.Scroller r5 = r4.scroller
            boolean r5 = r5.isFinished()
            if (r5 != 0) goto La1
            android.widget.Scroller r5 = r4.scroller
            r5.abortAnimation()
        La1:
            r4.lastMotionX = r2
        La3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.gui.MobViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void scrollLeft(boolean z10) {
        int i10 = this.currentScreen;
        if (i10 > 0) {
            scrollToScreen(i10 - 1, z10);
        }
    }

    public void scrollRight(boolean z10) {
        int i10 = this.currentScreen;
        if (i10 < this.screenCount - 1) {
            scrollToScreen(i10 + 1, z10);
        }
    }

    public void scrollToScreen(final int i10, final boolean z10) {
        post(new Runnable() { // from class: com.mob.tools.gui.MobViewPager.2
            @Override // java.lang.Runnable
            public void run() {
                MobViewPager.this.scrollToScreenOnUIThread(i10, z10);
            }
        });
    }

    @Deprecated
    public void scrollToScreen(int i10, boolean z10, boolean z11) {
        scrollToScreen(i10, z10);
    }

    public void setAdapter(ViewPagerAdapter viewPagerAdapter) {
        ViewPagerAdapter viewPagerAdapter2 = this.adapter;
        if (viewPagerAdapter2 != null) {
            viewPagerAdapter2.setMobViewPager(null);
        }
        this.adapter = viewPagerAdapter;
        if (viewPagerAdapter != null) {
            viewPagerAdapter.setMobViewPager(this);
        }
        if (viewPagerAdapter != null) {
            int count = viewPagerAdapter.getCount();
            this.screenCount = count;
            if (count > 0) {
                if (count <= this.currentScreen) {
                    scrollToScreenOnUIThread(count - 1, true);
                    return;
                }
                removeAllViews();
                int i10 = this.currentScreen;
                if (i10 > 0) {
                    View view = viewPagerAdapter.getView(i10 - 1, this.previousPage, this);
                    this.previousPage = view;
                    addView(view);
                }
                View view2 = viewPagerAdapter.getView(this.currentScreen, this.currentPage, this);
                this.currentPage = view2;
                addView(view2);
                int i11 = this.currentScreen;
                if (i11 < this.screenCount - 1) {
                    View view3 = viewPagerAdapter.getView(i11 + 1, this.nextPage, this);
                    this.nextPage = view3;
                    addView(view3);
                    return;
                }
                return;
            }
        }
        this.currentScreen = 0;
        removeAllViews();
    }
}
