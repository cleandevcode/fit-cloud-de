package x5;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;

/* loaded from: classes.dex */
public final class h extends AsyncTask<String, Void, Boolean> {

    /* renamed from: a */
    public final String f30308a;

    /* renamed from: b */
    public final File f30309b;

    /* renamed from: c */
    public final a f30310c;

    /* loaded from: classes.dex */
    public interface a {
        void c(File file);
    }

    public h(String str, File file, a aVar) {
        gm.l.f(str, "uriStr");
        this.f30308a = str;
        this.f30309b = file;
        this.f30310c = aVar;
    }

    public final Boolean a(String... strArr) {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            gm.l.f(strArr, "args");
            try {
                URL url = new URL(this.f30308a);
                int contentLength = url.openConnection().getContentLength();
                DataInputStream dataInputStream = new DataInputStream(url.openStream());
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f30309b));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (i6.a.b(this)) {
            return null;
        }
        try {
            return a(strArr);
        } catch (Throwable th2) {
            i6.a.a(this, th2);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Boolean bool) {
        if (i6.a.b(this)) {
            return;
        }
        try {
            boolean booleanValue = bool.booleanValue();
            if (!i6.a.b(this) && booleanValue) {
                this.f30310c.c(this.f30309b);
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }
}
