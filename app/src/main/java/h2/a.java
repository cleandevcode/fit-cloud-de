package h2;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final HashSet f15743a = new HashSet();

    /* renamed from: b */
    public static final boolean f15744b;

    /* JADX WARN: Code restructure failed: missing block: B:46:0x003f, code lost:
        if (r3 < 1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004e  */
    static {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            h2.a.f15743a = r0
            java.lang.String r0 = "java.vm.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 1
            if (r0 == 0) goto L42
            java.util.StringTokenizer r2 = new java.util.StringTokenizer
            java.lang.String r3 = "."
            r2.<init>(r0, r3)
            boolean r3 = r2.hasMoreTokens()
            r4 = 0
            if (r3 == 0) goto L23
            java.lang.String r3 = r2.nextToken()
            goto L24
        L23:
            r3 = r4
        L24:
            boolean r5 = r2.hasMoreTokens()
            if (r5 == 0) goto L2e
            java.lang.String r4 = r2.nextToken()
        L2e:
            if (r3 == 0) goto L42
            if (r4 == 0) goto L42
            int r2 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L42
            int r3 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L42
            r4 = 2
            if (r2 > r4) goto L43
            if (r2 != r4) goto L42
            if (r3 < r1) goto L42
            goto L43
        L42:
            r1 = 0
        L43:
            java.lang.String r2 = "VM with version "
            java.lang.StringBuilder r0 = p.a.a(r2, r0)
            if (r1 == 0) goto L4e
            java.lang.String r2 = " has multidex support"
            goto L50
        L4e:
            java.lang.String r2 = " does not have multidex support"
        L50:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MultiDex"
            android.util.Log.i(r2, r0)
            h2.a.f15744b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.a.<clinit>():void");
    }

    public static void a(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder a10 = android.support.v4.media.d.a("Clearing old secondary dex dir (");
            a10.append(file.getPath());
            a10.append(").");
            Log.i("MultiDex", a10.toString());
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                StringBuilder a11 = android.support.v4.media.d.a("Failed to list secondary dex dir content (");
                a11.append(file.getPath());
                a11.append(").");
                Log.w("MultiDex", a11.toString());
                return;
            }
            for (File file2 : listFiles) {
                StringBuilder a12 = android.support.v4.media.d.a("Trying to delete old file ");
                a12.append(file2.getPath());
                a12.append(" of size ");
                a12.append(file2.length());
                Log.i("MultiDex", a12.toString());
                if (!file2.delete()) {
                    StringBuilder a13 = android.support.v4.media.d.a("Failed to delete old file ");
                    a13.append(file2.getPath());
                    Log.w("MultiDex", a13.toString());
                } else {
                    StringBuilder a14 = android.support.v4.media.d.a("Deleted old file ");
                    a14.append(file2.getPath());
                    Log.i("MultiDex", a14.toString());
                }
            }
            if (!file.delete()) {
                StringBuilder a15 = android.support.v4.media.d.a("Failed to delete secondary dex dir ");
                a15.append(file.getPath());
                Log.w("MultiDex", a15.toString());
                return;
            }
            StringBuilder a16 = android.support.v4.media.d.a("Deleted old secondary dex dir ");
            a16.append(file.getPath());
            Log.i("MultiDex", a16.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x006a A[Catch: all -> 0x00c5, DONT_GENERATE, TRY_LEAVE, TryCatch #4 {, blocks: (B:64:0x0005, B:66:0x000b, B:68:0x000d, B:70:0x0052, B:71:0x0056, B:79:0x006a, B:85:0x0078, B:86:0x007f, B:89:0x008f, B:98:0x00b7, B:102:0x00be, B:104:0x00c0, B:88:0x0083, B:74:0x005b, B:76:0x0062, B:81:0x006c, B:91:0x009d, B:92:0x00a1, B:97:0x00a8), top: B:115:0x0005, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x006c A[Catch: all -> 0x0070, TRY_ENTER, TRY_LEAVE, TryCatch #4 {, blocks: (B:64:0x0005, B:66:0x000b, B:68:0x000d, B:70:0x0052, B:71:0x0056, B:79:0x006a, B:85:0x0078, B:86:0x007f, B:89:0x008f, B:98:0x00b7, B:102:0x00be, B:104:0x00c0, B:88:0x0083, B:74:0x005b, B:76:0x0062, B:81:0x006c, B:91:0x009d, B:92:0x00a1, B:97:0x00a8), top: B:115:0x0005, inners: #3, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.content.Context r7, java.io.File r8, java.io.File r9) {
        /*
            java.lang.String r0 = "secondary-dexes"
            java.util.HashSet r1 = h2.a.f15743a
            monitor-enter(r1)
            boolean r2 = r1.contains(r8)     // Catch: java.lang.Throwable -> Lc5
            if (r2 == 0) goto Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc5
            return
        Ld:
            r1.add(r8)     // Catch: java.lang.Throwable -> Lc5
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r3 = "MultiDex"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc5
            r4.<init>()     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r5 = "MultiDex is not guaranteed to work in SDK version "
            r4.append(r5)     // Catch: java.lang.Throwable -> Lc5
            r4.append(r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r2 = ": SDK version higher than "
            r4.append(r2)     // Catch: java.lang.Throwable -> Lc5
            r2 = 20
            r4.append(r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r2 = " should be backed by "
            r4.append(r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r2 = "runtime with built-in multidex capabilty but it's not the "
            r4.append(r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r2 = "case here: java.vm.version=\""
            r4.append(r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r2 = "java.vm.version"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch: java.lang.Throwable -> Lc5
            r4.append(r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r2 = "\""
            r4.append(r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> Lc5
            android.util.Log.w(r3, r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r2 = "MultiDex"
            r3 = 0
            java.lang.ClassLoader r4 = r7.getClassLoader()     // Catch: java.lang.RuntimeException -> L61 java.lang.Throwable -> Lc5
            boolean r5 = r4 instanceof dalvik.system.BaseDexClassLoader     // Catch: java.lang.Throwable -> Lc5
            if (r5 == 0) goto L5b
            goto L68
        L5b:
            java.lang.String r4 = "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching."
            android.util.Log.e(r2, r4)     // Catch: java.lang.Throwable -> Lc5
            goto L67
        L61:
            r4 = move-exception
            java.lang.String r5 = "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching."
            android.util.Log.w(r2, r5, r4)     // Catch: java.lang.Throwable -> Lc5
        L67:
            r4 = r3
        L68:
            if (r4 != 0) goto L6c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc5
            return
        L6c:
            a(r7)     // Catch: java.lang.Throwable -> L70
            goto L78
        L70:
            r2 = move-exception
            java.lang.String r5 = "MultiDex"
            java.lang.String r6 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
            android.util.Log.w(r5, r6, r2)     // Catch: java.lang.Throwable -> Lc5
        L78:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r5 = "code_cache"
            r2.<init>(r9, r5)     // Catch: java.lang.Throwable -> Lc5
            e(r2)     // Catch: java.io.IOException -> L83 java.lang.Throwable -> Lc5
            goto L8f
        L83:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> Lc5
            java.io.File r9 = r7.getFilesDir()     // Catch: java.lang.Throwable -> Lc5
            r2.<init>(r9, r5)     // Catch: java.lang.Throwable -> Lc5
            e(r2)     // Catch: java.lang.Throwable -> Lc5
        L8f:
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> Lc5
            r9.<init>(r2, r0)     // Catch: java.lang.Throwable -> Lc5
            e(r9)     // Catch: java.lang.Throwable -> Lc5
            h2.d r0 = new h2.d     // Catch: java.lang.Throwable -> Lc5
            r0.<init>(r8, r9)     // Catch: java.lang.Throwable -> Lc5
            r8 = 0
            java.util.ArrayList r8 = r0.k(r7, r8)     // Catch: java.lang.Throwable -> La5
            d(r9, r4, r8)     // Catch: java.lang.Throwable -> La5 java.io.IOException -> La7
            goto Lb7
        La5:
            r7 = move-exception
            goto Lc1
        La7:
            r8 = move-exception
            java.lang.String r2 = "MultiDex"
            java.lang.String r5 = "Failed to install extracted secondary dex files, retrying with forced extraction"
            android.util.Log.w(r2, r5, r8)     // Catch: java.lang.Throwable -> La5
            r8 = 1
            java.util.ArrayList r7 = r0.k(r7, r8)     // Catch: java.lang.Throwable -> La5
            d(r9, r4, r7)     // Catch: java.lang.Throwable -> La5
        Lb7:
            r0.close()     // Catch: java.io.IOException -> Lbb java.lang.Throwable -> Lc5
            goto Lbc
        Lbb:
            r3 = move-exception
        Lbc:
            if (r3 != 0) goto Lc0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc5
            return
        Lc0:
            throw r3     // Catch: java.lang.Throwable -> Lc5
        Lc1:
            r0.close()     // Catch: java.io.IOException -> Lc4 java.lang.Throwable -> Lc5
        Lc4:
            throw r7     // Catch: java.lang.Throwable -> Lc5
        Lc5:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc5
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.a.b(android.content.Context, java.io.File, java.io.File):void");
    }

    public static Field c(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        StringBuilder a10 = androidx.activity.result.d.a("Field ", str, " not found in ");
        a10.append(obj.getClass());
        throw new NoSuchFieldException(a10.toString());
    }

    public static void d(File file, ClassLoader classLoader, ArrayList arrayList) {
        IOException[] iOExceptionArr;
        if (!arrayList.isEmpty()) {
            Object obj = c(classLoader, "pathList").get(classLoader);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(arrayList);
            Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
            for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod("makeDexElements", clsArr);
                    if (!declaredMethod.isAccessible()) {
                        declaredMethod.setAccessible(true);
                    }
                    Object[] objArr = (Object[]) declaredMethod.invoke(obj, arrayList3, file, arrayList2);
                    Field c10 = c(obj, "dexElements");
                    Object[] objArr2 = (Object[]) c10.get(obj);
                    Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
                    System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
                    System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
                    c10.set(obj, objArr3);
                    if (arrayList2.size() > 0) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                        }
                        Field c11 = c(obj, "dexElementsSuppressedExceptions");
                        IOException[] iOExceptionArr2 = (IOException[]) c11.get(obj);
                        if (iOExceptionArr2 == null) {
                            iOExceptionArr = (IOException[]) arrayList2.toArray(new IOException[arrayList2.size()]);
                        } else {
                            IOException[] iOExceptionArr3 = new IOException[arrayList2.size() + iOExceptionArr2.length];
                            arrayList2.toArray(iOExceptionArr3);
                            System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList2.size(), iOExceptionArr2.length);
                            iOExceptionArr = iOExceptionArr3;
                        }
                        c11.set(obj, iOExceptionArr);
                        IOException iOException = new IOException("I/O exception during makeDexElement");
                        iOException.initCause((Throwable) arrayList2.get(0));
                        throw iOException;
                    }
                    return;
                } catch (NoSuchMethodException unused) {
                }
            }
            StringBuilder a10 = androidx.activity.result.d.a("Method ", "makeDexElements", " with parameters ");
            a10.append(Arrays.asList(clsArr));
            a10.append(" not found in ");
            a10.append(obj.getClass());
            throw new NoSuchMethodException(a10.toString());
        }
    }

    public static void e(File file) {
        String sb2;
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                StringBuilder a10 = android.support.v4.media.d.a("Failed to create dir ");
                a10.append(file.getPath());
                a10.append(". Parent file is null.");
                sb2 = a10.toString();
            } else {
                StringBuilder a11 = android.support.v4.media.d.a("Failed to create dir ");
                a11.append(file.getPath());
                a11.append(". parent file is a dir ");
                a11.append(parentFile.isDirectory());
                a11.append(", a file ");
                a11.append(parentFile.isFile());
                a11.append(", exists ");
                a11.append(parentFile.exists());
                a11.append(", readable ");
                a11.append(parentFile.canRead());
                a11.append(", writable ");
                a11.append(parentFile.canWrite());
                sb2 = a11.toString();
            }
            Log.e("MultiDex", sb2);
            StringBuilder a12 = android.support.v4.media.d.a("Failed to create directory ");
            a12.append(file.getPath());
            throw new IOException(a12.toString());
        }
    }
}
