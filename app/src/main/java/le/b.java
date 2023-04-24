package le;

import android.content.Context;
import android.support.v4.media.d;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b extends BufferedInputStream {

    /* renamed from: f */
    public static boolean f19454f = rd.b.f25540c;

    /* renamed from: a */
    public int f19455a;

    /* renamed from: b */
    public int f19456b;

    /* renamed from: c */
    public int f19457c;

    /* renamed from: d */
    public ArrayList<a> f19458d;

    /* renamed from: e */
    public String f19459e;

    public b(InputStream inputStream, String str) {
        super(inputStream);
        if (available() < 12) {
            throw new IOException("The input file size is less to 12, please check!");
        }
        this.f19459e = str;
    }

    public static b b(re.b bVar) {
        InputStream inputStream;
        b bVar2 = null;
        if (bVar == null) {
            return null;
        }
        if (bVar.f25557g == 1) {
            Context context = bVar.f25551a;
            if (context == null) {
                ge.b.d("please set the context first.");
                return null;
            }
            try {
                inputStream = context.getAssets().open(bVar.f25558h);
            } catch (IOException e10) {
                ge.b.p(e10.toString());
                return null;
            }
        } else {
            try {
                inputStream = new BufferedInputStream(new FileInputStream(bVar.f25558h));
            } catch (FileNotFoundException e11) {
                ge.b.p(e11.toString());
                inputStream = null;
            }
        }
        if (inputStream == null) {
            return null;
        }
        try {
            b bVar3 = new b(inputStream, bVar.f25558h);
            if (!bVar3.h()) {
                bVar3.close();
            } else {
                bVar2 = bVar3;
            }
            try {
                inputStream.close();
            } catch (IOException e12) {
                ge.b.p(e12.toString());
            }
            return bVar2;
        } catch (IOException e13) {
            ge.b.n(e13.toString());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static me.a j(re.b r13) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: le.b.j(re.b):me.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static me.a k(re.b r14) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: le.b.k(re.b):me.a");
    }

    public final a a(int i10) {
        ArrayList<a> arrayList = this.f19458d;
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        Iterator<a> it = this.f19458d.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.f19453d == i10) {
                return next;
            }
        }
        return null;
    }

    public final boolean h() {
        byte[] bArr = new byte[12];
        int i10 = 0;
        read(bArr, 0, 12);
        int i11 = ((bArr[3] << 24) & (-16777216)) | ((bArr[2] << 16) & 16711680) | ((bArr[1] << 8) & 65280) | (bArr[0] & 255);
        this.f19455a = i11;
        if (i11 != -1768442424) {
            ge.b.o(String.format("invalid multi-pack signature(0x%08X) ", Integer.valueOf(i11)), f19454f);
            return false;
        }
        this.f19456b = ((bArr[7] << 24) & (-16777216)) | ((bArr[6] << 16) & 16711680) | ((bArr[5] << 8) & 65280) | (bArr[4] & 255);
        this.f19457c = (bArr[8] & 255) | ((bArr[11] << 24) & (-16777216)) | ((bArr[10] << 16) & 16711680) | ((bArr[9] << 8) & 65280);
        this.f19458d = new ArrayList<>();
        int i12 = (this.f19457c * 8) + 12;
        byte[] bArr2 = new byte[8];
        int i13 = 0;
        while (i13 < this.f19457c) {
            read(bArr2, i10, 8);
            a aVar = new a(i12, this.f19459e, ((bArr2[3] << 24) & (-16777216)) | ((bArr2[2] << 16) & 16711680) | ((bArr2[1] << 8) & 65280) | (bArr2[i10] & 255), bArr2[4] & 1);
            ge.b.n(aVar.toString());
            this.f19458d.add(aVar);
            i12 += aVar.f19452c;
            i13++;
            i10 = 0;
        }
        return true;
    }

    public final String toString() {
        StringBuilder a10 = d.a("Multi-pack{");
        StringBuilder a11 = d.a("\n\tsignature=");
        a11.append(String.format("0x%04X", Integer.valueOf(this.f19455a)));
        a11.append(", version=");
        a11.append(String.format(Locale.US, "0x%08x(%d)", Integer.valueOf(this.f19456b), Integer.valueOf(this.f19456b)));
        a11.append(", num=");
        a11.append(String.format("0x%04x", Integer.valueOf(this.f19457c)));
        a10.append(a11.toString());
        ArrayList<a> arrayList = this.f19458d;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<a> it = this.f19458d.iterator();
            while (it.hasNext()) {
                StringBuilder a12 = d.a("\n\t\t");
                a12.append(it.next().toString());
                a10.append(a12.toString());
            }
        }
        a10.append("\n}");
        return a10.toString();
    }
}
