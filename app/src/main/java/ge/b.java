package ge;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.activity.e;
import d6.d0;
import d6.m0;
import d6.s0;
import gm.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import o5.f0;
import o5.q0;
import o5.v;
import o5.y;
import om.h;
import p5.m;
import pm.g0;
import r6.i;
import r6.j;
import sa.p;

/* loaded from: classes.dex */
public final class b implements p {

    /* renamed from: a */
    public static String f15314a = "Realtek";

    /* renamed from: b */
    public static boolean f15315b = false;

    /* renamed from: c */
    public static int f15316c = 1;

    /* renamed from: d */
    public static a f15317d = new g0();

    public static void b(int i10, Object obj, String str, boolean z10) {
        String[] strArr;
        String str2;
        if (!z10) {
            return;
        }
        Object[] objArr = {obj};
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace != null && stackTrace.length >= 6) {
            String className = stackTrace[5].getClassName();
            String[] split = className.split("\\.");
            if (split.length > 0) {
                className = e.b(new StringBuilder(), split[split.length - 1], ".java");
            }
            if (className.contains("$")) {
                className = e.b(new StringBuilder(), className.split("\\$")[0], ".java");
            }
            String methodName = stackTrace[5].getMethodName();
            int lineNumber = stackTrace[5].getLineNumber();
            if (lineNumber < 0) {
                lineNumber = 0;
            }
            String str3 = methodName.substring(0, 1).toUpperCase() + methodName.substring(1);
            if (str == null) {
                str2 = className;
            } else {
                str2 = str;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = f15314a;
            }
            strArr = new String[]{str2, objArr[0].toString(), String.format(Locale.US, "[ (%s:%d)#%s ]", className, Integer.valueOf(lineNumber), str3)};
        } else {
            strArr = null;
        }
        if (strArr != null && strArr.length >= 3) {
            String str4 = strArr[0];
            String str5 = strArr[1];
            c(i10, str4, strArr[2] + str5);
            return;
        }
        c(i10, str, (String) obj);
    }

    public static void c(int i10, String str, String str2) {
        if (f15317d == null) {
            return;
        }
        int max = Math.max(i10, f15316c);
        int i11 = 6;
        if ((max & 6) != 6) {
            i11 = 5;
            if ((max & 5) != 5) {
                i11 = 4;
                if ((max & 4) != 4) {
                    i11 = 3;
                    if ((max & 3) != 3) {
                        i11 = 2;
                        if ((max & 2) != 2) {
                            if ((max & 1) == 1) {
                                f15317d.a(1, str, str2);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        f15317d.a(i11, str, str2);
    }

    public static void d(String str) {
        b(2, str, f15314a, f15315b);
    }

    public static void e(String str, boolean z10) {
        b(2, str, f15314a, z10);
    }

    public static void f(String str) {
        b(5, str, f15314a, f15315b);
    }

    public static void g(String str, boolean z10) {
        b(5, str, f15314a, z10);
    }

    public static final ArrayList h(j jVar, UUID uuid) {
        List<i> list;
        Uri uri;
        Bitmap bitmap;
        d0.a aVar;
        l.f(uuid, "appCallId");
        if (jVar == null) {
            list = null;
        } else {
            list = jVar.f25384g;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (i iVar : list) {
            if (iVar instanceof i) {
                bitmap = iVar.f25375b;
                uri = iVar.f25376c;
            } else if (iVar instanceof r6.l) {
                uri = ((r6.l) iVar).f25390b;
                bitmap = null;
            } else {
                uri = null;
                bitmap = null;
            }
            if (bitmap != null) {
                aVar = d0.b(uuid, bitmap);
            } else if (uri != null) {
                aVar = d0.c(uuid, uri);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(ul.l.B(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((d0.a) it.next()).f12657d);
        }
        d0.a(arrayList);
        return arrayList2;
    }

    public static final String i(Uri uri) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        l.e(uri2, "uri.toString()");
        int j02 = om.l.j0(uri2, '.', 0, 6);
        if (j02 == -1) {
            return null;
        }
        String substring = uri2.substring(j02);
        l.e(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean j(int r7, android.content.Intent r8, q6.i r9) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.b.j(int, android.content.Intent, q6.i):boolean");
    }

    public static void k(String str) {
        b(3, str, f15314a, f15315b);
    }

    public static void l(String str, String str2) {
        m mVar = new m(v.a(), (String) null);
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_outcome", str);
        if (str2 != null) {
            bundle.putString("error_message", str2);
        }
        if (q0.b()) {
            mVar.f("fb_share_dialog_result", bundle);
        }
    }

    public static final y m(o5.a aVar, Uri uri, s0 s0Var) {
        f0 f0Var = f0.POST;
        String path = uri.getPath();
        m0 m0Var = m0.f12709a;
        if (h.V("file", uri.getScheme()) && path != null) {
            y.g gVar = new y.g(ParcelFileDescriptor.open(new File(path), 268435456));
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", gVar);
            return new y(aVar, "me/staging_resources", bundle, f0Var, s0Var, 32);
        } else if (h.V("content", uri.getScheme())) {
            y.g gVar2 = new y.g(uri);
            Bundle bundle2 = new Bundle(1);
            bundle2.putParcelable("file", gVar2);
            return new y(aVar, "me/staging_resources", bundle2, f0Var, s0Var, 32);
        } else {
            throw new o5.p("The image Uri must be either a file:// or content:// Uri");
        }
    }

    public static void n(String str) {
        b(1, str, f15314a, f15315b);
    }

    public static void o(String str, boolean z10) {
        b(1, str, f15314a, z10);
    }

    public static void p(String str) {
        b(4, str, f15314a, f15315b);
    }

    public static void q(String str, boolean z10) {
        b(4, str, f15314a, z10);
    }

    @Override // sa.p
    public Object a() {
        return new ConcurrentHashMap();
    }
}
