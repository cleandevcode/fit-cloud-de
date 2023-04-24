package com.mob.tools.gui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.mob.tools.utils.ResHelper;

/* loaded from: classes.dex */
public class MobDrawerLayout extends ViewGroup {
    private static final int SNAP_VELOCITY = 500;
    private static final int TOUCH_STATE_REST = 0;
    private static final int TOUCH_STATE_SCROLLING = 1;
    private FrameLayout bodyContainer;
    private FrameLayout drawerContainer;
    private double drawerWidth;
    private float lastMotionX;
    private float lastMotionY;
    private OnDrawerStateChangeListener listener;
    private boolean lockScroll;
    private int maximumVelocity;
    private boolean opened;
    private Paint paint;
    private Scroller scroller;
    private int touchSlop;
    private int touchState;
    private DrawerType type;
    private VelocityTracker velocityTracker;

    /* renamed from: com.mob.tools.gui.MobDrawerLayout$2 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$mob$tools$gui$MobDrawerLayout$DrawerType;

        static {
            int[] iArr = new int[DrawerType.values().length];
            $SwitchMap$com$mob$tools$gui$MobDrawerLayout$DrawerType = iArr;
            try {
                iArr[DrawerType.LEFT_COVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$mob$tools$gui$MobDrawerLayout$DrawerType[DrawerType.RIGHT_COVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$mob$tools$gui$MobDrawerLayout$DrawerType[DrawerType.LEFT_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$mob$tools$gui$MobDrawerLayout$DrawerType[DrawerType.LEFT_PUSH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$mob$tools$gui$MobDrawerLayout$DrawerType[DrawerType.RIGHT_BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$mob$tools$gui$MobDrawerLayout$DrawerType[DrawerType.RIGHT_PUSH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum DrawerType {
        LEFT_COVER,
        RIGHT_COVER,
        LEFT_BOTTOM,
        RIGHT_BOTTOM,
        LEFT_PUSH,
        RIGHT_PUSH
    }

    /* loaded from: classes.dex */
    public interface OnDrawerStateChangeListener {
        void onClosing(MobDrawerLayout mobDrawerLayout, int i10);

        void onOpening(MobDrawerLayout mobDrawerLayout, int i10);
    }

    public MobDrawerLayout(Context context) {
        super(context);
        init(context);
    }

    public MobDrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public MobDrawerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0060, code lost:
        if (r5 >= (((int) (getWidth() * r4.drawerWidth)) / 2)) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void computeDrag(int r5) {
        /*
            r4 = this;
            r0 = 500(0x1f4, float:7.0E-43)
            if (r5 < r0) goto L12
            int[] r5 = com.mob.tools.gui.MobDrawerLayout.AnonymousClass2.$SwitchMap$com$mob$tools$gui$MobDrawerLayout$DrawerType
            com.mob.tools.gui.MobDrawerLayout$DrawerType r0 = r4.type
            int r0 = r0.ordinal()
            r5 = r5[r0]
            switch(r5) {
                case 1: goto L62;
                case 2: goto L66;
                case 3: goto L62;
                case 4: goto L62;
                case 5: goto L66;
                case 6: goto L66;
                default: goto L11;
            }
        L11:
            goto L69
        L12:
            r0 = -500(0xfffffffffffffe0c, float:NaN)
            if (r5 > r0) goto L24
            int[] r5 = com.mob.tools.gui.MobDrawerLayout.AnonymousClass2.$SwitchMap$com$mob$tools$gui$MobDrawerLayout$DrawerType
            com.mob.tools.gui.MobDrawerLayout$DrawerType r0 = r4.type
            int r0 = r0.ordinal()
            r5 = r5[r0]
            switch(r5) {
                case 1: goto L66;
                case 2: goto L62;
                case 3: goto L66;
                case 4: goto L66;
                case 5: goto L62;
                case 6: goto L62;
                default: goto L23;
            }
        L23:
            goto L69
        L24:
            r5 = 0
            int[] r0 = com.mob.tools.gui.MobDrawerLayout.AnonymousClass2.$SwitchMap$com$mob$tools$gui$MobDrawerLayout$DrawerType
            com.mob.tools.gui.MobDrawerLayout$DrawerType r1 = r4.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L4e;
                case 2: goto L42;
                case 3: goto L3b;
                case 4: goto L4e;
                case 5: goto L33;
                case 6: goto L42;
                default: goto L32;
            }
        L32:
            goto L54
        L33:
            android.widget.FrameLayout r5 = r4.bodyContainer
            int r5 = r5.getLeft()
            int r5 = -r5
            goto L54
        L3b:
            android.widget.FrameLayout r5 = r4.bodyContainer
            int r5 = r5.getLeft()
            goto L54
        L42:
            int r5 = r4.getWidth()
            android.widget.FrameLayout r0 = r4.drawerContainer
            int r0 = r0.getLeft()
            int r5 = r5 - r0
            goto L54
        L4e:
            android.widget.FrameLayout r5 = r4.drawerContainer
            int r5 = r5.getRight()
        L54:
            int r0 = r4.getWidth()
            double r0 = (double) r0
            double r2 = r4.drawerWidth
            double r0 = r0 * r2
            int r0 = (int) r0
            int r0 = r0 / 2
            if (r5 < r0) goto L66
        L62:
            r4.open()
            goto L69
        L66:
            r4.close()
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.gui.MobDrawerLayout.computeDrag(int):void");
    }

    private void dragToLeft(int i10) {
        int i11;
        int width;
        switch (AnonymousClass2.$SwitchMap$com$mob$tools$gui$MobDrawerLayout$DrawerType[this.type.ordinal()]) {
            case 1:
                int right = this.drawerContainer.getRight();
                if (right > 0) {
                    int i12 = right - i10;
                    if (i12 < 0) {
                        i12 = 0;
                    }
                    this.drawerContainer.layout(i12 - ((int) (getWidth() * this.drawerWidth)), 0, i12, getHeight());
                    return;
                }
                return;
            case 2:
                int right2 = this.drawerContainer.getRight();
                int width2 = getWidth();
                if (right2 > width2) {
                    int i13 = right2 - i10;
                    if (i13 >= width2) {
                        width2 = i13;
                    }
                    this.drawerContainer.layout(width2 - ((int) (getWidth() * this.drawerWidth)), 0, width2, getHeight());
                    return;
                }
                return;
            case 3:
                int left = this.bodyContainer.getLeft();
                if (left > 0) {
                    i11 = left - i10;
                    if (i11 < 0) {
                        i11 = 0;
                    }
                    width = getWidth() + i11;
                    break;
                } else {
                    return;
                }
            case 4:
                int right3 = this.drawerContainer.getRight();
                if (right3 > 0) {
                    int i14 = right3 - i10;
                    if (i14 < 0) {
                        i14 = 0;
                    }
                    this.drawerContainer.layout(i14 - ((int) (getWidth() * this.drawerWidth)), 0, i14, getHeight());
                    this.bodyContainer.layout(i14, 0, getWidth() + i14, getHeight());
                    return;
                }
                return;
            case 5:
                int left2 = this.bodyContainer.getLeft();
                int i15 = (int) ((-getWidth()) * this.drawerWidth);
                if (left2 > i15) {
                    int i16 = left2 - i10;
                    if (i16 >= i15) {
                        i15 = i16;
                    }
                    this.bodyContainer.layout(i15, 0, getWidth() + i15, getHeight());
                    return;
                }
                return;
            case 6:
                int right4 = this.drawerContainer.getRight();
                int width3 = getWidth();
                if (right4 > width3) {
                    int i17 = right4 - i10;
                    if (i17 >= width3) {
                        width3 = i17;
                    }
                    width = width3 - ((int) (getWidth() * this.drawerWidth));
                    i11 = width - getWidth();
                    this.drawerContainer.layout(width, 0, width3, getHeight());
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        this.bodyContainer.layout(i11, 0, width, getHeight());
    }

    private void dragToRight(int i10) {
        int i11;
        int width;
        FrameLayout frameLayout;
        int width2;
        int width3;
        FrameLayout frameLayout2;
        int width4;
        int width5;
        FrameLayout frameLayout3;
        switch (AnonymousClass2.$SwitchMap$com$mob$tools$gui$MobDrawerLayout$DrawerType[this.type.ordinal()]) {
            case 1:
                int left = this.drawerContainer.getLeft();
                if (left < 0) {
                    i11 = left + i10;
                    if (i11 > 0) {
                        i11 = 0;
                    }
                    width = ((int) (getWidth() * this.drawerWidth)) + i11;
                    frameLayout = this.drawerContainer;
                    frameLayout.layout(i11, 0, width, getHeight());
                    return;
                }
                return;
            case 2:
                int left2 = this.drawerContainer.getLeft();
                width2 = getWidth();
                if (left2 < width2) {
                    int i12 = left2 + i10;
                    if (i12 <= width2) {
                        width2 = i12;
                    }
                    width3 = ((int) (getWidth() * this.drawerWidth)) + width2;
                    frameLayout2 = this.drawerContainer;
                    frameLayout2.layout(width2, 0, width3, getHeight());
                    return;
                }
                return;
            case 3:
                int left3 = this.bodyContainer.getLeft();
                width2 = (int) (getWidth() * this.drawerWidth);
                if (left3 < width2) {
                    int i13 = left3 + i10;
                    if (i13 <= width2) {
                        width2 = i13;
                    }
                    width3 = getWidth() + width2;
                    frameLayout2 = this.bodyContainer;
                    frameLayout2.layout(width2, 0, width3, getHeight());
                    return;
                }
                return;
            case 4:
                int left4 = this.drawerContainer.getLeft();
                if (left4 < 0) {
                    int i14 = left4 + i10;
                    if (i14 > 0) {
                        i14 = 0;
                    }
                    width4 = ((int) (getWidth() * this.drawerWidth)) + i14;
                    width5 = getWidth() + width4;
                    this.drawerContainer.layout(i14, 0, width4, getHeight());
                    frameLayout3 = this.bodyContainer;
                    frameLayout3.layout(width4, 0, width5, getHeight());
                    return;
                }
                return;
            case 5:
                int left5 = this.bodyContainer.getLeft();
                if (left5 < 0) {
                    i11 = left5 + i10;
                    if (i11 > 0) {
                        i11 = 0;
                    }
                    width = getWidth() + i11;
                    frameLayout = this.bodyContainer;
                    frameLayout.layout(i11, 0, width, getHeight());
                    return;
                }
                return;
            case 6:
                int left6 = this.bodyContainer.getLeft();
                if (left6 < 0) {
                    int i15 = left6 + i10;
                    if (i15 > 0) {
                        i15 = 0;
                    }
                    width4 = getWidth() + i15;
                    width5 = ((int) (getWidth() * this.drawerWidth)) + width4;
                    this.bodyContainer.layout(i15, 0, width4, getHeight());
                    frameLayout3 = this.drawerContainer;
                    frameLayout3.layout(width4, 0, width5, getHeight());
                    return;
                }
                return;
            default:
                return;
        }
    }

    private void drawShadow(Canvas canvas) {
        Paint paint;
        LinearGradient linearGradient;
        float f10;
        float f11;
        float f12;
        Paint paint2;
        LinearGradient linearGradient2;
        float f13;
        float f14;
        int i10 = AnonymousClass2.$SwitchMap$com$mob$tools$gui$MobDrawerLayout$DrawerType[this.type.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                int left = this.drawerContainer.getLeft();
                if (left >= getWidth()) {
                    return;
                }
                paint2 = this.paint;
                f13 = left - 25;
                f14 = left;
                linearGradient2 = new LinearGradient(f13, 0.0f, f14, 0.0f, 0, Integer.MIN_VALUE, Shader.TileMode.CLAMP);
            } else if (i10 == 5 || i10 == 6) {
                int right = this.bodyContainer.getRight();
                if (right >= getWidth()) {
                    return;
                }
                paint = this.paint;
                f10 = 0.0f;
                f11 = right;
                f12 = right + 25;
                linearGradient = new LinearGradient(f11, 0.0f, f12, 0.0f, Integer.MIN_VALUE, 0, Shader.TileMode.CLAMP);
            } else {
                int left2 = this.bodyContainer.getLeft();
                if (left2 <= 0) {
                    return;
                }
                paint2 = this.paint;
                f13 = left2 - 25;
                f14 = left2;
                linearGradient2 = new LinearGradient(f13, 0.0f, f14, 0.0f, 0, Integer.MIN_VALUE, Shader.TileMode.CLAMP);
            }
            paint2.setShader(linearGradient2);
            canvas.drawRect(f13, 0.0f, f14, getHeight(), this.paint);
            return;
        }
        int right2 = this.drawerContainer.getRight();
        if (right2 <= 0) {
            return;
        }
        paint = this.paint;
        f10 = 0.0f;
        f11 = right2;
        f12 = right2 + 25;
        linearGradient = new LinearGradient(f11, 0.0f, f12, 0.0f, Integer.MIN_VALUE, 0, Shader.TileMode.CLAMP);
        paint.setShader(linearGradient);
        canvas.drawRect(f11, f10, f12, getHeight(), this.paint);
    }

    private void init(Context context) {
        this.scroller = SmoothScroller.DEFAULT.getScroller(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.touchSlop = viewConfiguration.getScaledTouchSlop();
        this.maximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.type = DrawerType.LEFT_COVER;
        this.drawerWidth = 0.8d;
        this.touchState = 0;
        this.paint = new Paint();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.mob.tools.gui.MobDrawerLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        };
        FrameLayout frameLayout = new FrameLayout(context);
        this.bodyContainer = frameLayout;
        frameLayout.setOnClickListener(onClickListener);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.drawerContainer = frameLayout2;
        frameLayout2.setOnClickListener(onClickListener);
        addView(this.bodyContainer);
        addView(this.drawerContainer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x001a, code lost:
        if (r4.bodyContainer.getRight() == getWidth()) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0023, code lost:
        if (r4.bodyContainer.getLeft() == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0030, code lost:
        if (r4.drawerContainer.getLeft() == getWidth()) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0039, code lost:
        if (r4.drawerContainer.getRight() == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x003c, code lost:
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean isClose() {
        /*
            r4 = this;
            int[] r0 = com.mob.tools.gui.MobDrawerLayout.AnonymousClass2.$SwitchMap$com$mob$tools$gui$MobDrawerLayout$DrawerType
            com.mob.tools.gui.MobDrawerLayout$DrawerType r1 = r4.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L33;
                case 2: goto L26;
                case 3: goto L1d;
                case 4: goto L1d;
                case 5: goto L10;
                case 6: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L3e
        L10:
            android.widget.FrameLayout r0 = r4.bodyContainer
            int r0 = r0.getRight()
            int r3 = r4.getWidth()
            if (r0 != r3) goto L3c
            goto L3d
        L1d:
            android.widget.FrameLayout r0 = r4.bodyContainer
            int r0 = r0.getLeft()
            if (r0 != 0) goto L3c
            goto L3d
        L26:
            android.widget.FrameLayout r0 = r4.drawerContainer
            int r0 = r0.getLeft()
            int r3 = r4.getWidth()
            if (r0 != r3) goto L3c
            goto L3d
        L33:
            android.widget.FrameLayout r0 = r4.drawerContainer
            int r0 = r0.getRight()
            if (r0 != 0) goto L3c
            goto L3d
        L3c:
            r1 = 0
        L3d:
            r2 = r1
        L3e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.gui.MobDrawerLayout.isClose():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0023, code lost:
        if (r9 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x004f, code lost:
        if (r9 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0052, code lost:
        r9 = -getWidth();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void switchDrawer(boolean r9, boolean r10) {
        /*
            r8 = this;
            android.widget.FrameLayout r0 = r8.bodyContainer
            r0.clearFocus()
            android.widget.FrameLayout r0 = r8.drawerContainer
            r0.clearFocus()
            int[] r0 = com.mob.tools.gui.MobDrawerLayout.AnonymousClass2.$SwitchMap$com$mob$tools$gui$MobDrawerLayout$DrawerType
            com.mob.tools.gui.MobDrawerLayout$DrawerType r1 = r8.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            r2 = 0
            switch(r0) {
                case 1: goto L49;
                case 2: goto L33;
                case 3: goto L26;
                case 4: goto L49;
                case 5: goto L1d;
                case 6: goto L33;
                default: goto L1a;
            }
        L1a:
            r9 = 0
            r3 = 0
            goto L5e
        L1d:
            android.widget.FrameLayout r0 = r8.bodyContainer
            int r0 = r0.getLeft()
            if (r9 == 0) goto L5c
            goto L52
        L26:
            android.widget.FrameLayout r0 = r8.bodyContainer
            int r0 = r0.getLeft()
            if (r9 == 0) goto L5c
            int r9 = r8.getWidth()
            goto L57
        L33:
            int r0 = r8.getWidth()
            android.widget.FrameLayout r4 = r8.drawerContainer
            int r4 = r4.getLeft()
            if (r9 == 0) goto L44
            double r2 = (double) r0
            double r5 = r8.drawerWidth
            double r2 = r2 * r5
        L44:
            int r9 = (int) r2
            int r9 = r0 - r9
            r3 = r4
            goto L5e
        L49:
            android.widget.FrameLayout r0 = r8.drawerContainer
            int r0 = r0.getLeft()
            if (r9 == 0) goto L52
            goto L5c
        L52:
            int r9 = r8.getWidth()
            int r9 = -r9
        L57:
            double r2 = (double) r9
            double r4 = r8.drawerWidth
            double r2 = r2 * r4
        L5c:
            int r9 = (int) r2
            r3 = r0
        L5e:
            android.widget.Scroller r0 = r8.scroller
            r0.abortAnimation()
            if (r3 == r9) goto L76
            android.widget.Scroller r2 = r8.scroller
            r4 = 0
            int r5 = r9 - r3
            r6 = 0
            if (r10 == 0) goto L6f
            r7 = 0
            goto L73
        L6f:
            r1 = 100
            r7 = 100
        L73:
            r2.startScroll(r3, r4, r5, r6, r7)
        L76:
            r8.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.gui.MobDrawerLayout.switchDrawer(boolean, boolean):void");
    }

    public void close() {
        close(false);
    }

    public void close(boolean z10) {
        switchDrawer(false, z10);
    }

    @Override // android.view.View
    public void computeScroll() {
        int currX;
        int width;
        FrameLayout frameLayout;
        if (!this.scroller.computeScrollOffset()) {
            if (isClose()) {
                this.opened = false;
                return;
            } else {
                this.opened = true;
                return;
            }
        }
        switch (AnonymousClass2.$SwitchMap$com$mob$tools$gui$MobDrawerLayout$DrawerType[this.type.ordinal()]) {
            case 1:
            case 2:
                currX = this.scroller.getCurrX();
                width = ((int) (getWidth() * this.drawerWidth)) + currX;
                frameLayout = this.drawerContainer;
                frameLayout.layout(currX, 0, width, getHeight());
                break;
            case 3:
            case 5:
                currX = this.scroller.getCurrX();
                width = getWidth() + currX;
                frameLayout = this.bodyContainer;
                frameLayout.layout(currX, 0, width, getHeight());
                break;
            case 4:
                int width2 = getWidth();
                int currX2 = this.scroller.getCurrX();
                int i10 = ((int) (width2 * this.drawerWidth)) + currX2;
                this.drawerContainer.layout(currX2, 0, i10, getHeight());
                this.bodyContainer.layout(i10, 0, width2 + i10, getHeight());
                break;
            case 6:
                int width3 = getWidth();
                int currX3 = this.scroller.getCurrX();
                this.bodyContainer.layout(currX3 - width3, 0, currX3, getHeight());
                this.drawerContainer.layout(currX3, 0, ((int) (width3 * this.drawerWidth)) + currX3, getHeight());
                break;
        }
        postInvalidate();
        if (this.listener == null || this.scroller.getFinalX() == this.scroller.getStartX()) {
            return;
        }
        int currX4 = ((this.scroller.getCurrX() - this.scroller.getStartX()) * 100) / (this.scroller.getFinalX() - this.scroller.getStartX());
        if (this.opened) {
            this.listener.onClosing(this, currX4);
        } else {
            this.listener.onOpening(this, currX4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        long drawingTime = getDrawingTime();
        int i10 = AnonymousClass2.$SwitchMap$com$mob$tools$gui$MobDrawerLayout$DrawerType[this.type.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 6) {
            frameLayout = this.bodyContainer;
            frameLayout2 = this.drawerContainer;
        } else {
            frameLayout = this.drawerContainer;
            frameLayout2 = this.bodyContainer;
        }
        drawChild(canvas, frameLayout, drawingTime);
        drawChild(canvas, frameLayout2, drawingTime);
        drawShadow(canvas);
    }

    public boolean isOpened() {
        return this.opened;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0029, code lost:
        if (r0 != 3) goto L19;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.lockScroll
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            int r0 = r6.getAction()
            r2 = 2
            r3 = 1
            if (r0 != r2) goto L13
            int r4 = r5.touchState
            if (r4 == 0) goto L13
            return r3
        L13:
            android.view.VelocityTracker r4 = r5.velocityTracker
            if (r4 != 0) goto L1d
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r5.velocityTracker = r4
        L1d:
            android.view.VelocityTracker r4 = r5.velocityTracker
            r4.addMovement(r6)
            if (r0 == 0) goto L5d
            if (r0 == r3) goto L50
            if (r0 == r2) goto L2c
            r6 = 3
            if (r0 == r6) goto L50
            goto L72
        L2c:
            float r0 = r6.getX()
            float r6 = r6.getY()
            float r2 = r5.lastMotionX
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r2 = (int) r2
            float r4 = r5.lastMotionY
            float r6 = r6 - r4
            float r6 = java.lang.Math.abs(r6)
            int r6 = (int) r6
            if (r6 >= r2) goto L72
            int r6 = r5.touchSlop
            if (r2 <= r6) goto L72
            r5.touchState = r3
            r5.lastMotionX = r0
            goto L72
        L50:
            android.view.VelocityTracker r6 = r5.velocityTracker
            if (r6 == 0) goto L5a
            r6.recycle()
            r6 = 0
            r5.velocityTracker = r6
        L5a:
            r5.touchState = r1
            goto L72
        L5d:
            float r0 = r6.getX()
            r5.lastMotionX = r0
            float r6 = r6.getY()
            r5.lastMotionY = r6
            android.widget.Scroller r6 = r5.scroller
            boolean r6 = r6.isFinished()
            r6 = r6 ^ r3
            r5.touchState = r6
        L72:
            int r6 = r5.touchState
            if (r6 == 0) goto L77
            r1 = 1
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.gui.MobDrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            int r6 = r6 - r4
            int r7 = r7 - r5
            double r3 = (double) r6
            double r0 = r2.drawerWidth
            double r3 = r3 * r0
            int r3 = (int) r3
            boolean r4 = r2.isOpened()
            r5 = 0
            if (r4 == 0) goto L2f
            int[] r4 = com.mob.tools.gui.MobDrawerLayout.AnonymousClass2.$SwitchMap$com$mob$tools$gui$MobDrawerLayout$DrawerType
            com.mob.tools.gui.MobDrawerLayout$DrawerType r0 = r2.type
            int r0 = r0.ordinal()
            r4 = r4[r0]
            switch(r4) {
                case 1: goto L4a;
                case 2: goto L3d;
                case 3: goto L28;
                case 4: goto L28;
                case 5: goto L1d;
                case 6: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L6c
        L1d:
            android.widget.FrameLayout r4 = r2.bodyContainer
            int r0 = -r3
            int r3 = r6 - r3
            r4.layout(r0, r5, r3, r7)
            android.widget.FrameLayout r4 = r2.drawerContainer
            goto L46
        L28:
            android.widget.FrameLayout r4 = r2.bodyContainer
            int r6 = r6 + r3
            r4.layout(r3, r5, r6, r7)
            goto L4f
        L2f:
            int[] r4 = com.mob.tools.gui.MobDrawerLayout.AnonymousClass2.$SwitchMap$com$mob$tools$gui$MobDrawerLayout$DrawerType
            com.mob.tools.gui.MobDrawerLayout$DrawerType r0 = r2.type
            int r0 = r0.ordinal()
            r4 = r4[r0]
            switch(r4) {
                case 1: goto L61;
                case 2: goto L55;
                case 3: goto L4a;
                case 4: goto L61;
                case 5: goto L3d;
                case 6: goto L55;
                default: goto L3c;
            }
        L3c:
            goto L6c
        L3d:
            android.widget.FrameLayout r4 = r2.bodyContainer
            r4.layout(r5, r5, r6, r7)
            android.widget.FrameLayout r4 = r2.drawerContainer
            int r3 = r6 - r3
        L46:
            r4.layout(r3, r5, r6, r7)
            goto L6c
        L4a:
            android.widget.FrameLayout r4 = r2.bodyContainer
            r4.layout(r5, r5, r6, r7)
        L4f:
            android.widget.FrameLayout r4 = r2.drawerContainer
            r4.layout(r5, r5, r3, r7)
            goto L6c
        L55:
            android.widget.FrameLayout r4 = r2.bodyContainer
            r4.layout(r5, r5, r6, r7)
            android.widget.FrameLayout r4 = r2.drawerContainer
            int r3 = r3 + r6
            r4.layout(r6, r5, r3, r7)
            goto L6c
        L61:
            android.widget.FrameLayout r4 = r2.bodyContainer
            r4.layout(r5, r5, r6, r7)
            android.widget.FrameLayout r4 = r2.drawerContainer
            int r3 = -r3
            r4.layout(r3, r5, r5, r7)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.gui.MobDrawerLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.bodyContainer.measure(makeMeasureSpec, makeMeasureSpec2);
        this.drawerContainer.measure(View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * this.drawerWidth), 1073741824), makeMeasureSpec2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x001c, code lost:
        if (r0 != 3) goto L11;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            android.view.VelocityTracker r0 = r3.velocityTracker
            if (r0 != 0) goto La
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r3.velocityTracker = r0
        La:
            android.view.VelocityTracker r0 = r3.velocityTracker
            r0.addMovement(r4)
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == 0) goto L68
            if (r0 == r1) goto L42
            r2 = 2
            if (r0 == r2) goto L1f
            r4 = 3
            if (r0 == r4) goto L42
            goto L7f
        L1f:
            int r0 = r3.touchState
            if (r0 == r1) goto L2d
            boolean r0 = r3.onInterceptTouchEvent(r4)
            if (r0 == 0) goto L7f
            int r0 = r3.touchState
            if (r0 != r1) goto L7f
        L2d:
            float r4 = r4.getX()
            float r0 = r3.lastMotionX
            float r0 = r0 - r4
            int r0 = (int) r0
            if (r0 >= 0) goto L3c
            int r0 = -r0
            r3.dragToRight(r0)
            goto L7d
        L3c:
            if (r0 <= 0) goto L7d
            r3.dragToLeft(r0)
            goto L7d
        L42:
            int r4 = r3.touchState
            if (r4 != r1) goto L64
            android.view.VelocityTracker r4 = r3.velocityTracker
            if (r4 == 0) goto L64
            r0 = 1000(0x3e8, float:1.401E-42)
            int r2 = r3.maximumVelocity
            float r2 = (float) r2
            r4.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r4 = r3.velocityTracker
            float r4 = r4.getXVelocity()
            int r4 = (int) r4
            r3.computeDrag(r4)
            android.view.VelocityTracker r4 = r3.velocityTracker
            r4.recycle()
            r4 = 0
            r3.velocityTracker = r4
        L64:
            r4 = 0
            r3.touchState = r4
            goto L7f
        L68:
            int r0 = r3.touchState
            if (r0 == 0) goto L7f
            android.widget.Scroller r0 = r3.scroller
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L79
            android.widget.Scroller r0 = r3.scroller
            r0.abortAnimation()
        L79:
            float r4 = r4.getX()
        L7d:
            r3.lastMotionX = r4
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.gui.MobDrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void open() {
        open(false);
    }

    public void open(boolean z10) {
        switchDrawer(true, z10);
    }

    public void setBody(View view) {
        if (ResHelper.isEqual(this.bodyContainer.getChildCount() == 0 ? null : this.bodyContainer.getChildAt(0), view)) {
            return;
        }
        this.bodyContainer.removeAllViews();
        this.bodyContainer.addView(view);
    }

    public void setDrawer(View view) {
        if (ResHelper.isEqual(this.drawerContainer.getChildCount() == 0 ? null : this.drawerContainer.getChildAt(0), view)) {
            return;
        }
        this.drawerContainer.removeAllViews();
        this.drawerContainer.addView(view);
    }

    public void setDrawerType(DrawerType drawerType) {
        if (drawerType == null) {
            drawerType = DrawerType.LEFT_COVER;
        }
        if (this.type != drawerType) {
            this.type = drawerType;
            int i10 = AnonymousClass2.$SwitchMap$com$mob$tools$gui$MobDrawerLayout$DrawerType[drawerType.ordinal()];
            ((i10 == 1 || i10 == 2) ? this.drawerContainer : this.bodyContainer).bringToFront();
            postInvalidate();
        }
    }

    public void setDrawerWidth(double d10) {
        if (d10 < 0.0d) {
            d10 = 0.800000011920929d;
        }
        if (d10 > 1.0d) {
            d10 = 1.0d;
        }
        if (this.drawerWidth != d10) {
            this.drawerWidth = d10;
            postInvalidate();
        }
    }

    public void setLockScroll(boolean z10) {
        this.lockScroll = z10;
    }

    public void setOnDrawerStateChangeListener(OnDrawerStateChangeListener onDrawerStateChangeListener) {
        this.listener = onDrawerStateChangeListener;
    }
}
