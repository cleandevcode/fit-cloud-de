package com.mob.tools;

import android.text.TextUtils;
import android.util.Base64;
import com.mob.MobSDK;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.ResHelper;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.util.HashSet;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private static final Object f8602a = new Object();

    /* renamed from: b */
    private static final Object f8603b = new Object();

    /* renamed from: c */
    private volatile HashSet<String> f8604c = new HashSet<>();

    /* renamed from: d */
    private File f8605d;

    /* renamed from: e */
    private int f8606e;

    /* renamed from: f */
    private String f8607f;

    /* renamed from: com.mob.tools.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0112a {
        void a(String str);

        boolean a(DH.DHResponse dHResponse);
    }

    public a(String str, String str2, int i10) {
        this.f8606e = i10;
        if (str2 == null) {
            str2 = "null";
        } else if (TextUtils.isDigitsOnly(str2)) {
            str2 = a.b.b(str, str2);
        }
        this.f8607f = str2;
        File dataCacheFile = ResHelper.getDataCacheFile(MobSDK.getContextSafely(), str);
        this.f8605d = dataCacheFile;
        if (!dataCacheFile.isDirectory()) {
            this.f8605d.mkdirs();
        }
    }

    private File a(boolean z10) {
        File file;
        File[] listFiles = this.f8605d.listFiles();
        int i10 = 5;
        int i11 = 3;
        char c10 = 2;
        if (listFiles == null || listFiles.length <= 0) {
            file = new File(this.f8605d, a(this.f8607f, "_", 1, "_", 0));
        } else {
            int length = listFiles.length;
            int i12 = 0;
            int i13 = 1;
            while (i12 < length) {
                File file2 = listFiles[i12];
                String name = file2.getName();
                if (name.startsWith(this.f8607f)) {
                    String[] split = name.split("_");
                    if (!z10 && split.length == i11) {
                        try {
                            int parseInt = Integer.parseInt(split[c10]);
                            if (parseInt < this.f8606e && !b(name)) {
                                File file3 = this.f8605d;
                                Object[] objArr = new Object[i10];
                                objArr[0] = this.f8607f;
                                objArr[1] = "_";
                                objArr[2] = Integer.valueOf(i13);
                                objArr[3] = "_";
                                objArr[4] = Integer.valueOf(parseInt + 1);
                                File file4 = new File(file3, a(objArr));
                                return file2.renameTo(file4) ? file4 : file2;
                            }
                        } catch (Throwable th2) {
                            MobLog.getInstance().d(th2);
                        }
                    }
                    if (split.length > 1) {
                        try {
                            if (Integer.parseInt(split[1]) == i13) {
                                i13++;
                            }
                        } catch (Throwable th3) {
                            MobLog.getInstance().d(th3);
                        }
                    }
                }
                i12++;
                i10 = 5;
                i11 = 3;
                c10 = 2;
            }
            file = new File(this.f8605d, a(this.f8607f, "_", Integer.valueOf(i13), "_", 0));
        }
        try {
            file.createNewFile();
        } catch (Throwable unused) {
        }
        return file;
    }

    private static String a(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : objArr) {
            sb2.append(obj);
        }
        return sb2.toString();
    }

    public boolean b(String str) {
        synchronized (this.f8604c) {
            if (this.f8604c.contains(str)) {
                return true;
            }
            this.f8604c.add(str);
            return false;
        }
    }

    public void c(String str) {
        synchronized (this.f8604c) {
            this.f8604c.remove(str);
        }
    }

    public void a(long j10) {
        synchronized (f8603b) {
            File[] listFiles = this.f8605d.listFiles(new FilenameFilter() { // from class: com.mob.tools.a.3
                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str) {
                    return !TextUtils.isEmpty(str) && str.startsWith(a.this.f8607f);
                }
            });
            if (listFiles != null && listFiles.length > 0) {
                long j11 = 0;
                for (File file : listFiles) {
                    j11 += file.length();
                }
                if (j11 >= j10) {
                    for (File file2 : listFiles) {
                        file2.delete();
                    }
                }
            }
        }
    }

    public void a(final InterfaceC0112a interfaceC0112a) {
        if (interfaceC0112a == null) {
            return;
        }
        synchronized (f8603b) {
            final File[] listFiles = this.f8605d.listFiles(new FilenameFilter() { // from class: com.mob.tools.a.1
                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str) {
                    return !TextUtils.isEmpty(str) && str.startsWith(a.this.f8607f);
                }
            });
            if (listFiles != null && listFiles.length > 0) {
                DH.requester(MobSDK.getContext()).getDetailNetworkTypeForStatic().getAppName().getDeviceKey().getDeviceId().request(new DH.DHResponder() { // from class: com.mob.tools.a.2
                    @Override // com.mob.tools.utils.DH.DHResponder
                    public void onResponse(DH.DHResponse dHResponse) {
                        File[] fileArr;
                        BufferedReader bufferedReader;
                        for (File file : listFiles) {
                            String name = file.getName();
                            if (!a.this.b(name)) {
                                FileReader fileReader = null;
                                try {
                                    FileReader fileReader2 = new FileReader(file);
                                    try {
                                        bufferedReader = new BufferedReader(fileReader2);
                                        while (true) {
                                            try {
                                                String readLine = bufferedReader.readLine();
                                                if (readLine == null) {
                                                    break;
                                                }
                                                interfaceC0112a.a(new String(Base64.decode(readLine, 2), "utf-8"));
                                            } catch (Throwable th2) {
                                                th = th2;
                                                fileReader = fileReader2;
                                                try {
                                                    MobLog.getInstance().d(th);
                                                    ResHelper.closeIOs(bufferedReader);
                                                    ResHelper.closeIOs(fileReader);
                                                    a.this.c(name);
                                                } catch (Throwable th3) {
                                                    ResHelper.closeIOs(bufferedReader);
                                                    ResHelper.closeIOs(fileReader);
                                                    a.this.c(name);
                                                    throw th3;
                                                }
                                            }
                                        }
                                        if (interfaceC0112a.a(dHResponse)) {
                                            file.delete();
                                        }
                                        ResHelper.closeIOs(bufferedReader);
                                        ResHelper.closeIOs(fileReader2);
                                    } catch (Throwable th4) {
                                        th = th4;
                                        bufferedReader = null;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    bufferedReader = null;
                                }
                                a.this.c(name);
                            }
                        }
                    }
                });
            }
        }
    }

    public void a(String str) {
        a(str, false);
    }

    public void a(String str, boolean z10) {
        String str2;
        FileWriter fileWriter;
        String name;
        BufferedWriter bufferedWriter;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            str2 = Base64.encodeToString(str.getBytes("utf-8"), 2);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        synchronized (f8602a) {
            File a10 = a(z10);
            try {
                fileWriter = new FileWriter(a10, true);
                try {
                    bufferedWriter = new BufferedWriter(fileWriter);
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                fileWriter = null;
            }
            try {
                bufferedWriter.newLine();
                bufferedWriter.write(str2);
                ResHelper.closeIOs(bufferedWriter);
                ResHelper.closeIOs(fileWriter);
                name = a10.getName();
            } catch (Throwable th5) {
                th = th5;
                bufferedWriter2 = bufferedWriter;
                MobLog.getInstance().d(th);
                ResHelper.closeIOs(bufferedWriter2);
                ResHelper.closeIOs(fileWriter);
                name = a10.getName();
                c(name);
            }
            c(name);
        }
    }
}
