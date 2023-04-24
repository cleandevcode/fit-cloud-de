package pi;

import a0.m1;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.DashPathEffect;
import com.topstep.fitcloud.pro.ui.data.TemperatureDetailFragment;
import com.topstep.fitcloudpro.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p7.b;
import s.x2;

/* loaded from: classes2.dex */
public final class d {
    public static void a(r7.a aVar, int i10, int i11) {
        Context context = aVar.getContext();
        gm.l.f(context, "context");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842806});
        gm.l.e(obtainStyledAttributes, "context.theme.obtainStyl…ributes(intArrayOf(attr))");
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{16842808});
        gm.l.e(obtainStyledAttributes2, "context.theme.obtainStyl…ributes(intArrayOf(attr))");
        int color2 = obtainStyledAttributes2.getColor(0, 0);
        obtainStyledAttributes2.recycle();
        aVar.setNoDataText(context.getString(R.string.tip_current_no_data));
        aVar.setNoDataTextColor(color2);
        aVar.getDescription().f26656a = false;
        aVar.getAxisRight().f26656a = false;
        aVar.getLegend().f26656a = false;
        aVar.setScaleEnabled(false);
        s7.i xAxis = aVar.getXAxis();
        xAxis.C = 2;
        xAxis.f26646q = true;
        xAxis.f26645p = false;
        xAxis.f26638i = color2;
        xAxis.f26660e = color2;
        xAxis.f26659d = a8.f.c(11.0f);
        xAxis.g(2);
        xAxis.f26644o = true;
        xAxis.f26658c = a8.f.c(3.0f);
        s7.j axisLeft = aVar.getAxisLeft();
        axisLeft.f26646q = false;
        axisLeft.f26645p = true;
        axisLeft.f(i10);
        axisLeft.e(i11);
        axisLeft.f26660e = color;
        axisLeft.f26659d = a8.f.c(12.0f);
        axisLeft.g(5);
        axisLeft.f26644o = true;
        axisLeft.D = 8.0f;
    }

    public static void b(List list, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, x2 x2Var, float[] fArr) {
        if (list != null && list.size() > 0) {
            if (fArr != null) {
                fArr[0] = Float.MAX_VALUE;
                fArr[1] = Float.MIN_VALUE;
            }
            Collections.sort(list, new m1(1));
            int time = (int) ((((vf.g) list.get(0)).a().getTime() / 1000) / 60);
            int time2 = (int) ((((vf.g) list.get(list.size() - 1)).a().getTime() / 1000) / 60);
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
            for (int i10 = time; i10 <= time2; i10++) {
                date.setTime(i10 * 60 * 1000);
                arrayList.add(simpleDateFormat.format(date));
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                vf.g gVar = (vf.g) list.get(i11);
                int time3 = (int) ((gVar.a().getTime() / 1000) / 60);
                if (i11 >= list.size() - 1 || time3 != ((int) ((((vf.g) list.get(i11 + 1)).a().getTime() / 1000) / 60))) {
                    float c10 = gVar.c();
                    if (x2Var != null) {
                        int i12 = TemperatureDetailFragment.I0;
                        c10 = hh.b.e(c10);
                    }
                    arrayList2.add(new t7.k(time3 - time, c10));
                    if (fArr != null) {
                        fArr[0] = Math.min(fArr[0], c10);
                        fArr[1] = Math.max(fArr[1], c10);
                    }
                    if (arrayList3 != null) {
                        float b10 = gVar.b();
                        if (x2Var != null) {
                            int i13 = TemperatureDetailFragment.I0;
                            b10 = hh.b.e(b10);
                        }
                        arrayList3.add(new t7.k(time3 - time, b10));
                        if (fArr != null) {
                            fArr[0] = Math.min(fArr[0], b10);
                            fArr[1] = Math.max(fArr[1], b10);
                        }
                    }
                }
            }
        }
    }

    public static void c(r7.c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        Context context = cVar.getContext();
        gm.l.f(context, "context");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843827});
        gm.l.e(obtainStyledAttributes, "context.theme.obtainStyl…ributes(intArrayOf(attr))");
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        d(cVar, arrayList, arrayList2, arrayList3, color, color);
    }

    public static void d(r7.c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        if (arrayList.size() <= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        s7.i xAxis = cVar.getXAxis();
        if (arrayList.size() < 2) {
            z11 = false;
        }
        xAxis.g(2);
        xAxis.f26644o = z11;
        if (cVar.getMarker() instanceof b) {
            b bVar = (b) cVar.getMarker();
            bVar.setXValues(arrayList);
            bVar.setYValues1(arrayList2);
            bVar.setYValues2(arrayList3);
        }
        cVar.getXAxis().f26635f = new c(arrayList);
        t7.l lVar = new t7.l();
        for (T t10 : lVar.f27831i) {
            t10.G();
        }
        t7.m mVar = new t7.m("DataSet1", arrayList2);
        mVar.G = false;
        mVar.F = z10;
        mVar.f27816j = false;
        mVar.f27847y = a8.f.c(1.5f);
        mVar.i0(i10);
        if (mVar.A == null) {
            mVar.A = new ArrayList();
        }
        mVar.A.clear();
        mVar.A.add(Integer.valueOf(i10));
        mVar.f27806t = -7829368;
        mVar.f27844v = false;
        mVar.f27846x = new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
        lVar.b(mVar);
        lVar.f27831i.add(mVar);
        if (arrayList3 != null) {
            t7.m mVar2 = new t7.m("DataSet2", arrayList3);
            mVar2.G = false;
            mVar2.F = z10;
            mVar2.f27816j = false;
            mVar2.f27847y = a8.f.c(1.5f);
            mVar2.i0(i11);
            if (mVar2.A == null) {
                mVar2.A = new ArrayList();
            }
            mVar2.A.clear();
            mVar2.A.add(Integer.valueOf(i11));
            mVar2.f27806t = -7829368;
            mVar2.f27844v = false;
            mVar2.f27846x = new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f);
            lVar.b(mVar2);
            lVar.f27831i.add(mVar2);
        }
        cVar.setData(lVar);
        p7.a aVar = cVar.f25439s;
        aVar.getClass();
        b.a aVar2 = p7.b.f23954a;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar, "phaseX", 0.0f, 1.0f);
        ofFloat.setInterpolator(aVar2);
        ofFloat.setDuration(0);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aVar, "phaseY", 0.0f, 1.0f);
        ofFloat2.setInterpolator(aVar2);
        ofFloat2.setDuration(2000);
        ofFloat2.addUpdateListener(aVar.f23953a);
        ofFloat.start();
        ofFloat2.start();
        cVar.invalidate();
    }
}
