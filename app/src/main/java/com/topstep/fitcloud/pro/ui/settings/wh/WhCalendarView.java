package com.topstep.fitcloud.pro.ui.settings.wh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import com.topstep.fitcloudpro.R;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import y0.a;

/* loaded from: classes2.dex */
public class WhCalendarView extends View {
    public static final SparseIntArray C;
    public a A;
    public Drawable B;

    /* renamed from: a */
    public Locale f12030a;

    /* renamed from: b */
    public Date f12031b;

    /* renamed from: c */
    public Paint f12032c;

    /* renamed from: d */
    public int[] f12033d;

    /* renamed from: e */
    public float f12034e;

    /* renamed from: f */
    public float f12035f;

    /* renamed from: g */
    public float f12036g;

    /* renamed from: h */
    public float f12037h;

    /* renamed from: i */
    public float f12038i;

    /* renamed from: j */
    public float f12039j;

    /* renamed from: k */
    public float f12040k;

    /* renamed from: l */
    public Calendar f12041l;

    /* renamed from: m */
    public Date f12042m;

    /* renamed from: n */
    public Date f12043n;

    /* renamed from: o */
    public b f12044o;

    /* renamed from: p */
    public float f12045p;

    /* renamed from: q */
    public float f12046q;

    /* renamed from: r */
    public int f12047r;

    /* renamed from: s */
    public int f12048s;

    /* renamed from: t */
    public float f12049t;

    /* renamed from: u */
    public float f12050u;

    /* renamed from: v */
    public Date f12051v;

    /* renamed from: w */
    public RectF f12052w;

    /* renamed from: x */
    public float f12053x;

    /* renamed from: y */
    public float f12054y;

    /* renamed from: z */
    public float f12055z;

    /* loaded from: classes2.dex */
    public interface a {
        boolean a();

        Integer b(Date date);

        Integer c(Date date);
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(Date date);

        void b(boolean z10);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(1, R.string.ds_alarm_repeat_06_simple);
        sparseIntArray.put(2, R.string.ds_alarm_repeat_00_simple);
        sparseIntArray.put(3, R.string.ds_alarm_repeat_01_simple);
        sparseIntArray.put(4, R.string.ds_alarm_repeat_02_simple);
        sparseIntArray.put(5, R.string.ds_alarm_repeat_03_simple);
        sparseIntArray.put(6, R.string.ds_alarm_repeat_04_simple);
        sparseIntArray.put(7, R.string.ds_alarm_repeat_05_simple);
    }

    public WhCalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12030a = Locale.getDefault();
        this.f12031b = new Date();
        Paint paint = new Paint();
        this.f12032c = paint;
        paint.setAntiAlias(true);
        this.f12032c.setDither(true);
        this.f12041l = Calendar.getInstance();
        this.f12042m = new Date();
        int[] iArr = new int[7];
        this.f12033d = iArr;
        iArr[0] = this.f12041l.getFirstDayOfWeek();
        int i10 = 1;
        while (true) {
            int[] iArr2 = this.f12033d;
            if (i10 < iArr2.length) {
                int i11 = iArr2[i10 - 1] + 1;
                iArr2[i10] = i11;
                if (i11 > 7) {
                    iArr2[i10] = 1;
                }
                i10++;
            } else {
                this.f12052w = new RectF();
                this.f12053x = g7.a.a(getContext(), 2.0f);
                this.f12054y = g7.a.a(getContext(), 4.0f);
                this.f12055z = g7.a.a(getContext(), 1.5f);
                this.f12045p = g7.a.a(getContext(), 36.0f);
                this.f12046q = g7.a.a(getContext(), 4.0f);
                Context context2 = getContext();
                Object obj = y0.a.f30807a;
                this.B = a.c.b(context2, R.drawable.ic_wh_legend_ovulation_day);
                return;
            }
        }
    }

    public static boolean c(Date date, Date date2) {
        return date.getYear() == date2.getYear() && date.getMonth() == date2.getMonth() && date.getDate() == date2.getDate();
    }

    public final void a(float f10) {
        float titleHeightRatio = getTitleHeightRatio();
        float itemPaddingVerticalRatio = getItemPaddingVerticalRatio();
        int i10 = (titleHeightRatio > 0.0f ? 1 : (titleHeightRatio == 0.0f ? 0 : -1));
        int i11 = (itemPaddingVerticalRatio > 0.0f ? 1 : (itemPaddingVerticalRatio == 0.0f ? 0 : -1));
        float titleHeightSize = ((f10 - (i10 > 0 ? 0.0f : getTitleHeightSize())) + (i11 <= 0 ? getItemPaddingVerticalSize() * 8.0f : 0.0f)) / (((i10 > 0 ? titleHeightRatio : 0.0f) + 6.0f) + (i11 > 0 ? itemPaddingVerticalRatio * 8.0f : 0.0f));
        this.f12035f = titleHeightSize;
        this.f12034e = i10 > 0 ? titleHeightSize * titleHeightRatio : getTitleHeightSize();
        this.f12038i = i11 > 0 ? this.f12035f * itemPaddingVerticalRatio : getItemPaddingVerticalSize();
    }

    public final void b(float f10) {
        float itemPaddingHorizontalRatio = getItemPaddingHorizontalRatio();
        if (itemPaddingHorizontalRatio > 0.0f) {
            float f11 = f10 / ((8.0f * itemPaddingHorizontalRatio) + 7.0f);
            this.f12036g = f11;
            this.f12037h = f11 * itemPaddingHorizontalRatio;
            return;
        }
        float itemPaddingHorizontalSize = getItemPaddingHorizontalSize();
        this.f12037h = itemPaddingHorizontalSize;
        this.f12036g = (f10 - (itemPaddingHorizontalSize * 8.0f)) / 7.0f;
    }

    public float getItemHeight() {
        return this.f12045p;
    }

    public float getItemPaddingHorizontalRatio() {
        return -1.0f;
    }

    public float getItemPaddingHorizontalSize() {
        return this.f12046q;
    }

    public float getItemPaddingVerticalRatio() {
        return -1.0f;
    }

    public float getItemPaddingVerticalSize() {
        return this.f12046q;
    }

    public float getItemWidth() {
        return this.f12045p;
    }

    public Date getSelectDate() {
        return this.f12043n;
    }

    public float getTitleHeightRatio() {
        return 1.0f;
    }

    public float getTitleHeightSize() {
        return 0.0f;
    }

    public Date getYearMonth() {
        return this.f12042m;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x023b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r17) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.settings.wh.WhCalendarView.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0049, code lost:
        if (r6 > r10) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x009a, code lost:
        if (r0 > r11) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r10)
            int r1 = android.view.View.MeasureSpec.getMode(r11)
            int r10 = android.view.View.MeasureSpec.getSize(r10)
            int r11 = android.view.View.MeasureSpec.getSize(r11)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1090519040(0x41000000, float:8.0)
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            if (r0 != r4) goto L1e
            float r10 = (float) r10
        L1a:
            r9.b(r10)
            goto L4d
        L1e:
            float r6 = r9.getItemWidth()
            r9.f12036g = r6
            float r6 = r9.getItemPaddingHorizontalRatio()
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 <= 0) goto L35
            float r6 = r9.f12036g
            float r7 = r9.getItemPaddingHorizontalRatio()
            float r7 = r7 * r6
            goto L39
        L35:
            float r7 = r9.getItemPaddingHorizontalSize()
        L39:
            r9.f12037h = r7
            float r6 = r9.f12036g
            r8 = 1088421888(0x40e00000, float:7.0)
            float r6 = r6 * r8
            float r7 = r7 * r3
            float r6 = r6 + r7
            if (r0 != r2) goto L4c
            float r10 = (float) r10
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 <= 0) goto L4c
            goto L1a
        L4c:
            r10 = r6
        L4d:
            if (r1 != r4) goto L54
            float r11 = (float) r11
        L50:
            r9.a(r11)
            goto L9e
        L54:
            float r0 = r9.getItemHeight()
            r9.f12035f = r0
            float r0 = r9.getTitleHeightRatio()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L6b
            float r0 = r9.f12035f
            float r4 = r9.getTitleHeightRatio()
            float r4 = r4 * r0
            goto L6f
        L6b:
            float r4 = r9.getTitleHeightSize()
        L6f:
            r9.f12034e = r4
            float r0 = r9.getItemPaddingVerticalRatio()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L82
            float r0 = r9.f12035f
            float r4 = r9.getItemPaddingVerticalRatio()
            float r4 = r4 * r0
            goto L86
        L82:
            float r4 = r9.getItemPaddingVerticalSize()
        L86:
            r9.f12038i = r4
            float r0 = r9.f12034e
            float r5 = r9.f12035f
            r6 = 1086324736(0x40c00000, float:6.0)
            float r5 = r5 * r6
            float r5 = r5 + r0
            float r4 = r4 * r3
            float r0 = r4 + r5
            if (r1 != r2) goto L9d
            float r11 = (float) r11
            int r1 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r1 <= 0) goto L9d
            goto L50
        L9d:
            r11 = r0
        L9e:
            int r10 = (int) r10
            int r11 = (int) r11
            r9.setMeasuredDimension(r10, r11)
            float r10 = r9.f12034e
            float r11 = r9.f12036g
            float r10 = java.lang.Math.min(r10, r11)
            r11 = 1053609165(0x3ecccccd, float:0.4)
            float r10 = r10 * r11
            r9.f12039j = r10
            float r10 = r9.f12035f
            float r0 = r9.f12036g
            float r10 = java.lang.Math.min(r10, r0)
            float r10 = r10 * r11
            r9.f12040k = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.settings.wh.WhCalendarView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        Date date;
        int action = motionEvent.getAction();
        if (action == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f12049t = x10;
            this.f12050u = y10;
            float f10 = this.f12037h;
            float f11 = this.f12034e;
            float f12 = this.f12038i;
            float f13 = (2.0f * f12) + f11;
            if (x10 >= f10 && y10 >= f13) {
                float f14 = y10 - f13;
                float f15 = this.f12035f + f12;
                int i11 = (int) (f14 / f15);
                if (((float) (((int) f14) % ((int) f15))) > f12) {
                    float f16 = x10 - f10;
                    float f17 = this.f12036g + f10;
                    int i12 = (int) (f16 / f17);
                    if ((((float) (((int) f16) % ((int) f17))) > f10) && (i10 = (i11 * 7) + i12) >= this.f12047r && i10 <= this.f12048s) {
                        this.f12041l.setTime(this.f12042m);
                        this.f12041l.set(5, (i10 - this.f12047r) + 1);
                        this.f12051v = this.f12041l.getTime();
                        invalidate();
                    }
                }
            }
        } else if (action == 1 && this.f12051v != null) {
            if (Math.sqrt(Math.pow(Math.abs(motionEvent.getY()) - Math.abs(this.f12050u), 2.0d) + Math.pow(Math.abs(motionEvent.getX()) - Math.abs(this.f12049t), 2.0d)) < 30.0d && ((date = this.f12043n) == null || !c(date, this.f12051v))) {
                Date date2 = this.f12051v;
                this.f12043n = date2;
                b bVar = this.f12044o;
                if (bVar != null) {
                    bVar.a(date2);
                }
            }
            this.f12051v = null;
            invalidate();
        }
        return true;
    }

    public void setDataHolder(a aVar) {
        this.A = aVar;
    }

    public void setOnDateSelectListener(b bVar) {
        this.f12044o = bVar;
    }

    public void setYearMonth(Date date) {
        boolean z10;
        b bVar;
        Date date2 = this.f12042m;
        boolean z11 = false;
        if (date2.getYear() == date.getYear() && date2.getMonth() == date.getMonth()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = !z10;
        this.f12042m = date;
        invalidate();
        if (z12 && (bVar = this.f12044o) != null) {
            Date date3 = this.f12042m;
            Date date4 = this.f12031b;
            if (date3.getYear() == date4.getYear() && date3.getMonth() == date4.getMonth()) {
                z11 = true;
            }
            bVar.b(z11);
        }
    }
}
