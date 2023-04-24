package x2;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.view.ViewGroup;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes.dex */
public final class i implements r4.d, g9.f {

    /* renamed from: a */
    public final /* synthetic */ int f30182a;

    /* renamed from: b */
    public Object f30183b;

    public i(int i10) {
        this.f30182a = 9;
        this.f30183b = new LinkedHashMap(i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    public static i a(byte[] bArr) {
        byte[] bArr2;
        md.d dVar;
        if (bArr != null && bArr.length >= 1) {
            if (bArr.length < 1) {
                dVar = null;
            } else {
                int i10 = bArr[0] & 255;
                int length = bArr.length - 1;
                if (length > 0) {
                    bArr2 = new byte[length];
                    System.arraycopy(bArr, 1, bArr2, 0, length);
                } else {
                    bArr2 = null;
                }
                dVar = new md.d(i10, bArr2);
            }
            if (dVar == null) {
                return null;
            }
            return new i(7, dVar);
        }
        ge.b.d("invalid packet");
        return null;
    }

    @Override // g9.f
    public final void c() {
        switch (this.f30182a) {
            case 3:
                try {
                    ((i8.k) this.f30183b).cancel();
                    return;
                } catch (RemoteException unused) {
                    return;
                }
            default:
                g9.t tVar = ((g9.h) this.f30183b).f15034a;
                synchronized (tVar.f15057a) {
                    if (!tVar.f15059c) {
                        tVar.f15059c = true;
                        tVar.f15060d = true;
                        tVar.f15058b.b(tVar);
                        return;
                    }
                    return;
                }
        }
    }

    public final Map d() {
        return ((Map) this.f30183b).isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap((Map) this.f30183b);
    }

    @Override // r4.d
    public final boolean e(Object obj, File file, r4.h hVar) {
        FileOutputStream fileOutputStream;
        InputStream inputStream = (InputStream) obj;
        byte[] bArr = (byte[]) ((u4.b) this.f30183b).c(65536, byte[].class);
        boolean z10 = false;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (IOException e10) {
                        e = e10;
                        fileOutputStream2 = fileOutputStream;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        ((u4.b) this.f30183b).put(bArr);
                        return z10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        ((u4.b) this.f30183b).put(bArr);
                        throw th;
                    }
                }
                fileOutputStream.close();
                z10 = true;
                fileOutputStream.close();
            } catch (IOException e11) {
                e = e11;
            }
            ((u4.b) this.f30183b).put(bArr);
            return z10;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public final void f(Serializable serializable, Object obj) {
        ((Map) this.f30183b).put(serializable, obj);
    }

    public final void g() {
        nb.b bVar = (nb.b) this.f30183b;
        synchronized (bVar.f22214a) {
            if (!bVar.f22215b) {
                bVar.f22215b = true;
                bVar.f22214a.notifyAll();
                bVar.a();
            }
        }
    }

    public final String toString() {
        switch (this.f30182a) {
            case 7:
                StringBuilder a10 = android.support.v4.media.d.a("GetLlAptScenarioChooseInfoRsp {");
                StringBuilder a11 = android.support.v4.media.d.a("\n\tgroupNum=");
                a11.append(((md.d) this.f30183b).f20470a);
                a10.append(a11.toString());
                a10.append("\n\tgroupScenario=" + he.a.a(((md.d) this.f30183b).f20471b));
                a10.append("\n}");
                return a10.toString();
            default:
                return super.toString();
        }
    }

    public i(int i10, int i11) {
        this.f30182a = i10;
        if (i10 == 6) {
            this.f30183b = new nb.b();
        } else if (i10 != 8) {
            this.f30183b = f1.i.a(Looper.getMainLooper());
        } else {
            this.f30183b = new PriorityBlockingQueue();
        }
    }

    public /* synthetic */ i(int i10, Object obj) {
        this.f30182a = i10;
        this.f30183b = obj;
    }

    public i(ViewGroup viewGroup) {
        this.f30182a = 0;
        this.f30183b = viewGroup.getOverlay();
    }

    public i(p8.b bVar) {
        this.f30182a = 4;
        i8.p.f(bVar);
        this.f30183b = bVar;
    }
}
