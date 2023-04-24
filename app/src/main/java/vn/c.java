package vn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import pn.k;
import pn.p;
import pn.q;
import qn.h;

/* loaded from: classes2.dex */
public final class c implements k {

    /* renamed from: d */
    public static final a f29480d = new a();

    /* renamed from: a */
    public File f29481a;

    /* renamed from: b */
    public File f29482b = null;

    /* renamed from: c */
    public h f29483c = null;

    public c(String str) {
        this.f29481a = new File(str);
    }

    public static void h(File file) {
        File[] listFiles = file.listFiles(new b());
        if (listFiles == null) {
            throw new q();
        }
        for (int i10 = 0; i10 < listFiles.length; i10++) {
            File file2 = new File(file, listFiles[i10].getName().substring(0, listFiles[i10].getName().length() - 4));
            if (!listFiles[i10].renameTo(file2)) {
                file2.delete();
                listFiles[i10].renameTo(file2);
            }
        }
    }

    @Override // pn.k
    public final p a(String str) {
        d();
        try {
            File file = this.f29482b;
            StringBuffer stringBuffer = new StringBuffer(String.valueOf(str));
            stringBuffer.append(".msg");
            FileInputStream fileInputStream = new FileInputStream(new File(file, stringBuffer.toString()));
            int available = fileInputStream.available();
            byte[] bArr = new byte[available];
            for (int i10 = 0; i10 < available; i10 += fileInputStream.read(bArr, i10, available - i10)) {
            }
            fileInputStream.close();
            return new qn.k(bArr, available);
        } catch (IOException e10) {
            throw new q(e10);
        }
    }

    @Override // pn.k
    public final Enumeration b() {
        String name;
        d();
        File[] g10 = g();
        Vector vector = new Vector(g10.length);
        for (File file : g10) {
            vector.addElement(file.getName().substring(0, name.length() - 4));
        }
        return vector.elements();
    }

    @Override // pn.k
    public final void c(String str, String str2) {
        boolean z10;
        if (this.f29481a.exists() && !this.f29481a.isDirectory()) {
            throw new q();
        }
        if (!this.f29481a.exists() && !this.f29481a.mkdirs()) {
            throw new q();
        }
        if (this.f29481a.canWrite()) {
            StringBuffer stringBuffer = new StringBuffer();
            int i10 = 0;
            while (true) {
                boolean z11 = true;
                if (i10 >= str.length()) {
                    break;
                }
                char charAt = str.charAt(i10);
                if (!Character.isJavaIdentifierPart(charAt) && charAt != '-') {
                    z11 = false;
                }
                if (z11) {
                    stringBuffer.append(charAt);
                }
                i10++;
            }
            stringBuffer.append("-");
            for (int i11 = 0; i11 < str2.length(); i11++) {
                char charAt2 = str2.charAt(i11);
                if (!Character.isJavaIdentifierPart(charAt2) && charAt2 != '-') {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    stringBuffer.append(charAt2);
                }
            }
            synchronized (this) {
                if (this.f29482b == null) {
                    File file = new File(this.f29481a, stringBuffer.toString());
                    this.f29482b = file;
                    if (!file.exists()) {
                        this.f29482b.mkdir();
                    }
                }
                try {
                    this.f29483c = new h(this.f29482b);
                } catch (Exception unused) {
                }
                h(this.f29482b);
            }
            return;
        }
        throw new q();
    }

    @Override // pn.k
    public final void clear() {
        d();
        for (File file : g()) {
            file.delete();
        }
    }

    @Override // pn.k
    public final void close() {
        synchronized (this) {
            h hVar = this.f29483c;
            if (hVar != null) {
                hVar.a();
            }
            if (g().length == 0) {
                this.f29482b.delete();
            }
            this.f29482b = null;
        }
    }

    public final void d() {
        if (this.f29482b == null) {
            throw new q();
        }
    }

    @Override // pn.k
    public final void e(String str, p pVar) {
        d();
        File file = this.f29482b;
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(str));
        stringBuffer.append(".msg");
        File file2 = new File(file, stringBuffer.toString());
        File file3 = this.f29482b;
        StringBuffer stringBuffer2 = new StringBuffer(String.valueOf(str));
        stringBuffer2.append(".msg");
        stringBuffer2.append(".bup");
        File file4 = new File(file3, stringBuffer2.toString());
        if (file2.exists() && !file2.renameTo(file4)) {
            file4.delete();
            file2.renameTo(file4);
        }
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(pVar.b(), pVar.c(), pVar.f());
                if (pVar.d() != null) {
                    fileOutputStream.write(pVar.d(), pVar.e(), pVar.a());
                }
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                if (file4.exists()) {
                    file4.delete();
                }
            } catch (IOException e10) {
                throw new q(e10);
            }
        } finally {
            if (file4.exists() && !file4.renameTo(file2)) {
                file2.delete();
                file4.renameTo(file2);
            }
        }
    }

    @Override // pn.k
    public final boolean f(String str) {
        d();
        File file = this.f29482b;
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(str));
        stringBuffer.append(".msg");
        return new File(file, stringBuffer.toString()).exists();
    }

    public final File[] g() {
        d();
        File[] listFiles = this.f29482b.listFiles(f29480d);
        if (listFiles != null) {
            return listFiles;
        }
        throw new q();
    }

    @Override // pn.k
    public final void remove(String str) {
        d();
        File file = this.f29482b;
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(str));
        stringBuffer.append(".msg");
        File file2 = new File(file, stringBuffer.toString());
        if (file2.exists()) {
            file2.delete();
        }
    }
}
