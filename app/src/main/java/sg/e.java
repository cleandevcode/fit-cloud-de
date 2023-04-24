package sg;

import a0.q;
import android.content.Context;
import android.net.Uri;
import fm.p;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import mf.a0;
import mf.l0;
import p000do.a;
import pm.e0;
import tl.g;
import tl.l;
import vg.k;
import zl.i;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.feedback.FeedbackRepositoryImpl$getLogUrls$2", f = "FeedbackRepository.kt", l = {118, 124}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends i implements p<e0, xl.d<? super String>, Object> {

    /* renamed from: e */
    public File f26991e;

    /* renamed from: f */
    public int f26992f;

    /* renamed from: g */
    public final /* synthetic */ f f26993g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, xl.d<? super e> dVar) {
        super(2, dVar);
        this.f26993g = fVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super String> dVar) {
        return ((e) p(e0Var, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        return new e(this.f26993g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        File c10;
        boolean z10;
        Object obj2;
        File file;
        File file2;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f26992f;
        String str = null;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    file2 = this.f26991e;
                    try {
                        try {
                            a0.k(obj);
                            str = this.f26993g.f26999f.b(l0.d(List.class, String.class)).e(h7.a.p((String) ((k) obj).f29381c));
                        } catch (Throwable th2) {
                            th = th2;
                            file = file2;
                            try {
                                file.delete();
                            } catch (Exception e10) {
                                a.b bVar = p000do.a.f13275a;
                                bVar.t("Feedback");
                                bVar.q(e10);
                            }
                            throw th;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        a.b bVar2 = p000do.a.f13275a;
                        bVar2.t("Feedback");
                        bVar2.q(e);
                        file2.delete();
                        return str;
                    }
                    try {
                        file2.delete();
                    } catch (Exception e12) {
                        a.b bVar3 = p000do.a.f13275a;
                        bVar3.t("Feedback");
                        bVar3.q(e12);
                    }
                    return str;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c10 = this.f26991e;
            a0.k(obj);
        } else {
            a0.k(obj);
            f fVar = this.f26993g;
            c10 = fVar.f27000g.c(fVar.f26994a);
            if (c10 == null) {
                return null;
            }
            f fVar2 = this.f26993g;
            a aVar2 = fVar2.f27000g;
            Context context = fVar2.f26994a;
            this.f26991e = c10;
            this.f26992f = 1;
            obj = aVar2.a(context, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        List<File> list = (List) obj;
        if (list != null && !list.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            this.f26993g.getClass();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(System.currentTimeMillis());
            File file3 = new File(c10, q.b(sb2, (int) (Math.random() * 1000), ".zip"));
            try {
                ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file3));
                long j10 = 0;
                byte[] bArr = new byte[4096];
                for (File file4 : list) {
                    ZipEntry zipEntry = new ZipEntry(file4.getName());
                    FileInputStream fileInputStream = new FileInputStream(file4);
                    zipOutputStream.putNextEntry(zipEntry);
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        zipOutputStream.write(bArr, 0, read);
                        j10 += read;
                    }
                    zipOutputStream.closeEntry();
                    l lVar = l.f28297a;
                    a0.d(fileInputStream, null);
                    if (j10 > 15728640) {
                        break;
                    }
                }
                l lVar2 = l.f28297a;
                a0.d(zipOutputStream, null);
                obj2 = file3;
            } catch (Throwable th3) {
                obj2 = a0.f(th3);
            }
            Throwable a10 = g.a(obj2);
            if (a10 != null) {
                a.b bVar4 = p000do.a.f13275a;
                bVar4.t("Feedback");
                bVar4.q(a10);
            }
            boolean z11 = obj2 instanceof g.a;
            Object obj3 = obj2;
            if (z11) {
                obj3 = null;
            }
            file = (File) obj3;
            if (file == null) {
                return null;
            }
            try {
                f fVar3 = this.f26993g;
                vg.d dVar = fVar3.f26996c;
                Context context2 = fVar3.f26994a;
                Uri fromFile = Uri.fromFile(file);
                gm.l.e(fromFile, "fromFile(file)");
                this.f26991e = file;
                this.f26992f = 2;
                obj = vg.e.d(dVar, context2, 2, fromFile, this);
            } catch (Exception e13) {
                e = e13;
                file2 = file;
                a.b bVar22 = p000do.a.f13275a;
                bVar22.t("Feedback");
                bVar22.q(e);
                file2.delete();
                return str;
            } catch (Throwable th4) {
                th = th4;
                file.delete();
                throw th;
            }
            if (obj == aVar) {
                return aVar;
            }
            file2 = file;
            str = this.f26993g.f26999f.b(l0.d(List.class, String.class)).e(h7.a.p((String) ((k) obj).f29381c));
            file2.delete();
        }
        return str;
    }
}
