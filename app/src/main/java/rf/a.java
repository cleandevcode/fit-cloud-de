package rf;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import fm.p;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import mf.a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000do.a;
import pm.e0;
import tl.g;
import tl.l;
import zl.i;

@zl.e(c = "com.topstep.fitcloud.pro.files.AppFiles$copyChoosePhotoUri$2", f = "AppFiles.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends i implements p<e0, xl.d<? super Uri>, Object> {

    /* renamed from: e */
    public final /* synthetic */ Context f25595e;

    /* renamed from: f */
    public final /* synthetic */ Uri f25596f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Uri uri, xl.d<? super a> dVar) {
        super(2, dVar);
        this.f25595e = context;
        this.f25596f = uri;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super Uri> dVar) {
        return ((a) p(e0Var, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        return new a(this.f25595e, this.f25596f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        Object f10;
        a0.k(obj);
        File b10 = en.f.b(this.f25595e);
        if (b10 == null) {
            return null;
        }
        Uri uri = this.f25596f;
        Context context = this.f25595e;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                FileOutputStream fileOutputStream = new FileOutputStream(b10);
                byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_MASK];
                while (true) {
                    int read = openInputStream.read(bArr);
                    if (read < 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                f10 = FileProvider.b(context, b10);
                a0.d(fileOutputStream, null);
                a0.d(openInputStream, null);
            } else {
                f10 = null;
            }
        } catch (Throwable th2) {
            f10 = a0.f(th2);
        }
        boolean z10 = f10 instanceof g.a;
        if (!z10) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("AppFiles");
            bVar.h("copyChoosePhotoUri success:%s", (Uri) f10);
        }
        Throwable a10 = g.a(f10);
        if (a10 != null) {
            a.b bVar2 = p000do.a.f13275a;
            bVar2.t("AppFiles");
            bVar2.r(a10, "copyChoosePhotoUri failed", new Object[0]);
        }
        if (z10) {
            return null;
        }
        return f10;
    }
}
