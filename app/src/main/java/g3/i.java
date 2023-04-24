package g3;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public static final String f14888a = f3.m.e("WrkDbPathHelper");

    /* renamed from: b */
    public static final String[] f14889b = {"-journal", "-shm", "-wal"};

    public static void a(Context context) {
        String format;
        File file;
        String[] strArr;
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23 && databasePath.exists()) {
            f3.m.c().a(f14888a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            HashMap hashMap = new HashMap();
            if (i10 >= 23) {
                File databasePath2 = context.getDatabasePath("androidx.work.workdb");
                if (i10 < 23) {
                    file = context.getDatabasePath("androidx.work.workdb");
                } else {
                    file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
                }
                hashMap.put(databasePath2, file);
                for (String str : f14889b) {
                    hashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
                }
            }
            for (File file2 : hashMap.keySet()) {
                File file3 = (File) hashMap.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        f3.m.c().f(f14888a, String.format("Over-writing contents of %s", file3), new Throwable[0]);
                    }
                    if (file2.renameTo(file3)) {
                        format = String.format("Migrated %s to %s", file2, file3);
                    } else {
                        format = String.format("Renaming %s to %s failed", file2, file3);
                    }
                    f3.m.c().a(f14888a, format, new Throwable[0]);
                }
            }
        }
    }
}
