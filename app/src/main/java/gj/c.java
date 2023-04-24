package gj;

import fl.g;
import gm.l;
import gm.z;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import mf.a0;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a */
    public final File f15365a;

    /* renamed from: b */
    public final long f15366b = 30000;

    public c(File file) {
        this.f15365a = file;
    }

    public static void b(tk.j jVar, InputStream inputStream, File file, long j10) {
        l.f(jVar, "emitter");
        l.f(inputStream, "input");
        l.f(file, "file");
        File file2 = new File(file.getAbsolutePath() + ".tmp");
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            byte[] bArr = new byte[4096];
            z zVar = new z();
            int i10 = Integer.MIN_VALUE;
            long j11 = 0;
            while (true) {
                int read = inputStream.read(bArr);
                zVar.f15508a = read;
                if (read != -1) {
                    if (((g.a) jVar).a()) {
                        a0.d(fileOutputStream, null);
                        return;
                    }
                    j11 += zVar.f15508a;
                    int i11 = (int) ((((float) j11) / ((float) j10)) * 100);
                    if (i11 < 0) {
                        i11 = -1;
                    } else if (i11 >= 100) {
                        i11 = 99;
                    }
                    if (i10 != i11) {
                        ((g.a) jVar).d(new g(i11, null));
                        i10 = i11;
                    }
                    fileOutputStream.write(bArr, 0, zVar.f15508a);
                } else {
                    fileOutputStream.flush();
                    if (file2.renameTo(file)) {
                        ((g.a) jVar).d(new g(100, file));
                        ((g.a) jVar).b();
                        tl.l lVar = tl.l.f28297a;
                    } else {
                        ((g.a) jVar).f(new a(0, 5, "rename fail", null));
                    }
                    a0.d(fileOutputStream, null);
                    return;
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                a0.d(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public abstract void a(g.a aVar, File file, String str);
}
