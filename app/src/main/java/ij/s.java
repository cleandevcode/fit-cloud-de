package ij;

import a0.q0;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000do.a;
import yi.c;

/* loaded from: classes2.dex */
public final class s implements c0 {

    /* renamed from: a */
    public final Context f17076a;

    /* renamed from: b */
    public final File f17077b;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17078a;

        static {
            int[] iArr = new int[s.c0.c(2).length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f17078a = iArr;
        }
    }

    public s(Application application, File file) {
        gm.l.f(application, "context");
        this.f17076a = application;
        this.f17077b = file;
    }

    public static File c(File file, int i10, int i11, byte b10) {
        File file2;
        byte b11;
        int[] iArr = a.f17078a;
        if (i10 != 0) {
            int i12 = iArr[i10 - 1];
            if (i12 != 1) {
                if (i12 == 2) {
                    a.b bVar = p000do.a.f13275a;
                    StringBuilder c10 = jh.v.c("rewriteFile6621:");
                    c10.append(file.getAbsolutePath());
                    c10.append(" dfuType:");
                    c10.append(q0.c(i11));
                    c10.append(" binFlag:");
                    c10.append((int) b10);
                    bVar.h(c10.toString(), new Object[0]);
                    String name = file.getName();
                    gm.l.e(name, "file.name");
                    if (om.h.U(name, ".zip", false)) {
                        File file3 = new File(file.getParent(), file.getName() + "TempDir");
                        try {
                            ArrayList f10 = jh.v.f(file, file3);
                            Iterator it = f10.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    file2 = (File) it.next();
                                    if (gm.l.a(file2.getName(), "firmware.dat")) {
                                        break;
                                    }
                                } else {
                                    file2 = null;
                                    break;
                                }
                            }
                            if (file2 != null) {
                                RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                                byte[] bArr = new byte[1];
                                try {
                                    if (i11 == 3) {
                                        if (b10 == -95) {
                                            b11 = 17;
                                        } else if (b10 == -91) {
                                            b11 = 18;
                                        } else if (b10 == -90) {
                                            b11 = 19;
                                        } else if (b10 == -89) {
                                            b11 = 20;
                                        } else if (b10 == -88) {
                                            b11 = 21;
                                        } else if (b10 == -87) {
                                            b11 = 22;
                                        } else if (b10 == -86) {
                                            b11 = 23;
                                        } else if (b10 == -85) {
                                            b11 = 24;
                                        }
                                        bArr[0] = b11;
                                        randomAccessFile.seek(12L);
                                        randomAccessFile.write(bArr);
                                        tl.l lVar = tl.l.f28297a;
                                        mf.a0.d(randomAccessFile, null);
                                        jh.v.h(f10, file);
                                        f(file3);
                                    }
                                    f(file3);
                                } catch (Exception e10) {
                                    p000do.a.f13275a.q(e10);
                                }
                                b11 = 0;
                                bArr[0] = b11;
                                randomAccessFile.seek(12L);
                                randomAccessFile.write(bArr);
                                tl.l lVar2 = tl.l.f28297a;
                                mf.a0.d(randomAccessFile, null);
                                jh.v.h(f10, file);
                            } else {
                                c.a aVar = yi.c.f31771d;
                                throw c.a.b(5, null, 6);
                            }
                        } catch (Throwable th2) {
                            try {
                                f(file3);
                            } catch (Exception e11) {
                                p000do.a.f13275a.q(e11);
                            }
                            throw th2;
                        }
                    } else {
                        c.a aVar2 = yi.c.f31771d;
                        throw c.a.b(5, null, 6);
                    }
                } else {
                    throw new qa.p();
                }
            } else {
                a.b bVar2 = p000do.a.f13275a;
                StringBuilder c11 = jh.v.c("rewriteFile8762C:");
                c11.append(file.getAbsolutePath());
                c11.append(" dfuType:");
                c11.append(q0.c(i11));
                c11.append(" binFlag:");
                c11.append((int) b10);
                bVar2.h(c11.toString(), new Object[0]);
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                try {
                    byte[] bArr2 = {b10};
                    randomAccessFile2.seek(61L);
                    randomAccessFile2.write(bArr2);
                    randomAccessFile2.seek(516L);
                    randomAccessFile2.write(bArr2);
                    tl.l lVar3 = tl.l.f28297a;
                    mf.a0.d(randomAccessFile2, null);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        mf.a0.d(randomAccessFile2, th3);
                        throw th4;
                    }
                }
            }
            return file;
        }
        throw null;
    }

    public static void d(File file) {
        if (!file.exists()) {
            c.a aVar = yi.c.f31771d;
            throw c.a.b(3, null, 6);
        } else if (!file.canRead()) {
            c.a aVar2 = yi.c.f31771d;
            throw c.a.b(4, null, 6);
        } else {
            String name = file.getName();
            gm.l.e(name, "file.name");
            if (om.h.U(name, ".bin", true)) {
                return;
            }
            String name2 = file.getName();
            gm.l.e(name2, "file.name");
            if (om.h.U(name2, ".zip", true)) {
                return;
            }
            c.a aVar3 = yi.c.f31771d;
            throw c.a.b(5, null, 6);
        }
    }

    public static boolean f(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    if (true ^ (listFiles.length == 0)) {
                        for (File file2 : listFiles) {
                            if (file2.isFile()) {
                                if (!file2.delete()) {
                                    return false;
                                }
                            } else if (file2.isDirectory() && !f(file2)) {
                                return false;
                            }
                        }
                    }
                }
                return file.delete();
            }
            return false;
        }
        return true;
    }

    public final File a(Uri uri) {
        String str;
        StringBuilder sb2;
        String str2;
        boolean z10 = false;
        p000do.a.f13275a.h("copy file", new Object[0]);
        String type = this.f17076a.getContentResolver().getType(uri);
        if (type != null && om.h.V(type, DfuBaseService.MIME_TYPE_ZIP)) {
            sb2 = new StringBuilder();
            String uri2 = uri.toString();
            gm.l.e(uri2, "uri.toString()");
            sb2.append(a0.m.d(uri2));
            str2 = ".zip";
        } else {
            if (type != null && om.h.V(type, DfuBaseService.MIME_TYPE_OCTET_STREAM)) {
                z10 = true;
            }
            if (!z10) {
                str = null;
                return b(uri, str);
            }
            sb2 = new StringBuilder();
            String uri3 = uri.toString();
            gm.l.e(uri3, "uri.toString()");
            sb2.append(a0.m.d(uri3));
            str2 = ".bin";
        }
        sb2.append(str2);
        str = sb2.toString();
        return b(uri, str);
    }

    public final File b(Uri uri, String str) {
        if (str == null || str.length() == 0) {
            c.a aVar = yi.c.f31771d;
            throw c.a.b(5, null, 6);
        }
        File file = this.f17077b;
        if (file == null) {
            c.a aVar2 = yi.c.f31771d;
            throw c.a.a(3);
        } else if (!file.exists() && !this.f17077b.mkdirs()) {
            c.a aVar3 = yi.c.f31771d;
            throw c.a.b(1, null, 6);
        } else if (!a0.m.b(this.f17077b)) {
            c.a aVar4 = yi.c.f31771d;
            throw c.a.a(4);
        } else {
            File file2 = new File(this.f17077b, str);
            if (file2.exists()) {
                file2.delete();
            }
            InputStream openInputStream = this.f17076a.getContentResolver().openInputStream(uri);
            try {
                if (openInputStream == null) {
                    c.a aVar5 = yi.c.f31771d;
                    throw c.a.b(4, null, 6);
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = openInputStream.read(bArr);
                    if (read == -1) {
                        fileOutputStream.flush();
                        tl.l lVar = tl.l.f28297a;
                        mf.a0.d(fileOutputStream, null);
                        mf.a0.d(openInputStream, null);
                        return file2;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        }
    }

    public final File e(File file) {
        String str;
        StringBuilder sb2;
        p000do.a.f13275a.h("copy file", new Object[0]);
        d(file);
        String name = file.getName();
        gm.l.e(name, "file.name");
        if (om.h.U(name, ".zip", true)) {
            sb2 = new StringBuilder();
            String absolutePath = file.getAbsolutePath();
            gm.l.e(absolutePath, "file.absolutePath");
            sb2.append(a0.m.d(absolutePath));
            sb2.append(".zip");
        } else {
            String name2 = file.getName();
            gm.l.e(name2, "file.name");
            if (!om.h.U(name2, ".bin", true)) {
                str = null;
                Uri fromFile = Uri.fromFile(file);
                gm.l.e(fromFile, "fromFile(file)");
                return b(fromFile, str);
            }
            sb2 = new StringBuilder();
            String absolutePath2 = file.getAbsolutePath();
            gm.l.e(absolutePath2, "file.absolutePath");
            sb2.append(a0.m.d(absolutePath2));
            sb2.append(".bin");
        }
        str = sb2.toString();
        Uri fromFile2 = Uri.fromFile(file);
        gm.l.e(fromFile2, "fromFile(file)");
        return b(fromFile2, str);
    }
}
