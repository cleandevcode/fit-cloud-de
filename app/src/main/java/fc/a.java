package fc;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.e;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import no.nordicsemi.android.dfu.DfuBaseService;
import s.h1;
import yb.y;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final Uri f14228a = Uri.parse("content://com.huawei.hwid");

    /* renamed from: b */
    public static final String[] f14229b = {"B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05", "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539"};

    public static String a(Context context) {
        StringBuilder sb2;
        Context applicationContext;
        if (Build.VERSION.SDK_INT >= 24) {
            sb2 = new StringBuilder();
            applicationContext = context.createDeviceProtectedStorageContext();
        } else {
            sb2 = new StringBuilder();
            applicationContext = context.getApplicationContext();
        }
        sb2.append(applicationContext.getFilesDir());
        return e.b(sb2, File.separator, "aegis");
    }

    public static String b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    public static void c(Context context, ByteArrayInputStream byteArrayInputStream) {
        Throwable th2;
        FileOutputStream fileOutputStream;
        String a10 = a(context);
        if (!new File(a10).exists() && !TextUtils.isEmpty(a10)) {
            File file = new File(a10);
            if (file.exists()) {
                Log.w(p.b.b("BksUtil"), "The directory  has already exists");
            } else if (!file.mkdirs()) {
                p.b.c("BksUtil", "create directory  failed");
            }
        }
        File file2 = new File(a10, "hmsrootcas.bks");
        if (file2.exists()) {
            file2.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                p.b.e("BksUtil", "write output stream ");
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = byteArrayInputStream.read(bArr, 0, 2048);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            y.g(fileOutputStream);
                            return;
                        }
                    }
                } catch (IOException unused) {
                    fileOutputStream2 = fileOutputStream;
                    p.b.c("BksUtil", " IOException");
                    y.g(fileOutputStream2);
                } catch (Throwable th3) {
                    th2 = th3;
                    y.g(fileOutputStream);
                    throw th2;
                }
            } catch (Throwable th4) {
                FileOutputStream fileOutputStream3 = fileOutputStream2;
                th2 = th4;
                fileOutputStream = fileOutputStream3;
            }
        } catch (IOException unused2) {
        }
    }

    public static byte[] d(Context context, String str) {
        StringBuilder sb2;
        String str2;
        PackageInfo packageInfo;
        if (TextUtils.isEmpty(str)) {
            Log.e("BksUtil", "packageName is null or context is null");
            return new byte[0];
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str, 64)) != null) {
                return packageInfo.signatures[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException e10) {
            e = e10;
            sb2 = new StringBuilder();
            str2 = "PackageManager.NameNotFoundException : ";
            sb2.append(str2);
            sb2.append(e.getMessage());
            Log.e("BksUtil", sb2.toString());
            return new byte[0];
        } catch (Exception e11) {
            e = e11;
            sb2 = new StringBuilder();
            str2 = "get pm exception : ";
            sb2.append(str2);
            sb2.append(e.getMessage());
            Log.e("BksUtil", sb2.toString());
            return new byte[0];
        }
        return new byte[0];
    }

    public static String e(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return b(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            p.b.c("BksUtil", "inputstraem exception");
            return "";
        }
    }

    public static boolean f(String str) {
        int parseInt;
        int i10;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        p.b.e("BksUtil", "hms version code is : " + str);
        String[] split = str.split("\\.");
        String[] split2 = "4.0.2.300".split("\\.");
        int length = split.length;
        int length2 = split2.length;
        int max = Math.max(length, length2);
        for (int i11 = 0; i11 < max; i11++) {
            if (i11 < length) {
                try {
                    parseInt = Integer.parseInt(split[i11]);
                } catch (Exception e10) {
                    StringBuilder a10 = android.support.v4.media.d.a(" exception : ");
                    a10.append(e10.getMessage());
                    p.b.c("BksUtil", a10.toString());
                    if (i11 < length2) {
                        return false;
                    }
                    return true;
                }
            } else {
                parseInt = 0;
            }
            if (i11 < length2) {
                i10 = Integer.parseInt(split2[i11]);
            } else {
                i10 = 0;
            }
            if (parseInt < i10) {
                return false;
            }
            if (parseInt > i10) {
                return true;
            }
        }
        return true;
    }

    public static String g(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            return b(MessageDigest.getInstance("SHA-256").digest(bArr));
        } catch (NoSuchAlgorithmException e10) {
            StringBuilder a10 = android.support.v4.media.d.a("NoSuchAlgorithmException");
            a10.append(e10.getMessage());
            Log.e("BksUtil", a10.toString());
            return "";
        }
    }

    public static boolean h(Context context) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a(context));
        return new File(e.b(sb2, File.separator, "hmsrootcas.bks")).exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public static synchronized FileInputStream i(Context context) {
        boolean z10;
        Closeable closeable;
        InputStream inputStream;
        ByteArrayInputStream byteArrayInputStream;
        InputStream inputStream2;
        InputStream inputStream3;
        String string;
        String e10;
        synchronized (a.class) {
            p.b.e("BksUtil", "get bks from tss begin");
            if (context != null && h1.f25978c == null) {
                h1.f25978c = context.getApplicationContext();
            }
            Context context2 = h1.f25978c;
            InputStream inputStream4 = null;
            if (context2 == null) {
                p.b.c("BksUtil", "context is null");
                return null;
            } else if (!f(c.a("com.huawei.hwid")) && !f(c.a("com.huawei.hms"))) {
                p.b.c("BksUtil", "hms version code is too low : " + c.a("com.huawei.hwid"));
                return null;
            } else {
                byte[] d10 = d(context2, "com.huawei.hwid");
                String[] strArr = f14229b;
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (strArr[i10].equalsIgnoreCase(g(d10))) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (!z10 && !"E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539".equalsIgnoreCase(g(d(context2, "com.huawei.hms")))) {
                    p.b.c("BksUtil", "hms sign error");
                    return null;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    inputStream2 = context2.getContentResolver().openInputStream(Uri.withAppendedPath(f14228a, "files/hmsrootcas.bks"));
                    try {
                        byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
                        while (true) {
                            int read = inputStream2.read(bArr);
                            if (read <= -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byteArrayOutputStream.flush();
                        byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    } catch (Exception unused) {
                        byteArrayInputStream = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayInputStream = inputStream4;
                        inputStream4 = inputStream2;
                        closeable = byteArrayInputStream;
                        y.g(inputStream4);
                        y.g(byteArrayOutputStream);
                        y.g(closeable);
                        throw th;
                    }
                    try {
                        string = d.a(context2).getString("bks_hash", "");
                        e10 = e(byteArrayOutputStream.toByteArray());
                    } catch (Exception unused2) {
                        inputStream4 = inputStream2;
                        inputStream = byteArrayInputStream;
                        try {
                            p.b.c("BksUtil", "Get bks from HMS_VERSION_CODE exception : No content provider");
                            y.g(inputStream4);
                            y.g(byteArrayOutputStream);
                            inputStream3 = inputStream;
                            y.g(inputStream3);
                            return j(context2);
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream2 = inputStream4;
                            inputStream4 = inputStream;
                            byteArrayInputStream = inputStream4;
                            inputStream4 = inputStream2;
                            closeable = byteArrayInputStream;
                            y.g(inputStream4);
                            y.g(byteArrayOutputStream);
                            y.g(closeable);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream4 = inputStream2;
                        closeable = byteArrayInputStream;
                        y.g(inputStream4);
                        y.g(byteArrayOutputStream);
                        y.g(closeable);
                        throw th;
                    }
                } catch (Exception unused3) {
                    inputStream = null;
                } catch (Throwable th5) {
                    th = th5;
                    closeable = null;
                    y.g(inputStream4);
                    y.g(byteArrayOutputStream);
                    y.g(closeable);
                    throw th;
                }
                if (h(context2) && string.equals(e10)) {
                    p.b.e("BksUtil", "bks not update");
                    y.g(inputStream2);
                    y.g(byteArrayOutputStream);
                    inputStream3 = byteArrayInputStream;
                    y.g(inputStream3);
                    return j(context2);
                }
                p.b.e("BksUtil", "update bks and sp");
                c(context2, byteArrayInputStream);
                d.a(context2).edit().putString("bks_hash", e10).apply();
                y.g(inputStream2);
                y.g(byteArrayOutputStream);
                inputStream3 = byteArrayInputStream;
                y.g(inputStream3);
                return j(context2);
            }
        }
    }

    public static FileInputStream j(Context context) {
        if (h(context)) {
            p.b.e("BksUtil", "getFilesBksIS ");
            try {
                return new FileInputStream(a(context) + File.separator + "hmsrootcas.bks");
            } catch (FileNotFoundException unused) {
                p.b.c("BksUtil", "FileNotFoundExceptio: ");
                return null;
            }
        }
        return null;
    }
}
