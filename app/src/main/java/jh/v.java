package jh;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import no.nordicsemi.android.dfu.DfuBaseService;
import pm.d2;
import pm.e2;
import pm.n1;
import pm.s0;
import rm.g;
import xl.e;
import xl.f;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a */
    public static final String[] f17828a = {"e2f856b9f9a4fd4cb2795aeaf83268e4bff189aaec05d691ffde76e075b82648", "173cf86fe9894a0f70dadd09d4fd88c380836099d4939f8c3754361bdc16a32b", "b368b110e3b565fe97c91f786e11bc48754cc8e4e6f21d8a94a68ac6ad67aaaf", "db48223fd9e143f7e133c57f5d08a4e38549ce3ebd921fe3b4003c26e5e35bed", "4bdecdf772491e35c4e8b48f88aee22bae1311984f2e1da4dfad0b78ee7f5163", "3081a0adab3018d57165e6dd24074bdbac640f6dbe21a9e24d3474a87ebf38b8", "db53fcdc9ab71e9bdd4eab257fe1aba7989ad2b24fbe3a85dfef72ea1dd6bae2", "d80f18e8081b624cc64985f87f70118f1702985d2e10dbc985ee7be334fd3c7d", "5fed96c85bd58c58aadbd465c172a4c9a794d8eb2f86cbc7bcee6caf4c7a2c5f", "07ff9b7aeeff969173c45b285fe0fecdbaae244576ff7a2796a36f1c0c11adb4", "92974c6802419e4d18b5ec536cbfa167b8e8eff09ec4c8510a5b95750b1e0c82", "403f14ad2f0e5eb3c4f3a0bcd5c1592cc4492662ad53191c92905255d4990656", "4230baa077b401374d0fc012375047e79ea0790d58d095ef18d97d95470c738d", "f8d927750a0952ffb5bd87dfb83d781ae65f7bed043a7886d1d3cdcfc94bb77a", "e9702f1e92e97fce49cdf81a5fa730a4e913554d09b3fe41e1d8a7fba00a8459", "24fbae40bcd50b759b26e3ba0f46aa25e932fa7da05f226d75ec507bcf53bce5"};

    public /* synthetic */ v() {
        String.valueOf(ok.a.f23614a.incrementAndGet());
    }

    public static rm.a a(int i10, rm.f fVar, int i11) {
        rm.f fVar2 = rm.f.SUSPEND;
        boolean z10 = false;
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            fVar = fVar2;
        }
        int i12 = 1;
        if (i10 != -2) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != Integer.MAX_VALUE) {
                        if (i10 == 1 && fVar == rm.f.DROP_OLDEST) {
                            return new rm.p(null);
                        }
                        return new rm.e(i10, fVar, null);
                    }
                    return new rm.q(null);
                } else if (fVar == fVar2) {
                    return new rm.x(null);
                } else {
                    return new rm.e(1, fVar, null);
                }
            }
            if (fVar == fVar2) {
                z10 = true;
            }
            if (z10) {
                return new rm.p(null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (fVar == fVar2) {
            rm.g.N.getClass();
            i12 = g.a.f25847b;
        }
        return new rm.e(i12, fVar, null);
    }

    public static String b(StringBuilder sb2, int i10, char c10) {
        return a1.b.a(sb2, i10, c10);
    }

    public static StringBuilder c(String str) {
        return android.support.v4.media.d.a(str);
    }

    public static boolean d(File file, String str, ZipOutputStream zipOutputStream) {
        String str2;
        if (file == null) {
            return false;
        }
        StringBuilder a10 = android.support.v4.media.d.a(str);
        if (str.isEmpty()) {
            str2 = "";
        } else {
            str2 = File.separator;
        }
        a10.append(str2);
        a10.append(file.getName());
        String sb2 = a10.toString();
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    if (!d(file2, sb2, zipOutputStream)) {
                        return false;
                    }
                }
                return true;
            }
            ZipEntry zipEntry = new ZipEntry(sb2 + '/');
            zipEntry.setComment(null);
            zipOutputStream.putNextEntry(zipEntry);
            zipOutputStream.closeEntry();
            return true;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            ZipEntry zipEntry2 = new ZipEntry(sb2);
            zipEntry2.setComment(null);
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_MASK];
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, DfuBaseService.ERROR_REMOTE_MASK);
                if (read != -1) {
                    zipOutputStream.write(bArr, 0, read);
                } else {
                    zipOutputStream.closeEntry();
                    bufferedInputStream.close();
                    return true;
                }
            }
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static final Object e(Object obj) {
        return obj instanceof pm.u ? mf.a0.f(((pm.u) obj).f24396a) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x006f, code lost:
        if (r11.mkdirs() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0098, code lost:
        if (r0.mkdirs() != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList f(java.io.File r16, java.io.File r17) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jh.v.f(java.io.File, java.io.File):java.util.ArrayList");
    }

    public static final Object g(long j10, fm.p pVar, xl.d dVar) {
        Object uVar;
        Object m02;
        pm.j0 j0Var = null;
        if (j10 > 0) {
            e2 e2Var = new e2(j10, dVar);
            f.b b10 = e2Var.f28940c.e().b(e.a.f30630a);
            if (b10 instanceof pm.j0) {
                j0Var = (pm.j0) b10;
            }
            if (j0Var == null) {
                j0Var = pm.i0.f24347a;
            }
            e2Var.k(new s0(j0Var.E(e2Var.f24337d, e2Var, e2Var.f24320b)));
            boolean z10 = false;
            try {
                gm.e0.c(2, pVar);
                uVar = pVar.A(e2Var, e2Var);
            } catch (Throwable th2) {
                uVar = new pm.u(th2, false);
            }
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            if (uVar != aVar && (m02 = e2Var.m0(uVar)) != n1.f24374b) {
                if (m02 instanceof pm.u) {
                    Throwable th3 = ((pm.u) m02).f24396a;
                    if (!(((th3 instanceof d2) && ((d2) th3).f24333a == e2Var) ? true : true)) {
                        if (uVar instanceof pm.u) {
                            throw ((pm.u) uVar).f24396a;
                        }
                    } else {
                        throw th3;
                    }
                } else {
                    uVar = n1.a(m02);
                }
                return uVar;
            }
            return aVar;
        }
        throw new d2("Timed out immediately", null);
    }

    public static void h(ArrayList arrayList, File file) {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext() && d((File) it.next(), "", zipOutputStream)) {
            }
            zipOutputStream.close();
        } catch (Throwable th2) {
            try {
                zipOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
