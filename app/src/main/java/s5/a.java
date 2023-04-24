package s5;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import d6.m0;
import gm.l;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o5.v;
import s5.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final a f26567a = new a();

    /* renamed from: s5.a$a */
    /* loaded from: classes.dex */
    public static final class View$OnClickListenerC0471a implements View.OnClickListener {

        /* renamed from: a */
        public t5.a f26568a;

        /* renamed from: b */
        public WeakReference<View> f26569b;

        /* renamed from: c */
        public WeakReference<View> f26570c;

        /* renamed from: d */
        public View.OnClickListener f26571d;

        /* renamed from: e */
        public boolean f26572e = true;

        public View$OnClickListenerC0471a(t5.a aVar, View view, View view2) {
            this.f26568a = aVar;
            this.f26569b = new WeakReference<>(view2);
            this.f26570c = new WeakReference<>(view);
            this.f26571d = t5.f.e(view2);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (i6.a.b(this)) {
                return;
            }
            try {
                l.f(view, "view");
                View.OnClickListener onClickListener = this.f26571d;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                View view2 = this.f26570c.get();
                View view3 = this.f26569b.get();
                if (view2 == null || view3 == null) {
                    return;
                }
                a aVar = a.f26567a;
                a.a(this.f26568a, view2, view3);
            } catch (Throwable th2) {
                i6.a.a(this, th2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        public t5.a f26573a;

        /* renamed from: b */
        public WeakReference<AdapterView<?>> f26574b;

        /* renamed from: c */
        public WeakReference<View> f26575c;

        /* renamed from: d */
        public AdapterView.OnItemClickListener f26576d;

        /* renamed from: e */
        public boolean f26577e = true;

        public b(t5.a aVar, View view, AdapterView<?> adapterView) {
            this.f26573a = aVar;
            this.f26574b = new WeakReference<>(adapterView);
            this.f26575c = new WeakReference<>(view);
            this.f26576d = adapterView.getOnItemClickListener();
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            l.f(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.f26576d;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i10, j10);
            }
            View view2 = this.f26575c.get();
            AdapterView<?> adapterView2 = this.f26574b.get();
            if (view2 == null || adapterView2 == null) {
                return;
            }
            a aVar = a.f26567a;
            a.a(this.f26573a, view2, adapterView2);
        }
    }

    public static final void a(t5.a aVar, View view, View view2) {
        if (i6.a.b(a.class)) {
            return;
        }
        try {
            l.f(aVar, "mapping");
            String str = aVar.f27768a;
            d.a aVar2 = d.f26589f;
            Bundle b10 = d.a.b(aVar, view, view2);
            f26567a.b(b10);
            v.c().execute(new s.g(str, b10, 10));
        } catch (Throwable th2) {
            i6.a.a(a.class, th2);
        }
    }

    public final void b(Bundle bundle) {
        Locale locale;
        if (i6.a.b(this)) {
            return;
        }
        try {
            String string = bundle.getString("_valueToSum");
            if (string != null) {
                int i10 = x5.e.f30297a;
                double d10 = 0.0d;
                try {
                    Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(string);
                    if (matcher.find()) {
                        String group = matcher.group(0);
                        m0 m0Var = m0.f12709a;
                        try {
                            locale = v.a().getResources().getConfiguration().locale;
                        } catch (Exception unused) {
                            locale = null;
                        }
                        if (locale == null) {
                            locale = Locale.getDefault();
                            l.e(locale, "getDefault()");
                        }
                        d10 = NumberFormat.getNumberInstance(locale).parse(group).doubleValue();
                    }
                } catch (ParseException unused2) {
                }
                bundle.putDouble("_valueToSum", d10);
            }
            bundle.putString("_is_fb_codeless", "1");
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }
}
