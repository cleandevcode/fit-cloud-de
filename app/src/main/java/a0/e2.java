package a0;

import android.view.View;
import d6.s;
import f6.f;
import gm.l;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Pattern;
import k1.n2;
import o5.e0;
import o5.y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z9.r;

/* loaded from: classes.dex */
public final /* synthetic */ class e2 implements s.a, r.b {

    /* renamed from: a */
    public final /* synthetic */ int f49a;

    public /* synthetic */ e2(int i10) {
        this.f49a = i10;
    }

    @Override // z9.r.b
    public final n2 b(View view, n2 n2Var, r.c cVar) {
        a1.c a10 = n2Var.a(7);
        gm.l.e(a10, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        cVar.f32167b += a10.f215b;
        cVar.a(view);
        return n2Var;
    }

    @Override // d6.s.a
    public final void c(boolean z10) {
        File[] listFiles;
        boolean z11;
        switch (this.f49a) {
            case 1:
                o5.v vVar = o5.v.f22837a;
                if (z10 && o5.q0.b()) {
                    d6.s sVar = d6.s.f12755a;
                    d6.u.c(new d6.t(new s.t0(5), s.b.CrashReport));
                    d6.u.c(new d6.t(new e2(3), s.b.ErrorReport));
                    d6.u.c(new d6.t(new s.j0(6), s.b.AnrReport));
                    return;
                }
                return;
            case 2:
                if (z10) {
                    u5.a aVar = u5.a.f28515a;
                    if (!i6.a.b(u5.a.class)) {
                        try {
                            u5.a.f28516b = true;
                            u5.a.f28515a.a();
                            return;
                        } catch (Throwable th2) {
                            i6.a.a(u5.a.class, th2);
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                if (z10) {
                    o5.v vVar2 = o5.v.f22837a;
                    if (o5.q0.b() && !d6.m0.y()) {
                        File b10 = f6.f.b();
                        if (b10 == null) {
                            listFiles = new File[0];
                        } else {
                            listFiles = b10.listFiles(new FilenameFilter() { // from class: j6.d
                                @Override // java.io.FilenameFilter
                                public final boolean accept(File file, String str) {
                                    l.e(str, "name");
                                    String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
                                    l.e(format, "java.lang.String.format(format, *args)");
                                    Pattern compile = Pattern.compile(format);
                                    l.e(compile, "compile(pattern)");
                                    return compile.matcher(str).matches();
                                }
                            });
                            gm.l.e(listFiles, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
                        }
                        final ArrayList arrayList = new ArrayList();
                        int length = listFiles.length;
                        int i10 = 0;
                        while (i10 < length) {
                            File file = listFiles[i10];
                            i10++;
                            j6.a aVar2 = new j6.a(file);
                            if (aVar2.f17508b != null && aVar2.f17509c != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                arrayList.add(aVar2);
                            }
                        }
                        ul.m.C(arrayList, new Comparator() { // from class: j6.b
                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                a aVar3 = (a) obj;
                                a aVar4 = (a) obj2;
                                l.e(aVar4, "o2");
                                aVar3.getClass();
                                Long l10 = aVar3.f17509c;
                                if (l10 != null) {
                                    long longValue = l10.longValue();
                                    Long l11 = aVar4.f17509c;
                                    if (l11 == null) {
                                        return 1;
                                    }
                                    int i11 = (l11.longValue() > longValue ? 1 : (l11.longValue() == longValue ? 0 : -1));
                                    if (i11 >= 0) {
                                        if (i11 != 0) {
                                            return 1;
                                        }
                                        return 0;
                                    }
                                }
                                return -1;
                            }
                        });
                        JSONArray jSONArray = new JSONArray();
                        for (int i11 = 0; i11 < arrayList.size() && i11 < 1000; i11++) {
                            jSONArray.put(arrayList.get(i11));
                        }
                        f6.f.e("error_reports", jSONArray, new y.b() { // from class: j6.c
                            @Override // o5.y.b
                            public final void b(e0 e0Var) {
                                Boolean valueOf;
                                ArrayList<a> arrayList2 = arrayList;
                                l.f(arrayList2, "$validReports");
                                try {
                                    if (e0Var.f22704c == null) {
                                        JSONObject jSONObject = e0Var.f22705d;
                                        if (jSONObject == null) {
                                            valueOf = null;
                                        } else {
                                            valueOf = Boolean.valueOf(jSONObject.getBoolean("success"));
                                        }
                                        if (l.a(valueOf, Boolean.TRUE)) {
                                            for (a aVar3 : arrayList2) {
                                                f.a(aVar3.f17507a);
                                            }
                                        }
                                    }
                                } catch (JSONException unused) {
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
