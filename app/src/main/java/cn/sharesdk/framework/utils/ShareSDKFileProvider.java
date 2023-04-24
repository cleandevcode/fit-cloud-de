package cn.sharesdk.framework.utils;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class ShareSDKFileProvider extends ContentProvider {

    /* renamed from: a */
    private static final String[] f5282a = {"_display_name", "_size"};

    /* renamed from: b */
    private static final File f5283b = new File("/");

    /* renamed from: c */
    private static HashMap<String, PathStrategy> f5284c = new HashMap<>();

    /* renamed from: d */
    private PathStrategy f5285d;

    /* renamed from: e */
    private ProviderInfo f5286e;

    /* loaded from: classes.dex */
    public interface PathStrategy {
        File getFileForUri(Uri uri);

        Uri getUriForFile(File file);
    }

    /* loaded from: classes.dex */
    public static class a implements PathStrategy {

        /* renamed from: a */
        private final String f5287a;

        /* renamed from: b */
        private final HashMap<String, File> f5288b = new HashMap<>();

        public a(String str) {
            this.f5287a = str;
        }

        public void a(String str, File file) {
            File absoluteFile;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                absoluteFile = file.getCanonicalFile();
            } catch (Throwable unused) {
                absoluteFile = file.getAbsoluteFile();
            }
            this.f5288b.put(str, absoluteFile);
        }

        @Override // cn.sharesdk.framework.utils.ShareSDKFileProvider.PathStrategy
        public File getFileForUri(Uri uri) {
            File absoluteFile;
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f5288b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, decode2);
            try {
                absoluteFile = file2.getCanonicalFile();
            } catch (Throwable unused) {
                absoluteFile = file2.getAbsoluteFile();
            }
            if (absoluteFile.getPath().startsWith(file.getPath())) {
                return absoluteFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        }

        @Override // cn.sharesdk.framework.utils.ShareSDKFileProvider.PathStrategy
        public Uri getUriForFile(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f5288b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry != null) {
                    String path2 = entry.getValue().getPath();
                    boolean endsWith = path2.endsWith("/");
                    int length = path2.length();
                    if (!endsWith) {
                        length++;
                    }
                    String substring = canonicalPath.substring(length);
                    return new Uri.Builder().scheme("content").authority(this.f5287a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
                }
                throw new IllegalArgumentException(a.b.b("Failed to find configured root that contains ", canonicalPath));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }
    }

    public static Uri a(Context context, String str, File file) {
        try {
            return a(context, str).getUriForFile(file);
        } catch (Throwable th2) {
            SSDKLog b10 = SSDKLog.b();
            b10.a("getUriForFile fail" + th2);
            return null;
        }
    }

    private static PathStrategy a(Context context, String str) {
        PathStrategy pathStrategy;
        synchronized (f5284c) {
            pathStrategy = f5284c.get(str);
            if (pathStrategy == null) {
                pathStrategy = b(context, str);
                f5284c.put(str, pathStrategy);
            }
        }
        return pathStrategy;
    }

    private static File a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private void a(String str) {
        ProviderInfo providerInfo;
        if (this.f5285d == null && (providerInfo = this.f5286e) != null) {
            if (providerInfo.exported) {
                throw new SecurityException("Provider must not be exported");
            }
            if (!providerInfo.grantUriPermissions) {
                throw new SecurityException("Provider must grant uri permissions");
            }
            try {
                this.f5285d = a(getContext(), this.f5286e.authority);
            } catch (Throwable unused) {
            }
        }
    }

    public static File[] a(Context context) {
        return context.getExternalFilesDirs(null);
    }

    private static Object[] a(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[i10];
        System.arraycopy(objArr, 0, objArr2, 0, i10);
        return objArr2;
    }

    private static String[] a(String[] strArr, int i10) {
        String[] strArr2 = new String[i10];
        System.arraycopy(strArr, 0, strArr2, 0, i10);
        return strArr2;
    }

    private static int b(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException(a.b.b("Invalid mode: ", str));
    }

    public static File[] b(Context context) {
        return context.getExternalCacheDirs();
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        this.f5286e = providerInfo;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        a("del");
        PathStrategy pathStrategy = this.f5285d;
        if (pathStrategy == null) {
            return 0;
        }
        return pathStrategy.getFileForUri(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        a("g-t");
        PathStrategy pathStrategy = this.f5285d;
        if (pathStrategy == null) {
            return "";
        }
        File fileForUri = pathStrategy.getFileForUri(uri);
        int lastIndexOf = fileForUri.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileForUri.getName().substring(lastIndexOf + 1));
            return mimeTypeFromExtension != null ? mimeTypeFromExtension : DfuBaseService.MIME_TYPE_OCTET_STREAM;
        }
        return DfuBaseService.MIME_TYPE_OCTET_STREAM;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        a("o-f");
        PathStrategy pathStrategy = this.f5285d;
        if (pathStrategy == null) {
            return null;
        }
        return ParcelFileDescriptor.open(pathStrategy.getFileForUri(uri), b(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        a("q");
        PathStrategy pathStrategy = this.f5285d;
        if (pathStrategy == null) {
            return null;
        }
        File fileForUri = pathStrategy.getFileForUri(uri);
        if (strArr == null) {
            strArr = f5282a;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i10 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i10] = "_display_name";
                objArr[i10] = fileForUri.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i10] = "_size";
                objArr[i10] = Long.valueOf(fileForUri.length());
            }
            i10++;
        }
        String[] a10 = a(strArr3, i10);
        Object[] a11 = a(objArr, i10);
        MatrixCursor matrixCursor = new MatrixCursor(a10, 1);
        matrixCursor.addRow(a11);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    private static PathStrategy b(Context context, String str) {
        a aVar = new a(str);
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            aVar.a("imageNameFilesDir", a(filesDir, "Mob/cache/images"));
            aVar.a("videoNameFilesDir", a(filesDir, "Mob/cache/videos"));
        }
        StringBuilder a10 = android.support.v4.media.d.a("Mob/");
        a10.append(context.getPackageName());
        a10.append("/cache/images");
        String sb2 = a10.toString();
        if (context.getCacheDir() != null) {
            aVar.a("cachename", a(filesDir, "."));
            aVar.a("imageNameExternal", a(filesDir, sb2));
            aVar.a("imageNameExternal", a(filesDir, "Mob/cache/images"));
        }
        StringBuilder a11 = android.support.v4.media.d.a("Mob/");
        a11.append(context.getPackageName());
        a11.append("/cache/images");
        String sb3 = a11.toString();
        StringBuilder a12 = android.support.v4.media.d.a("Mob/");
        a12.append(context.getPackageName());
        a12.append("/cache/videos");
        String sb4 = a12.toString();
        File[] a13 = a(context);
        File file = a13.length > 0 ? a13[0] : null;
        if (file != null) {
            aVar.a("imageNameExternal", a(file, sb3));
            aVar.a("videoNameExternal", a(file, sb4));
            aVar.a("mihayou", a(file, "."));
            aVar.a("more", a(file, "./."));
        }
        StringBuilder a14 = android.support.v4.media.d.a("Mob/");
        a14.append(context.getPackageName());
        a14.append("/cache/images");
        String sb5 = a14.toString();
        StringBuilder a15 = android.support.v4.media.d.a("Mob/");
        a15.append(context.getPackageName());
        a15.append("/cache/videos");
        String sb6 = a15.toString();
        File[] b10 = b(context);
        File file2 = b10.length > 0 ? b10[0] : null;
        if (file2 != null) {
            aVar.a("imageNameEtc", a(file2, sb5));
            aVar.a("videoNameEtc", a(file2, sb6));
        }
        if (f5283b != null) {
            aVar.a("imageNameRoot", a((File) null, "Mob/cache/images"));
            aVar.a("videoNameRoot", a((File) null, "Mob/cache/videos"));
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            aVar.a("externalStDir", a(externalStorageDirectory, "."));
        }
        return aVar;
    }
}
