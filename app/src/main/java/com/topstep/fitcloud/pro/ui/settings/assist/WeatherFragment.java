package com.topstep.fitcloud.pro.ui.settings.assist;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bi.z0;
import com.topstep.fitcloud.pro.databinding.FragmentWeatherBinding;
import com.topstep.fitcloud.pro.model.location.LocationInfo;
import com.topstep.fitcloud.pro.model.weather.WeatherInfo;
import com.topstep.fitcloudpro.R;
import fm.p;
import gm.b0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import ji.m;
import kotlin.Metadata;
import mm.h;
import og.t;
import pm.e0;
import tl.l;
import zl.e;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class WeatherFragment extends m {

    /* renamed from: y0 */
    public static final /* synthetic */ h<Object>[] f11988y0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11989t0;

    /* renamed from: u0 */
    public final SimpleDateFormat f11990u0;

    /* renamed from: v0 */
    public ug.b f11991v0;

    /* renamed from: w0 */
    public ch.c f11992w0;

    /* renamed from: x0 */
    public t f11993x0;

    @e(c = "com.topstep.fitcloud.pro.ui.settings.assist.WeatherFragment$onViewCreated$1", f = "WeatherFragment.kt", l = {46, 48, 49}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public WeatherFragment f11994e;

        /* renamed from: f */
        public int f11995f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(2, dVar);
            WeatherFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            return ((a) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new a(dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x007c  */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r8) {
            /*
                r7 = this;
                yl.a r0 = yl.a.COROUTINE_SUSPENDED
                int r1 = r7.f11995f
                java.lang.String r2 = "weatherRepository"
                r3 = 0
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L2a
                if (r1 == r6) goto L26
                if (r1 == r5) goto L20
                if (r1 != r4) goto L18
                com.topstep.fitcloud.pro.ui.settings.assist.WeatherFragment r0 = r7.f11994e
                mf.a0.k(r8)
                goto L74
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                com.topstep.fitcloud.pro.ui.settings.assist.WeatherFragment r1 = r7.f11994e
                mf.a0.k(r8)
                goto L56
            L26:
                mf.a0.k(r8)
                goto L3c
            L2a:
                mf.a0.k(r8)
                com.topstep.fitcloud.pro.ui.settings.assist.WeatherFragment r8 = com.topstep.fitcloud.pro.ui.settings.assist.WeatherFragment.this
                ug.b r8 = r8.f11991v0
                if (r8 == 0) goto L80
                r7.f11995f = r6
                java.lang.Object r8 = r8.c(r7)
                if (r8 != r0) goto L3c
                return r0
            L3c:
                com.topstep.fitcloud.pro.model.location.LocationInfo r8 = (com.topstep.fitcloud.pro.model.location.LocationInfo) r8
                com.topstep.fitcloud.pro.ui.settings.assist.WeatherFragment r1 = com.topstep.fitcloud.pro.ui.settings.assist.WeatherFragment.this
                com.topstep.fitcloud.pro.ui.settings.assist.WeatherFragment.i1(r1, r8)
                com.topstep.fitcloud.pro.ui.settings.assist.WeatherFragment r1 = com.topstep.fitcloud.pro.ui.settings.assist.WeatherFragment.this
                if (r8 == 0) goto L5d
                ch.c r6 = r1.f11992w0
                if (r6 == 0) goto L59
                r7.f11994e = r1
                r7.f11995f = r5
                java.lang.Object r8 = r6.c(r8, r7)
                if (r8 != r0) goto L56
                return r0
            L56:
                fg.a r8 = (fg.a) r8
                goto L5e
            L59:
                gm.l.l(r2)
                throw r3
            L5d:
                r8 = r3
            L5e:
                com.topstep.fitcloud.pro.ui.settings.assist.WeatherFragment.h1(r1, r8)
                com.topstep.fitcloud.pro.ui.settings.assist.WeatherFragment r8 = com.topstep.fitcloud.pro.ui.settings.assist.WeatherFragment.this
                ch.c r1 = r8.f11992w0
                if (r1 == 0) goto L7c
                r7.f11994e = r8
                r7.f11995f = r4
                java.lang.Object r1 = r1.b(r7)
                if (r1 != r0) goto L72
                return r0
            L72:
                r0 = r8
                r8 = r1
            L74:
                com.topstep.fitcloud.pro.model.weather.WeatherInfo r8 = (com.topstep.fitcloud.pro.model.weather.WeatherInfo) r8
                com.topstep.fitcloud.pro.ui.settings.assist.WeatherFragment.j1(r0, r8)
                tl.l r8 = tl.l.f28297a
                return r8
            L7c:
                gm.l.l(r2)
                throw r3
            L80:
                java.lang.String r8 = "locationRepository"
                gm.l.l(r8)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.settings.assist.WeatherFragment.a.t(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.l<Button, l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(1);
            WeatherFragment.this = r1;
        }

        @Override // fm.l
        public final l k(Button button) {
            gm.l.f(button, "it");
            qi.h.j(WeatherFragment.this).e(new com.topstep.fitcloud.pro.ui.settings.assist.b(WeatherFragment.this, null)).k(new d(WeatherFragment.this));
            return l.f28297a;
        }
    }

    static {
        gm.t tVar = new gm.t(WeatherFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentWeatherBinding;", 0);
        b0.f15488a.getClass();
        f11988y0 = new h[]{tVar};
    }

    public WeatherFragment() {
        super(R.layout.fragment_weather);
        this.f11989t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentWeatherBinding.class, this);
        this.f11990u0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.US);
    }

    public static final void h1(WeatherFragment weatherFragment, fg.a aVar) {
        TextView textView;
        String sb2;
        if (aVar == null) {
            textView = weatherFragment.k1().tvCityMsg;
            sb2 = null;
        } else {
            weatherFragment.getClass();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("cid:");
            p0.a.a(sb3, aVar.f14259a, "\n", "locality:");
            sb3.append(aVar.f14260b);
            textView = weatherFragment.k1().tvCityMsg;
            sb2 = sb3.toString();
        }
        textView.setText(sb2);
    }

    public static final void i1(WeatherFragment weatherFragment, LocationInfo locationInfo) {
        TextView textView;
        String sb2;
        if (locationInfo == null) {
            sb2 = null;
            weatherFragment.k1().tvLocationTime.setText((CharSequence) null);
            textView = weatherFragment.k1().tvLocationMsg;
        } else {
            weatherFragment.k1().tvLocationTime.setText(weatherFragment.f11990u0.format(new Date(locationInfo.f9707c)));
            StringBuilder sb3 = new StringBuilder();
            sb3.append("lng:");
            sb3.append(locationInfo.f9706b);
            sb3.append("\n");
            sb3.append("lat:");
            sb3.append(locationInfo.f9705a);
            sb3.append("\n");
            sb3.append("locality:");
            String str = locationInfo.f9708d;
            if (str != null) {
                sb3.append(str);
            }
            String str2 = locationInfo.f9709e;
            if (str2 != null) {
                sb3.append(str2);
            }
            String str3 = locationInfo.f9710f;
            if (str3 != null) {
                sb3.append(str3);
            }
            String str4 = locationInfo.f9711g;
            if (str4 != null) {
                sb3.append(str4);
            }
            String str5 = locationInfo.f9712h;
            if (str5 != null) {
                sb3.append(str5);
            }
            sb3.append("\naddress:");
            sb3.append(locationInfo.f9713i);
            textView = weatherFragment.k1().tvLocationMsg;
            sb2 = sb3.toString();
        }
        textView.setText(sb2);
    }

    public static final void j1(WeatherFragment weatherFragment, WeatherInfo weatherInfo) {
        TextView textView;
        String sb2;
        if (weatherInfo == null) {
            sb2 = null;
            weatherFragment.k1().tvWeatherTime.setText((CharSequence) null);
            textView = weatherFragment.k1().tvWeatherMsg;
        } else {
            weatherFragment.k1().tvWeatherTime.setText(weatherFragment.f11990u0.format(new Date(weatherInfo.f9733a)));
            StringBuilder sb3 = new StringBuilder();
            sb3.append("cid:");
            p0.a.a(sb3, weatherInfo.f9734b, "\n", "locality:");
            p0.a.a(sb3, weatherInfo.f9735c, "\n", "temperature:");
            sb3.append(weatherInfo.f9736d);
            sb3.append("℃\n");
            sb3.append("code:");
            sb3.append(weatherInfo.f9737e);
            sb3.append("\n");
            sb3.append("text:");
            p0.a.a(sb3, weatherInfo.f9738f, "\n", "pressure:");
            sb3.append(weatherInfo.f9742j);
            sb3.append("\n");
            sb3.append("windForce:");
            sb3.append(weatherInfo.f9743k);
            sb3.append("\n");
            sb3.append("visibility:");
            sb3.append(weatherInfo.f9744l);
            textView = weatherFragment.k1().tvWeatherMsg;
            sb2 = sb3.toString();
        }
        textView.setText(sb2);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        z0.g(qi.h.j(this), null, 0, new a(null), 3);
        p.b.g(k1().btnRefresh, new b());
    }

    public final FragmentWeatherBinding k1() {
        return (FragmentWeatherBinding) this.f11989t0.a(this, f11988y0[0]);
    }
}
