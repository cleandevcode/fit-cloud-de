package s;

import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.topstep.fitcloud.pro.ui.MainActivity;
import d6.s;
import gm.l;
import h6.c;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import k1.n2;
import k1.o0;
import o5.e0;
import o5.y;
import org.json.JSONException;
import org.json.JSONObject;
import s.k0;
import z9.r;

/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements k0.e.a, s.a, r.b {

    /* renamed from: a */
    public final /* synthetic */ int f26193a;

    public /* synthetic */ t0(int i10) {
        this.f26193a = i10;
    }

    @Override // s.k0.e.a
    public final boolean a(TotalCaptureResult totalCaptureResult) {
        return k0.a(totalCaptureResult, true);
    }

    @Override // z9.r.b
    public final k1.n2 b(View view, k1.n2 n2Var, r.c cVar) {
        int i10;
        n2.e bVar;
        int i11 = MainActivity.E;
        a1.c a10 = n2Var.a(7);
        gm.l.e(a10, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        WeakHashMap<View, k1.i2> weakHashMap = k1.o0.f18161a;
        boolean z10 = true;
        if (o0.e.d(view) != 1) {
            z10 = false;
        }
        int i12 = a10.f214a;
        int i13 = a10.f216c;
        int i14 = cVar.f32166a;
        if (z10) {
            i10 = i13;
        } else {
            i10 = i12;
        }
        cVar.f32166a = i14 + i10;
        int i15 = cVar.f32168c;
        if (!z10) {
            i12 = i13;
        }
        cVar.f32168c = i15 + i12;
        cVar.a(view);
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 30) {
            bVar = new n2.d(n2Var);
        } else if (i16 >= 29) {
            bVar = new n2.c(n2Var);
        } else {
            bVar = new n2.b(n2Var);
        }
        bVar.c(7, a1.c.b(0, a10.f215b, 0, 0));
        return bVar.b();
    }

    @Override // d6.s.a
    public final void c(boolean z10) {
        File[] fileArr;
        switch (this.f26193a) {
            case 4:
                if (z10) {
                    y5.d dVar = y5.d.f31147a;
                    if (!i6.a.b(y5.d.class)) {
                        try {
                            d6.m0.M(new j(2));
                            return;
                        } catch (Throwable th2) {
                            i6.a.a(y5.d.class, th2);
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                if (z10) {
                    synchronized (h6.c.f15885b) {
                        o5.v vVar = o5.v.f22837a;
                        if (o5.q0.b()) {
                            c.a.a();
                        }
                        if (h6.c.f15887d != null) {
                            Log.w(h6.c.f15886c, "Already enabled!");
                        } else {
                            h6.c cVar = new h6.c(Thread.getDefaultUncaughtExceptionHandler());
                            h6.c.f15887d = cVar;
                            Thread.setDefaultUncaughtExceptionHandler(cVar);
                        }
                    }
                    d6.s sVar = d6.s.f12755a;
                    if (d6.s.c(s.b.CrashShield)) {
                        o8.b.f22889h = true;
                        if (o5.q0.b() && !d6.m0.y()) {
                            File b10 = f6.f.b();
                            if (b10 == null || (fileArr = b10.listFiles(new FilenameFilter() { // from class: f6.d
                                @Override // java.io.FilenameFilter
                                public final boolean accept(File file, String str) {
                                    l.e(str, "name");
                                    String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
                                    l.e(format, "java.lang.String.format(format, *args)");
                                    Pattern compile = Pattern.compile(format);
                                    l.e(compile, "compile(pattern)");
                                    return compile.matcher(str).matches();
                                }
                            })) == null) {
                                fileArr = new File[0];
                            }
                            ArrayList arrayList = new ArrayList();
                            int length = fileArr.length;
                            int i10 = 0;
                            while (i10 < length) {
                                File file = fileArr[i10];
                                i10++;
                                gm.l.f(file, "file");
                                final f6.b bVar = new f6.b(file);
                                if (bVar.b()) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("crash_shield", bVar.toString());
                                        String str = o5.y.f22858j;
                                        String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{o5.v.b()}, 1));
                                        gm.l.e(format, "java.lang.String.format(format, *args)");
                                        arrayList.add(y.c.h(null, format, jSONObject, new y.b() { // from class: f6.a
                                            @Override // o5.y.b
                                            public final void b(e0 e0Var) {
                                                Boolean valueOf;
                                                b bVar2 = b.this;
                                                l.f(bVar2, "$instrumentData");
                                                try {
                                                    if (e0Var.f22704c == null) {
                                                        JSONObject jSONObject2 = e0Var.f22705d;
                                                        if (jSONObject2 == null) {
                                                            valueOf = null;
                                                        } else {
                                                            valueOf = Boolean.valueOf(jSONObject2.getBoolean("success"));
                                                        }
                                                        if (l.a(valueOf, Boolean.TRUE)) {
                                                            f.a(bVar2.f14131a);
                                                        }
                                                    }
                                                } catch (JSONException unused) {
                                                }
                                            }
                                        }));
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                o5.d0 d0Var = new o5.d0(arrayList);
                                String str2 = o5.y.f22858j;
                                d6.n0.e(d0Var);
                                new o5.c0(d0Var).executeOnExecutor(o5.v.c(), new Void[0]);
                            }
                        }
                        i6.a.f16566b = true;
                    }
                    d6.s sVar2 = d6.s.f12755a;
                    if (d6.s.c(s.b.ThreadCheck)) {
                        int i11 = k6.a.f18197a;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
