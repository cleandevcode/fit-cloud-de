package gm;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import cn.sharesdk.framework.InnerShareParams;
import com.topstep.fitcloud.pro.ui.MainActivity;
import com.topstep.fitcloud.pro.ui.auth.AuthActivity;
import com.topstep.fitcloud.pro.ui.policy.AskPolicyActivity;
import com.topstep.fitcloud.pro.ui.sport.SportingActivity;
import ih.u;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.UUID;
import java.util.zip.Deflater;
import no.nordicsemi.android.dfu.DfuBaseService;
import y3.k0;
import yb.p0;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a */
    public static boolean f15503a = false;

    public static String a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toString("UTF-8");
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            c(byteArrayOutputStream);
        }
    }

    public static ArrayList b(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        if (bArr != null && bArr.length > 0) {
            int i10 = bArr[0] & 255;
            if (bArr.length >= (i10 * 4) + 1) {
                for (int i11 = 0; i11 < i10; i11++) {
                    nd.g gVar = new nd.g();
                    int i12 = i11 * 4;
                    gVar.f22324a = bArr[i12 + 1];
                    gVar.f22325b = bArr[i12 + 2];
                    gVar.f22326c = bArr[i12 + 3];
                    gVar.f22327d = bArr[i12 + 4];
                    arrayList.add(gVar);
                }
            }
        }
        return arrayList;
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                m2.f.h("hmsSdk", "closeQuietly(): Exception when closing the closeable!");
            }
        }
    }

    public static void d(File file, String str) {
        FileOutputStream fileOutputStream;
        String str2;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(str.getBytes("UTF-8"));
                    fileOutputStream.flush();
                } catch (FileNotFoundException unused) {
                    fileOutputStream2 = fileOutputStream;
                    str2 = "saveInfoToFile(): No files need to be read";
                    m2.f.h("hmsSdk", str2);
                    fileOutputStream = fileOutputStream2;
                    c(fileOutputStream);
                } catch (IOException unused2) {
                    fileOutputStream2 = fileOutputStream;
                    str2 = "saveInfoToFile(): io exc from write info to file!";
                    m2.f.h("hmsSdk", str2);
                    fileOutputStream = fileOutputStream2;
                    c(fileOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    c(fileOutputStream);
                    throw th;
                }
            } catch (FileNotFoundException unused3) {
            } catch (IOException unused4) {
            }
            c(fileOutputStream);
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = fileOutputStream2;
        }
    }

    public static void e(String str, String str2) {
        if (f15503a) {
            return;
        }
        Log.d(str, str2);
    }

    public static void f(HttpURLConnection httpURLConnection) {
        boolean z10;
        try {
            httpURLConnection.getInputStream().close();
        } catch (Exception unused) {
            m2.f.h("hmsSdk", "closeQuietly(): Exception when connHttp.getInputStream()!,There may be no network, or no INTERNET permission");
        }
        httpURLConnection.disconnect();
        p0 p0Var = m2.f.f20193a;
        if (p0Var.f31373a && 3 >= p0Var.f31374b) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            p0.a(3, "hmsSdk", " connHttp disconnect");
        }
    }

    public static boolean g(int i10) {
        return i10 == 5 || i10 == 4 || i10 == 2 || i10 == 7 || i10 == 6;
    }

    public static byte[] h(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        deflater.end();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused) {
            m2.f.h("hmsSdk", "closeStream(): Exception: close OutputStream error!");
        }
        return byteArray;
    }

    public static String i(Context context) {
        l.f(context, "context");
        if (p5.m.a() == null) {
            synchronized (p5.m.c()) {
                if (p5.m.a() == null) {
                    String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    if (!i6.a.b(p5.m.class)) {
                        p5.m.f23925e = string;
                    }
                    if (p5.m.a() == null) {
                        UUID randomUUID = UUID.randomUUID();
                        l.e(randomUUID, "randomUUID()");
                        String k10 = l.k(randomUUID, "XZ");
                        if (!i6.a.b(p5.m.class)) {
                            p5.m.f23925e = k10;
                        }
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", p5.m.a()).apply();
                    }
                }
                tl.l lVar = tl.l.f28297a;
            }
        }
        String a10 = p5.m.a();
        if (a10 != null) {
            return a10;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public static final String j(String str) {
        l.f(str, "<this>");
        if (str.length() >= 76) {
            String substring = str.substring(48, 56);
            l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return "";
    }

    public static final String k(String str) {
        l.f(str, "<this>");
        if (str.length() < 76) {
            return "——.——";
        }
        String m10 = m(str);
        String l10 = l(str);
        String substring = l10.substring(l10.length() - 4);
        l.e(substring, "this as java.lang.String).substring(startIndex)");
        String o10 = o(j(str));
        String substring2 = m10.substring(0, 2);
        l.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        if (l.a(substring2, "00")) {
            return o(m10) + '.' + substring + '.' + o10;
        }
        StringBuilder sb2 = new StringBuilder();
        String substring3 = m10.substring(2);
        l.e(substring3, "this as java.lang.String).substring(startIndex)");
        sb2.append(o(substring3));
        sb2.append('-');
        sb2.append(substring2);
        sb2.append('.');
        sb2.append(substring);
        sb2.append('.');
        sb2.append(o10);
        return sb2.toString();
    }

    public static final String l(String str) {
        l.f(str, "<this>");
        if (str.length() >= 76) {
            String substring = str.substring(28, 40);
            l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return "";
    }

    public static final String m(String str) {
        l.f(str, "<this>");
        if (str.length() >= 76) {
            String substring = str.substring(0, 12);
            l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return "";
    }

    public static final void n(ih.u uVar, androidx.fragment.app.x xVar) {
        l.f(xVar, InnerShareParams.ACTIVITY);
        if (l.a(uVar, u.a.f16876a)) {
            int i10 = AuthActivity.f10303x;
            AuthActivity.a.a(xVar);
        } else if (l.a(uVar, u.b.f16877a)) {
            int i11 = AskPolicyActivity.f11701x;
            xVar.startActivity(new Intent(xVar, AskPolicyActivity.class));
        } else if (l.a(uVar, u.c.f16878a)) {
            int i12 = MainActivity.E;
            MainActivity.a.a(xVar);
        } else if (uVar instanceof u.d) {
            SportingActivity.a aVar = SportingActivity.X;
            int i13 = ((u.d) uVar).f16879a;
            aVar.getClass();
            Intent intent = new Intent(xVar, SportingActivity.class);
            intent.putExtra("sport_type", i13);
            intent.putExtra("from_main", false);
            xVar.startActivity(intent);
        } else {
            throw new IllegalStateException();
        }
        xVar.finish();
    }

    public static final String o(String str) {
        int i10 = 0;
        if (str.length() == 0) {
            return str;
        }
        int length = str.length();
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            } else if (str.charAt(i11) != '0') {
                i10 = i11;
                break;
            } else {
                i11++;
            }
        }
        String substring = str.substring(i10, str.length());
        l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final Object p(k0 k0Var, fm.l lVar) {
        l.f(k0Var, "repository1");
        return lVar.k(k0Var.f30971c.f31078c.d());
    }
}
