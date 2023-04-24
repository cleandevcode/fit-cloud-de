package com.topstep.fitcloud.pro.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.topstep.fitcloud.pro.model.data.SleepItem;
import com.topstep.fitcloudpro.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import oi.e;
import oi.f;
import oi.g;
import vf.n;

/* loaded from: classes2.dex */
public class SleepDayView extends View {

    /* renamed from: a */
    public b f12400a;

    /* renamed from: b */
    public c[] f12401b;

    /* renamed from: c */
    public a f12402c;

    /* renamed from: d */
    public int f12403d;

    /* renamed from: e */
    public GestureDetector f12404e;

    /* renamed from: f */
    public SimpleDateFormat f12405f;

    /* renamed from: g */
    public float f12406g;

    /* renamed from: h */
    public float f12407h;

    /* renamed from: i */
    public float f12408i;

    /* renamed from: j */
    public float f12409j;

    /* renamed from: k */
    public Date f12410k;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public float f12411a;

        /* renamed from: b */
        public float f12412b;

        /* renamed from: c */
        public float f12413c;

        /* renamed from: d */
        public int f12414d;

        /* renamed from: e */
        public int f12415e;

        /* renamed from: f */
        public int f12416f;

        /* renamed from: g */
        public int f12417g;
    }

    /* loaded from: classes2.dex */
    public class b {

        /* renamed from: a */
        public int f12418a;

        /* renamed from: b */
        public int f12419b;

        /* renamed from: c */
        public Paint f12420c;

        /* renamed from: d */
        public Paint f12421d;

        /* renamed from: e */
        public int f12422e;

        /* renamed from: f */
        public int f12423f;

        /* renamed from: g */
        public int f12424g;

        /* renamed from: h */
        public int f12425h;

        /* renamed from: i */
        public int f12426i;

        /* renamed from: j */
        public int f12427j;

        /* renamed from: k */
        public Paint f12428k;

        /* renamed from: l */
        public float f12429l;

        public b(SleepDayView sleepDayView) {
            Paint paint = new Paint();
            this.f12420c = paint;
            paint.setAntiAlias(true);
            this.f12420c.setDither(true);
            this.f12420c.setColor(-1);
            this.f12420c.setTextSize((int) ((12.0f * sleepDayView.getContext().getResources().getDisplayMetrics().scaledDensity) + 0.5f));
            this.f12423f = (int) this.f12420c.measureText("00:00");
            this.f12424g = (int) (-this.f12420c.getFontMetrics().ascent);
            Paint paint2 = new Paint();
            this.f12421d = paint2;
            paint2.setAntiAlias(true);
            this.f12421d.setDither(true);
            this.f12421d.setColor(-1);
            this.f12421d.setTextSize((int) ((10.0f * sleepDayView.getContext().getResources().getDisplayMetrics().scaledDensity) + 0.5f));
            this.f12422e = (int) this.f12421d.measureText("00:00-00:00");
            this.f12425h = sleepDayView.getResources().getColor(R.color.sleep_chart_color_deep);
            this.f12426i = sleepDayView.getResources().getColor(R.color.sleep_chart_color_light);
            this.f12427j = sleepDayView.getResources().getColor(R.color.sleep_chart_color_sober);
            Paint paint3 = new Paint();
            this.f12428k = paint3;
            paint3.setAntiAlias(true);
            this.f12428k.setDither(true);
            this.f12429l = TypedValue.applyDimension(1, 5.0f, sleepDayView.getResources().getDisplayMetrics());
        }
    }

    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a */
        public int f12430a;

        /* renamed from: b */
        public int f12431b;

        /* renamed from: c */
        public int f12432c;

        /* renamed from: d */
        public float f12433d;
    }

    public SleepDayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12410k = new Date();
        this.f12405f = new SimpleDateFormat("H:mm", Locale.US);
        this.f12400a = new b(this);
        this.f12404e = new GestureDetector(getContext(), new e(this));
        setLongClickable(true);
        setOnTouchListener(new f(this));
    }

    public static void a(SleepDayView sleepDayView, MotionEvent motionEvent) {
        boolean z10;
        c[] cVarArr;
        c[] cVarArr2;
        int i10;
        b bVar = sleepDayView.f12400a;
        int i11 = 0;
        if (bVar.f12418a != 0 && bVar.f12419b != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (cVarArr = sleepDayView.f12401b) != null && cVarArr.length != 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (x10 >= sleepDayView.f12406g && x10 <= sleepDayView.getWidth() - sleepDayView.f12406g && y10 >= sleepDayView.f12407h && y10 <= sleepDayView.getHeight() - sleepDayView.f12407h) {
                float f10 = sleepDayView.f12406g;
                float f11 = 0.0f;
                float f12 = 0.0f;
                while (true) {
                    cVarArr2 = sleepDayView.f12401b;
                    if (i11 < cVarArr2.length) {
                        f12 = cVarArr2[i11].f12433d * sleepDayView.f12408i;
                        if (x10 >= f10 && x10 <= f10 + f12) {
                            f11 = (f12 / 2.0f) + f10;
                            break;
                        } else {
                            f10 += f12;
                            i11++;
                        }
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 != -1 && i11 != sleepDayView.f12403d) {
                    sleepDayView.f12403d = i11;
                    if (sleepDayView.f12402c == null) {
                        sleepDayView.f12402c = new a();
                    }
                    a aVar = sleepDayView.f12402c;
                    aVar.f12411a = f11;
                    b bVar2 = sleepDayView.f12400a;
                    c cVar = cVarArr2[i11];
                    int i12 = cVar.f12432c;
                    if (i12 != 1) {
                        if (i12 == 2) {
                            i10 = bVar2.f12426i;
                        } else if (i12 == 3) {
                            i10 = bVar2.f12427j;
                        }
                        aVar.f12414d = i10;
                        aVar.f12412b = f12;
                        aVar.f12413c = sleepDayView.f12409j;
                        aVar.f12415e = 255;
                        aVar.f12416f = cVar.f12430a;
                        aVar.f12417g = cVar.f12431b;
                        sleepDayView.invalidate();
                    }
                    i10 = bVar2.f12425h;
                    aVar.f12414d = i10;
                    aVar.f12412b = f12;
                    aVar.f12413c = sleepDayView.f12409j;
                    aVar.f12415e = 255;
                    aVar.f12416f = cVar.f12430a;
                    aVar.f12417g = cVar.f12431b;
                    sleepDayView.invalidate();
                }
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10;
        c[] cVarArr;
        float f10;
        float f11;
        int i10;
        c[] cVarArr2;
        b bVar;
        int i11;
        float f12;
        Paint paint;
        int i12;
        super.onDraw(canvas);
        b bVar2 = this.f12400a;
        if (bVar2.f12418a != 0 && bVar2.f12419b != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (cVarArr = this.f12401b) != null && cVarArr.length != 0) {
            int width = getWidth();
            b bVar3 = this.f12400a;
            float f13 = (width - bVar3.f12418a) / 2.0f;
            int i13 = bVar3.f12422e;
            int i14 = bVar3.f12423f;
            if (i13 > i14) {
                f10 = i13;
            } else {
                f10 = i14;
            }
            float f14 = f10 / 2.0f;
            if (f13 < f14) {
                f11 = f14;
            } else {
                f11 = f13;
            }
            float width2 = getWidth() - (f11 * 2.0f);
            int height = getHeight();
            b bVar4 = this.f12400a;
            float f15 = bVar4.f12419b;
            float f16 = f15 - ((bVar4.f12429l * 2.0f) + (bVar4.f12424g * 2));
            float f17 = f16 / 1.2f;
            float f18 = ((f15 - f17) / 2.0f) + ((height - i10) / 2.0f);
            float f19 = f11;
            int i15 = 0;
            while (true) {
                cVarArr2 = this.f12401b;
                if (i15 >= cVarArr2.length) {
                    break;
                }
                c cVar = cVarArr2[i15];
                float f20 = width2 * cVar.f12433d;
                if (i15 != this.f12403d) {
                    float f21 = f19 + f20;
                    float f22 = f18 + f17;
                    b bVar5 = this.f12400a;
                    int i16 = cVar.f12432c;
                    if (i16 == 1) {
                        paint = bVar5.f12428k;
                        i12 = bVar5.f12425h;
                    } else if (i16 == 2) {
                        paint = bVar5.f12428k;
                        i12 = bVar5.f12426i;
                    } else {
                        if (i16 == 3) {
                            paint = bVar5.f12428k;
                            i12 = bVar5.f12427j;
                        }
                        i11 = i15;
                        f12 = f18;
                        canvas.drawRect(f19, f18, f21, f22, bVar5.f12428k);
                    }
                    paint.setColor(i12);
                    i11 = i15;
                    f12 = f18;
                    canvas.drawRect(f19, f18, f21, f22, bVar5.f12428k);
                } else {
                    i11 = i15;
                    f12 = f18;
                }
                f19 += f20;
                i15 = i11 + 1;
                f18 = f12;
            }
            this.f12410k.setTime(cVarArr2[0].f12430a * 1000);
            int height2 = getHeight();
            b bVar6 = this.f12400a;
            int i17 = bVar6.f12419b;
            canvas.drawText(this.f12405f.format(this.f12410k), f11 - (this.f12400a.f12423f / 2.0f), ((height2 - i17) / 2) + i17, bVar6.f12420c);
            Date date = this.f12410k;
            c[] cVarArr3 = this.f12401b;
            date.setTime(cVarArr3[cVarArr3.length - 1].f12431b * 1000);
            int height3 = getHeight();
            b bVar7 = this.f12400a;
            int i18 = bVar7.f12419b;
            canvas.drawText(this.f12405f.format(this.f12410k), (f11 + width2) - (this.f12400a.f12423f / 2.0f), ((height3 - i18) / 2) + i18, bVar7.f12420c);
            this.f12406g = f11;
            this.f12407h = f18;
            this.f12408i = width2;
            this.f12409j = f16;
            a aVar = this.f12402c;
            if (aVar != null) {
                float f23 = aVar.f12411a - (aVar.f12412b / 2.0f);
                a aVar2 = this.f12402c;
                float height4 = (getHeight() / 2) - (aVar2.f12413c / 2.0f);
                float f24 = (aVar2.f12412b / 2.0f) + aVar2.f12411a;
                a aVar3 = this.f12402c;
                float height5 = (aVar3.f12413c / 2.0f) + (getHeight() / 2);
                b bVar8 = this.f12400a;
                bVar8.f12428k.setColor(aVar3.f12414d);
                canvas.drawRect(f23, height4, f24, height5, bVar8.f12428k);
                this.f12410k.setTime(this.f12402c.f12416f * 1000);
                String format = this.f12405f.format(this.f12410k);
                this.f12410k.setTime(this.f12402c.f12417g * 1000);
                String a10 = android.support.v4.media.a.a(format, "-", this.f12405f.format(this.f12410k));
                this.f12400a.f12421d.setAlpha(this.f12402c.f12415e);
                float f25 = this.f12402c.f12411a - (this.f12400a.f12422e / 2);
                int height6 = getHeight();
                canvas.drawText(a10, f25, ((height6 - bVar.f12419b) / 2) + bVar.f12424g, this.f12400a.f12421d);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        b bVar = this.f12400a;
        bVar.f12418a = measuredWidth;
        bVar.f12419b = measuredHeight;
    }

    public void setSleepDayDatas(n nVar) {
        c[] cVarArr;
        List<SleepItem> list;
        Object obj;
        int i10 = -1;
        if (nVar != null && (list = nVar.f29303e) != null && list.size() > 0) {
            List<SleepItem> list2 = nVar.f29303e;
            Collections.sort(list2, new g());
            ArrayList arrayList = new ArrayList(list2.size());
            ArrayList arrayList2 = new ArrayList();
            int i11 = 0;
            while (i11 < list2.size()) {
                SleepItem sleepItem = list2.get(i11);
                int i12 = sleepItem.f9600a;
                if (i12 != 3 || arrayList.size() > 0) {
                    if (arrayList.size() > 0) {
                        long time = sleepItem.f9602c.getTime() - sleepItem.f9601b.getTime();
                        if (time > 0) {
                            if (arrayList2.size() > 0) {
                                obj = arrayList2.get(arrayList2.size() + i10);
                            } else {
                                obj = arrayList.get(arrayList.size() + i10);
                            }
                            SleepItem sleepItem2 = (SleepItem) obj;
                            sleepItem.f9601b.setTime(sleepItem2.f9602c.getTime());
                            sleepItem.f9602c.setTime(sleepItem2.f9602c.getTime() + time);
                            if (i12 == 3) {
                                arrayList2.add(sleepItem);
                            } else {
                                arrayList.addAll(arrayList2);
                                arrayList2.clear();
                            }
                        }
                    }
                    arrayList.add(sleepItem);
                }
                i11++;
                i10 = -1;
            }
            if (arrayList.size() > 0) {
                cVarArr = new c[arrayList.size()];
                int time2 = (int) ((((SleepItem) arrayList.get(arrayList.size() - 1)).f9602c.getTime() - ((SleepItem) arrayList.get(0)).f9601b.getTime()) / 1000);
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    SleepItem sleepItem3 = (SleepItem) arrayList.get(i13);
                    c cVar = new c();
                    cVar.f12432c = sleepItem3.f9600a;
                    cVar.f12430a = (int) (sleepItem3.f9601b.getTime() / 1000);
                    int time3 = (int) (sleepItem3.f9602c.getTime() / 1000);
                    cVar.f12431b = time3;
                    cVar.f12433d = (time3 - cVar.f12430a) / time2;
                    cVarArr[i13] = cVar;
                }
                this.f12402c = null;
                this.f12403d = -1;
                this.f12401b = cVarArr;
                postInvalidate();
            }
        }
        cVarArr = null;
        this.f12402c = null;
        this.f12403d = -1;
        this.f12401b = cVarArr;
        postInvalidate();
    }
}
