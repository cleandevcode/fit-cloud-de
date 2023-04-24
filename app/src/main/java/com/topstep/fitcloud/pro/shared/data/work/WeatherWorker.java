package com.topstep.fitcloud.pro.shared.data.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import ch.c;
import com.topstep.fitcloud.pro.model.weather.ForecastInfo;
import com.topstep.fitcloud.pro.model.weather.WeatherInfo;
import f3.c;
import f3.n;
import f3.o;
import gm.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jj.k1;
import kotlin.Metadata;
import og.t;
import p000do.a;
import rj.f;
import rj.g;
import xl.d;
import zl.e;

@Metadata
/* loaded from: classes2.dex */
public final class WeatherWorker extends CoroutineWorker {

    /* renamed from: i */
    public final ug.b f10123i;

    /* renamed from: j */
    public final c f10124j;

    /* renamed from: k */
    public final t f10125k;

    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(Context context) {
            l.f(context, "context");
            a.b bVar = p000do.a.f13275a;
            bVar.t("Weather");
            bVar.h("executeOnce", new Object[0]);
            c.a aVar = new c.a();
            aVar.f14074a = n.CONNECTED;
            f3.c cVar = new f3.c(aVar);
            o.a aVar2 = new o.a(WeatherWorker.class);
            aVar2.f14118d.add("WeatherOnce");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            o.a aVar3 = (o.a) aVar2.e(60L, timeUnit).d(1, 60L, timeUnit);
            aVar3.f14117c.f22634j = cVar;
            g3.l d10 = g3.l.d(context);
            d10.getClass();
            d10.c(Collections.singletonList(aVar3.a()));
        }

        public static void b(t tVar, WeatherInfo weatherInfo) {
            ArrayList arrayList;
            tk.a g10;
            l.f(tVar, "deviceManager");
            a.b bVar = p000do.a.f13275a;
            bVar.t("Weather");
            boolean z10 = true;
            bVar.h("sendWeather:%s", weatherInfo);
            if (weatherInfo == null) {
                g10 = ((k1) tVar.s()).g(" ", 0L, new g(0, 0, 0, 0, 0, 0, 0), null);
            } else {
                int i10 = weatherInfo.f9740h;
                if (i10 == 0) {
                    i10 = weatherInfo.f9736d;
                }
                int i11 = i10;
                int i12 = weatherInfo.f9741i;
                if (i12 == 0) {
                    i12 = weatherInfo.f9736d;
                }
                g gVar = new g(i11, i12, weatherInfo.f9737e, weatherInfo.f9736d, weatherInfo.f9742j, weatherInfo.f9743k, weatherInfo.f9744l);
                List<ForecastInfo> list = weatherInfo.f9739g;
                if (list != null && !list.isEmpty()) {
                    z10 = false;
                }
                if (!z10) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    for (ForecastInfo forecastInfo : list) {
                        arrayList2.add(new f(forecastInfo.f9725a, forecastInfo.f9726b, forecastInfo.f9727c));
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                g10 = ((k1) tVar.s()).g(weatherInfo.f9735c, weatherInfo.f9733a, gVar, arrayList);
            }
            new bl.g(g10).f();
        }
    }

    @e(c = "com.topstep.fitcloud.pro.shared.data.work.WeatherWorker", f = "WeatherWorker.kt", l = {81, 87, 91, 114}, m = "doWork")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public WeatherWorker f10126d;

        /* renamed from: e */
        public Object f10127e;

        /* renamed from: f */
        public /* synthetic */ Object f10128f;

        /* renamed from: h */
        public int f10130h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d<? super b> dVar) {
            super(dVar);
            WeatherWorker.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f10128f = obj;
            this.f10130h |= Integer.MIN_VALUE;
            return WeatherWorker.this.h(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeatherWorker(Context context, WorkerParameters workerParameters, ug.b bVar, ch.c cVar, t tVar) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "workerParams");
        l.f(bVar, "locationRepository");
        l.f(cVar, "weatherRepository");
        l.f(tVar, "deviceManager");
        this.f10123i = bVar;
        this.f10124j = cVar;
        this.f10125k = tVar;
    }

    public static ListenableWorker.a.c j(String str) {
        a.b bVar = p000do.a.f13275a;
        bVar.t("Weather");
        bVar.p("success : %s", str);
        return new ListenableWorker.a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01d5  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(xl.d<? super androidx.work.ListenableWorker.a> r19) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.shared.data.work.WeatherWorker.h(xl.d):java.lang.Object");
    }

    public final ListenableWorker.a i(String str) {
        a.b bVar = p000do.a.f13275a;
        bVar.t("Weather");
        bVar.p("retry : %s", str);
        if (!this.f3619b.f3629c.contains("WeatherOnce") && this.f3619b.f3630d > 3) {
            return new ListenableWorker.a.C0036a();
        }
        return new ListenableWorker.a.b();
    }
}
