package com.topstep.fitcloud.pro.ui.widget;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import com.topstep.fitcloudpro.R;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes2.dex */
public class HealthCalendarView extends View {

    /* renamed from: a */
    public SparseIntArray f12341a;

    /* renamed from: b */
    public Paint f12342b;

    /* renamed from: c */
    public int[] f12343c;

    /* renamed from: d */
    public int f12344d;

    /* renamed from: e */
    public int f12345e;

    /* renamed from: f */
    public int f12346f;

    /* renamed from: g */
    public Calendar f12347g;

    /* renamed from: h */
    public Date f12348h;

    /* renamed from: i */
    public Date f12349i;

    /* renamed from: j */
    public Date f12350j;

    /* renamed from: k */
    public Date f12351k;

    /* renamed from: l */
    public Date[] f12352l;

    /* renamed from: m */
    public a f12353m;

    /* renamed from: n */
    public int f12354n;

    /* renamed from: o */
    public int f12355o;

    /* renamed from: p */
    public float f12356p;

    /* renamed from: q */
    public float f12357q;

    /* renamed from: r */
    public Date f12358r;

    /* loaded from: classes2.dex */
    public interface a {
    }

    public HealthCalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f12341a = sparseIntArray;
        sparseIntArray.put(1, R.string.ds_alarm_repeat_06_simple);
        this.f12341a.put(2, R.string.ds_alarm_repeat_00_simple);
        this.f12341a.put(3, R.string.ds_alarm_repeat_01_simple);
        this.f12341a.put(4, R.string.ds_alarm_repeat_02_simple);
        this.f12341a.put(5, R.string.ds_alarm_repeat_03_simple);
        this.f12341a.put(6, R.string.ds_alarm_repeat_04_simple);
        this.f12341a.put(7, R.string.ds_alarm_repeat_05_simple);
        Paint paint = new Paint();
        this.f12342b = paint;
        paint.setAntiAlias(true);
        this.f12342b.setDither(true);
        this.f12347g = Calendar.getInstance();
        this.f12348h = new Date();
        int[] iArr = new int[7];
        this.f12343c = iArr;
        iArr[0] = this.f12347g.getFirstDayOfWeek();
        int i10 = 1;
        while (true) {
            int[] iArr2 = this.f12343c;
            if (i10 >= iArr2.length) {
                return;
            }
            int i11 = iArr2[i10 - 1] + 1;
            iArr2[i10] = i11;
            if (i11 > 7) {
                iArr2[i10] = 1;
            }
            i10++;
        }
    }

    public static boolean a(Date date, Date date2) {
        return date.getYear() == date2.getYear() && date.getMonth() == date2.getMonth() && date.getDate() == date2.getDate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0027, code lost:
        if (r3 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0038, code lost:
        if (((a(r5, r7) || !r5.after(r7)) ? false : false) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x003a, code lost:
        r5 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.Date r5, java.util.Date r6, java.util.Date r7, java.util.Date[] r8) {
        /*
            r4 = this;
            if (r6 == 0) goto L11
            boolean r0 = r6.after(r7)
            if (r0 != 0) goto L9
            goto L11
        L9:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "开始时间需小于结束时间"
            r5.<init>(r6)
            throw r5
        L11:
            r0 = 0
            if (r5 == 0) goto L3b
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L2a
            boolean r3 = a(r5, r6)
            if (r3 != 0) goto L26
            boolean r3 = r5.before(r6)
            if (r3 == 0) goto L26
            r3 = 1
            goto L27
        L26:
            r3 = 0
        L27:
            if (r3 == 0) goto L2a
            goto L3a
        L2a:
            boolean r3 = a(r5, r7)
            if (r3 != 0) goto L37
            boolean r3 = r5.after(r7)
            if (r3 == 0) goto L37
            goto L38
        L37:
            r1 = 0
        L38:
            if (r1 == 0) goto L3b
        L3a:
            r5 = r0
        L3b:
            if (r5 != 0) goto L47
            java.util.Date r5 = new java.util.Date
            r5.<init>()
            r4.f12348h = r5
            r4.f12349i = r0
            goto L4b
        L47:
            r4.f12348h = r5
            r4.f12349i = r5
        L4b:
            r4.f12350j = r6
            r4.f12351k = r7
            r4.f12352l = r8
            r4.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.widget.HealthCalendarView.b(java.util.Date, java.util.Date, java.util.Date, java.util.Date[]):void");
    }

    public Date getYearMonth() {
        return this.f12348h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0106, code lost:
        if (r5 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x011b, code lost:
        if (r5 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x011e, code lost:
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x019d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01a0 A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r17) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.widget.HealthCalendarView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i13 = (int) ((32.0f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
        int i14 = i13 * 9;
        if (mode != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(size, i14);
            } else {
                size = i14;
            }
        }
        if (mode2 != 1073741824) {
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(size2, i14);
            } else {
                size2 = i14;
            }
        }
        setMeasuredDimension(size, size2);
        if (size < i14) {
            i12 = size / 9;
        } else {
            i12 = i13;
        }
        if (size2 < i14) {
            i13 = size2 / 9;
        }
        int min = Math.min(i12, i13);
        this.f12344d = min;
        int i15 = min * 7;
        this.f12345e = (size - i15) / 6;
        this.f12346f = (size2 - i15) / 6;
        this.f12342b.setTextSize(min * 0.45f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x00ec, code lost:
        if (r0 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0101, code lost:
        if (r0 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x009d, code lost:
        if (r0 == false) goto L18;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.widget.HealthCalendarView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnDateSelectListener(a aVar) {
        this.f12353m = aVar;
    }
}
