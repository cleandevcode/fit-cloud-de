package com.mob.tools.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.huawei.hms.framework.common.ContainerUtils;
import com.mob.MobSDK;
import com.mob.commons.C0744r;
import com.mob.commons.j;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.network.KVPair;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.DH;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLDecoder;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public class ResHelper implements PublicMemberKeeper {

    /* renamed from: a */
    private static float f9345a;

    /* renamed from: b */
    private static int f9346b;

    /* renamed from: c */
    private static Uri f9347c;

    public static void clearCache(Context context) {
        deleteFileAndFolder(new File(getCachePath(context, null)));
    }

    public static void closeIOs(Closeable... closeableArr) {
        if (closeableArr == null || closeableArr.length <= 0) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th2) {
                    MobLog.getInstance().d(th2);
                }
            }
        }
    }

    public static void copyFile(FileInputStream fileInputStream, FileOutputStream fileOutputStream) {
        byte[] bArr = new byte[65536];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read <= 0) {
                fileInputStream.close();
                fileOutputStream.close();
                return;
            }
            fileOutputStream.write(bArr, 0, read);
        }
    }

    public static boolean copyFile(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !new File(str).exists()) {
            return false;
        }
        try {
            copyFile(new FileInputStream(str), new FileOutputStream(str2));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Deprecated
    public static long dateStrToLong(String str) {
        return new SimpleDateFormat("yyyy-MM-dd").parse(str, new ParsePosition(0)).getTime();
    }

    @Deprecated
    public static long dateToLong(String str) {
        try {
            Date date = new Date(str);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar.getTimeInMillis();
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return 0L;
        }
    }

    @Deprecated
    public static Bundle decodeUrl(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            for (String str2 : str.split(ContainerUtils.FIELD_DELIMITER)) {
                String[] split = str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
                if (split.length < 2 || split[1] == null) {
                    bundle.putString(URLDecoder.decode(split[0]), "");
                } else {
                    bundle.putString(URLDecoder.decode(split[0]), URLDecoder.decode(split[1]));
                }
            }
        }
        return bundle;
    }

    public static void deleteFileAndFolder(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        String[] list = file.list();
        if (list == null || list.length <= 0) {
            file.delete();
            return;
        }
        for (String str : list) {
            File file2 = new File(file, str);
            if (file2.isDirectory()) {
                deleteFileAndFolder(file2);
            } else {
                file2.delete();
            }
        }
        file.delete();
    }

    public static int designToDevice(Context context, float f10, int i10) {
        if (f9345a <= 0.0f) {
            f9345a = context.getResources().getDisplayMetrics().density;
        }
        return (int) (((i10 * f9345a) / f10) + 0.5f);
    }

    public static int designToDevice(Context context, int i10, int i11) {
        if (f9346b == 0) {
            int[] screenSize = getScreenSize(context);
            int i12 = screenSize[0];
            int i13 = screenSize[1];
            if (i12 >= i13) {
                i12 = i13;
            }
            f9346b = i12;
        }
        return (int) (((i11 * f9346b) / i10) + 0.5f);
    }

    public static int dipToPx(Context context, int i10) {
        if (f9345a <= 0.0f) {
            f9345a = context.getResources().getDisplayMetrics().density;
        }
        return (int) ((i10 * f9345a) + 0.5f);
    }

    @Deprecated
    public static String encodeUrl(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj == null) {
                obj = "";
            }
            if (z10) {
                z10 = false;
            } else {
                sb2.append(ContainerUtils.FIELD_DELIMITER);
            }
            sb2.append(Data.urlEncode(str) + ContainerUtils.KEY_VALUE_DELIMITER + Data.urlEncode(String.valueOf(obj)));
        }
        return sb2.toString();
    }

    @Deprecated
    public static String encodeUrl(ArrayList<KVPair<String>> arrayList) {
        if (arrayList == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        Iterator<KVPair<String>> it = arrayList.iterator();
        while (it.hasNext()) {
            KVPair<String> next = it.next();
            if (i10 > 0) {
                sb2.append('&');
            }
            String str = next.name;
            String str2 = next.value;
            if (str != null) {
                if (str2 == null) {
                    str2 = "";
                }
                sb2.append(Data.urlEncode(str) + ContainerUtils.KEY_VALUE_DELIMITER + Data.urlEncode(str2));
                i10++;
            }
        }
        return sb2.toString();
    }

    public static <T> T forceCast(Object obj) {
        return (T) forceCast(obj, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T forceCast(Object obj, T t10) {
        if (obj != 0) {
            try {
                if (obj instanceof Integer) {
                    return t10 instanceof Long ? (T) Long.valueOf(((Integer) obj).intValue()) : obj;
                }
                return obj;
            } catch (Throwable unused) {
            }
        }
        return t10;
    }

    public static int getAnimRes(Context context, String str) {
        return getResId(context, "anim", str);
    }

    public static int getBitmapRes(Context context, String str) {
        int resId = getResId(context, "drawable", str);
        return resId <= 0 ? getResId(context, "mipmap", str) : resId;
    }

    public static String getCachePath(Context context, String str) {
        String str2 = context.getFilesDir().getAbsolutePath() + j.a("001e") + "MobSDK" + j.a("007e+bebdbe0age");
        try {
            String sandboxPath = DH.SyncMtd.getSandboxPath();
            if (sandboxPath != null) {
                str2 = sandboxPath + j.a("001e") + "MobSDK" + j.a("001e") + DH.SyncMtd.getPackageName() + j.a("007e?bebdbeSage");
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        if (!TextUtils.isEmpty(str)) {
            StringBuilder a10 = p.a.a(str2, str);
            a10.append(j.a("001e"));
            str2 = a10.toString();
        }
        File file = new File(str2);
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        return str2;
    }

    public static String getCacheRoot(Context context) {
        return getCacheRoot(context, false);
    }

    public static String getCacheRoot(Context context, boolean z10) {
        String dataCache;
        if (z10) {
            dataCache = null;
        } else {
            try {
                dataCache = getDataCache(context);
            } catch (Throwable th2) {
                MobLog.getInstance().w(th2);
                return null;
            }
        }
        String sandboxPath = DH.SyncMtd.getSandboxPath();
        if (sandboxPath != null) {
            dataCache = sandboxPath + j.a("001e") + "MobSDK";
        }
        if (TextUtils.isEmpty(dataCache)) {
            return null;
        }
        File file = new File(dataCache);
        if (!file.exists() || !file.isDirectory()) {
            file.delete();
            file.mkdirs();
        }
        return dataCache;
    }

    public static File getCacheRootFile(Context context, String str) {
        try {
            String cacheRoot = getCacheRoot(context);
            if (cacheRoot != null) {
                File file = new File(cacheRoot, str);
                if (!file.getParentFile().exists() || !file.getParentFile().isDirectory()) {
                    file.getParentFile().delete();
                    file.getParentFile().mkdirs();
                }
                return file;
            }
            return null;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public static int getColorRes(Context context, String str) {
        return getResId(context, "color", str);
    }

    public static String getDataCache(Context context) {
        String str = context.getFilesDir().getAbsolutePath() + j.a("001e") + "MobSDK";
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            file.delete();
            file.mkdirs();
        }
        return str;
    }

    public static File getDataCacheFile(Context context, String str) {
        return getDataCacheFile(context, str, false);
    }

    public static File getDataCacheFile(Context context, String str, boolean z10) {
        File file = new File(getDataCache(context), str);
        if (z10 && !file.exists()) {
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                file.createNewFile();
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
            }
        }
        return file;
    }

    public static float getDensity(Context context) {
        if (f9345a <= 0.0f) {
            f9345a = context.getResources().getDisplayMetrics().density;
        }
        return f9345a;
    }

    public static int getDensityDpi(Context context) {
        return context.getResources().getDisplayMetrics().densityDpi;
    }

    public static float[] getDensityXYDpi(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new float[]{displayMetrics.xdpi, displayMetrics.ydpi};
    }

    @Deprecated
    public static long getFileSize(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                int i10 = 0;
                for (String str : file.list()) {
                    i10 = (int) (getFileSize(new File(file, str)) + i10);
                }
                return i10;
            }
            return file.length();
        }
        return 0L;
    }

    @Deprecated
    public static long getFileSize(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return getFileSize(new File(str));
    }

    public static int getIdRes(Context context, String str) {
        return getResId(context, j.a("002:bc+f"), str);
    }

    public static String getImageCachePath(Context context) {
        return getCachePath(context, "images");
    }

    public static int getLayoutRes(Context context, String str) {
        return getResId(context, j.a("006Ocbbdbgcaba@b"), str);
    }

    @Deprecated
    public static synchronized Uri getMediaUri(Context context, String str, String str2) {
        Uri uri;
        synchronized (ResHelper.class) {
            final Object obj = new Object();
            f9347c = null;
            MediaScannerConnection.scanFile(context, new String[]{str}, new String[]{str2}, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.mob.tools.utils.ResHelper.1
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public void onScanCompleted(String str3, Uri uri2) {
                    Uri unused = ResHelper.f9347c = uri2;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            });
            try {
                if (f9347c == null) {
                    synchronized (obj) {
                        obj.wait(10000L);
                    }
                }
            } catch (Throwable unused) {
            }
            uri = f9347c;
            f9347c = null;
        }
        return uri;
    }

    public static int getRawRes(Context context, String str) {
        return getResId(context, "raw", str);
    }

    public static int getResId(Context context, String str, String str2) {
        int i10 = 0;
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String packageName = context.getPackageName();
            if (TextUtils.isEmpty(packageName)) {
                return 0;
            }
            i10 = context.getResources().getIdentifier(str2, str, packageName);
            if (i10 <= 0) {
                i10 = context.getResources().getIdentifier(str2.toLowerCase(), str, packageName);
            }
            if (i10 <= 0) {
                NLog mobLog = MobLog.getInstance();
                mobLog.w("failed to parse " + str + " resource \"" + str2 + "\"");
            }
        }
        return i10;
    }

    public static int getScreenHeight(Context context) {
        return getScreenSize(context)[1];
    }

    public static int[] getScreenSize(Context context) {
        WindowManager windowManager;
        Display display = null;
        try {
            windowManager = (WindowManager) DH.SyncMtd.getSystemServiceSafe("window");
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            windowManager = null;
        }
        if (windowManager != null) {
            try {
                display = windowManager.getDefaultDisplay();
            } catch (Throwable th3) {
                MobLog.getInstance().w(th3);
            }
            try {
                if (display == null) {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
                }
                Point point = new Point();
                Method method = display.getClass().getMethod(j.a("011Zdd?gbFecZg[bdcbcfbcea>g"), Point.class);
                method.setAccessible(true);
                method.invoke(display, point);
                return new int[]{point.x, point.y};
            } catch (Throwable th4) {
                MobLog.getInstance().w(th4);
            }
        }
        return new int[]{0, 0};
    }

    public static int getScreenWidth(Context context) {
        return getScreenSize(context)[0];
    }

    public static int getStringArrayRes(Context context, String str) {
        return getResId(context, "array", str);
    }

    public static int getStringRes(Context context, String str) {
        return getResId(context, "string", str);
    }

    public static int getStyleRes(Context context, String str) {
        return getResId(context, "style", str);
    }

    public static int[] getStyleableRes(Context context, String str) {
        try {
            Object staticField = ReflectHelper.getStaticField(ReflectHelper.importClass(context.getPackageName() + ".R$styleable"), str);
            return staticField == null ? new int[0] : staticField.getClass().isArray() ? (int[]) staticField : new int[]{((Integer) staticField).intValue()};
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return new int[0];
        }
    }

    public static <T> boolean isEqual(T t10, T t11) {
        return !((t10 == null && t11 != null) || !(t10 == null || t10.equals(t11)));
    }

    @Deprecated
    public static int parseInt(String str) {
        return parseInt(str, 10);
    }

    @Deprecated
    public static int parseInt(String str, int i10) {
        return Integer.parseInt(str, i10);
    }

    @Deprecated
    public static long parseLong(String str) {
        return parseLong(str, 10);
    }

    @Deprecated
    public static long parseLong(String str, int i10) {
        return Long.parseLong(str, i10);
    }

    @Deprecated
    public static Uri pathToContentUri(Context context, String str) {
        try {
            if (DH.SyncMtd.checkPermission(j.a("040Abdbi%f7bfcabcVf!cjMcgFbf[j*bcdedebccabicjecebchdgbbebfecgebeccdchcibbcfcgdjecchfieb"))) {
                Cursor query = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "_data=? ", new String[]{str}, null);
                if (query == null || !query.moveToFirst()) {
                    if (new File(str).exists()) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("_data", str);
                        return context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                    }
                    return null;
                }
                int i10 = query.getInt(query.getColumnIndex("_id"));
                Uri parse = Uri.parse("content://media/external/images/media");
                return Uri.withAppendedPath(parse, "" + i10);
            }
            return null;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }

    public static int pxToDip(Context context, int i10) {
        if (f9345a <= 0.0f) {
            f9345a = context.getResources().getDisplayMetrics().density;
        }
        return (int) ((i10 / f9345a) + 0.5f);
    }

    public static ArrayList<HashMap<String, String>> readArrayListFromFile(String str) {
        return readArrayListFromFile(str, false);
    }

    public static ArrayList<HashMap<String, String>> readArrayListFromFile(String str, boolean z10) {
        File dataCacheFile = getDataCacheFile(MobSDK.getContext(), str, true);
        if (dataCacheFile.exists()) {
            BufferedReader bufferedReader = null;
            try {
                ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream(dataCacheFile)), "utf-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            closeIOs(bufferedReader2);
                            return arrayList;
                        }
                        if (z10) {
                            readLine = new String(Base64.decode(readLine, 2), "utf-8");
                        }
                        arrayList.add(HashonHelper.fromJson(readLine));
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        try {
                            MobLog.getInstance().d(th);
                            closeIOs(bufferedReader);
                            return new ArrayList<>();
                        } catch (Throwable th3) {
                            closeIOs(bufferedReader);
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return new ArrayList<>();
    }

    public static long readLongFromFile(String str) {
        Throwable th2;
        DataInputStream dataInputStream;
        File dataCacheFile = getDataCacheFile(MobSDK.getContext(), str);
        if (dataCacheFile.exists()) {
            try {
                dataInputStream = new DataInputStream(new FileInputStream(dataCacheFile));
            } catch (Throwable th3) {
                th2 = th3;
                dataInputStream = null;
            }
            try {
                long readLong = dataInputStream.readLong();
                C0744r.a(dataInputStream);
                return readLong;
            } catch (Throwable th4) {
                th2 = th4;
                try {
                    MobLog.getInstance().d(th2);
                    C0744r.a(dataInputStream);
                    return 0L;
                } catch (Throwable th5) {
                    C0744r.a(dataInputStream);
                    throw th5;
                }
            }
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0010, code lost:
        if (r0.exists() == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object readObjectFromFile(java.lang.String r9) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 0
            if (r0 != 0) goto L71
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L13
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L13
            boolean r9 = r0.exists()     // Catch: java.lang.Throwable -> L13
            if (r9 != 0) goto L1c
            goto L1b
        L13:
            r9 = move-exception
            com.mob.tools.log.NLog r0 = com.mob.tools.MobLog.getInstance()
            r0.d(r9)
        L1b:
            r0 = r1
        L1c:
            if (r0 == 0) goto L71
            r9 = 2
            r2 = 1
            r3 = 0
            r4 = 3
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4d
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L4d
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L49
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L49
            java.io.ObjectInputStream r6 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L46
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r7 = r6.readObject()     // Catch: java.lang.Throwable -> L44
            r6.close()     // Catch: java.lang.Throwable -> L44
            java.io.Closeable[] r1 = new java.io.Closeable[r4]
            r1[r3] = r6
            r1[r2] = r0
            r1[r9] = r5
            closeIOs(r1)
            return r7
        L44:
            r7 = move-exception
            goto L51
        L46:
            r7 = move-exception
            r6 = r1
            goto L51
        L49:
            r7 = move-exception
            r0 = r1
            r6 = r0
            goto L51
        L4d:
            r7 = move-exception
            r0 = r1
            r5 = r0
            r6 = r5
        L51:
            com.mob.tools.log.NLog r8 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L64
            r8.d(r7)     // Catch: java.lang.Throwable -> L64
            java.io.Closeable[] r4 = new java.io.Closeable[r4]
            r4[r3] = r6
            r4[r2] = r0
            r4[r9] = r5
            closeIOs(r4)
            goto L71
        L64:
            r1 = move-exception
            java.io.Closeable[] r4 = new java.io.Closeable[r4]
            r4[r3] = r6
            r4[r2] = r0
            r4[r9] = r5
            closeIOs(r4)
            throw r1
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.utils.ResHelper.readObjectFromFile(java.lang.String):java.lang.Object");
    }

    public static void saveArrayListToFile(ArrayList<HashMap<String, String>> arrayList, String str) {
        saveArrayListToFile(arrayList, str, false);
    }

    public static void saveArrayListToFile(ArrayList<HashMap<String, String>> arrayList, String str, boolean z10) {
        OutputStreamWriter outputStreamWriter;
        OutputStreamWriter outputStreamWriter2 = null;
        try {
            outputStreamWriter = new OutputStreamWriter(new GZIPOutputStream(new FileOutputStream(getDataCacheFile(MobSDK.getContext(), str, true))), "utf-8");
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Iterator<HashMap<String, String>> it = arrayList.iterator();
            while (it.hasNext()) {
                String fromHashMap = HashonHelper.fromHashMap(it.next());
                if (z10) {
                    fromHashMap = new String(Base64.encode(fromHashMap.getBytes("utf-8"), 2), "utf-8");
                }
                outputStreamWriter.append((CharSequence) fromHashMap).append('\n');
            }
            closeIOs(outputStreamWriter);
        } catch (Throwable th3) {
            th = th3;
            outputStreamWriter2 = outputStreamWriter;
            try {
                MobLog.getInstance().d(th);
                closeIOs(outputStreamWriter2);
            } catch (Throwable th4) {
                closeIOs(outputStreamWriter2);
                throw th4;
            }
        }
    }

    public static boolean saveLongToFile(long j10, String str) {
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2 = null;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(getDataCacheFile(MobSDK.getContext(), str)));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            dataOutputStream.writeLong(j10);
            dataOutputStream.flush();
            C0744r.a(dataOutputStream);
            return true;
        } catch (Throwable th3) {
            th = th3;
            dataOutputStream2 = dataOutputStream;
            try {
                MobLog.getInstance().d(th);
                C0744r.a(dataOutputStream2);
                return false;
            } catch (Throwable th4) {
                C0744r.a(dataOutputStream2);
                throw th4;
            }
        }
    }

    public static boolean saveObjectToFile(String str, Object obj) {
        File file;
        GZIPOutputStream gZIPOutputStream;
        ObjectOutputStream objectOutputStream;
        FileOutputStream fileOutputStream;
        if (!TextUtils.isEmpty(str)) {
            FileOutputStream fileOutputStream2 = null;
            try {
                file = new File(str);
                if (file.exists()) {
                    file.delete();
                }
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                file = null;
            }
            if (obj == null) {
                return true;
            }
            if (!file.getParentFile().exists() || !file.getParentFile().isDirectory()) {
                file.getParentFile().delete();
                file.getParentFile().mkdirs();
            }
            file.createNewFile();
            if (file != null) {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        gZIPOutputStream = new GZIPOutputStream(fileOutputStream);
                        try {
                            objectOutputStream = new ObjectOutputStream(gZIPOutputStream);
                        } catch (Throwable th3) {
                            th = th3;
                            objectOutputStream = null;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        gZIPOutputStream = null;
                        objectOutputStream = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    gZIPOutputStream = null;
                    objectOutputStream = null;
                }
                try {
                    objectOutputStream.writeObject(obj);
                    objectOutputStream.flush();
                    objectOutputStream.close();
                    closeIOs(objectOutputStream, gZIPOutputStream, fileOutputStream);
                    return true;
                } catch (Throwable th6) {
                    th = th6;
                    fileOutputStream2 = fileOutputStream;
                    try {
                        MobLog.getInstance().d(th);
                        closeIOs(objectOutputStream, gZIPOutputStream, fileOutputStream2);
                        return false;
                    } catch (Throwable th7) {
                        closeIOs(objectOutputStream, gZIPOutputStream, fileOutputStream2);
                        throw th7;
                    }
                }
            }
        }
        return false;
    }

    @Deprecated
    public static long strToDate(String str) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str, new ParsePosition(0)).getTime();
    }

    @Deprecated
    public static Bundle urlToBundle(String str) {
        int indexOf;
        String str2;
        if (str.indexOf("://") >= 0) {
            str2 = j.a("007abbcdee") + str.substring(indexOf + 1);
        } else {
            str2 = j.a("007abbcdee") + str;
        }
        try {
            URL url = new URL(str2);
            Bundle decodeUrl = decodeUrl(url.getQuery());
            decodeUrl.putAll(decodeUrl(url.getRef()));
            return decodeUrl;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return new Bundle();
        }
    }

    @Deprecated
    public static Uri videoPathToContentUri(Context context, String str) {
        try {
            if (DH.SyncMtd.checkPermission(j.a("040[bdbi9f>bfcabc)f2cj-cg%bf.j@bcdedebccabicjecebchdgbbebfecgebeccdchcibbcfcgdjecchfieb"))) {
                Cursor query = context.getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "_data=? ", new String[]{str}, null);
                if (query == null || !query.moveToFirst()) {
                    if (new File(str).exists()) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("_data", str);
                        return context.getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
                    }
                    return null;
                }
                int i10 = query.getInt(query.getColumnIndex("_id"));
                Uri parse = Uri.parse("content://media/external/video/media");
                return Uri.withAppendedPath(parse, "" + i10);
            }
            return null;
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
            return null;
        }
    }
}
